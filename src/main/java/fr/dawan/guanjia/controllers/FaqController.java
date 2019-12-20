package fr.dawan.guanjia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.guanjia.entities.Client;

@Controller
@RequestMapping("/client")
public class FaqController {
	
	@GetMapping("/faq")
	public String consulterfaq(Model model) {
		model.addAttribute("client", new Client());
		return "faq";
	}

}
