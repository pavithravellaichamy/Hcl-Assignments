package com.src.customValidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = EmailConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface Email 
{
		public String message() default "must contain @ and .";
		public Class<?>[] groups() default{};
		public Class<? extends Payload>[] payload() default{};

}