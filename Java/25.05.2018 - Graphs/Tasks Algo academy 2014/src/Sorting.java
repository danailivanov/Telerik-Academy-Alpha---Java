//import java.lang.reflect.Array;
//import java.util.*;
//
//public class Sorting {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] numbers = Arrays.stream(in.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        int k = in.nextInt();
//        bfs(numbers, n, k);
//
//    }
//
//    private static int bfs(int[] initialState, int n, int k) {
//        if (isSorted(initialState)) {
//            return 0;
//        }
//        HashMap<int[], Integer> used = new HashMap<>();
//        Queue<int[]> queue = new ArrayDeque<>();
//        queue.add(initialState);
//        used.put(initialState, 0);
//        while (!queue.isEmpty()){
//            int[] state = queue.peek();
//            for (int i = 0; i +k <=n  ; i++) {
//                int[] newState = state.clone();
//                Collections.reverse(Arrays.asList(newState));
//
//
//            }
//        }
//    }
//
//    private static boolean isSorted(int[] numbers) {
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < numbers[i - 1]) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
