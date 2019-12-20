package fr.dawan.guanjia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/prestataire")
public class PrestataireController {

	@RequestMapping(value="/chef_cuisinier", method = RequestMethod.GET)
	public String showCategorieRestaurant() {
		return "prestataire_chefcuisinier";
	}
	

}

    
    
	
