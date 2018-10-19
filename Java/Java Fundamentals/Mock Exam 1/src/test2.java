import java.math.BigInteger;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        N = N.replace("-", "");
        N = N.replace(".", "");
        BigInteger numbers = new BigInteger(N);
        BigInteger[] arrNumbers = new BigInteger[N.length()];

        for (int i = 0; i < arrNumbers.length; i++) {
            arrNumbers[i] = numbers.mod(BigInteger.valueOf(10));
            numbers = numbers.divide(BigInteger.valueOf(10));
        }
        BigInteger sum = new BigInteger(String.valueOf(0));
        for (int i = 0; i < arrNumbers.length; i++) {
            sum = sum.add(arrNumbers[i]);
        }
        BigInteger cons = new BigInteger(String.valueOf(9));
        int res = sum.compareTo(cons);
        while (res == 1) {
            numbers = sum;
            N = String.valueOf(sum);
            arrNumbers = new BigInteger[N.length()];
            for (int i = 0; i < N.length() ; i++) {
                arrNumbers[i] = numbers.mod(BigInteger.valueOf(10));
                numbers = numbers.divide(BigInteger.valueOf(10));
            }
            sum = new BigInteger(String.valueOf(0));
            for (int i = 0; i < arrNumbers.length; i++) {
                sum = sum.add(arrNumbers[i]);
            }
            res = sum.compareTo(cons);
        }
        System.out.println(sum);
    }
}
