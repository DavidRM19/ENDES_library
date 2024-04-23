package com.endes.library;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library {
	
	private String name;
	private String address;
	private Catalog catalog;
	private List<BookItem> bookItem = new ArrayList<>();
	private Set<Account> accounts = new HashSet<Account>();

    public void addBookItem(BookItem bookItem) {
        this.bookItem.add(bookItem);
    }


}
