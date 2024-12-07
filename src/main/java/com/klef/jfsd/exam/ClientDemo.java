package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Device device = new Device();
        device.setBrand("Generic");
        device.setModel("X1");
        device.setPrice(150.0);

        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Apple");
        smartphone.setModel("iPhone 14");
        smartphone.setPrice(999.99);
        smartphone.setOperatingSystem("iOS");
        smartphone.setCameraResolution("12MP");

        Tablet tablet = new Tablet();
        tablet.setBrand("Samsung");
        tablet.setModel("Galaxy Tab S8");
        tablet.setPrice(699.99);
        tablet.setScreenSize("11 inches");
        tablet.setBatteryLife(15);

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(device);
        session.save(smartphone);
        session.save(tablet);

        transaction.commit();
        session.close();
        factory.close();

        System.out.println("Records inserted successfully!");
    }
}
