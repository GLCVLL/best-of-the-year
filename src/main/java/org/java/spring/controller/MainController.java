package org.java.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {
	
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("author", "Gio");
        return "home";
    }

}
