import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cheaters {
   public static HashMap<String, List<String>> result = new HashMap<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i <n ; i++) {

            String input = in.nextLine();
            String[] str = input.split(" ");
            List<String> depends = new ArrayList<>();


            for (int j = 0; j < 2; j++) {
                depends.add(str[i]);
                input.replace(str[1] + " ", "");


            }
            System.out.println(input);
            result.put(input, depends);
        }

    }

}
