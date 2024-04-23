package com.endes.library;

import java.util.List;

public class BookItem extends Book{
	
	private String barcode;
	private String tag;
	private Boolean isReferenceOnly;
	
	public BookItem(String isbn, String title, String summary, String publisher, Integer publicationDate,
			Integer numberOfPages, String language, List<Author> authors, List<BookItem> books) {
		super(isbn, title, summary, publisher, publicationDate, numberOfPages, language, authors, books);
		// TODO Auto-generated constructor stub
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Boolean getIsReferenceOnly() {
		return isReferenceOnly;
	}

	public void setIsReferenceOnly(Boolean isReferenceOnly) {
		this.isReferenceOnly = isReferenceOnly;
	}

}
