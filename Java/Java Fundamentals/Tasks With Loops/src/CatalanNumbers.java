import java.math.BigInteger;
import java.util.Scanner;

public class CatalanNumbers {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        BigInteger fac1 = BigInteger.ONE;
        BigInteger fac2 = BigInteger.ONE;
        BigInteger fac3= BigInteger.ONE;
        int i = 1;
        int x = 1;
        int y = 1;

        while(i <= N){
            while(x <= N * 2){
                while(y <= N + 1){
                    fac3 = fac3.multiply(BigInteger.valueOf(y));
                    y++;
                }
                fac2 = fac2.multiply(BigInteger.valueOf(x));
                x++;
            }
            fac1 = fac1.multiply(BigInteger.valueOf(i));
            i++;
        }
        BigInteger result = fac1.multiply(fac3);
        BigInteger combination = fac2.divide(result);
        System.out.println(combination);
    }
}
