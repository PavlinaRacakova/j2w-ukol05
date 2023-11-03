package cz.czechitas.java2webapps.ukol5.newRegistration;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Getter
@Setter

public class RegistrationForm {

    @NotBlank
    private String givenName;

    @NotBlank
    private String surname;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @AgeBetween9And15
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
