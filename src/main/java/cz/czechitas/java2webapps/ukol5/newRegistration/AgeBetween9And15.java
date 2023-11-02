package cz.czechitas.java2webapps.ukol5.newRegistration;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeBetween9And15Validator.class)
public @interface AgeBetween9And15 {

    String message() default "Age of child must be between 9 and 15";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
