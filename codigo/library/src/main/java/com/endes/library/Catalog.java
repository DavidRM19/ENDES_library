package com.endes.library;

import java.util.HashSet;
import java.util.Set;

import com.endes.services.Manage;
import com.endes.services.Search;

public class Catalog implements Search, Manage{
	
	private Set<BookItem> record = new HashSet<BookItem>();

	@Override
	public void createBookItem(BookItem bookItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBookItem(BookItem bookItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBookItem(String ISBN) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookItem getBookItem(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookItem searchByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookItem searchByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

}
