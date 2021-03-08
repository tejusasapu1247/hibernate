package com.inheritance.single_table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.MySessionFactory;

public class AccountTester {

	public static void main(String[] args) {
		SessionFactory factory=MySessionFactory.getSessionFactory();
		Session session=factory.openSession();
//		session.getTransaction().begin();
//		SavingAccount a1=new SavingAccount("teju", 5000, 3.4);
//		CurrentAccount a2= new CurrentAccount("moksha",7000, 7.3);
//		session.save(a1);
//		session.save(a2);
//		session.getTransaction().commit();
//		session.close();
//		factory.close();
	}

}
