import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimesToN {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        getAllPrimesTo(N).forEach(result -> System.out.print(result + " ") );
    }
    static ArrayList<Integer> getAllPrimesTo (int N){
        ArrayList<Integer> primes = new ArrayList<>();
        List<Boolean> isPrime = Stream.generate(() -> true)
                .limit(N + 1)
                .collect(Collectors.toList());
        for (int number= 2; number < N + 1 ; number++) {
            for(int x = number * 2; x < N + 1; x+= number){
                isPrime.set(x, false);
            }
        }
        for (int i = 1; i < isPrime.size(); i++) {
            if(isPrime.get(i)){
                primes.add(i);
            }
        }
        return primes;
    }
}
