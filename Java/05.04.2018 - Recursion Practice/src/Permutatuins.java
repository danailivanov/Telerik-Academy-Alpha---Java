import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Permutatuins {
    static void getAllPermutations(int n, int index,
                                   List<Integer> currentPermutation,
                                   HashSet<Integer> used,
                                   ArrayList<List<Integer>> permutation
                                   ){
        if (index == n) {
            permutation.add(new ArrayList<>(currentPermutation));
            return;
        }
        for (int value = 1; value <= n ; value++) {
            if(used.contains(value)){
                continue;
            }

            used.add(value);
            currentPermutation.set(index, value);
            getAllPermutations(n, index + 1, currentPermutation, used, permutation);
            used.remove(value);
        }


    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> currentPermutation = Stream.generate(() -> 0)
                .limit(n)
                .collect(Collectors.toList());
        ArrayList<List<Integer>> permutations = new ArrayList<>();

        getAllPermutations(n,0, currentPermutation, new HashSet<>(), permutations);

        permutations.forEach(innerList -> {
            innerList.forEach(result -> System.out.print(result + " "));
            System.out.println();
                });

    }
}
