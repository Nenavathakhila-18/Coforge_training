package com.coforge.assignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

    public static void main(String[] args) {

        // Load Hibernate Configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        // Create SessionFactory
        SessionFactory factory = configuration.buildSessionFactory();

        // Open Session
        Session session = factory.openSession();

        // Begin Transaction
        Transaction transaction = session.beginTransaction();

        // Create Course Objects
        Course java = new Course(1, "Java");
        Course hibernate = new Course(2, "Hibernate");
        Course springBoot = new Course(3, "Spring Boot");

        // Create Student Objects
        Student student1 = new Student(101, "John");
        Student student2 = new Student(102, "James");
        Student student3 = new Student(103, "Priya");

        // Assign Courses to Students

        // John
        student1.getCourses().add(java);
        student1.getCourses().add(hibernate);

        // James
        student2.getCourses().add(java);

        // Priya
        student3.getCourses().add(hibernate);
        student3.getCourses().add(springBoot);

        // Maintain both sides

        java.getStudents().add(student1);
        java.getStudents().add(student2);

        hibernate.getStudents().add(student1);
        hibernate.getStudents().add(student3);

        springBoot.getStudents().add(student3);

        // Save Students
        // Because CascadeType.ALL is used, Courses are also saved automatically.
        session.save(student1);
        session.save(student2);
        session.save(student3);

        // Commit Transaction
        transaction.commit();

        System.out.println("Records Saved Successfully");

        // Close Resources
        session.close();
        factory.close();
    }
}