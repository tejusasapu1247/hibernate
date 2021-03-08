package com.demo;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class ShowAll {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		SessionFactory factory=new MetadataSources(serviceRegistry)
				.buildMetadata().buildSessionFactory();
		
		Session session=factory.openSession();
//		List<Book> books=session
//				.createQuery("select b from Book b where b.id=:id")
//				.setParameter("id", 3)
//				.list();
		List<Book> books=session
				.createQuery("from Book")
				.list();
		books.forEach(b-> System.out.println(b));
		
		session.close();
		factory.close();
		
	}
}









