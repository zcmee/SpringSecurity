package zcm.com.github.SpringSecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user/panel")
public class WebController {

    @GetMapping
    public String exmpleMessage() {
        return "Twoja stara zapierdala";
    }

}
