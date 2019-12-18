package fr.dawan.guanjia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.guanjia.dao.UtilisateurDao;
import fr.dawan.guanjia.entities.Utilisateur;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	UtilisateurDao utilisateurDao;

	
	@GetMapping("/{page}/{max}")
	public String showAllUsers(Model m, @PathVariable(name="page") int page, @PathVariable(name="max") int max ) {
		int start = (page-1)*max;
		List<Utilisateur> ls = utilisateurDao.findAllPagination(start, max);
		int nbpage = (int) (utilisateurDao.count()/max+1);
		System.out.println("il y aura pages : " + nbpage);
		
		m.addAttribute("usersList", ls);
		m.addAttribute("page", page);
		m.addAttribute("max", max);
		m.addAttribute("nbpage", nbpage);
		
		boolean suivExist = (page*max)<utilisateurDao.count();
		m.addAttribute("suivExist", suivExist);
		
		return "admin";
		
		
	}

	
	@GetMapping("/delete/{id}")
	public String deleteUsers(@PathVariable(name="id") long id, Model m) {
        int res = utilisateurDao.deleteById(id);
        if(res>0) {
        	m.addAttribute("msg","Utilisateur n°" + id + " a été supprimé");
        }
        //TODO: comment récupérer "max" (nombre de lignes à afficher par page)
		return showAllUsers(m, 1, 3);
	}
	
	




}
