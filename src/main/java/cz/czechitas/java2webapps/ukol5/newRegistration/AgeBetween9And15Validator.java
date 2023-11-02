package cz.czechitas.java2webapps.ukol5.newRegistration;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.Period;

public class AgeBetween9And15Validator implements ConstraintValidator<AgeBetween9And15, LocalDate> {
    @Override
    public boolean isValid(LocalDate birthday, ConstraintValidatorContext context) {
        Period period = birthday.until(LocalDate.now());
        int ageOfChild = period.getYears();
        return ageOfChild >= 9 && ageOfChild <= 15;
    }
}
