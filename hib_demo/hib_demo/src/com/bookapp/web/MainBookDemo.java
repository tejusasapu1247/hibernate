package com.bookapp.web;

import java.util.*;

import com.bookapp.dao.*;

public class MainBookDemo {
	public static void main(String[] args) {
		BookDao dao=new BookDaoImpl();
//		System.out.println(".....after adding a new book.....");
//		Book book=new Book("ATF47", "Peace", "Bhanu", 1000);
//		dao.addBook(book);
//		List<Book> books=dao.getAllBooks();
//		books.forEach(b-> System.out.println(b));
//		dao.deleteBook(10);
		
		
		Book b=new Book("ATF47", "Peace", "Bhanu",7000);
		dao.updateBook(12, b);
		
		List<Book> books=dao.getAllBooks();
		books.forEach(b1-> System.out.println(b1));
		
		System.out.println("get book by id = "+dao.getBookById(12));
		}

}
