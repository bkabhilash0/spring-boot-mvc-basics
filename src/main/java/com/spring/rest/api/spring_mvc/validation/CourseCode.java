package com.spring.rest.api.spring_mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    public String value() default "LUV";

    public String message() default "Must Start with LUV";

    // Groups
    public Class<?>[] groups() default {};

    // Payloads
    public Class<? extends Payload>[] payload() default {};
}
