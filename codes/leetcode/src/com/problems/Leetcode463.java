package com.problems;

/**
463. Island Perimeter

 https://leetcode.com/problems/island-perimeter/

 You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
 Grid cells are connected horizontally/vertically (not diagonally).
 The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
 One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100.
 Determine the perimeter of the island.

 Example:
 [0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]

 Answer: 16
 */
public class Leetcode463 {
    public int islandPerimeter(int[][] grid) {
        if (grid == null) {
                return 0;
            }

            final int height = grid.length;
        final int width = grid[0].length;

            int perimeter = 0;

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (grid[i][j] == 0) {
                        continue;
                    }

                    // left
                    if (j == 0 || grid[i][j-1] == 0) {
                        perimeter++;
                    }
                    // up
                    if (i == 0 || grid[i-1][j] == 0 ) {
                        perimeter++;
                    }
                    // right
                    if (j == width - 1 || grid[i][j+1] == 0) {
                        perimeter++;
                    }
                    // down
                    if (i == height - 1 || grid[i+1][j] == 0 ) {
                        perimeter++;
                    }
                }
        }

        return perimeter;
    }

    public static void main(String args[])  {
        Leetcode463 sol = new Leetcode463();

        System.out.println(sol.islandPerimeter(new int[][]
                {
                        new int[] {0,1,0,0},
                        new int[] {1,1,1,0},
                        new int[] {0,1,0,0},
                        new int[] {1,1,0,0},
                }));
    }
}
