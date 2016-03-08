package com.problems;


public class Leetcode258 {
    public int addDigits(int num) {
        while (num >  9) {
            int tempNum = 0;

            for (int i = 0; i < String.valueOf(num).length(); i++) {
                tempNum += Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
            }

            num = tempNum;
        }

        return num;
    }

    public static void main(String args[]) {
        Leetcode258 sol = new Leetcode258();
        System.out.println(sol.addDigits(38));
    }
}