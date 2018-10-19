import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<Integer> tubes = new ArrayList<>();
        long maxLength = 0;
        for (int i = 0; i < n; i++) {
            tubes.add(in.nextInt());
            if(tubes.get(i) > maxLength) {
                maxLength = tubes.get(i);
            }
        }
        System.out.println(getTheTubes(tubes, m, 1, maxLength));
    }

    private static long getTheTubes(List<Integer> tubes, int m, long minLength, long maxLength) {
        if (minLength == maxLength) {
            return maxLength;
        }
        if (canBe(tubes, m, maxLength)) {
            minLength = maxLength;
            maxLength = (long) (minLength * 1.5);
        } else {
            maxLength = (minLength + maxLength) / 2;
        }
        return getTheTubes(tubes, m, minLength, maxLength);
    }

    private static boolean canBe(List<Integer> tubes, int m, long maxLength) {
        long counter = 0;
        for (int tube : tubes) {
            counter += tube / maxLength;

            if(counter >= m) {
                return true;
            }
        }
        return false;
    }

}