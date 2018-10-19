import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();
        int cols = in.nextInt();

        int row = 0;
        int col = 0;
        int dRow = +1;
        int dCol = +1;
        long sum = 0;

        while (true){
            sum += getValue(row, col);
            row += dRow;
            col += dCol;
            dRow *= -1;
            if(col == cols - 1 || col == 0){
                dRow *= -1;
                dCol *= -1;
            }
            if(atCorner(row, col, rows, cols)){
                sum += getValue(row, col);
                break;
            }
        }
        System.out.println(sum);
    }

    private static boolean atCorner(int row, int col, int rows, int cols) {
        return ((row == 0 || row == rows - 1) &&
                (col == 0 || col == cols - 1));
    }

    private static long getValue(int row, int col) {
        return ((row + col)*3) + 1;
    }

}
