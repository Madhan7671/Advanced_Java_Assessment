package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.MovieClient;
import com.example.demo.model.Booking;
import com.example.demo.model.Movie;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    MovieClient movieClient;

    List<Booking> bookings = new ArrayList<>();

    @PostMapping
    public Booking book(@RequestBody Booking booking){

        Movie movie = movieClient.getMovie(booking.getMovieId());

        booking.setTotalAmount(movie.getPrice()*booking.getTickets());

        bookings.add(booking);

        return booking;
    }

    @GetMapping
    public List<Booking> getBookings(){
        return bookings;
    }

}
