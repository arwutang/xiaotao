package com.interview;

import javafx.util.Pair;

public class BestSquare {

    /**
     * Premise
     * The problem is to determine the dimensions (x,y) of a grid
     * that is as square as possible and large enough to contain n elements with no more than 2 empty spaces.
     * Orientation of the grid does not matter (tall vs. wide).
     * <p>
     * Distilled problem statement: given n, minimize |x - y| such that n <= x * y <= n + 2 and n,y,x are positive integers.
     * <p>
     * Highlights
     * General problem solving
     * Understanding the problem rules
     * Multiple solutions: brute force or optimized
     * Loop design and use
     * <p>
     * Examples
     * n = 4
     * x = 2, y = 2
     * 0 empty spaces
     * square
     * <p>
     * n = 17
     * x = 6, y = 3
     * 1 empty space
     * more square than other options (x = 9, y = 2... etc)
     * <p>
     * n = 23
     * x = 5, y = 5
     * 2 empty spaces
     * square, better than other options with fewer empty spaces (x = 6, y = 4)
     * consider withholding this case since the optimal solution has 2 empty spaces
     * <p>
     * n = 18
     * x = 5, y = 4
     * 2 empty spaces
     * more square than x = 6, y = 3which has no empty spaces)
     *
     * @param n input of n
     */
    public Pair<Integer, Integer> calculateDimensions(int n) {
        int x = (int) Math.sqrt(n);
        int y = (int) Math.sqrt(n);

        if (x * x == n) {
            return new Pair<>(x, y);
        } else {
            while (x * y > n + 2 || x * y < n) {
                x++;
                y = (int) Math.ceil((double) n / x);
            }

            return new Pair<>(x, y);
        }
    }

    public static void main(String[] args) {
        System.out.print(new BestSquare().calculateDimensions(17));
    }
}
