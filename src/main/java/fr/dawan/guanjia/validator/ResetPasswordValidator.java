package fr.dawan.guanjia.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import fr.dawan.guanjia.entities.Utilisateur;

@Component
public class ResetPasswordValidator implements Validator{
	
	//private static final Pattern EMAIL_REGEX1 = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");


	@Override
	public boolean supports(Class<?> clazz) {
		return Utilisateur.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//ValidationUtils.rejectIfEmpty(errors, "email", "utilisateur.email.empty");
		ValidationUtils.rejectIfEmpty(errors, "pwd", "utilisateur.pwd.empty");
		
		Utilisateur user = (Utilisateur) target;

		if (user.getPwd() != null && user.getConfirmpwd() != null &&
				user.getPwd().contains(" ") && user.getConfirmpwd().contains(" ")){
			errors.rejectValue("pwd", "utilisateur.pwd.space");
			errors.rejectValue("confirmpwd", "utilisateur.pwd.space");

		}

		if (user.getPwd() != null && user.getConfirmpwd() != null && 
				((user.getPwd().length() < 5) ||(user.getPwd().length() > 15)) &&
				((user.getConfirmpwd().length() < 5) || (user.getConfirmpwd().length() > 15))) {
			errors.rejectValue("pwd", "utilisateur.pwd.size");
			errors.rejectValue("confirmpwd", "utilisateur.pwd.size");
		}
		

		if(user.getPwd() != null && user.getConfirmpwd() != null && 
				!user.getPwd().equals(user.getConfirmpwd())){
			errors.rejectValue("pwd", "utilisateur.pwd.confirmPwd");
		}
//		
//		if (user.getEmail() != null && !EMAIL_REGEX1.matcher(user.getEmail()).matches()) {
//			errors.rejectValue("email", "utilisateur.email.invalid");
//		}

	
	}

}
