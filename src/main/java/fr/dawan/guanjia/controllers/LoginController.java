package fr.dawan.guanjia.controllers;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.dawan.guanjia.dao.UtilisateurDao;
import fr.dawan.guanjia.entities.Utilisateur;
import fr.dawan.guanjia.validator.ResetPasswordValidator;


@Controller
@SessionAttributes("isConnected")
public class LoginController {

	@Autowired
	UtilisateurDao utilisateurDao;
	
	@Autowired
	private JavaMailSender emailSender;
	
	@Autowired
	ResetPasswordValidator resetPasswordValidator;
		
	// @RequestMapping(value = "/login", method = RequestMethod.GET)
	@GetMapping(value = "/login")
	public String showLogin(Model m) {
		m.addAttribute("utilisateur-form", new Utilisateur()); 
		// Aller sur login.jsp avec "user-form"
		return "login";
	}
	
	// @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
	@PostMapping(value = "/checkLogin")
	public String verifLogin(Model model, HttpSession session, @ModelAttribute("utilisateur-form") Utilisateur u,
			BindingResult result) {
		String result1 = "";
		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			model.addAttribute("utilisateur-form", u);
			return "login";
		} else {
			Utilisateur dbClient = utilisateurDao.findByEmail(u.getEmail());
			if (dbClient != null && dbClient.getPwd().contentEquals(u.getPwd())) {
				session.setAttribute("utilisateur_id", dbClient.getId());
				session.setAttribute("utilisateur_name", dbClient.getNom());
				model.addAttribute("isConnected", true);
				switch (dbClient.getTypeUtilisateur()) {
				case CLIENT:
					result1 = "home";
					break;
				case PRESTATAIRE:
					result1 = "comptePrestataire";
					break;
				case ADMIN:
					result1 = ("redirect:/admin/1/3");
					break;
				}
				return result1;
			} else {
				model.addAttribute("msg", "Erreur d'authentification");
				model.addAttribute("utilisateur-form", u);
				return "login";
			}
		}
	}
	
	@GetMapping(value="/logout")
	public String logout(HttpSession session, Model model) {
		session.invalidate();
		model.addAttribute("isConnected", false);
		return "home";
	}
	

	@ModelAttribute("isConnected")
	public Boolean initSessionIsConnected() {
		return false;
	}
	
	
	@GetMapping(value="/mot-de-passe-oublie")
	public String getPwdReset(HttpSession session, Model model) {
		return "send_mail_for_reset_password";
	}
	

	//Pour un mail htlm
	@PostMapping("/mot-de-passe-oublie")
	public String sendMail(Model model, @ModelAttribute("utilisateur-form") Utilisateur u,
			BindingResult result) {
		SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
		//passwordResetEmail.setFrom("support@demo.com");
		passwordResetEmail.setTo(u.getEmail());
		passwordResetEmail.setSubject("Mot de passe oublié");
		passwordResetEmail.setText("Vous avez oublié ou perdu votre mot de passe.\r\n" + 
				"Pour en créer un nouveau, merci de cliquer sur le lien suivant :\n" + "http://localhost:8080/guanjia/creer-mot-de-passe");
		emailSender.send(passwordResetEmail);
		return "home";
	}
	
	
	@GetMapping("/creer-mot-de-passe")
	public String getPageforNewPassWord(Model model) {
		model.addAttribute("utilisateur-resetpassword", new Utilisateur());
		return "password_reset";
	}
	
	@PostMapping("/creer-mot-de-passe")
	public String createPassWord(Model model, @Valid @ModelAttribute("utilisateur-resetpassword") Utilisateur u,
			BindingResult result, RedirectAttributes redirectAttributes
			) {
		
		resetPasswordValidator.validate(u, result);
		System.out.println("rentre dans le post");
		System.out.println("Prenom : " + u);
		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			model.addAttribute("utilisateur-resetpassword", u);
			System.out.println("erroooooooooooooooooooooooor");
			return "send_mail_for_reset_password";
		} else {
			System.out.println("----------" + u.getTypeUtilisateur() + "----------");
				
				utilisateurDao.udpadteByEmal(u.getEmail());
				System.out.println("new email : " + u.getEmail());
				redirectAttributes.addFlashAttribute("msg", "Ton compte a été crée avec succès");
				return "home";

			}
	}
}
