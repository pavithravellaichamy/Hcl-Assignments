package com.src.customValidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = MobileConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface Mobileno 
{
	public String message() default "must contain 10 digits";
	public Class<?>[] groups() default{};
	public Class<? extends Payload>[] payload() default{};

}
