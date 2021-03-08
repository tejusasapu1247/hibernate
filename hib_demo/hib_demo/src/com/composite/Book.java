package com.composite;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="composite_table")
public class Book {
	@Id
	private BookId id;
	private String author;
	@Temporal(TemporalType.DATE)
	private Date pubDate;
	private double price;
	public Book(BookId id, String author, Date pubDate, double price) {
		this.id = id;
		
		this.author = author;
		this.pubDate = pubDate;
		this.price = price;
	}
	public BookId getId() {
		return id;
	}
	public void setId(BookId id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id  + ", author=" + author + ", pubDate=" + pubDate + ", price="
				+ price + "]";
	}
	
	
	
	
}