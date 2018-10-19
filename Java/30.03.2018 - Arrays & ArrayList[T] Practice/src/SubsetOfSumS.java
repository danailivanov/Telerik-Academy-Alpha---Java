import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubsetOfSumS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        in.nextLine();
        String input = in.nextLine();
        subsetOfSum(input, s);
    }
    private static void subsetOfSum(String input, int s){
        String[] inputArr = input.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (String str: inputArr) {
            int x = Integer.parseInt(str);
            numbers.add(x);
        }
        List<Boolean> hasSum = Stream.generate(() -> false)
                .limit(s + 1)
                .collect(Collectors.toList());
        hasSum.set(0,true);

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = hasSum.size() - 1 ; j >= 0; j--) {
                if (hasSum.get(j)){
                    int nextSum = numbers.get(i) + j;
                    if(nextSum < hasSum.size()) {
                        hasSum.set(nextSum, true);
                    }
                }
            }
        }
        System.out.println(hasSum.get(s) ? "yes" : "no");
    }
}

























//        Scanner in = new Scanner(System.in);
//
//        int s = in.nextInt();
//        in.nextLine();
//        String input = in.nextLine();
//        String[] inputArr = input.split(" ");
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (String str : inputArr) {
//            int x = Integer.parseInt(str);
//            numbers.add(x);
//        }
//        int result = 0;
//        for (int i = 0; i < numbers.size(); i++) {
//            int sum = numbers.get(i);
//            for (int j = i + 1; j < numbers.size(); j++) {
//                sum+= numbers.get(j);
//                if(sum >= s){
//                    break;
//                }
//            }
//            result = sum;
//            if(result == s){
//                break;
//            }
//        }
//        System.out.println(result == s ? "yes" : "no");
//    }
//}