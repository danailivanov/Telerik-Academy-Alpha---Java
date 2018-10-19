import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args){

//Write a program that finds the most frequent number in an array of N elements.


        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] numbersArr = new int [N];

        for (int i = 0; i < numbersArr.length ; i++) {
            numbersArr[i] = in.nextInt();
        }
        int max = 0;
        int number = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            int current = 1;
            for (int j = i + 1; j < numbersArr.length ; j++) {
                if (numbersArr[i] == numbersArr[j]){
                    current ++;
                }
                if (current > max){
                    number = numbersArr[i];
                }
                max = Math.max(max, current);
            }
        }
        System.out.println(number + " (" + max + " times)");
    }
}
