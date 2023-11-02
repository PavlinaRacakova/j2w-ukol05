package cz.czechitas.java2webapps.ukol5.newRegistration;

import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.Period;

/**
 * This controller handles new registrations for summer camp
 */
@Controller
public class RegistracionController {

  @GetMapping("/")
  public ModelAndView index() {
    ModelAndView modelAndView = new ModelAndView("formular");
    modelAndView.addObject("form", new RegistrationForm());
    return modelAndView;
  }

  @PostMapping("/")
  public Object registration (@Valid @ModelAttribute("form") RegistrationForm form, BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return "formular";
    }

    return "successfulRegistration";

  }
}
