package com.composite;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class BookId implements Serializable{
	private static final long serialVersionUID = 1L;
	private String isbn;
	private String title;
	
	public BookId() {}
	
	public BookId(String isbn, String title) {
		this.isbn = isbn;
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "BookId [isbn=" + isbn + ", title=" + title + "]";
	}
	
}
