import java.util.Scanner;

public class PrimeTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNum = in.nextInt();
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
            for (int j = 1; j <= i && isPrime ; j++) {
                int divider2 = 2;
                int maxDivider2 = (int) Math.sqrt(j);
                boolean isPrime2 = true;
                while (divider2 <= maxDivider2) {
                    if(j % divider2 == 0){
                        isPrime2 = false;
                        System.out.print("0");
                        break;
                    }
                    divider2++;
                }
                if(isPrime2) {
                    System.out.print("1");
                }
            }
            if(isPrime){
                System.out.println();
            }
        }
    }
}
