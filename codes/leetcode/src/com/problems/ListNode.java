package com.problems;

import java.util.List;


public class ListNode {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        ListNode head = this;

        while (head != null) {
            sb.append(head.val).append("->");
            head = head.next;
        }

        sb.delete(sb.length() - 2, sb.length());

        return sb.toString();
    }
}
