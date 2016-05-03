package com.problems;

import com.common.ListNode;

import java.util.Arrays;


public class Leetcode24 {
    /**
     * Given a linked list, swap every two adjacent nodes and return its head.
     * <p>
     * For example,
     * Given 1->2->3->4, you should return the list as 2->1->4->3.
     * <p>
     * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
     *
     * @param head the head of the linked list
     * @return  the head of new linked list
     */
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
