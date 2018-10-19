import java.util.Scanner;

public class CrookedWalls {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String[] inputArr = input.split(" ");
        long[] numbers = new long [inputArr.length];
        long sum = 0;

        for (int i = 0; i < inputArr.length ; i++) {
            numbers[i] = Integer.parseInt(inputArr[i]);
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            long diff = Math.abs(numbers[i] - numbers[i + 1]);
            if(diff % 2 == 0){
                sum += diff;
                i++;
            }
        }
        System.out.println(sum);
    }
}
