import java.math.BigInteger;
import java.util.Scanner;

public class Calculate3 {
    public static void main(String[] args){

/*In combinatorics, the number of ways to choose N different members out of a group of N different elements
(also known as the number of combinations) is calculated by the following formula: formula For example,
there are 2598960 ways to withdraw 5 cards out of a standard deck of 52 cards.
Your task is to write a program that calculates N! / (K! * (N - K)!) for given N and K.
 */

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        BigInteger fac1 = BigInteger.ONE;
        BigInteger fac2 = BigInteger.ONE;
        BigInteger fac3= BigInteger.ONE;
        int i = 1;
        int x = 1;
        int y = 1;
        int Z = N - K;

        while(i <= N){
            while(x <= K){
                while(y <= Z){
                    fac3 = fac3.multiply(BigInteger.valueOf(y));
                    y++;
                }
                fac2 = fac2.multiply(BigInteger.valueOf(x));
                x++;
            }
            fac1 = fac1.multiply(BigInteger.valueOf(i));
            i++;
        }
        BigInteger result = fac2.multiply(fac3);
        BigInteger combination = fac1.divide(result);
        System.out.println(combination);
    }
}
