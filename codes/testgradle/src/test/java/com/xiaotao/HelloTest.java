package com.xiaotao;


import org.junit.Assert;
import org.junit.Test;



public class HelloTest {
    @Test
    public void testMain() {
        Hello.tryLog();
        Assert.assertTrue("test ut failed", true);
    }
}