package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TestLambda {
    public static void main(String args[]) {
        List<Integer> valList = new ArrayList<>();
        valList.add(1);
        valList.add(2);
        valList.add(3);
        valList.add(1);
        valList.add(2);
        valList.add(3);

        System.out.println(valList);

        Set<Integer> valSet = new HashSet<>();

        valList.forEach(val -> {
            // print can be commented, however I just want to test the multiline of lambda expression.
            System.out.printf("Put %d into set.\n", val);
            valSet.add(val);
        });

        System.out.println(valSet);
    }
}
