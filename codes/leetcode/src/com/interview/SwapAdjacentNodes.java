package com.interview;


import com.common.ListNode;

import java.util.Arrays;

public class SwapAdjacentNodes {
    /**
     * Given head pointer of a linked list, implement a function which swap each pair of adjacent nodes.
     *
     * For example: n1->n2->n3->n4  to  n2->n1->n4->n3.
     *
     * @param head head of the linked list
     * @return new head for the linked list
     */
    public ListNode swapAdjacentNodes(ListNode head) {
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

        SwapAdjacentNodes sol = new SwapAdjacentNodes();
        ListNode newHead = sol.swapAdjacentNodes(head);

        System.out.println(newHead);
    }
}
