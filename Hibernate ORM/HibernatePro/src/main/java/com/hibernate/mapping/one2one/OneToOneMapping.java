package com.hibernate.mapping.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMapping {

    public static void main(String[] args) {

        LaptopBean laptopBean = new LaptopBean();
        laptopBean.setlId(1);
        laptopBean.setBrand("Asus");
        laptopBean.setModel("Tuf Gaming A15");
        laptopBean.setRam(16);

        AlienBean alienBean = new AlienBean();
        alienBean.setaId(101);
        alienBean.setaName("Prudhvi");
        alienBean.setTech("Java");
        alienBean.setLaptop(laptopBean);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(AlienBean.class)
                .addAnnotatedClass(LaptopBean.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(laptopBean);
        session.persist(alienBean);

        transaction.commit();

        AlienBean alienFetch = session.get(AlienBean.class, 101);
        System.out.println(alienFetch);

        session.close();
        sf.close();



    }
}
