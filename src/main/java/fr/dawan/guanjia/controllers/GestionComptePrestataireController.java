package fr.dawan.guanjia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.guanjia.entities.Prestataire;

@Controller
@RequestMapping("/prestataire")
public class GestionComptePrestataireController {
	
	@GetMapping("/compteprestataire")
	public String consulterComptePrestataire(Model model) {
		model.addAttribute("prestataire", new Prestataire());
		return "gestionComptePrestataire";
	}

}
