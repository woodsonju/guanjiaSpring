package fr.dawan.guanjia.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.dawan.guanjia.entities.Client;

@Controller
public class LoginController {

	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(Model m) {
		m.addAttribute("user-form", new Client()); //TODO:impossible instancier Utilisateur, car abstrait
		//Aller sur login.jsp avec "user-form"
		return "login";
	}
	
	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
	public String verifLogin(Model m, HttpSession session, @ModelAttribute("user-form")Client c, BindingResult result) {
		if(c.getEmail().contentEquals("client1@gmail.com") && c.getPwd().contentEquals("client1")) {
			return "espace-client";
		}else {
			m.addAttribute("msg", "mot de passe ou identifiant non correct");
			m.addAttribute("user-form", c);
			return "login";
		}
	}
	
}
