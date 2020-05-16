package com.sametsafkan;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

public class ClassCodeConstraintValidator implements ConstraintValidator<ClassCode, String>{

	private String prefix;
	
	@Override
	public void initialize(ClassCode constraintAnnotation) {
		this.prefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String classCode, ConstraintValidatorContext context) {
		return StringUtils.isEmpty(classCode) ? true : classCode.startsWith(prefix);
	}

}
