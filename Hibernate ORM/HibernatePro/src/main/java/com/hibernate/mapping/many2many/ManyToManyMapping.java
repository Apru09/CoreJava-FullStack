package com.hibernate.mapping.many2many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class ManyToManyMapping {

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

        LaptopBean laptopBean3 = new LaptopBean();
        laptopBean3.setlId(3);
        laptopBean3.setBrand("Apple");
        laptopBean3.setModel("Macbook Air");
        laptopBean3.setRam(8);


        AlienBean alienBean = new AlienBean();
        alienBean.setaId(101);
        alienBean.setaName("Lalith");
        alienBean.setTech("MERN");

        AlienBean alienBean2 = new AlienBean();
        alienBean2.setaId(102);
        alienBean2.setaName("Prudhvi");
        alienBean2.setTech("Java");

        AlienBean alienBean3 = new AlienBean();
        alienBean3.setaId(103);
        alienBean3.setaName("Kiran");
        alienBean3.setTech("Machine Learning");


        alienBean.setLaptops(Arrays.asList(laptopBean, laptopBean2));
        alienBean2.setLaptops(Arrays.asList(laptopBean2, laptopBean3));
        alienBean3.setLaptops(Arrays.asList(laptopBean));

        laptopBean.setAliens(Arrays.asList(alienBean, alienBean3));
        laptopBean2.setAliens(Arrays.asList(alienBean, alienBean2));
        laptopBean3.setAliens(Arrays.asList(alienBean2));



        SessionFactory sf = new Configuration()
                .addAnnotatedClass(AlienBean.class)
                .addAnnotatedClass(LaptopBean.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(laptopBean);
        session.persist(laptopBean2);
        session.persist(laptopBean3);

        session.persist(alienBean);
        session.persist(alienBean2);
        session.persist(alienBean3);

        transaction.commit();

        AlienBean alienFetch = session.get(AlienBean.class, 102);
        System.out.println(alienFetch);

        session.close();
        sf.close();


    }
}
