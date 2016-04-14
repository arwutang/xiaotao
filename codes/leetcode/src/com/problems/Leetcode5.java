package com.problems;


public class Leetcode5 {
    /**
     * Given a string S, find the longest palindromic substring in S.
     * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
     *
     * @param s string to process
     * @return the longest longest palindrome string
     */
    public String longestPalindrome(String s) {
        if (s == null || s.equals("")) {
            return null;
        }

        char[] charArray = s.toCharArray();
        int maxStart = 0;
        int maxEnd = 0;

        for (int i = 1; i < charArray.length; i++) {
            int length1 = getPalindrome(charArray, i, i);

            if (2 * length1 - 1 > maxEnd - maxStart + 1) {
                maxStart = i - (length1 - 1);
                maxEnd = i + (length1 - 1);
            }

            int length2 = getPalindrome(charArray, i - 1, i);

            if (2 * length2 > maxEnd - maxStart + 1) {
                maxStart = i - 1 - (length2 - 1);
                maxEnd = i + (length2 - 1);
            }
        }

        return s.substring(maxStart, maxEnd + 1);
    }

    private int getPalindrome(char[] charArray, int c1, int c2) {
        int length = 0;
        while (c1 >=0 && c2 < charArray.length && charArray[c1] == charArray[c2]) {
            c1 --;
            c2 ++;

            length ++;
        }

        return length;
    }

    public static void main(String args[]) {
        Leetcode5 sol = new Leetcode5();

        System.out.println(sol.longestPalindrome("aaaa"));
    }
}