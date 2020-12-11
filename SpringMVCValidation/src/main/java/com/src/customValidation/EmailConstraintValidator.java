package com.src.customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailConstraintValidator implements ConstraintValidator<Email,String>
{
	public boolean isValid(String s,ConstraintValidatorContext cvc)
	{
	boolean result=s.contains("@");
	return result;
	}
}
