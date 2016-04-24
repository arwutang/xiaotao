package com.useconfig.dao;

import com.useconfig.model.User;
import org.junit.Assert;
import org.junit.Test;


public class UserDaoTest {
    @Test
    public void insertUser() throws Exception {
        UserDao dao = new UserDao();
        dao.insertUser();
    }

    @Test
    public void updateUser() throws Exception {
        UserDao dao = new UserDao();
        dao.updateUser();
    }

    @Test
    public void mergeUser() throws Exception {
        UserDao dao = new UserDao();
        dao.mergeUser();
    }

    @Test
    public void deleteUser() throws Exception {
        UserDao dao = new UserDao();
        dao.deleteUser();
    }

    @Test
    public void getUser() throws Exception {
        User user = new UserDao().getUser();
        System.out.println(user);

        Assert.assertNotNull(user);
    }

    @Test
    public void loadUser() throws Exception {
        new UserDao().loadUser();
    }

    @Test
    public void getUserList() throws Exception {

    }

}