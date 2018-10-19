import java.util.Scanner;

public class CrookedStairs {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int n = in.nextInt();

        System.out.println(x);
        System.out.println(y + " " + z);

        for (int i = 3; i <= n ; i++) {
            for (int j = 0; j < i; j++) {
                int bh = x + y + z;
                System.out.print(bh + " ");
                x = y;
                y = z;
                z = bh;
            }
            System.out.println();
        }
    }
}
