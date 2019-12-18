package fr.dawan.guanjia.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import fr.dawan.guanjia.entities.Utilisateur;

public class InscriptionValidator implements Validator{

	private static final Pattern EMAIL_REGEX = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
	private static final Pattern SPACE_PWD_REGEX = Pattern.compile("\\S+");


	@Override
	public boolean supports(Class<?> clazz) {
		return Utilisateur.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmpty(errors, "nom", "utilisateur.nom.empty");
		ValidationUtils.rejectIfEmpty(errors, "prenom", "utilisateur.prenom.empty");
		ValidationUtils.rejectIfEmpty(errors, "email", "utilisateur.email.empty");
		ValidationUtils.rejectIfEmpty(errors, "numTelephone", "utilisateur.numTelephone.empty");
		ValidationUtils.rejectIfEmpty(errors, "pwd", "utilisateur.pwd.empty");
		ValidationUtils.rejectIfEmpty(errors, "confirmpwd", "utilisateur.pwd.empty");

		
		Utilisateur user = (Utilisateur) target;
		if (user.getNom() != null && user.getNom().length() < 2 ||
				user.getNom().length() > 20) {
			errors.rejectValue("nom", "utilisateur.nom.size");
		}

		if (user.getPrenom() != null && user.getPrenom().length() < 2 ||
				user.getPrenom().length() > 20) {
			errors.rejectValue("prenom", "utilisateur.prenom.size");
		}

		if (user.getNumTelephone() != null && user.getNumTelephone().length() < 8) {
			errors.rejectValue("numTelephone", "utilisateur.numTelephone.size");
		}

		if (user.getPwd() != null && user.getConfirmpwd() != null &&
				user.getPwd().contains(" ") && user.getConfirmpwd().contains(" ")){
			errors.rejectValue("pwd", "utilisateur.pwd.space");
			errors.rejectValue("confirmpwd", "utilisateur.pwd.space");

		}

		if (user.getPwd() != null && user.getConfirmpwd() != null && 
				user.getPwd().length() < 5 && user.getPwd().length() > 15 &&
				user.getConfirmpwd().length() < 5 && user.getConfirmpwd().length() > 15) {
			errors.rejectValue("pwd", "utilisateur.pwd.size");
			errors.rejectValue("confirmpwd", "utilisateur.pwd.size");

		}
		

		if(user.getPwd() != null && user.getConfirmpwd() != null && 
				!user.getPwd().equals(user.getConfirmpwd())){
			errors.rejectValue("pwd", "utilisateur.pwd.confirmPwd");
		}


		if (user.getEmail() != null && !EMAIL_REGEX.matcher(user.getEmail()).matches()) {
			errors.rejectValue("email", "utilisateur.email.invalid");
		}

	}

}
