package cz.czechitas.java2webapps.ukol5.newRegistration;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;
import java.time.Period;

@Component
public class RegistrationFormChildAgeValidator implements Validator {


    @Override
    public boolean supports(Class<?> clazz) {
        return RegistrationForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (errors.getErrorCount() == 0) {
            RegistrationForm form = (RegistrationForm) target;
            Period period = form.getBirthday().until(LocalDate.now());
            int ageOfChild = period.getYears();
            if (ageOfChild < 9) {
                errors.reject("birthday", "Child is too young");
            } else if (ageOfChild > 15) {
                errors.reject("birthday", "Child is too old");
            }
        }
    }
}
