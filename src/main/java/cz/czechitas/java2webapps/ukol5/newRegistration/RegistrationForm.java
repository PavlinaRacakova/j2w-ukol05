package cz.czechitas.java2webapps.ukol5.newRegistration;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Getter
@Setter
/*
The model class that is ready to accept data and store them.
 */
public class RegistrationForm {

    @NotBlank
    private String givenName;

    @NotBlank
    private String surname;

    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthday;

    @NotBlank
    private String sex;

    @NotBlank
    private String campSession;

    @Email
    private String email;

    private String phoneNumber;

    public String getBirthdayInReadableForm() {
       return birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

    public String getCampSessionInReadableForm() {
        CampSessionDate campSessionDate = Enum.valueOf(CampSessionDate.class, campSession);
        return campSessionDate.getCampSessionDateInReadableForm();
    }
}
