package fr.dawan.guanjia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.guanjia.entities.Panier;

@Controller
@RequestMapping("/commande")
public class ValidationCommandeController {
	
	@GetMapping("/validationcommande")
	public String validerCommande(Model model) {
		model.addAttribute("panier", new Panier());
		return "validationCommande";
	}

}
