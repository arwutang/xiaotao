package com.problems;


public class Leetcode6 {
    /**
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
     * (you may want to display this pattern in a fixed font for better legibility)
     *
     * P     A     H     N
     * A  P  L  S  I  I  G
     * Y     I     R
     *
     * And then read line by line: "PAHNAPLSIIGYIR"
     *
     * @param s       string to convert
     * @param numRows number of rows
     * @return convert string
     */
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }

        String[] rows = new String[numRows];

        int i = 0;
        boolean isUpToDown = true;

        for (Character c : s.toCharArray()) {
            if (i == 0) {
                isUpToDown = true;
            }

            if (i == numRows - 1 ) {
                isUpToDown = false;
            }

            rows[i] = rows[i] == null ? c.toString() : rows[i] + c.toString();

            i = isUpToDown? i + 1 : i - 1;
        }

        String result = "";

        for (String r : rows) {
            result += r == null ? "" : r;
        }

        return result;
    }

    public static void main(String args[]) {
        Leetcode6 sol = new Leetcode6();

        System.out.println(sol.convert("PAYPALISHIRING", 3));
    }
}