package com.problems;


import com.common.TreeNode;

public class Leetcode100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        // normal case
        return p.val == q.val && (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }

    public static void main(String args[]) {
        Leetcode100 sol = new Leetcode100();
        System.out.println(sol.isSameTree(new TreeNode(0), new TreeNode(1)));
    }
}