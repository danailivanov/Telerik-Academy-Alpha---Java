package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = new Solution().reverseList(head);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode result = null;


            while (head != null){
                ListNode current = head;
                head = head.next;
                current.next = result;
                result = current;
            }
            return result;
        }
    }
}
