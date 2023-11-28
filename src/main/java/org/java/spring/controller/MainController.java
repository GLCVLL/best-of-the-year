package org.java.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.java.model.Movie;
import org.java.model.Song;
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
    
    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Bohemian Rhapsody"));
        songs.add(new Song(2, "Imagine"));
        songs.add(new Song(3, "Like a Rolling Stone"));
        return songs;
    }
    
    // MOVIE METHOD
    
    @GetMapping("/movies")
    
    public String getMovies(Model model) {
    	List<Movie> m = getBestMovies();
    	List<String> mt = new ArrayList<>();
        for (Movie movie : m) {
            mt.add(movie.getTitle());
        }
        
        model.addAttribute("titles", mt);
        
        return "movies";
    	
    }
    
    // SONG METHOD
    
    @GetMapping("/songs")
    public String getSongs(Model model) {
        List<Song> s = getBestSongs();
        List<String> st = new ArrayList<>();
        for (Song song : s) {
            st.add(song.getTitle());
        }
        model.addAttribute("titles", st);
        return "songs";
    }

}
