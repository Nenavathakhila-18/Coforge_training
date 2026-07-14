package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.SessionFactoryDelegatingImpl;

import com.coforge.model.Employee;

public class MainClass {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee(100,"Amu",40000,1);
		//session.save(employee); //insert
		//session.update(employee); //update
		
		//Employee emp = session.get(Employee.class, 201); //Select
		//System.out.println(emp);
		
		session.delete(employee);
		transaction.commit();
		session.close();
		factory.close();
		
		System.out.println("Employee Object deleted");
		
	}

}
