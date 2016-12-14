package com.problems;

/**
 344. Reverse String

 Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".

 */
public class Leetcode344 {
    public String reverseString(String s) {
        if (s ==null) {
            return null;
        }

        final char[] charArray = s.toCharArray();

        final StringBuilder sb = new StringBuilder(s.length());

        for(int i = s.length() - 1; i >=0; i--) {
            sb.append(charArray[i]);
        }

        return sb.toString();
    }

    public static void main(String args[])  {
        Leetcode344 sol = new Leetcode344();

        System.out.println(sol.reverseString("hello world"));
    }
}
