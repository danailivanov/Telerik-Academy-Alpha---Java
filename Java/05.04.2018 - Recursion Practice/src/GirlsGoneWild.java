import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GirlsGoneWild {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int shirts = in.nextInt();
        in.nextLine();
        String skirts = in.nextLine();
        char[] skirtsArray = skirts.toCharArray();
        Arrays.sort(skirtsArray);
        skirts = new String(skirtsArray);
        int girls = in.nextInt();

        List<Integer> currentShirtsCombination = Stream.generate(() -> 0)
                .limit(girls)
                .collect(Collectors.toList());
        ArrayList<ArrayList<Integer>> shirtsCombinations = new ArrayList<>();
        getShirtsCombinations(0, 0, shirts, girls, currentShirtsCombination, shirtsCombinations);

        List<Character> currentSkirtsVariation = Stream.generate(() -> ' ')
                .limit(girls)
                .collect(Collectors.toList());
        ArrayList<ArrayList<Character>> skirtsVariations = new ArrayList<>();
        getSkirtsVariations(0, skirts, girls, currentSkirtsVariation,
                skirtsVariations, new HashSet<Integer>());

        ArrayList <String> result = combine(shirtsCombinations,skirtsVariations);
        System.out.println(result.size());
        result.forEach(System.out::println);

    }
    private static ArrayList<String> combine(ArrayList<ArrayList<Integer>> combinations,
                                             ArrayList<ArrayList<Character>> variations){
        ArrayList<String> result = new ArrayList<>();

        for (ArrayList<Integer> shirtCombination : combinations) {
            for (ArrayList<Character> skirtCombinations : variations) {
                StringBuilder comb = new StringBuilder();
                for (int i = 0; i < shirtCombination.size(); i++) {
                    comb.append(shirtCombination.get(i));
                    comb.append(skirtCombinations.get(i));
                    comb.append('-');
                }
                comb.deleteCharAt(comb.length() - 1);
                result.add(comb.toString());
            }
        }
        result.sort(String::compareTo);
        return result;
    }

    private static void getSkirtsVariations(int index, String skirts, int girls,
                                              List<Character> currentSkirtsVariation,
                                              ArrayList<ArrayList<Character>> skirtsVariations,
                                              HashSet<Integer> used){
        if(index == girls){
            skirtsVariations.add(new ArrayList<>(currentSkirtsVariation));
            return;
        }
        for (int i = 0; i < skirts.length(); i++) {
            if(used.contains(i) || (currentSkirtsVariation.get(index)) != null
                    && currentSkirtsVariation.get(index).equals(skirts.charAt(i))){
                continue;
            }
            currentSkirtsVariation.set(index, skirts.charAt(i));
            used.add(i);
            getSkirtsVariations(index + 1, skirts, girls,currentSkirtsVariation,
                    skirtsVariations,used);
            used.remove(i);
        }
    }

    private static void getShirtsCombinations(int current, int index,
                                              int shirts, int girls,
                                              List<Integer> currentCombination,
                                              ArrayList<ArrayList<Integer>> shirtsCombinations){
        if(index == girls) {
            shirtsCombinations.add(new ArrayList<>(currentCombination));
            return;
        }
        for (int next = current; next < shirts; next++) {
            currentCombination.set(index, next);
            getShirtsCombinations(next + 1, index + 1, shirts, girls,
                    currentCombination, shirtsCombinations);
        }
    }
}
