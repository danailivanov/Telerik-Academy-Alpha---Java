import java.util.Scanner;
import java.util.stream.IntStream;

public class NumbersFrom1toN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        IntStream.rangeClosed(1, in.nextInt())
                .forEach(x -> System.out.print(x + " "));
    }
}
