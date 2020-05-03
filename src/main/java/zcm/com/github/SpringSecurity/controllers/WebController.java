package zcm.com.github.SpringSecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user/panel")
public class WebController {

    @GetMapping
    public ModelAndView exmpleMessage(ModelAndView modelAndView) {
        modelAndView.setViewName("user_panel");
        return modelAndView;
    }

}
