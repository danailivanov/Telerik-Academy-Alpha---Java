import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.nextLine();

        int x = n.charAt(0) - '0';
        int y = n.charAt(1) - '0';
        int z = n.charAt(2) - '0';

        int result = Integer.MIN_VALUE;

        result = Math.max(result, x + y + z);
        result = Math.max(result, x * y + z);
        result = Math.max(result, x + y * z);
        result = Math.max(result, x * y * z);

        System.out.println(result);
    }
}
