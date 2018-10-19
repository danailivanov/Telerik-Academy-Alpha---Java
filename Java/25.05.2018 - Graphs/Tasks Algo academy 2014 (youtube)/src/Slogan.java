import java.util.*;
import java.util.stream.Collectors;

public class Slogan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        solve(in);
    }
    private static void solve(Scanner in) {
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            List<String> words = Arrays.asList(in.nextLine().split(" "));
            String slogan = in.nextLine();
            List<String> usedWords = new LinkedList<>();
            boolean canBeDone = checkSlogan(slogan, words, usedWords, new HashSet<>());

            if (canBeDone) {
                System.out.println(
                        usedWords.stream()
                                .collect(
                                        Collectors.joining(" ")
                                )
                );
            } else {
                System.out.println("NOT VALID");
            }
        }
    }

    private static boolean checkSlogan(String slogan, List<String> words, List<String> usedWords, Set<String> invalid) {
        for (String word : words) {
            if (!slogan.startsWith(word)) {
                continue;
            }

            String newSlogan = slogan.substring(word.length());
            if (invalid.contains(newSlogan)) {
                continue;
            }

            usedWords.add(word);
            if (newSlogan.length() == 0) {
                return true;
            }


            boolean canBeDone = checkSlogan(newSlogan, words, usedWords, invalid);

            if (canBeDone) {
                return true;
            }

            usedWords.remove(usedWords.size() - 1);
        }

        invalid.add(slogan);
        return false;
    }

}
