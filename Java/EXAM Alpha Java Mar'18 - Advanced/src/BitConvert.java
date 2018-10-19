import java.util.*;

public class BitConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String[] numbers = input.split(",");
        ArrayList<Integer> numbersList = new ArrayList<>();

        for (String str : numbers) {
            int x = Integer.parseInt(str);
            numbersList.add(x);
        }
        ArrayList<ArrayList<Integer>> binaryNumbers = new ArrayList<>();
        for (int i = 0; i < numbersList.size(); i++) {
            String binary = Integer.toBinaryString(numbersList.get(i));
            ArrayList<Integer> number = new ArrayList<>();
            for (int j = 0; j < 8 - binary.length(); j++) {
                number.add(0);
            }
            for (int j = 0; j < binary.length(); j++) {
                number.add(binary.charAt(j) - '0');
            }
            for (int j = 0; j < number.size(); j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    number.set(j, null);

                }
                if (i % 2 == 1 && j % 2 == 1) {
                    number.set(j, null);
                }
            }
            number.removeIf(Objects::isNull);
            binaryNumbers.add(number);
        }
        binaryNumbers.forEach(number -> {number.forEach(result -> System.out.print(result)); });
    }
}
