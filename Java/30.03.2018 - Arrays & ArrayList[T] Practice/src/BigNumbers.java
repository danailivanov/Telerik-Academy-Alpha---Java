import java.util.ArrayList;
import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int m = in.nextInt();
         in.nextLine();
         String[]nArr = in.nextLine().split(" ");
         String[]mArr = in.nextLine().split(" ");
         ArrayList<Integer>nArrList = new ArrayList<>();
         ArrayList<Integer>mArrList = new ArrayList<>();

        for (String str:nArr) {
            int x = Integer.parseInt(str);
            nArrList.add(x);
        }
        for (String str:mArr) {
            int x = Integer.parseInt(str);
            mArrList.add(x);
        }
        if(nArrList.size() < mArrList.size()){
            for (int i = nArrList.size(); i < mArrList.size() ; i++) {
                nArrList.add(0);
            }
        }else{
            for (int i = mArrList.size(); i < nArrList.size() ; i++) {
                mArrList.add(0);
            }
        }
//        nArrList.forEach(System.out::print);
//        System.out.println();
//        mArrList.forEach(System.out::print);
        int sum = 0;
        int next = 0;



        for (int i = 0; i < nArrList.size() ; i++) {
            sum = nArrList.get(i) + mArrList.get(i);
            if (sum >= 10){
                sum = sum % 10;
                System.out.print(sum + next + " ");
                next = 1;
            }else if(sum == 9 && next == 1){
                System.out.print(0 + " ");
                next = 1;
            }else{
                System.out.print(sum + next + " ");
                next = 0;
            }
        }
    }
}
