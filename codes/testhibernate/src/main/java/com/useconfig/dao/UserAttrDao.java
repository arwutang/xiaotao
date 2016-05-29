package com.useconfig.dao;

import com.useconfig.model.User;
import com.useconfig.model.UserAttr;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class UserAttrDao {
    private SessionFactory sessionFactory;

    public UserAttrDao() {
        Configuration config = new Configuration().configure("useconfig/hibernate.cfg.xml");
        ServiceRegistry serviceRegistryBuilder = new ServiceRegistryBuilder()
                .applySettings(config.getProperties())
                .build();

        sessionFactory = config.buildSessionFactory(serviceRegistryBuilder);
    }

    public void insertUserAttr() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        UserAttr userAttr = new UserAttr(48);
        userAttr.setGender(1);
        userAttr.setAge(27);
        session.persist(userAttr);

        tx.commit();
        session.close();
    }

    public void getUserAndUserAttr() {
        Session session = sessionFactory.openSession();

        User user = (User) session.get(User.class, 48);
        UserAttr attr = user.getUserAttr();

        session.close();

        System.out.println(user);
        System.out.println(attr);
    }
}
