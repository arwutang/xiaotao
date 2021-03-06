package com.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 389. Find the Difference

 https://leetcode.com/problems/find-the-difference/

 Given two strings s and t which consist of only lowercase letters.

 String t is generated by random shuffling string s and then add one more letter at a random position.

 Find the letter that was added in t.

 Input:
 s = "abcd"
 t = "abcde"

 Output:
 e

 Explanation:
 'e' is the letter that was added.

 */
public class Leetcode389 {
    public char findTheDifference(String s, String t) {
        final char[] charArray1 = s.toCharArray();
        final char[] charArray2 = t.toCharArray();

        final Map<Character, Integer> map = new HashMap<>(26);

        for (Character c : charArray1) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c : charArray2) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);

                if (map.get(c) == -1) {
                    return c;
                }
            } else {
                return c;
            }
        }

        throw new RuntimeException("input not right");
    }

    public static void main(String args[])  {
        Leetcode389 sol = new Leetcode389();

        System.out.println(sol.findTheDifference("abcd", "abcde"));
    }
}
