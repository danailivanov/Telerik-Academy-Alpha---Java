import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BitShiftMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();
        int cols = in.nextInt();
        in.nextLine();
        in.nextLine();
        int[] moves = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean[][] visited = new boolean[rows][cols];
        int coeff = Math.max(rows, cols);
        int row = rows - 1;
        int col = 0;

        for (int move : moves) {
            int nextRow = getRow(move, coeff);
            int nextCol = getCow(move , coeff);

            int colDir = col < nextCol
                    ? +1
                    : -1;
            while (col != nextCol){
                visited[row][col] = true;
                col += colDir;
            }
            int rowDir = row < nextRow
                    ? +1
                    : -1;
            while (row != nextRow){
                visited[row][col] = true;
                row += rowDir;
            }
            visited[row][col] = true;
        }
        BigInteger result = BigInteger.ZERO;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if(visited[r][c]){
                    BigInteger cellValue = getValue(rows -1 - r, c);
                    result = result.add(cellValue);
                }
            }
        }
        System.out.println(result);
    }
    private static int getRow(int code, int coeff){
        return code / coeff;
    }
    private static int getCow(int code, int coeff){
        return code % coeff;
    }
    private static BigInteger getValue(int row, int col) {
        int power = row + col;
        return BigInteger.TWO.pow(power);
    }
}



