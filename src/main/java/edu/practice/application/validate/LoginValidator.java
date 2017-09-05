package edu.practice.application.validate;

import org.springframework.util.NumberUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import edu.practice.application.model.Department;

public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(Department.class);
	}

	@Override
	public void validate(Object object, Errors errors) {




	}

}
