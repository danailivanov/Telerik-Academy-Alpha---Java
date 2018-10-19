import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Numerology {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String number = in.nextLine();
        List<Integer> counters = Stream.generate(() -> 0)
                .limit(10)
                .collect(Collectors.toList());
        ArrayList<Integer> birthday = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            birthday.add(number.charAt(i) - '0');
        }
        numerology(birthday,counters).forEach(s -> System.out.print(s + " "));
    }
    private static List<Integer> numerology(ArrayList<Integer> birthday,
                                            List<Integer> counters){
        if (birthday.size() == 1){
            int digit = birthday.get(0);
            counters.set(digit, counters.get(digit) + 1);
            return counters;
        }
        for (int i = 0; i < birthday.size() - 1 ; i++) {
            int a = birthday.get(i);
            int b = birthday.get(i + 1);
            int sum = (a + b)  * (a ^ b) % 10;

            ArrayList<Integer> newBirthday = new ArrayList<>(birthday);
            newBirthday.remove(i);
            newBirthday.set(i, sum);

            numerology(newBirthday, counters);
        }
        return counters;
    }
}
