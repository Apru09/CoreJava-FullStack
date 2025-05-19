package com.hibernate.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecords {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollNo(1);
        s1.setsName("Lalith");
        s1.setsAge(20);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.merge(s1);  // .merge() is used to update existing data, or create a new one.

        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s1);

    }
}
