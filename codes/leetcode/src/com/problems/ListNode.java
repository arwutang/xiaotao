package com.problems;

import java.util.List;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode createListNodes(final List<Integer> valueList) {
        if (valueList == null) {
            return null;
        }

        ListNode head = null;
        ListNode p = null;

        for (Integer val : valueList) {
            ListNode node = new ListNode(val);

            if (head == null) {
                head = node;
                p = node;
            } else {
                p.next = node;
                p = p.next;
            }
        }

        return head;
    }

    public static void printListNodes(ListNode head) {
        if (head == null) {
            System.out.println("head == null");
        }

        StringBuilder sb = new StringBuilder();

        while (head != null) {
            sb.append(head.val).append("->");
            head = head.next;
        }

        System.out.println(sb.toString());
    }
}
