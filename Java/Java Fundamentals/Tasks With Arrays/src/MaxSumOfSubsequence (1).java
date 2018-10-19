import java.util.Scanner;

public class MaxSumOfSubsequence {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = in.nextInt();
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length ; i++) {
            sum += numbers[i];
            if (max < sum){
                max = sum;
            }
            if(sum <0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
