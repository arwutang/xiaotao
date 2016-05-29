package com.useconfig.dao;

import com.useconfig.model.User;
import org.junit.Assert;
import org.junit.Test;


public class OrderDaoTest {
    @Test
    public void insertOrderTest() throws Exception {
        OrderDao dao = new OrderDao();
        dao.insertOrder();
    }

    @Test
    public void getOrdersTest() throws Exception {
        OrderDao dao = new OrderDao();
        dao.getUOrders();
    }
}