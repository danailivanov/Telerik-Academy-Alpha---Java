import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            numbers.add(in.nextInt());
        }
        int current = 1;
        int max = 1;
        for (int i = 1; i < numbers.size() ; i++) {
            if(numbers.get(i) > numbers.get(i - 1)){
                current++;
                max = Math.max(max, current);
            }else{
                max = Math.max(max, current);
                current = 1;
            }
        }
        System.out.println(max);
    }
}
