package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;

@Controller
@RequestMapping("/movies")
public class MovieController {
	@Autowired
    private MovieService movieservice;

    @GetMapping
    public String listMovies(Model model){
        model.addAttribute("movies", movieservice.getAllMovies());
        return "movie-list";
    }
    @GetMapping("/new")
    public String showForm(Model model){
        model.addAttribute("movie", new Movie());
        return "movie-form";
    }
    
    @PostMapping("/save")
    public String saveMovie(@ModelAttribute Movie movie){
        movieservice.saveMovie(movie);
        return "redirect:/movies";
    }
    
    @GetMapping("/edit/{id}")
    public String editMovie(@PathVariable Long id, Model model){
        model.addAttribute("movie", movieservice.getMovieById(id));
        return "movie-form";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteMovie(@PathVariable Long id){
        movieservice.deleteMovie(id);
        return "redirect:/movies";
    }
}

