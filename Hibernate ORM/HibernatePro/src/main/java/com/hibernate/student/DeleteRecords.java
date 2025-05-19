package com.hibernate.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecords {

    public static void main(String[] args) {

        Student s1 = null;

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        s1 = session.get(Student.class, 1);

        Transaction transaction = session.beginTransaction();

        session.remove(s1);

        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s1);
    }
}
