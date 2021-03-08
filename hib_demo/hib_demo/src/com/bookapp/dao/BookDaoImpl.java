package com.bookapp.dao;

import java.util.List;
import org.hibernate.*;
import org.hibernate.SessionFactory;

public class BookDaoImpl implements BookDao {
	public SessionFactory factory;

	public BookDaoImpl() {
		factory = MySessionFactory.getSessionFactory();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBooks() {
		Session session = factory.openSession();
		List<Book> books = session.createQuery("from Book").list();
		session.close();
		return books;
	}

	@Override
	public void addBook(com.bookapp.dao.Book book) {
		Session session = factory.openSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
			session.save(book);
			tr.commit();
		} catch (HibernateException e) {
			tr.rollback();
		}
		session.close();

	}

	@Override
	public void deleteBook(int id) {
		Session session = factory.openSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
			Book book = getBookById(id);
			session.delete(book);
			tr.commit();
		} catch (HibernateException e) {
			tr.rollback();
		}
		session.close();
System.out.println("book is deleted");
	}

	@Override
	public void updateBook(int id, Book book) {
		Session session = factory.openSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
			Book updateBook = getBookById(id);
			if(updateBook!=null) {
			updateBook.setPrice(book.getPrice());
			session.update(updateBook);
			System.out.println(updateBook);
			tr.commit();
			}else {
				throw new BookNotFoundException("book with " + id + "not found..");
			}
		} catch (HibernateException e) {
			tr.rollback();
		}
		session.close();
	}

	@Override
	public Book getBookById(int id) {
		Session session = factory.openSession();
		Book book = session.get(Book.class, id);
		if (book != null) {
			return book;
		} else {
			throw new BookNotFoundException("book with " + id + "not found..");
		}
	}
}
