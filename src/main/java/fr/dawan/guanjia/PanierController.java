package fr.dawan.guanjia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.guanjia.entities.LigneDeCommande;
import fr.dawan.guanjia.entities.Panier;
import fr.dawan.guanjia.entities.Prestataire;
import fr.dawan.guanjia.entities.Prestation;

//import src.main.webapp.resources.js.quantiterpanier;

@Controller
@RequestMapping("/panier")
public class PanierController {

	//private static final Object Quantit = null;

	@GetMapping("")
	public String pagePanier(Model m){
		List<LigneDeCommande> lignes = new ArrayList<LigneDeCommande>();
		
		//private final int Quantit = new Quantit();
		double result = 0.0;
		int Quantit = 0;
		int index = 0;
		
		Prestation p1 = new Prestation();
		p1.setDescription("Samsung 21.5\" LED - S22F350FH");
		p1.setPrixPrestation(389.9);
		
		Prestation p2 = new Prestation();
		p2.setDescription("Samsung 21.5\" LED - S22UUFDD");
		p2.setPrixPrestation(289.9);
		
		Prestation p3 = new Prestation();
		p3.setDescription("Samsung 21.5\" LED - HXVUXYVUTYD");
		p3.setPrixPrestation(489.9);
		
		Prestation p4 = new Prestation();
		p4.setDescription("Samsung 21.5\" LED - DOOODHHUHUH");
		p4.setPrixPrestation(599.9);
		
		Prestation p5 = new Prestation();
		p5.setDescription("Samsung 21.5\" LED - SDFGYIUGUY");
		p5.setPrixPrestation(888.99);
		
		LigneDeCommande l1 = new LigneDeCommande();
		l1.setQuantite(2);
		l1.setPrestation(p1);
		l1.setPrixTotal(p1.getPrixPrestation() * l1.getQuantite());
		
		LigneDeCommande l2 = new LigneDeCommande();
		l2.setQuantite(4);
		l2.setPrestation(p2);
		l2.setPrixTotal(p2.getPrixPrestation() * l2.getQuantite());

		LigneDeCommande l3 = new LigneDeCommande();
		l3.setQuantite(4);
		l3.setPrestation(p3);
		l3.setPrixTotal(p3.getPrixPrestation() * l3.getQuantite());

		LigneDeCommande l4 = new LigneDeCommande();
		l4.setQuantite(4);
		l4.setPrestation(p4);
		l4.setPrixTotal(p4.getPrixPrestation() * l4.getQuantite());


		LigneDeCommande l5 = new LigneDeCommande();
		l5.setQuantite(4);
		l5.setPrestation(p5);
		l5.setPrixTotal(p5.getPrixPrestation() * l5.getQuantite());
		
		lignes.add(l1);
		lignes.add(l2);
		lignes.add(l3);		
		lignes.add(l4);
		lignes.add(l5);
		lignes.add(l5);
		
		

		for(int i=0; i < lignes.size(); i++) {
			index += lignes.get(i).getPrixTotal();
		}
		for(int i=0; i < lignes.size(); i++) {
			result += lignes.get(i).getPrixTotal();
		}

		
		m.addAttribute("i", index);
		m.addAttribute("Quantit", Quantit);
		m.addAttribute("result", result);
		m.addAttribute("mesLignes", lignes);
		return "panier";
	}

}
