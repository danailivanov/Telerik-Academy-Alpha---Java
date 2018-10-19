import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoMakeASum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nArr = in.nextLine().split(" ");
        String[] mArr = in.nextLine().split(" ");
        ArrayList<Integer> nArrList = new ArrayList<>();
        ArrayList<Integer> mArrList = new ArrayList<>();

        for (String str : nArr) {
            int x = Integer.parseInt(str);
            nArrList.add(x);
        }
        for (String str : mArr) {
            int x = Integer.parseInt(str);
            mArrList.add(x);
        }
        int result = 0;
        int counter = 0;
        for (int k = 0; k < mArrList.size(); k++) {
            for (int i = 0; i < nArrList.size(); i++) {
                int sum = nArrList.get(i);
                for (int j = i + 1; j < nArrList.size(); j++) {
                    sum += nArrList.get(j);
                    if (sum >= mArrList.get(k)) {
                        break;
                    }
                }
                result = sum;
                if (result == mArrList.get(k)) {
                    counter++;
                    break;
                }
            }




        }
        System.out.println(counter);
    }
}
