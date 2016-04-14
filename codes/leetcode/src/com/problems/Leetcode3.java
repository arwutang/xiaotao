package com.problems;

import java.util.ArrayList;
import java.util.List;


public class Leetcode3 {
    /**
     * Given a string, find the length of the longest substring without repeating characters.
     * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
     * For "bbbbb" the longest substring is "b", with the length of 1.
     * @param s string to process
     * @return the longest substring without repeating letters
     */
    public int lengthOfLongestSubstring01(String s) {
        if (s == null) {
            return 0;
        }

        int maxLength = 0;

        char[] charArray = s.toCharArray();
        List<Character> temp = new ArrayList<>();

        for (char c : charArray) {
            int findIndex = temp.indexOf(c);
            if (findIndex == -1) {
                temp.add(c);
            } else {
                temp = temp.subList(findIndex, temp.size() - 1);
            }

            maxLength = Integer.max(temp.size(), maxLength);
        }

        return maxLength;
    }

    public int lengthOfLongestSubstring02(String s) {
        if (s == null) {
            return 0;
        }

        int maxLength = 0;
        int p = 0;

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = p; j < i; j++) {
                if (charArray[j] == charArray[i]) {
                    p = j + 1;
                }
            }
            maxLength = Integer.max(i - p + 1, maxLength);
        }

        return maxLength;
    }

    public static void main(String args[]) {
        Leetcode3 sol = new Leetcode3();

        System.out.println(sol.lengthOfLongestSubstring01("abcabcbb"));
        System.out.println(sol.lengthOfLongestSubstring02("abcabcbb"));
    }
}