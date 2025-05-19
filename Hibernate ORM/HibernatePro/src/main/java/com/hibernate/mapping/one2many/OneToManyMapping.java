package com.hibernate.mapping.one2many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class OneToManyMapping {

    public static void main(String[] args) {

        LaptopBean laptopBean = new LaptopBean();
        laptopBean.setlId(1);
        laptopBean.setBrand("Dell");
        laptopBean.setModel("Alienware");
        laptopBean.setRam(32);

        LaptopBean laptopBean2 = new LaptopBean();
        laptopBean2.setlId(2);
        laptopBean2.setBrand("Acer");
        laptopBean2.setModel("Aspire");
        laptopBean2.setRam(16);

        AlienBean alienBean = new AlienBean();
        alienBean.setaId(101);
        alienBean.setaName("Lalith");
        alienBean.setTech("MERN");
        alienBean.setLaptops(Arrays.asList(laptopBean, laptopBean2));

        laptopBean.setAlien(alienBean);
        laptopBean2.setAlien(alienBean);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(AlienBean.class)
                .addAnnotatedClass(LaptopBean.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(laptopBean);
        session.persist(laptopBean2);
        session.persist(alienBean);

        transaction.commit();

        AlienBean alienFetch = session.get(AlienBean.class, 101);
        System.out.println(alienFetch);

        session.close();
        sf.close();

    }
}
