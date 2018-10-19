package rematch;

import java.util.Scanner;

public class TheGreedyDwarf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int[][] lab = new int[rows][cols];
        int row = 0;
        int col = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int x = in.nextInt();
                lab[i][j] = x;
                if (x == 0) {
                    row = i;
                    col = j;
                }
            }
        }
        int counter = 0;

        while (true){
            int left = 0;
            int right = 0;
            int up = 0;
            int down = 0;

            if(inRange(col - 1, cols)){
                left = lab[row][col - 1];
            }
            if(inRange(col + 1, cols)){
                right = lab[row][col + 1];
            }
            if (inRange(row - 1, rows)){
                up = lab[row - 1][col];
            }
            if(inRange(row + 1 , rows)){
                down = lab[row + 1][col];
            }
            if(left == 0 && right == 0 && up == 0 && down == 0){
                break;
            }
            int max = Math.max(Math.max(Math.max(left, right),up),down);
            if(max == left){
                lab[row][col -1] --;
                col --;
                counter++;
            }else if(max == right){
                lab[row][col + 1] --;
                col ++;
                counter++;
            }else if(max == up){
                lab[row - 1][col] --;
                row --;
                counter++;
            }else{
                lab[row + 1][col]--;
                row ++;
                counter++;
            }
        }
        System.out.println(counter);
    }
    private static boolean inRange(int value, int max) {
       return 0 <= value && value < max;
   }
}
