package com.problems;

import com.common.ListNode;

import java.util.Arrays;


public class Leetcode24 {
    public ListNode swapPairs(ListNode head) {
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode p = h;

        while (h.next != null && h.next.next != null) {
            ListNode n1 = h.next;
            ListNode n2 = h.next.next;

            h.next = n2;
            n1.next = n2.next;
            n2.next = n1;

            h = n1;
        }

        return p.next;
    }

    public static void main(String args[]) {
        Integer[] values = {1, 2, 3, 4, 5};

        ListNode head = ListNode.createListNodes(Arrays.asList(values));

        System.out.println(head);

        Leetcode24 sol = new Leetcode24();
        ListNode newHead = sol.swapPairs(head);

        System.out.println(newHead);
    }
}
