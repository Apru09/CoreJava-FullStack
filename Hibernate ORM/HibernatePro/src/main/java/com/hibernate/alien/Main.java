package com.hibernate.alien;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setBrand("Macbook Air");
        l1.setModel("M4");
        l1.setRam(16);

        Alien a1 = new Alien();
        a1.setaId(101);
        a1.setaName("Prudhvi");
        a1.setaTech("Java");
        a1.setLaptop(l1);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();

        Alien a2 = session.get(Alien.class, 101);
        System.out.println(a2);

        session.close();
        sf.close();

    }
}

/*
* When this code is successfully compiled, a table named 'alien' is created with a record of
* alien and laptop properties, however a separate table is not created.
*
* This is because of a special annotation used on laptop class which is '@Embeddable'. This makes sure
* that a separate table is not created altogether, but the properties of the embeddable class are
* combined within the table of alien.
*
*
* After saving the data using .persist(), we are writing a search query .get() to retrieve the
* data from the database. However, we can see the console that the select query is never fired.
*
* WHY??
*
* This is because of an optimisation feature of hibernate.
* Hibernate has a 'first-level cache' which ensures that same object is returned when requested
* multiple times within the same session.
*
* When you call session.get() with the same ID (101), Hibernate checks its first-level cache first
* and finds the object there.
* Since the object is already in memory, Hibernate doesn't need to query the database again.
*
* */
