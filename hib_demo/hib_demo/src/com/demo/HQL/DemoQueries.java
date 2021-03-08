package com.demo.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.MySessionFactory;

public class DemoQueries {

	public static void main(String[] args) {
		
		SessionFactory factory=MySessionFactory.getSessionFactory();
		Session session=factory.openSession();
		
		//List<Customer> customers=session.createNativeQuery("select * from cust_table").addEntity(Customer.class).
		
		session.close();
		factory.close();
		
		
		
		
		
		/*
		 * 
		 * session.getTransaction().begin();
		  session.getTransaction().commit();
		 Customer customer1=new Customer("teju", "ooty");
		Customer customer2=new Customer("ram", "kerala");
		Customer customer3=new Customer("shyam", "delhi");
		Customer customer4=new Customer("somu", "rajam");
		session.save(customer1);
		session.save(customer2);
		session.save(customer3);
		session.save(customer4); 
		 * */
		 
		
	}

}
