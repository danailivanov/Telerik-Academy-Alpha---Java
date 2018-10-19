import java.util.Scanner;

public class NumbersFrom1toN {
    public static void main(String[] args) {

/* Write a program that enters from the console a positive integer n and prints
 all the numbers from 1 to N inclusive, on a single line, separated by a whitespace.*/

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
    }
}