package com.xiaotaot.codes;

import org.junit.Test;

import java.util.Arrays;


public class StatusTest {
    @Test
    public void test() {
        int[] testList = new int[100000000];

        for (int i = 0; i < testList.length; i++) {
            testList[i] = 1;
        }

        long starTime1 = System.currentTimeMillis();

        int sum1 = Arrays.stream(testList).reduce(0, this::testIntegerSum);

        System.out.println(System.currentTimeMillis() - starTime1);
        System.out.println(sum1);
    }

    @Test
    public void test2() {
        int[] testList = new int[100000000];

        for (int i = 0; i < testList.length; i++) {
            testList[i] = 1;
        }

        long starTime2 = System.currentTimeMillis();

        int sum2 = Arrays.stream(testList).reduce(0, Integer::sum);

        System.out.println(System.currentTimeMillis() - starTime2);
        System.out.println(sum2);
    }


    private Integer testIntegerSum(Integer sum, Integer num) {
        return sum + num;
    }
}
