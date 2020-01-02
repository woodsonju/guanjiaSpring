package fr.dawan.guanjia.controllers;

import java.util.UUID;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.dawan.guanjia.dao.UtilisateurDao;
import fr.dawan.guanjia.entities.Utilisateur;
import fr.dawan.guanjia.validator.EmailValidatorForResetPWD;
import fr.dawan.guanjia.validator.ResetPasswordValidator;

@Controller
@SessionAttributes("isConnected")
public class LoginController {

	@Autowired
	private UtilisateurDao utilisateurDao;
	
	@Autowired
	private JavaMailSender emailSender;
	
	@Autowired
	private ResetPasswordValidator resetPasswordValidator;
	
	@Autowired
	private EmailValidatorForResetPWD emailValidatorForResetPWD;
	
		
	@GetMapping(value = "/login")
	public String showLogin(Model m) {
		m.addAttribute("utilisateur-form", new Utilisateur()); 
		return "login";
	}

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
					result1 = "gestionCompteClient";
					break;
				case PRESTATAIRE:
					result1 = "gestionComptePrestataire";
					break;
				case ADMIN:
					result1 = ("redirect:/admin/1/10");
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
		model.addAttribute("utilisateur-sendmailforpwd", new Utilisateur()); 
		return "send_mail_for_reset_password";
	}
	

	//Pour un mail htlm
	@SuppressWarnings("unused")
	@PostMapping("/mot-de-passe-oublie")
	//@Async
	public String sendMail(Model model, @Valid @ModelAttribute("utilisateur-sendmailforpwd") Utilisateur u,
			BindingResult result) {
		SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
		
		emailValidatorForResetPWD.validate(u, result);

		System.out.println(u.getEmail());
		System.out.println("avantttttttttttttt error");
		System.out.println(result.hasErrors());
		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			System.out.println("erooooooooooooor");
			model.addAttribute("utilisateur-sendmailforpwd", u);
			return "send_mail_for_reset_password";
		} else {
			System.out.println("Passssssssssssss error");
			//On vérifie que l'utilisateur existe dans la base de données
			Utilisateur dbClient = utilisateurDao.findByEmail(u.getEmail());
			System.out.println(dbClient);
			System.out.println("mailUser : " + dbClient.getEmail());
			
			//Generer le token pour reinitialiser la pwd
			dbClient.setResetToken(UUID.randomUUID().toString());
			
			//Sauver le token dans la base de données
			utilisateurDao.update(dbClient);
			
			if(dbClient != null) {		
				passwordResetEmail.setTo(u.getEmail());
				passwordResetEmail.setSubject("Mot de passe oublié");
				passwordResetEmail.setText("Vous avez oublié ou perdu votre mot de passe.\r\n" + 
						"Pour en créer un nouveau, merci de cliquer sur le lien suivant :\n" + "http://localhost:8080/guanjia"
						+ "/creer-mot-de-passe?token=" + dbClient.getResetToken());

				emailSender.send(passwordResetEmail);
				return "home";
			} else {
				model.addAttribute("msg", "L'utilisateur n'exite pas");
				model.addAttribute("utilisateur-sendmailforpwd", u);
				return "send_mail_for_reset_password";
			}
		}
		
		

	}
	
	
	@GetMapping("/creer-mot-de-passe")
	public ModelAndView getPageforNewPassWord(ModelAndView modelAndView, @RequestParam("token") String token) {
		//model.addAttribute("utilisateur-resetpassword", new Utilisateur());
		modelAndView.addObject("utilisateur-resetpassword", new Utilisateur());
		Utilisateur utilisateur = utilisateurDao.findByResetToken(token);
		System.out.println(utilisateur);
		
		//On regarde si le token est dans la base de données 
		if(utilisateur != null) 
			modelAndView.addObject("resetToken", token);
		else					
			modelAndView.addObject("errorMessage", "Le lien de réinitialisation du mot de passe est invalide");
		
		modelAndView.setViewName("password_reset");
		return modelAndView;
	
	}
	
	
	
	@PostMapping("/creer-mot-de-passe")
	public ModelAndView  createPassWord(ModelAndView  modelAndView, @Valid @ModelAttribute("utilisateur-resetpassword") Utilisateur u, 
			BindingResult result, RedirectAttributes redirectAttributes
			) {
		
		//Trouver l'utilisateur associer au token
		Utilisateur utilisateur = utilisateurDao.findByResetToken(u.getResetToken());
		System.out.println("Utilisateur : " + utilisateur);

		resetPasswordValidator.validate(u, result);
		System.out.println("rentre dans le post");
		if (result.hasErrors()) {
			modelAndView.addObject("errors", result.getAllErrors());
			modelAndView.addObject("utilisateur-resetpassword", u);
			System.out.println("erroooooooooooooooooooooooor");
			modelAndView.setViewName("password_reset");
			return modelAndView;
		} else {
			System.out.println("----------" + u.getTypeUtilisateur() + "----------");
				if(utilisateur != null) {
					//Nouveau mot de passe
					utilisateur.setPwd(u.getPwd());
					utilisateur.setConfirmpwd(u.getConfirmpwd());
					
					//Mettre le resetToken à null
					utilisateur.setResetToken(null);
					
					//Mettre à jour l'utilisateur
					utilisateurDao.update(utilisateur);
					System.out.println("nouvelle utilisateur pwd : " + utilisateur);
					
					redirectAttributes.addFlashAttribute("msg", "La mise à jour de ton compte a été un succès. Tu peux maintenant te connecter à ton compte");
					modelAndView.setViewName("redirect:/login");
					return modelAndView;
				} else {
					modelAndView.addObject("errorMessage", "Le lien de réinitialisation du mot de passe est invalide");
					modelAndView.setViewName("password_reset");
					return modelAndView; 
				}


			}
	}

}


/*
 * Une fois que l'utilisateur a envoyé son e-mail à l'étape 2, nous interrogeons la base de données pour identifier l'utilisateur. Si l'utilisateur n'existe pas, une erreur est renvoyée.

Si l'utilisateur existe, nous créons un jeton de réinitialisation qui est simplement une chaîne générée aléatoirement comme 9e5bf4a8-66b8-433e-b91c-6382c1a25f00.   Ce jeton est enregistré sur la ligne de l'utilisateur dans la base de données.  

À l'étape 3, nous créons un message électronique avec un lien contenant le jeton:

https://mywebapp.com/reset?token=9e5bf4a8-66b8-433e-b91c-6382c1a25f00
La page de réinitialisation est capable d'identifier l'utilisateur en fonction du jeton dans l'URL.

À l'étape 4, le formulaire de réinitialisation du mot de passe mettra à jour leur hachage de mot de passe dans la base de données. Il est recommandé d'effacer le jeton de réinitialisation de la base de données une fois le nouveau mot de passe défini. Cela empêche l'utilisateur de pouvoir utiliser le lien plusieurs fois.
 * */
