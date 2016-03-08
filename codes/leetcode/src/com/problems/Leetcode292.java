package com.problems;


public class Leetcode292 {
    public boolean canWinNim(int n) {
        if (n == 0) {
            return false;
        }else if (n <= 3) {
            return true;
        }else if (n == 4) {
            return false;
        }

        return canWinNim(n - 4 * (n / 4));
    }

    public static void main(String args[]) {
        long start = System.currentTimeMillis();

        Leetcode292 sol = new Leetcode292();
        System.out.println(sol.canWinNim(1348820612));

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}