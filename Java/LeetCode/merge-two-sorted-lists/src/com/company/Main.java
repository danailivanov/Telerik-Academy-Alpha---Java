package com.company;

public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result = new Solution().mergeTwoLists(l1, l2);

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
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(-1);
            ListNode node = result;

            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    node.next = l1;
                    l1 = l1.next;
                } else {
                    node.next = l2;
                    l2 = l2.next;
                }
                node = node.next;
            }
            while (l2 != null) {
                node.next = l2;
                l2 = l2.next;
                node = node.next;

            }
            while (l1 != null) {
                node.next = l1;
                l1 = l1.next;
                node = node.next;

            }
            return result.next;
        }
    }
}
