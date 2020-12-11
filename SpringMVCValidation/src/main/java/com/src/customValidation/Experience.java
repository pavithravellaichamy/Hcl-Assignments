package com.src.customValidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ExperienceConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface Experience 
{
	public String message() default "must be greater than or equal to 0.1";
	public Class<?>[] groups() default{};
	public Class<? extends Payload>[] payload() default{};

}
