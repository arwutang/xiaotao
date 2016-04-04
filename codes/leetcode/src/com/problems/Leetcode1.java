package com.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Leetcode1 {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * <p>
     * You may assume that each input would have exactly one solution.
     * <p>
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     * @param nums input numbers
     * @param target target number
     * @return result
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            }
        }

        return new int[] {0, 0};
    }

    public static void main(String args[]) {
        Leetcode1 sol = new Leetcode1();
        System.out.println(Arrays.toString(sol.twoSum(new int[]{2, 11, 11, 15}, 22)));
    }
}