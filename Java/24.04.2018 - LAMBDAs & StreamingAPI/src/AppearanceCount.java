import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppearanceCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> numbers = Stream.generate(in::nextInt)
                .limit(n)
                .collect(Collectors.toList());
        int number = in .nextInt();

        int freq = Collections.frequency(numbers,number);
        System.out.println(freq);
    }
}
