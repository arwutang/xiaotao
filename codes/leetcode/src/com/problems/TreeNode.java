package com.problems;

import java.util.ArrayList;


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.print("[]");
        }

        ArrayList<TreeNode> level = new ArrayList<>();
        level.add(root);
        System.out.printf("[%s]", root);

        while (!level.isEmpty()) {
            ArrayList<TreeNode> temp = new ArrayList<>();

            System.out.print("[");

            for(TreeNode node : level) {
                System.out.print(node.left);
                System.out.print(",");
                System.out.print(node.right);

                if (node.left != null) {
                    temp.add(node.left);
                }

                if (node.right != null) {
                    temp.add(node.right);
                }
            }

            System.out.print("]");

            level = temp;
        }
    }

    public String toString() {
        return String.valueOf(this.val);
    }
}
