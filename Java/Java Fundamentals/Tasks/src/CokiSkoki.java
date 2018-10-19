import java.util.Arrays;
import java.util.Scanner;

public class CokiSkoki {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] buld = new int [n];
        int max = Integer.MIN_VALUE;
        String jumpLength = "";

        for (int i = 0; i < buld.length ; i++) {
            buld[i] = in.nextInt();
        }
        for (int i = 0; i < buld.length ; i++) {
            int jumps = 0;
            int consta = i;
            for (int j = consta + 1; j < buld.length ; j++) {
                if (buld[consta] < buld[j]){
                    jumps++;
                    consta = j;
                }
                max = Math.max(max, jumps);
            }
            jumpLength += Integer.toString(jumps) + " ";
        }
        System.out.println(max);
        System.out.println(jumpLength);

    }
}
