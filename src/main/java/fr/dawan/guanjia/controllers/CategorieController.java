package fr.dawan.guanjia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/categorie")
public class CategorieController {

	@RequestMapping(value="/restaurant", method = RequestMethod.GET)
	public String showCategorieRestaurant() {
		return "categorie_restaurant";
		
	}
	
	
	
	
	@RequestMapping(value="/commercedeproximite", method = RequestMethod.GET)
	public String showCategorieCommercedeproximite() {
		return "categorie_commercedeproximite";
		
	}
	
	
	@RequestMapping(value="/service", method = RequestMethod.GET)
	public String showCategorieService() {
		return "categorie_service";
		
	}
}

    
    
	
