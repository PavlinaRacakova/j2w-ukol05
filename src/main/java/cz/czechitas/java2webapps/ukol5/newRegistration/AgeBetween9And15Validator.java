package cz.czechitas.java2webapps.ukol5.newRegistration;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.Period;

/*
The class performing validation task. If annotated property isn't instance of LocalDate class, it immediately returns false.
Otherwise, it checks whether annotated LocalDate is withing given time range.
 */
public class AgeBetween9And15Validator implements ConstraintValidator<AgeBetween9And15, Object> {
    @Override
    public boolean isValid(Object birthday, ConstraintValidatorContext context) {
        if(!(birthday instanceof LocalDate)) {
            return false;
        }

        Period period = ((LocalDate) birthday).until(LocalDate.now());
        int ageOfChild = period.getYears();
        return ageOfChild >= 9 && ageOfChild <= 15;
    }
}
