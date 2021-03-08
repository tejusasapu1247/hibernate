package com.one_class_2_table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.MySessionFactory;

public class Tester {

	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
		Customer customer=new Customer("teju", "ooty", "234567433", "teju@gmail.com");
		Session session=factory.openSession();
		session.getTransaction().begin();
		session.save(customer);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
