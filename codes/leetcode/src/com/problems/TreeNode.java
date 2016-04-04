package com.problems;

import java.util.ArrayList;


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        ArrayList<TreeNode> level = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        level.add(this);
        sb.append(String.format("[%s]", this.val));

        int sbLength = sb.length();

        while (!level.isEmpty()) {
            ArrayList<TreeNode> temp = new ArrayList<>();
            sbLength = sb.length() ;

            sb.append(",").append("[");

            for(TreeNode node : level) {

                if (node.left != null) {
                    sb.append(node.left.val).append(",");
                    temp.add(node.left);
                } else {
                    sb.append("NULL").append(",");
                }

                if (node.right != null) {
                    sb.append(node.right.val).append(",");
                    temp.add(node.right);
                } else {
                    sb.append("NULL").append(",");
                }
            }

            sb.deleteCharAt(sb.length() - 1);
            sb.append("]");

            level = temp;
        }

        sb.delete(sbLength, sb.length());
        return sb.toString();
    }
}
