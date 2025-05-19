package com.hibernate.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        Laptop l1 = new Laptop();
        l1.setlId(1);
        l1.setBrand("Apple");
        l1.setModel("Macbook Pro M4");
        l1.setRam(64);

        Laptop l2 = new Laptop();
        l2.setlId(2);
        l2.setBrand("Asus");
        l2.setModel("Strix");
        l2.setRam(32);

        Laptop l3 = new Laptop();
        l3.setlId(3);
        l3.setBrand("Dell");
        l3.setModel("Alienware");
        l3.setRam(16);

        Laptop l4 = new Laptop();
        l4.setlId(4);
        l4.setBrand("HP");
        l4.setModel("Victus");
        l4.setRam(8);

        Laptop l5 = new Laptop();
        l5.setlId(5);
        l5.setBrand("Apple");
        l5.setModel("Macbook Air");
        l5.setRam(32);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        session.persist(l4);
        session.persist(l5);

        transaction.commit();
        session.close();

        //New session to fire select query, or else first-level cache is used.
        Session sessionFetch = sf.openSession();

        Laptop fetch = sessionFetch.get(Laptop.class, 1);
        System.out.println(fetch);

        System.out.println();

        // .get() can be used to fetch on the basis on primary key only. How do we fetch records
        // on the basis of other property like ram? USING HQL.

        // In SQL, we say 'SELECT * from laptop where ram=32'.
        // In HQL, we say 'from Laptop where ram=32'.

        System.out.println("Using HQL");
        System.out.println();

        Query query1 = sessionFetch.createQuery("from Laptop where ram=16");
        List<Laptop> laptopsByRam = query1.getResultList();
        System.out.println(laptopsByRam);

        //Setting filters and fetching.

        String brand = "Apple";
        Query query2 = sessionFetch.createQuery("from Laptop where brand like ?1");
        query2.setParameter(1, brand);
        List<Laptop> laptopsbyBrand = query2.getResultList();
        System.out.println(laptopsbyBrand);

        sessionFetch.close();
        sf.close();
    }
}
