package fr.dawan.guanjia.controllers;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.dawan.guanjia.dao.UtilisateurDao;
import fr.dawan.guanjia.entities.Utilisateur;


@Controller
@SessionAttributes("isConnected")
public class LoginController {

	@Autowired
	UtilisateurDao utilisateurDao;
		
	// @RequestMapping(value = "/login", method = RequestMethod.GET)
	@GetMapping(value = "/login")
	public String showLogin(Model m) {
		m.addAttribute("utilisateur-form", new Utilisateur()); // TODO:impossible instancier Utilisateur, car abstrait
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
}
