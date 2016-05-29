package com.useconfig.dao;

import org.junit.Test;


public class UserAttrDaoTest {
    @Test
    public void insertUserAttrTest() throws Exception {
        UserAttrDao dao = new UserAttrDao();
        dao.insertUserAttr();
    }

    @Test
    public void getUserAndUserAttrTest() throws Exception {
        UserAttrDao dao = new UserAttrDao();
        dao.getUserAndUserAttr();
    }
}