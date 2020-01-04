package fr.dawan.guanjia.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.dawan.guanjia.entities.Prestataire;
import fr.dawan.guanjia.entities.Utilisateur;

@Controller
@RequestMapping(value = "/prestataire", 
	method = {RequestMethod.GET, RequestMethod.POST})
public class GestionComptePrestataireController {
	
	@GetMapping("/compteprestataire")
	public String consulterComptePrestataire(Model model, HttpSession session) {
		//Récuperer la session afin de l'utiliser dans la jsp
		Utilisateur prestaSession =  (Utilisateur) session.getAttribute("userConnected");
		System.out.println("prestaSession : " + prestaSession);
		
		model.addAttribute("prestataire", new Prestataire());
		model.addAttribute("prestaSession", prestaSession);

		return "gestionComptePrestataire";
	}
	
	@PostMapping(value = "/updatePrestataire")
	public String updateClient(Model model, HttpSession session, @Valid @ModelAttribute("prestataire") Utilisateur u,
			BindingResult result) {
		
		System.out.println("POSsssssssssssssssssssssssssssssssssssssssssT " + u);
		
		return "gestionComptePrestataire";
//		
//		if (result.hasErrors()) {
//			model.addAttribute("errors", result.getAllErrors());
//			System.out.println("erooooooooooooor");
//			model.addAttribute("utilisateur-sendmailforpwd", u);
//			return "gestionCompteClient";
//		} else {
//			System.out.println("ELSEEEEEEEEEEEEEEEEEEEEE " + u);
//			System.out.println("iddddddd " +u.getId());
//			//u.setId(1);
//			utilisateurDao.update(u);
//			return "home";

		}
	


}
