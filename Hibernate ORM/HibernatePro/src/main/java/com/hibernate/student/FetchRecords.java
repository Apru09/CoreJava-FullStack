package com.hibernate.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchRecords {

    public static void main(String[] args) {

        Student s2 = null;

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        s2 = session.get(Student.class, 1);

        session.close();
        sf.close();

        System.out.println(s2);
    }
}
