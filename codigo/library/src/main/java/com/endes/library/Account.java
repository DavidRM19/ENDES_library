package com.endes.library;

public class Account{
	
	private Integer number;
	private String history;
	private Integer opened;
	private AccountState state;
	private BookItem[] borrowed = new BookItem[12];
	private BookItem[] reserved = new BookItem[3];
	

}
