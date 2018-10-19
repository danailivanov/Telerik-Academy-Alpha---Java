
import java.util.Scanner;

public class Ranks {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < nArr.length ; i++) {
            nArr[i] = in.nextInt();
        }
        int[] rank = new int [nArr.length];
        int index = 0;
        int counter = 1;
        for (int i = 0; i < rank.length ; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < nArr.length; j++) {
                if (max < nArr[j]){
                    max = nArr[j];
                    index = j;
                }
            }
            nArr[index] = Integer.MIN_VALUE;
            rank[index] = counter;
            counter++;
        }
        for (int i : rank) {
            System.out.print(i + " ");
        }
    }
}
