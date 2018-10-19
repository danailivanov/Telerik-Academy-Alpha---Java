import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
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
                index++;
            }
            inputNum--;
        }
    }
}
