package com.problems;


public class Leetcode84 {
    public boolean canWinNim(int n) {
        if (n <= 3) {
            return false;
        }

        boolean[] resultTable = new boolean[3];
        resultTable[0] = false;
        resultTable[1] = false;
        resultTable[2] = false;

        for (int i = 4; i <= n; i++) {
            resultTable[(i - 4) % 3] = !(resultTable[(i - 4) % 3] && resultTable[(i - 3) % 3] && resultTable[(i - 2) % 3]);
        }

        return resultTable[(n - 4) % 3];
    }

    public static void main(String args[]) {
        Leetcode84 sol = new Leetcode84();
        System.out.println(sol.canWinNim(100));
    }
}