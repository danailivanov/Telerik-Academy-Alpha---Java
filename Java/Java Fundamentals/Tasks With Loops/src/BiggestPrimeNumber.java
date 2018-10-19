import java.util.Scanner;

public class BiggestPrimeNumber {
    public static void main(String[] args){

// Write a program that finds and prints the biggest prime number which is <= N.

        Scanner in = new Scanner(System.in);
        int inputNum = in.nextInt();
        int index = 0;

        while(index < 1 && inputNum > 1) {
            int divider = 2;
            int maxDivider = (int) Math.sqrt(inputNum);
            boolean isPrime = true;
            while (divider <= maxDivider) {
                if (inputNum % divider == 0) {
                    isPrime = false;
                    break;
                }
                divider++;
            }
            if (isPrime) {
                System.out.println(inputNum);
                index++;
            }
            inputNum--;
        }
    }
}