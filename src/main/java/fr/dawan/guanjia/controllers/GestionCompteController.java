package fr.dawan.guanjia.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.guanjia.dao.AdresseDao;
import fr.dawan.guanjia.dao.ClientDao;
import fr.dawan.guanjia.dao.UtilisateurDao;
import fr.dawan.guanjia.entities.Client;
import fr.dawan.guanjia.entities.Utilisateur;

@Controller
@RequestMapping("/client")
public class GestionCompteController {
	
	@Autowired
	private AdresseDao adresseDao;
	
	@Autowired
	private ClientDao clientDao;
	
	@Autowired
	private UtilisateurDao utilisateurDao;
	
	@GetMapping("/compteclient")
	public String consulterCompte(Model model, HttpSession session) {
		//Récuperer la session afin de l'utiliser dans la jsp
		 Utilisateur userSession =  (Utilisateur) session.getAttribute("userConnected");
		System.out.println("userSession : " + userSession);
		//On veut l'adresse du client
		
//		List<Adresse> adresses = adresseDao.findByClientId(userSession);
//		System.out.println("eeeeeeeeffffffffffffffffff : " + adresses.get(1).getClient());
//		
//		Utilisateur cli = clientDao.findById(userSession.getId());
//		System.out.println("vvvvvvvvvvvvvvvvvvvvv: " + cli);
		
		model.addAttribute("client", new Client());
		model.addAttribute("userSession", userSession);
		return "gestionCompteClient";
	}
	
	
	@PostMapping(value = "/updateClient")
	public String updateClient(Model model, HttpSession session, @Valid @ModelAttribute("client") Utilisateur u,
			BindingResult result) {
		
		System.out.println("POSsssssssssssssssssssssssssssssssssssssssssT " + u);
		
		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			System.out.println("erooooooooooooor");
			model.addAttribute("utilisateur-sendmailforpwd", u);
			return "gestionCompteClient";
		} else {
			System.out.println("ELSEEEEEEEEEEEEEEEEEEEEE " + u);
			System.out.println("iddddddd " +u.getId());
			//u.setId(1);
			utilisateurDao.update(u);
			return "home";

		}
		
	}

}
