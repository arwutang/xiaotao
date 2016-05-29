package com.useconfig.dao;

import com.useconfig.model.Order;
import com.useconfig.model.User;
import com.useconfig.model.UserAttr;
import org.hibernate.AssertionFailure;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;


public class OrderDao {
    private SessionFactory sessionFactory;

    public OrderDao() {
        Configuration config = new Configuration().configure("useconfig/hibernate.cfg.xml");
        ServiceRegistry serviceRegistryBuilder = new ServiceRegistryBuilder()
                .applySettings(config.getProperties())
                .build();

        sessionFactory = config.buildSessionFactory(serviceRegistryBuilder);
    }

    public void insertOrder() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        User user = (User)session.get(User.class, 48);
        Set<Order> orderList = new HashSet<Order>();
        Order order1 = new Order(48, "test order 1");
        Order order2 = new Order(48, "test order 2");
        Order order3 = new Order(48, "test order 3");

        order1.setUser(user);
        order2.setUser(user);
        order3.setUser(user);

        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);

        user.setOrders(orderList);

        session.persist(user);

        tx.commit();
        session.close();
    }

    public void getUOrders() {
        Session session = sessionFactory.openSession();

        User user = (User) session.get(User.class, 48);
        Set<Order> orderList = user.getOrders();

        System.out.println(user);
        System.out.println(orderList);

        Assert.assertEquals(3, orderList.size());

        session.close();
    }
}
