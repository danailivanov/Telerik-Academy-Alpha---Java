import java.util.Arrays;
import java.util.Scanner;

public class MazeRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        int even = Arrays.stream(in.nextLine().split(""))
        .mapToInt(Integer::parseInt)
                .filter(x -> x % 2 == 0)
                .filter(y -> y % 2 == 1)
                .sum();

        int odd = Arrays.stream(in.nextLine().split(""))
                .mapToInt(Integer::parseInt)
                .filter(x -> x % 2 == 1)
                .sum();
        System.out.println(odd);
    }
}
