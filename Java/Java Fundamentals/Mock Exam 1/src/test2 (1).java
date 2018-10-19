import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNum = in.nextInt();

        //int currNum = 1;
        for (int i = 1; i <= inputNum; i++) {
            int divider = 2;
            int maxDivider = (int) Math.sqrt(i);
            boolean isPrime = true;
            while (divider <= maxDivider) {
                if (i % divider == 0) {
                    isPrime = false;
                    break;
                }
                divider++;
            }
            int number = 1;
            while (isPrime && number <= i){
                int dev = 2;
                int maxDivider2 = (int) Math.sqrt(number);
                boolean isprime2 = true;
                while (dev <= maxDivider2) {
                    if(number % dev == 0){
                        isprime2 = false;
                        System.out.print(" 0");
                        break;
                    }
                    dev++;
                }
                if(isprime2) {
                    System.out.print(" 1");
                }
                number++;
            }
            if(isPrime){
                System.out.println();
            }
        }
    }
}
