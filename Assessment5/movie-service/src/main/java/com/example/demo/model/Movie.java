package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {

    private int id;
    private String name;
    private String language;
    private int price;
	public Movie(int id, String name, String language, int price) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.price = price;
	}
    
    // getters setters
}
