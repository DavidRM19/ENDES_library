package com.endes.library;

import java.util.HashSet;
import java.util.Set;

import com.endes.services.Search;

public class Patron implements Search{
	
	private String name;
	private String address;
	private Set<Account> account = new HashSet<Account>();
	
	
	@Override
	public BookItem searchByTitle(String title) {
		
		return null;
		
	}
	@Override
	public BookItem searchByAuthor(String author) {
		
		return null;
		
	}

}
