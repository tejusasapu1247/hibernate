package com.mapping.one2many.uni;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.MySessionFactory;

public class Tester {

	public static void main(String[] args) {
		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		
		List<Department> departments= session.createQuery("from Department d").list();
		for(Department dept : departments) {
			System.out.println(dept.getDetpName());
			System.out.println("------------------------------");
			for(Employee e: dept.getEmployees()) {
				System.out.println(e);
			}
			System.out.println("------------------------------");
			
		}
/*
		Department dept1=new Department("Hcl finanacial department");
		Employee e1=new Employee("teju");
		Employee e2=new Employee("moksha");
		Employee e3=new Employee("sneha");
		
		dept1.getEmployees().add(e1);
		dept1.getEmployees().add(e2);
		dept1.getEmployees().add(e3);
		
		
		Department dept2=new Department("Hcl HR department");
		Employee e4=new Employee("Ram");
		Employee e5=new Employee("Shyam");
		Employee e6=new Employee("Vinnu");
		
		dept2.getEmployees().add(e4);
		dept2.getEmployees().add(e5);
		dept2.getEmployees().add(e6);
		
		
		Department dept3=new Department("Hcl Sales department");
		Employee e7=new Employee("Pooja");
		Employee e8=new Employee("Jathin");
		Employee e9=new Employee("Meghana");
		
		dept3.getEmployees().add(e7);
		dept3.getEmployees().add(e8);
		dept3.getEmployees().add(e9);
		
		
		session.save(dept1);
		session.save(dept2);
		session.save(dept3);
	*/	
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
