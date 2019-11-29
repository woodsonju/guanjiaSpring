package fr.dawan.guanjia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategorieController {

	@RequestMapping(value="/categorie_restaurant", method = RequestMethod.GET)
	public String showCategorieRestaurant() {
		return "categorie_restaurant";
		
	}
	
	
	
	
	@RequestMapping(value="/categorie_commercedeproximite", method = RequestMethod.GET)
	public String showCategorieCommercedeproximite() {
		return "categorie_commercedeproximite";
		
	}
}

    
    
	
