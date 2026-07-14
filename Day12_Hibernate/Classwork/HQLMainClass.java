package com.coforge.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.SessionFactoryDelegatingImpl;

import com.coforge.model.Employee;

public class HQLMainClass {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		/*
		 * HQL Select Query query = session.createQuery("from Employee");
		 * List<Employee>list = query.list(); System.out.println(list);
		 */

		/*
		 * HQL Static select Query query =
		 * session.createQuery("from Employee where eid = 101"); List<Employee>list =
		 * query.list(); System.out.println(list);
		 */

		// HQL dynamic select
		/*
		 * Query query = session.createQuery("from Employee where eid = :ID");
		 * query.setParameter("ID", 101); List<Employee>list = query.list();
		 * System.out.println(list);
		 */

		// HQL specific column select
		/*
		 * Query query = session.createQuery("select ename from Employee");
		 * List<Employee>list = query.list(); System.out.println(list);
		 */

		// HQL Update
		/*
		 * Query query = session.createQuery(
		 * "update Employee set ename = :name where eid = :id");
		 * 
		 * query.setParameter("id", 101); query.setParameter("name", "Amulya");
		 * 
		 * int n = query.executeUpdate();
		 * 
		 * System.out.println(n);
		 * 
		 * if (n == 1) { System.out.println("Employee object updated"); } else {
		 * System.out.println("Employee object not updated"); }
		 */

		// HQL Delete
		Query query = session.createQuery("delete from Employee where eid = :id");

		query.setParameter("id", 101);

		int n = query.executeUpdate();

		System.out.println(n);

		if (n == 1) {
			System.out.println("Employee object Deleted");
		} else {
			System.out.println("Employee object not Deleted");
		}

		transaction.commit();
		session.close();
		factory.close();

		transaction.commit();
		session.close();
		factory.close();

	}

}
