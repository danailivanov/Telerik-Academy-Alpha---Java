import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class МагическиЧисла {
    private static HashMap<Character, HashSet<Character>> graph = new HashMap<>();
    private static HashSet<Character> visited = new HashSet<>();
    private static SortedSet<Long> results = new TreeSet<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        List<String> numbers = Stream.generate(in::nextLine)
                .limit(n)
                .collect(Collectors.toList());

        generateGraphFromNumbers(numbers);

        for (char i = '1'; i < '9'; i++) {
            if(graph.containsKey(i)){
                visited = new HashSet<>();
                addNumbers(i,"");
            }
        }
        results.forEach(System.out::println);
    }

    //DFS
    private static void addNumbers(char currentNumber, String currentResult) {
        if(visited.contains(currentNumber)){
            results.add(Long.parseLong(currentResult));
            return;
        }
        visited.add(currentNumber);
        currentResult = String.format("%s%s",currentResult,currentNumber);
        HashSet<Character> children = graph.get(currentNumber);
        for (char child : children) {
            addNumbers(child,currentResult);
        }
        visited.remove(currentNumber);
        if(children.size() == 0){
            results.add(Long.parseLong(currentResult));
        }
    }

    private static void generateGraphFromNumbers(List<String> numbers) {
        for (String number :numbers) {
            for (int i = 0; i < number.length() - 1; i++) {
                char currentDigit = number.charAt(i);
                if(!graph.containsKey(currentDigit)){
                    graph.put(currentDigit, new HashSet<>());
                }
                char nextDigit = number.charAt(i + 1);
                graph.get(currentDigit).add(nextDigit);
                if(!graph.containsKey(nextDigit)){
                    graph.put(nextDigit,new HashSet<>());
                }
            }
        }
    }
}
