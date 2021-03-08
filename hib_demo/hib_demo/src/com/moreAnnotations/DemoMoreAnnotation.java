package com.moreAnnotations;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bookapp.dao.MySessionFactory;

public class DemoMoreAnnotation {

	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
		Book book=new Book("123", "java", "Jay", new Date(), 567);
		Session session=factory.openSession();
		Transaction tr=session.getTransaction();
		try {
			
		}catch (HibernateException e) {
			tr.rollback();
		}
	}

}
