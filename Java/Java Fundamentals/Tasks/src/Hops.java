import java.util.Scanner;

public class Hops {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String[] inputArr = input.split(", ");
        int[] fieldArr = new int [inputArr.length];
        for (int i = 0; i < inputArr.length ; i++) {
            fieldArr[i] = Integer.parseInt(inputArr[i]);
        }

        int M = in.nextInt();
        in.nextLine();

        int[][] numbers = new int[M][];
        for (int i = 0; i < M; i++) {
            String directions = in.nextLine();
            String[] directionsArr = directions.split(", ");
            numbers[i] = new int [directionsArr.length];
            for (int j = 0; j < directionsArr.length; j++) {
                numbers[i][j] = Integer.parseInt(directionsArr[j]);
            }
        }

        int max = Integer.MIN_VALUE;

        for (int row = 0; row < numbers.length; row++) {
            int sum = fieldArr[0];
            int jumps = 0;
            for (int col = 0; col < numbers[row].length; col++) {
                int n = numbers [row][col];
                jumps += n;
                if (jumps < 0 || jumps >= fieldArr.length){
                    break;
                }else {
                    sum += fieldArr[jumps];
                    max = Math.max(max, sum);
                }
            }
        }
        System.out.println(max);
    }
}
