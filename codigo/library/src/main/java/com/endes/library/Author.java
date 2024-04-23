package com.endes.library;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String biography;
    private List<Book> wrote = new ArrayList<>(); 
    
	public Author(String name, String biography) {
		super();
		this.name = name;
		this.biography = biography;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}
	
	
    
    
}
