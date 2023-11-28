package org.java.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.java.model.Movie;
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
    
    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Il Padrino"));
        movies.add(new Movie(2, "Schindler's List"));
        movies.add(new Movie(3, "Forrest Gump"));
        return movies;
    }

}
