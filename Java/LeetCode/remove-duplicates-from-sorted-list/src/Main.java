public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = new Solution().deleteDuplicates(head);

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
        public ListNode deleteDuplicates(ListNode head) {
            ListNode result = head;

            while (result != null && result.next != null) {
                if (result.val == result.next.val) {
                    result.next = result.next.next;
                } else {
                    result = result.next;
                }

            }
            return head;
        }
    }
}
