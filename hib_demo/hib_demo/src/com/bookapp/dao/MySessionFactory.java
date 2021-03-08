package com.bookapp.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class MySessionFactory {
	private MySessionFactory() {}
	private static SessionFactory factory;
	public static SessionFactory getSessionFactory() {
		ServiceRegistry serviceRegistry=
				new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		factory=new MetadataSources(serviceRegistry).buildMetadata()
				.buildSessionFactory();
		return factory;
	}
	
}
