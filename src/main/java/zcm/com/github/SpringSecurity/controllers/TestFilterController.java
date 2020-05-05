package zcm.com.github.SpringSecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("filter")
public class TestFilterController {

    @GetMapping
    private String testFilter() {
        System.out.println("Dupa zbita");
        return "Twoja stara";
    }

}
