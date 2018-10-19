import java.util.Scanner;

import static java.lang.System.out;

public class CalculateNandX {
    public static void main(String[] args){

/* Write a program that, for a given two numbers N and x,
calculates the sum S = 1 + 1!/x + 2!/x2 + … + N!/xN.
 - Use only one loop. Print the result with 5 digits after the decimal point. */

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double x = in.nextDouble();
        double S = 0;
        double fac = 1;
        double power = 1;

        for(int i = 1;i <= N; i++) {
            fac *= i;
            power *= x;
            S += (fac / power);
        }
        System.out.printf("%.5f", S + 1 );

    }
}
