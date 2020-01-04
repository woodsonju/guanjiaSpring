package fr.dawan.guanjia.controllers;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.guanjia.entities.FormAdd;
import fr.dawan.guanjia.entities.FormLess;
import fr.dawan.guanjia.entities.LigneDeCommande;

import fr.dawan.guanjia.entities.Prestation;

//import src.main.webapp.resources.js.quantiterpanier;

@Controller
@RequestMapping("/panier")
public class PanierController {

	// private static final Object Quantit = null;

	@GetMapping("")
	public String pagePanier(Model m, HttpSession session) {
		List<LigneDeCommande> lignes = new ArrayList<LigneDeCommande>();


		double result = 0.0;
		int index = 0;
		int i = 0;

		Prestation p1 = new Prestation();
		p1.setDescription("maroquinerie chanel-5");
		p1.setPrixPrestation(100);

		Prestation p2 = new Prestation();
		p2.setDescription("macdonald Menu Maxi best Of");
		p2.setPrixPrestation(15);

		Prestation p3 = new Prestation();
		p3.setDescription("histoiredor Bracelet Acier Dore Maille Marine");
		p3.setPrixPrestation(39);

		Prestation p4 = new Prestation();
		p4.setDescription("LA ROCHE POSAY LIPIKAR AP+ Baume");
		p4.setPrixPrestation(12);

		Prestation p5 = new Prestation();
		p5.setDescription("fleurs-magie-de-noel-vase-offert");
		p5.setPrixPrestation(50);

		LigneDeCommande l1 = new LigneDeCommande();
		l1.setQuantite(2);
		l1.setPrestation(p1);
		l1.setPrixTotal(p1.getPrixPrestation() * l1.getQuantite());
		l1.setId(++i);

		LigneDeCommande l2 = new LigneDeCommande();
		l2.setQuantite(4);
		l2.setPrestation(p2);
		l2.setPrixTotal(p2.getPrixPrestation() * l2.getQuantite());
		l2.setId(++i);

		LigneDeCommande l3 = new LigneDeCommande();
		l3.setQuantite(4);
		l3.setPrestation(p3);
		l3.setPrixTotal(p3.getPrixPrestation() * l3.getQuantite());
		l3.setId(++i);

		LigneDeCommande l4 = new LigneDeCommande();
		l4.setQuantite(4);
		l4.setPrestation(p4);
		l4.setPrixTotal(p4.getPrixPrestation() * l4.getQuantite());
		l4.setId(++i);

		LigneDeCommande l5 = new LigneDeCommande();
		l5.setQuantite(4);
		l5.setPrestation(p5);
		l5.setPrixTotal(p5.getPrixPrestation() * l5.getQuantite());
		l5.setId(++i);

		lignes.add(l1);
		lignes.add(l2);
		lignes.add(l3);
		lignes.add(l4);
		lignes.add(l5);
		
		for(int j=0; j < lignes.size(); j++) {
			index += lignes.get(j).getPrixTotal();
		}

		for (int j = 0; j < lignes.size(); j++) {
			result += lignes.get(j).getPrixTotal();
		}

		m.addAttribute("result", result);
		m.addAttribute("mesLignes", lignes);
		m.addAttribute("i", index);
		m.addAttribute("formAdd", new FormAdd());
		m.addAttribute("formMoins", new FormLess());

		session.setAttribute("produits", lignes);
		return "panier";
	}

	@PostMapping("/ajouter")
	public String ajouterProduit(Model m, HttpSession session, @ModelAttribute("formAdd") FormAdd f, BindingResult r) {

		/**
		 * il faut faire la meme chose pour le boutton moins
		 */
		double result = 0.0;
		Object o = session.getAttribute("produits");
		List<LigneDeCommande> lignes = null;
		if (o != null) {
			lignes = (List<LigneDeCommande>) o;
		} else {
			lignes = new ArrayList<LigneDeCommande>();
		}
		for (LigneDeCommande l : lignes) {
			if (+f.id == l.getId()) {
				l.setQuantite(l.getQuantite() + 1);
				double prix = l.getPrestation().getPrixPrestation();
				l.setPrixTotal(l.getPrixTotal() + prix);
			}
			result += l.getPrixTotal();
		}
		m.addAttribute("mesLignes", lignes);
		session.setAttribute("produits", lignes);
		
		m.addAttribute("formAdd", new FormAdd());
		m.addAttribute("formMoins", new FormLess());
		m.addAttribute("result", result);
		
		return "panier";
	}

	@PostMapping("/moins")
	public String moinsProduit(Model m, HttpSession session, @ModelAttribute("formMoins") FormLess f, BindingResult r) {

		double result = 0.0;
		Object o = session.getAttribute("produits");
		List<LigneDeCommande> lignes;
		if (o != null) {
			lignes = (List<LigneDeCommande>) o;
		} else {
			lignes = new ArrayList<LigneDeCommande>();
		}
		for (LigneDeCommande l : lignes) {
			if (+f.id == l.getId()) {
				l.setQuantite(l.getQuantite() - 1);
				double prix = l.getPrestation().getPrixPrestation();
				l.setPrixTotal(l.getPrixTotal() - prix);
			}
			result += l.getPrixTotal();
		}
		m.addAttribute("mesLignes", lignes);
		session.setAttribute("produits", lignes);
		
		m.addAttribute("formAdd", new FormAdd());
		m.addAttribute("formMoins", new FormLess());
		m.addAttribute("result", result);

		return "panier";
	}
}