package com.lifecycle;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.bookapp.dao.MySessionFactory;

public class Tester {

	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
		Session session=factory.openSession();
		System.out.println(session);
		Transaction tr=session.getTransaction();
		tr.begin();
		Customer c=session.get(Customer.class,1);
		//session.close();
		System.out.println(c);
		//System.out.println(c);
//		c.setAddress("delhi");
//		c.setAddress("kerala");
//		c.setAddress("Bangalore");
		tr.commit();
		
		//System.out.println(session);
		session.close();
		factory.close();
		
	
		
		
//		session.evict(c);
//		Customer c1=session.get(Customer.class, 1);
//		System.out.println(session);
////		Customer c1=new Customer("teju", "ooty");
//		Customer c2=new Customer("moksha", "kerala");	
//		Customer c3=new Customer("manoj", "delhi");
//		Transaction tr=session.getTransaction();
//		try {
//			tr.begin();
//			session.save(c1);
//			session.save(c2);
//			session.save(c3);
//			tr.commit();	
//		}catch (HibernateException e) {
//			tr.rollback();
//		}
//		
//		System.out.println(session.get(Customer.class, 1));
//		session.close();
		//factory.close();
		
	}

}
