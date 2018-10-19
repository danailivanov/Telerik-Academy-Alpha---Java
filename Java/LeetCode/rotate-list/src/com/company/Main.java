package com.company;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        ListNode result = new Solution().rotateRight(head, k);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || k == 0) {
                return head;
            }

            int len = 1;
            ListNode tail = head;
            while (tail.next != null) {
                len++;
                tail = tail.next;
            }

            k = k % len;
            if (k == 0) {
                return head;
            }

            tail.next = head;
            for (int i = 0; i < len - k; i++) {
                tail = tail.next;
            }
            head = tail.next;
            tail.next = null;

            return head;

        }
    }
}
