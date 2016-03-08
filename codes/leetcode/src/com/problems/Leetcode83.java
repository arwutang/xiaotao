package com.problems;

import java.util.Arrays;


public class Leetcode83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p1 = head;

        while (p1 != null) {
            ListNode p2 = p1.next;

            if (p2 == null) {
                break;
            }

            if (p2.val == p1.val) {
                p1.next = p2.next;
            } else {
                p1 = p1.next;
            }
        }

        return head;
    }

    public static void main(String args[]) {
        Integer[] values = {1, 1, 2, 2, 2, 3, 3};

        ListNode head = ListNode.createListNodes(Arrays.asList(values));

        ListNode.printListNodes(head);

        Leetcode83 sol = new Leetcode83();
        head = sol.deleteDuplicates(head);

        ListNode.printListNodes(head);
    }
}