package cz.czechitas.java2webapps.ukol5.newRegistration;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * This controller handles new registrations for summer camp
 */
@Controller
public class RegistrationController {

    private RegistrationFormChildAgeValidator validator;

    public RegistrationController(RegistrationFormChildAgeValidator validator) {
        this.validator = validator;
    }

    @InitBinder("form")
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(validator);
    }

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("registration");
        modelAndView.addObject("form", new RegistrationForm());
        addCampSessionDateEnumsToModel(modelAndView);
        return modelAndView;
    }

    @PostMapping("/")
    public ModelAndView registration(@Valid @ModelAttribute("form") RegistrationForm form, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("registration");
        addCampSessionDateEnumsToModel(modelAndView);

        if (bindingResult.hasErrors()) {
            return modelAndView;
        }

        modelAndView.setViewName("successfulRegistration");
        return modelAndView;
    }

    private void addCampSessionDateEnumsToModel(ModelAndView modelAndView) {
        modelAndView.addObject("enum1", CampSessionDate.JULY5TO11);
        modelAndView.addObject("enum2", CampSessionDate.JULY12TO18);
        modelAndView.addObject("enum3", CampSessionDate.AUGUST2TO10);
    }
}