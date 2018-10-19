import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Combinations {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        List<Integer> currentCombination = Stream.generate(() -> 0)
                .limit(k)
                .collect(Collectors.toList());
        ArrayList<ArrayList<Integer>> combinations = new ArrayList<>();

        getAllCombinations(1,0, n, k, currentCombination, combinations);

        combinations.forEach(combination -> {
            combination.forEach(result -> System.out.print(result + " "));
            System.out.println();
        } );
    }
    private static void getAllCombinations(int current, int index, int n, int k,
                                           List<Integer> currentCombination, ArrayList<ArrayList<Integer>> combinations){
        if(index == k){
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }
        for (int next = current; next <= n; next++) {
            currentCombination.set(index, next);
            getAllCombinations(next + 1,index + 1, n, k, currentCombination, combinations );
        }
    }
}
