package com.test;


import java.util.HashSet;
import java.util.Set;

public class testAssert {
    public static void main(String args[]) {
        final String testStr = "this is a test";

        Set<Character> charset = new HashSet<>();

        for(Character c : testStr.toCharArray()) {
            if (charset.contains(c)) {
                System.out.println("find it ! char is: " + c);
            } else {
                charset.add(c);
            }
        }
    }

    private int test(boolean isTrue) {
        return isTrue ?  3 : 0;
    }
}
