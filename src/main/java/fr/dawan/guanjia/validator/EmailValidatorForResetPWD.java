package fr.dawan.guanjia.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import fr.dawan.guanjia.entities.Utilisateur;

public class EmailValidatorForResetPWD implements Validator{
	
	private static final Pattern EMAIL_REGEX1 = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");


	@Override
	public boolean supports(Class<?> clazz) {
		return Utilisateur.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Utilisateur user = (Utilisateur) target;

		ValidationUtils.rejectIfEmpty(errors, "email", "utilisateur.email.empty");
	
		if (user.getEmail() != null && !EMAIL_REGEX1.matcher(user.getEmail()).matches()) {
			errors.rejectValue("email", "utilisateur.email.invalid");
		}

	
	}

}
