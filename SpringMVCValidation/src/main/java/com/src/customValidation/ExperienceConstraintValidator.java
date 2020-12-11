package com.src.customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ExperienceConstraintValidator  implements ConstraintValidator<Experience,String>
{
	public boolean isValid(String s,ConstraintValidatorContext cvc)
	{
		if(s.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
		}
}
