import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class HorseSpread {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(in.readLine());
        int cols = Integer.parseInt(in.readLine());
        int startRow = Integer.parseInt(in.readLine());
        int startCol = Integer.parseInt(in.readLine());
        int[][] matrix = new int[rows][cols];
        int codeFactor = cols;

        solve(startRow, startCol, rows, cols, matrix, codeFactor);
        printResult(matrix, rows, cols);

    }

    static void solve(int startRow, int startCol, int rows, int cols, int[][] matrix, int codeFactor) {
        int[] dRow = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dCol = {1, 2, 2, 1, -1, -2, -2, -1};
        matrix[startRow][startCol] = 1;
        Queue<Integer> q = new ArrayDeque<Integer>();

        ((ArrayDeque<Integer>) q).push(encode(startRow, startCol, codeFactor));
        int row, col, code, nextRow, nextCol, d;
        while (!q.isEmpty()) {
            code = ((ArrayDeque<Integer>) q).pollLast();
            row = decodeRow(code, codeFactor);
            col = decodeCol(code, codeFactor);
            for (d = 0; d < 8; d++) {
                nextRow = row + dRow[d];
                nextCol = col + dCol[d];


                if (inRange(nextRow, rows) && inRange(nextCol, cols) &&
                        matrix[nextRow][nextCol] == 0) {
                    int value = matrix[row][col] + 1;
                    matrix[nextRow][nextCol] = value;
                    ((ArrayDeque<Integer>) q).push(encode(nextRow, nextCol, codeFactor));

                }
            }
        }

    }

    private static Integer encode(int row, int col, int codeFactor) {
        return row * codeFactor + col;
    }

    private static int decodeRow(int code, int codeFactor) {
        return code / codeFactor;
    }

    private static int decodeCol(int code, int codeFactor) {
        return code % codeFactor;
    }

    private static boolean inRange(int value, int max) {
        return 0 <= value && value < max;
    }

    private static void printResult(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][cols/2]);


        }
    }
}
