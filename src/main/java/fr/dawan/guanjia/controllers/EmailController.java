//package fr.dawan.guanjia.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class EmailController {
//	
//	
//	@Autowired
//	private JavaMailSender emailSender;
//	
//	//Pour un mail simple
//	@GetMapping("/sendSimpleEmail")
//	public String testMail(Model model) {
//
//		SimpleMailMessage message = new SimpleMailMessage(); 
//		message.setTo("woody973@gmail.com"); 
//		message.setSubject("sujet de l'email"); 
//		message.setText("contenu de l'email");
//		emailSender.send(message);
//		
//		//System.out.println("Email ?");
//		return "login";
//	}
//
//	//Pour un mail htlm
//	@GetMapping("/forgot")
//	public String testMailhtml(Model model) {
//		
//	  return "login";
//	}
//
//}
