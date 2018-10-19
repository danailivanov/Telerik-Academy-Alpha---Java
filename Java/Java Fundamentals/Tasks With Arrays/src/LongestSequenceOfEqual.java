import java.util.Scanner;

public class LongestSequenceOfEqual {
    public static void main(String[] args) {

/*Write a program that finds the length of the maximal sequence
 of equal elements in an array of N integers.
  */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

//        int max = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            int current = 1;
//            int number = numbers[i];
//            for(int j = i + 1; j < numbers.length; j++){
//                if(numbers[j] == number){
//                    current++;
//                }else{
//                    i = j - 1;
//                    break;
//                }
//            }
//            max = Math.max(max, current);
//        }
//        System.out.println(max);

// Optimized

        int max = 1;
        int current = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 1;
            }
        }
        System.out.println(max);
    }
}
