
import java.util.Scanner;

public class Bounce {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();
        int cols = in.nextInt();
        if( rows == 1 || cols == 1){
            System.out.println(getValue(0, 0));
            return;
        }

        int row = 1;
        int col = 1;
        int dRow = +1;
        int dCol = +1;
        long result = getValue(0, 0);

        while(!atCorner(row, col, rows, cols)){
            result += getValue(row, col);
            int next_row = row + dRow;
            if(next_row < 0 || next_row >= rows){
                dRow *= -1;
            }

            int next_col = col + dCol;
            if(next_col < 0 || next_col >= cols){
                dCol *= -1;
            }
            row += dRow;
            col += dCol;
        }
        result += getValue(row, col);
        System.out.println(result);
    }

    private static boolean atCorner(int row, int col, int rows, int cols) {
        return ((row == 0 || row == rows - 1) &&
                (col == 0 || col == cols - 1));
    }

    private static long getValue(int row, int col) {
        long power = row + col;
        return (long) Math.pow(2, power);
    }
}
