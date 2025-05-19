package com.hibernate.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateExample {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollNo(1);
        s1.setsName("Lalith");
        s1.setsAge(18);

        // Configuration object is created to build a session factory, which provides a session
        // to manage transactions.
        Configuration cfg = new Configuration();

        // Providing the class on whose properties the table is created.
        cfg.addAnnotatedClass(Student.class);

        // Configuration object now looks into hibernate.cfg.xml for database details.
        cfg.configure();

        // Session factory is a heavyweight object (consumes more resources),
        // so always close it after the transaction.
        SessionFactory sf = cfg.buildSessionFactory();

        // A hibernate session is started.
        Session session = sf.openSession();

        // A transaction object is needed for the transaction between the application and the database.
        Transaction transaction = session.beginTransaction();
        session.persist(s1);  // Save(); is deprecated.
        transaction.commit();

        session.close();
        sf.close();
        System.out.println(s1);
    }
}
