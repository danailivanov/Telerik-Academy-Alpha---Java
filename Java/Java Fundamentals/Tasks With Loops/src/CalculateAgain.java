import java.math.BigInteger;
import java.util.Scanner;

public class CalculateAgain {
    public static void main(String[] args){

/*Write a program that calculates N! / K! for given N and K.
 - Use only one loop */

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();
        BigInteger fac1 = BigInteger.ONE;
        BigInteger fac2 = BigInteger.ONE;
        int i = 1;
        int x = 1;

        while(i <= N){
            while(x <= K){
                fac2 = fac2.multiply(BigInteger.valueOf(x));
                x++;
            }
            fac1 = fac1.multiply(BigInteger.valueOf(i));
            i++;
        }
        BigInteger result = fac1.divide(fac2);
        System.out.println(result);
    }
}
