import java.util.Scanner;

public class AllocateArray {
    public static void main(String[] args){

/*Write a program that allocates array of N integers, initializes each element
by its index multiplied by 5 and the prints the obtained array on the console.
 */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++ ){
            numbers[i] = i * 5;
            System.out.println(numbers[i]);
        }
    }
}
