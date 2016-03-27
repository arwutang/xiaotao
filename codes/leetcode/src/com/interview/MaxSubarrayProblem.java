package com.interview;


public class MaxSubarrayProblem {

    /**
     * Maximum Sum of Subarray
     * Given an array of numbers:
     * int array[N];
     * find the subarray with the maximum sum (maximize sum(i = i1 .. i2, array[i])).
     * <p>
     * For example, given this array:
     * 10 20 -40 5 5 10 30 -60
     * The subarray with the largest sum is array[3] .. array[6] (5 5 10 30) at 50.
     *
     * @param array the given array
     * @return the max sum of sub-array
     */
    public int maxSubarrayProblem01(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int maxSubSum = 0;
        int currentMax = 0;

        for (int current : array) {
            currentMax += current;

            if (currentMax >= 0) {
                if (currentMax > maxSubSum) {
                    maxSubSum = currentMax;
                }
            } else {
                currentMax = 0;
            }
        }

        return maxSubSum;
    }

    /**
     * DP Solution
     * @param array input
     * @return max sum of sub array
     */
    public int maxSubarrayProblem02(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int[] resTable = new int[array.length];

        // resTable[i] means sum maxSubarray end with i
        // resTable[i] = max(resTable[i-1] + array[i], array[i]); 1 <= i < n-1
        // resTable[0] = array[0]
        resTable[0] = array[0];
        int maxValue = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            resTable[i] = Math.max(resTable[i - 1] + array[i], array[i]);
            maxValue = Math.max(maxValue, resTable[i]);
        }

        return maxValue;
    }

    public static void main(String[] args) {
        // List<Integer> array = Arrays.asList(10, 20, -40, 5, 5, 10, 30, -60);
        int[] array = new int[]{10, 20, -40, 5, 5, 10, 30, -60};

        System.out.println(new MaxSubarrayProblem().maxSubarrayProblem01(array));

        System.out.println(new MaxSubarrayProblem().maxSubarrayProblem02(array));
    }
}
