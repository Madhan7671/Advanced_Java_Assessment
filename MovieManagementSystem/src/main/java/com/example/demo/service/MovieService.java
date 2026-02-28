package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
    private MovieRepository movierepository;

    public List<Movie> getAllMovies(){
        return movierepository.findAll();
    }

    public Movie saveMovie(Movie movie){
        return movierepository.save(movie);
    }

    public Movie getMovieById(Long id){
        return movierepository.findById(id).orElse(null);
    }

    public void deleteMovie(Long id){
        movierepository.deleteById(id);
    }
}