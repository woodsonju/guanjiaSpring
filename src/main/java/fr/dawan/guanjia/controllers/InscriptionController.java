package fr.dawan.guanjia.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.guanjia.dao.GenericDao;
import fr.dawan.guanjia.entities.Utilisateur;

@Controller
@RequestMapping("/utilisateur")
public class InscriptionController {
	
	@GetMapping("/inscription")
	public String consulterCompte(Model model) {
		model.addAttribute("utilisateur-inscription", new Utilisateur());
		return "inscription";
	}
	
	@PostMapping("/addUtilisateur")
	public String addUtilisateur(Model model, HttpSession session,
			@ModelAttribute("utilisateur-inscription") Utilisateur u,
			BindingResult result
			) {
		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			model.addAttribute("utilisateur-form", u);
			return "inscription";
		} else {
			Utilisateur dbClient = GenericDao.create(u);
			System.out.println(dbClient.getEmail());
//			
//			if (dbClient != null && dbClient.getPwd().contentEquals(u.getPwd())) {
//				session.setAttribute("utilisateur_id", dbClient.getId());
//				session.setAttribute("utilisateur_name", dbClient.getNom());
//				model.addAttribute("isConnected", true);
//				switch (dbClient.getTypeUtilisateur()) {
//				case CLIENT:
//					result1 = "home";
//					break;
//				case PRESTATAIRE:
//					result1 = "comptePrestataire";
//					break;
//				case ADMIN:
//					result1 = ("redirect:/admin/1/3");
//					break;
//				}
				//return result1;
				return "home";

			} 
		//else {
//				model.addAttribute("msg", "Erreur d'authentification");
//				model.addAttribute("utilisateur-form", u);
//				return "login";
//			}
		//}
	}

}
