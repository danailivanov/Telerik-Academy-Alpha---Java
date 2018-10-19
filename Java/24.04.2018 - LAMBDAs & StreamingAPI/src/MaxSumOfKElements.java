import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class MaxSumOfKElements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        Integer result = Stream.generate(in::nextInt)
                .limit(n)
                .sorted(Comparator.reverseOrder())
                .limit(k)
                .mapToInt(x -> x)
                .sum();

        System.out.println(result);


    }
}
