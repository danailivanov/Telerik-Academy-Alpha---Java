import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Swapping {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
        ListNode[] nodes = new ListNode[n + 1];
        for (int i = 0; i <= n; i++) {
            nodes[i] = (new ListNode(i));
        }

        for (int i = 1; i < n; i++) {
            nodes[i].link(nodes[i + 1]);
        }

        ListNode first = nodes[1];
        ListNode last = nodes[n];

        String[] stringSwappings = input.readLine().split(" ");
        ArrayList<Integer> swappings = new ArrayList<>();
        for (String stringSwapping : stringSwappings) {
            swappings.add(Integer.parseInt(stringSwapping));
        }
        for (Integer swapping : swappings) {
            ListNode newLast = nodes[swapping].getLeft();
            ListNode newFirst = nodes[swapping].getRight();

            nodes[swapping].detach();
            if (last != nodes[swapping]) {
                last.link(nodes[swapping]);
            } else {
                newFirst = nodes[swapping];
            }
            if (first != nodes[swapping]) {
                nodes[swapping].link(first);
            } else {
                newLast = nodes[swapping];
            }
            first = newFirst;
            last = newLast;
        }
//        StringBuilder sb = new StringBuilder();
//        ListNode next = first;
//        while (next != null) {
//            sb.append(next.value).append(" ");
//            next = next.right;
//        }
//        System.out.println(sb);
        ListNode.print(first);
    }


    public static class ListNode {
        private int value;
        private ListNode left;
        private ListNode right;

        ListNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public static void print(ListNode node) {
            while (node != null) {
                System.out.print(node.value + " ");
                node = node.right;
            }
        }

        ListNode getLeft() {
            return left;
        }

        ListNode getRight() {
            return right;
        }

        void link(ListNode r) {
            right = r;
            r.left = this;
        }

        void detach() {
            if (this.left != null) {
                this.left.right = null;
            }
            if (this.right != null) {
                this.right.left = null;
            }
            this.left = null;
            this.right = null;
        }
    }
}
