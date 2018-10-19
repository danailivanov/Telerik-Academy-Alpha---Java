import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GreaterMoney {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String[] str1 = in.nextLine().split(",");
        String[] str2 = in.nextLine().split(",");
        List<Integer> bag1 = new ArrayList<>();
        List<Integer> bag2 = new ArrayList<>();
        for (String str : str1) {
            int x = Integer.parseInt(str);
            bag1.add(x);
        }
        for (String str : str2) {
            int x = Integer.parseInt(str);
            bag2.add(x);
        }

        for (int i = 0; i < bag1.size(); i++) {
            int temp = bag1.get(i);
            int tempIndex = bag2.indexOf(bag1.get(i));
            for (int j = tempIndex; j < bag2.size(); j++) {
                if (bag1.get(i) < bag2.get(j)) {
                    sb.append(bag2.get(j)).append(",");
                    temp = bag2.get(j);
                    break;
                }
            }
            if (temp == bag1.get(i)) {
                sb.append(-1).append(",");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
