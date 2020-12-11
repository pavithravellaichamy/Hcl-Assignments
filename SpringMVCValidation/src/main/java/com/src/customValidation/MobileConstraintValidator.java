package com.src.customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MobileConstraintValidator  implements ConstraintValidator<Mobileno,String>
{
	public boolean isValid(String s, ConstraintValidatorContext context) {
		boolean result=true;
		if(s.length()==10)
		{
			return result;
		}
		else
		{
			result=false;
			return result;
		}
	}
}

