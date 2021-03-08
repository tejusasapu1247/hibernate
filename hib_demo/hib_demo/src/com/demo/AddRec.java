package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class AddRec {

	public static void main(String[] args) throws ParseException {
		//core java, spring , hibreate
		
		//SessionFactory
		/*
		 * 1. must be singleton 
		 * 2. it is thread safe
		 * 3. it is heavy object to create again and again ie it should be created
		 * once and kept in servlet context scope ( in web app)
		 */
		ServiceRegistry serviceRegistry=
				new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		SessionFactory factory=new MetadataSources(serviceRegistry).buildMetadata()
				.buildSessionFactory();
		
		//Session
		/*
		 * 1. it is the main object of hiberante ( it is a container)
		 * 2. it is not thread safe 
		 * 3. should not be share among two threads
		 * 4. session object is used to maintain life cycle of the entity object
		 * 
		 */
		
		Session session=factory.openSession();
		
		//strat the tr
		
		session.getTransaction().begin();
		//use save method to save book object to db
		
//		Book  book1=new Book("TR34", "spring in action", "foo",
//				new Date(), 700.0);
//		Book  book2=new Book("ME34", "ejb in action", "bar",
//				new SimpleDateFormat("dd/MM/yyyy").parse("11/11/2011"), 800.0);
//		Book  book3=new Book("EQ123", "servlet jsp head first", "ks",
//				new SimpleDateFormat("dd/MM/yyyy").parse("1/5/2019"), 500.0);
//		
//		
		
//		session.save(book1);
//		session.save(book2);
//		session.save(book3);
//	
		Book  book=new Book("TJ47", "Hibernate in action", "Ajith",
				new Date(), 750.0);
		session.save(book);		
		//finally commit the tx
		session.getTransaction().commit();
		//close the session
		session.close();
		//close the session factory
		factory.close();
		
	}
}
