
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaxSumOfKelements {
    public static void main(String[] args) {

/* Write a program that reads two integer numbers N and K and an array
of N elements from the console. Find the maximal sum of K elements in the array.*/

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] inarr = new int[n];
        for (int i = 0; i < inarr.length ; i++) {
            inarr[i] = in.nextInt();
        }
        Arrays.sort(inarr);
        int sum = 0;
        for (int i = inarr.length - 1; i > inarr.length - k - 1 ; i--) {
            sum += inarr[i];
        }
        System.out.println(sum);

//Optimized 2
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        ArrayList<Integer> list = new ArrayList();
//        for (int i = 0; i < n; i++) {
//            list.add(in.nextInt());
//        }
//        list.sort(Comparator.naturalOrder());
//        int sum =0;
//        for (int i = list.size() - 1; i > list.size() - 1 - k  ; i--) {
//            sum += list.get(i);
//        }
//        System.out.println(sum);


// Var 1
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        ArrayList<Integer> list = new ArrayList();
//        for (int i = 0; i < n; i++) {
//            list.add(in.nextInt());
//        }
//        int sum = 0;
//        boolean[] used = new boolean[n];
//        for (int i = 0; i < k; i++) {
//            int max = Integer.MIN_VALUE;
//            int index = 0;
//            for (int j = 0; j < list.size(); j++) {
//                if(used[j]){
//                    continue;
//                }
//                if(max < list.get(j)) {
//                    max = list.get(j);
//                    index = j;
//                }
//            }
//            used[index] = true;
//            sum += max;
//        }
//        System.out.println(sum);

// Var 2
        //        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        ArrayList<Integer> list = new ArrayList();
//        for (int i = 0; i < n; i++) {
//            list.add(in.nextInt());
//        }
//        int sum = 0;
//        int index = 0;
//        for (int i = 0; i < k ; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int j = 0; j < list.size(); j++) {
//                if(max < list.get(j)){
//                    max = list.get(j);
//                    index = j;
//                }
//            }
//            list.remove(index);
//            sum += max;
//
//        }
//        System.out.println(sum);
    }
}