package uz.jl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Saydali Murodullayev, Tue 12:54 AM. 2/15/2022
 */
@Controller
public class LandingPageController {

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    private String landingPage() {
        return "home";
    }
}
