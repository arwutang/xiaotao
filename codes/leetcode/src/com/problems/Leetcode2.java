package com.problems;


public class Leetcode2 {
    /**
     * You are given two linked lists representing two non-negative numbers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.

     Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     Output: 7 -> 0 -> 8
     * @param l1 linkedList 1
     * @param l2 linkedList 2
     * @return result number
     */
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        int num1 = readNumberFromLinkedList(l1);
        int num2 = readNumberFromLinkedList(l2);

        return convertNumberToLinkedList(num1 + num2);
    }

    private int readNumberFromLinkedList(ListNode head) {
        int number = 0;
        int times = 1;

        while (head != null) {
            number = times * head.val + number;

            times *= 10;
            head = head.next;
        }

        return number;
    }

    private ListNode convertNumberToLinkedList(int number) {
        ListNode head = null;
        ListNode temp = null;

        char[] characterList = String.valueOf(number).toCharArray();

        for (int i = characterList.length - 1; i >= 0; i--) {
            ListNode node = new ListNode(Integer.parseInt(String.valueOf(characterList[i])));

            if (temp == null) {
                head = node;
                temp = node;
            } else {
                temp.next = node;
                temp = temp.next;
            }
        }

        return head;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode temp = head;

        boolean shouldAddOne = false;

        while (l1 != null || l2 != null) {
            int num1 = 0;
            int num2 = 0;

            if (l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }

            int sum = shouldAddOne? num1 + num2 + 1 : num1 + num2;
            shouldAddOne = sum >= 10;

            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }

        if (shouldAddOne) {
            temp.next = new ListNode(1);
        }

        return head.next;
    }

    public static void main(String args[]) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        //l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(9);

        Leetcode2 sol = new Leetcode2();
        ListNode.printListNodes(sol.addTwoNumbers1(l1, l2));
        ListNode.printListNodes(sol.addTwoNumbers2(l1, l2));
    }
}