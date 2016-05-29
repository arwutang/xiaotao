package com.useconfig.dao;

import com.useconfig.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.Date;


public class UserDao {
    private SessionFactory sessionFactory;

    public UserDao() {
        Configuration config = new Configuration().configure("useconfig/hibernate.cfg.xml");
        ServiceRegistry serviceRegistryBuilder = new ServiceRegistryBuilder()
                .applySettings(config.getProperties())
                .build();

        sessionFactory = config.buildSessionFactory(serviceRegistryBuilder);
    }

    public void insertUser() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        User user = new User("admin01", "123456", new Date());
        session.persist(user);

        tx.commit();
        session.close();
    }

    public void updateUser() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        User user = (User) session.get(User.class, 1);
        user.setUsername("new_username_1");

        tx.commit();
        session.close();
    }

    public void mergeUser() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        User user = new User();
        user.setId(100);
        user.setUsername("admin100");
        user.setPassword("123456");
        user.setRegisterDatetime(new Date());

        user = (User) session.merge(user);
        user.setPassword("564321");

        tx.commit();
        session.close();
    }

    public void deleteUser() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        User user = (User) session.get(User.class, 1);
        session.delete(user);

        tx.commit();
        session.close();
    }

    public User getUser() {
        Session session = sessionFactory.openSession();

        User user = (User) session.get(User.class, 48);

        session.close();

        return user;
    }

    public void loadUser() {
        Session session = sessionFactory.openSession();

        User user = (User) session.load(User.class, 1);

        System.out.println(user);

        session.close();
    }

    public void getUserList() {

    }
}
