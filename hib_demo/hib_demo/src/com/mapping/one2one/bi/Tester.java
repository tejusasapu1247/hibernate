package com.mapping.one2one.bi;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.MySessionFactory;

public class Tester {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		
//		Employee e=session.get(Employee.class, 3);
//		session.delete(e);

		Employee emp=session.get(Employee.class, 1);
		List<Employee> employess=session.createQuery("from Parking p join fetch p.employe Employee").list();
		for(Employee e:employess) {
			System.out.println(e.getEmpName());
			System.out.println(e.getParking());
		}
	
		session.getTransaction().commit();
		session.close();
		factory.close();
		
//		Parking parking = new Parking("Ip2");
//		Employee emp = new Employee("Rohith");
//		
//		Parking parking1 = new Parking("M22");
//		Employee emp1 = new Employee("Rahul");
//		
//		Parking parking2 = new Parking("B31");
//		Employee emp2 = new Employee("Kavitha");
//		
//		parking.setEmployee(emp);
//		emp.setParking(parking);
//		session.save(emp);
		
		
		
		//session.save(parking);
		
//		parking1.setEmployee(emp1);
//		emp1.setParking(parking1);
//		session.save(emp1);
//		//session.save(parking1);
//		
//		parking2.setEmployee(emp2);
//		emp2.setParking(parking2);
//		session.save(emp2);
//		//session.save(parking2);
//		
//		session.getTransaction().commit();
//		session.close();
//		
//		
//		

		//Employee emp=session.get(Employee.class, 1);
//		List<Employee> employess=session.createQuery("from Employee e join fetch e.parking Parknig").list();
//		for(Employee e:employess) {
//			System.out.println(e.getEmpName());
//			System.out.println(e.getParking());
//		}
//	
		
//		Parking parking = new Parking("Ip2");
//		Employee emp = new Employee("Rohith", parking);
//		
//		Parking parking1 = new Parking("M22");
//		Employee emp1 = new Employee("Rahul", parking1);
//		
//		Parking parking2 = new Parking("B31");
//		Employee emp2 = new Employee("Kavitha", parking2);
//		
		
		
		//session.save(parking);
		//session.save(emp);
		
		//session.save(parking1);
		//session.save(emp1);
		
		//session.save(parking2);
		//session.save(emp2);
		
		
		
	}

}
