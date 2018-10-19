import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args){

/* Write a program that finds the length of the maximal
increasing sequence in an array of N integers.*/

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        int current = 1;
        int max = 0;
        for (int i = 1; i < numbers.length ; i++) {
            if(numbers[i] > numbers[i - 1]){
                current++;
                max = Math.max(max, current);
            } else {
                max = Math.max(max, current);
                current = 1;
            }
        }
        System.out.println(max);
    }
}
