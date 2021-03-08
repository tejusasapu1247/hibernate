package com.two_class_1_table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.MySessionFactory;

public class Tester {

	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
		Session session=factory.openSession();
		
		SchoolDetails schoolDetails= new SchoolDetails("DAV public School,Rajam,India", false, 7000);
		
		School school=new School("Dav", schoolDetails);
		
		session.getTransaction().begin();
		
		session.save(school);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
