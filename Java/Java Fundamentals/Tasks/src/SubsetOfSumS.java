import java.util.Arrays;
import java.util.Scanner;

public class SubsetOfSumS {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        in.nextLine();
        String input = in.nextLine();
        String[] inputArr = input.split(" ");
        int[] numbers = new int [inputArr.length];
        for (int i = 0; i < inputArr.length ; i++) {
            numbers[i] = Integer.parseInt(inputArr[i]);
        }
        int result = 0;
        for (int i = 0; i < numbers.length ; i++) {
            int sum = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                sum += numbers[j];
                if(sum >= s){
                    break;
                }
            }
            result = sum;
            if(result == s){
                break;
            }
        }
        if(result == s){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
