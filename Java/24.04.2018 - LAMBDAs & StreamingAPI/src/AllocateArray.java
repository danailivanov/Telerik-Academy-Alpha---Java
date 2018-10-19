import java.util.Scanner;
import java.util.stream.IntStream;

public class AllocateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        IntStream.range(0, in.nextInt())
                .forEach(x -> System.out.println(x * 5));
    }
}
