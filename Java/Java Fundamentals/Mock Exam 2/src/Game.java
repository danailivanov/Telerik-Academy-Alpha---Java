import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int a = N % 10;
        int b = N / 10 % 10;
        int c = N / 100 % 10;
        int sum = Integer.MIN_VALUE;

        sum = Math.max(sum, a + b + c);
        sum = Math.max(sum, a * b + c);
        sum = Math.max(sum, a + b * c);
        sum = Math.max(sum, a * b * c);

        System.out.println(sum);
    }
}