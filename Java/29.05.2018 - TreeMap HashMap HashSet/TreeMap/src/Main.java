import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        String text = "Test text words Count " + "words count teSt";
        printWordsCount(createWordsCounts(text));

    }

    private static Map<String, Integer> createWordsCounts(String text) {
        Comparator<String> caseInsensitiveComparator = (o1, o2) -> o1.compareToIgnoreCase(o2);
        Scanner in = new Scanner(text);
        Map<String, Integer> words = new TreeMap<>(caseInsensitiveComparator);
        while (in.hasNext()) {
            String word = in.next();
            Integer count = words.get(word);
            if (count == null) {
                count = 0;
            }
            words.put(word, count + 1);
        }
        return words;
    }

    private static void printWordsCount(Map<String, Integer> wordsCounts) {
        for (Map.Entry<String, Integer> wordEntry : wordsCounts.entrySet()) {
            System.out.printf(
                    "word '%s' is seen %d times in the text%n",
                    wordEntry.getKey(), wordEntry.getValue());
        }
    }
}
