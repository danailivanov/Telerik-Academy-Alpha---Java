import java.util.Scanner;

public class AlphaNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 6 ; i++) {
            int sum = 0;
            int diff = 0;
            int number = in.nextInt();
            int z = number % 10;
            int y = number / 10 % 10;
            int x = number / 100 % 10;
            sum = x + y + z;
            int xsum = sum % 10;

            diff = Math.max(diff, x - y);
            diff = Math.max(diff, x - z);
            diff = Math.max(diff, y - x);
            diff = Math.max(diff, y - z);
            diff = Math.max(diff, z - x);
            diff = Math.max(diff, z - y);

            if (diff > xsum){
                System.out.println(number);
            }
        }
    }
}
