package com.problems;


public class Leetcode104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return leftDepth > rightDepth? leftDepth + 1 : rightDepth + 1;
    }

    public static void main(String args[]) {
        Leetcode104 sol = new Leetcode104();
        System.out.println(sol.maxDepth(new TreeNode(0)));
    }
}