package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Booking {

    private int bookingId;
    private int movieId;
    private int tickets;
    private int totalAmount;
	public Booking(int bookingId, int movieId, int tickets) {
		super();
		this.bookingId = bookingId;
		this.movieId = movieId;
		this.tickets = tickets;
	}
    
}