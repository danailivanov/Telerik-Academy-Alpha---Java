import java.util.ArrayList;
import java.util.Scanner;

public class ThreeGroups {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] numbers = in.nextLine()
                .split(" ");

        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();

        groups.add(new ArrayList<>());
        groups.add(new ArrayList<>());
        groups.add(new ArrayList<>());

        for (String str : numbers) {
            int x = Integer.parseInt(str);
            int index = x % 3;
            ArrayList<Integer> group = groups.get(index);
            group.add(x);
        }
        for(ArrayList<Integer> group : groups){
            if(group.size() == 0){
                continue;
            }
            for (int j = 0; j < group.size() - 1; j++) {
                System.out.print(group.get(j) + " ");
            }
            System.out.println(group.get(group.size() - 1));
        }
    }
}
