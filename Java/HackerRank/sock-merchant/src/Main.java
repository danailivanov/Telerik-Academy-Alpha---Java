import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int pairs = 0;
        int currentColor = 0;
        Set<Integer> colors = new HashSet<>();

        for (int i = 0; i < n; i++) {
            currentColor = in.nextInt();
            if(!colors.contains(currentColor)){
                colors.add(currentColor);
            }else {
                pairs ++;
                colors.remove(currentColor);
            }
        }
        System.out.println(pairs);
    }
}
