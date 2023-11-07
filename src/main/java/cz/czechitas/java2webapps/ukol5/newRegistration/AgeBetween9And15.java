package cz.czechitas.java2webapps.ukol5.newRegistration;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
This annotation validates that the annotated LocalDate property is set between 9 and 15 years in the past from now.
It should be used only with LocalDate object, otherwise it always returns false.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeBetween9And15Validator.class)
public @interface AgeBetween9And15 {

    String message() default "Age of child must be between 9 and 15";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
