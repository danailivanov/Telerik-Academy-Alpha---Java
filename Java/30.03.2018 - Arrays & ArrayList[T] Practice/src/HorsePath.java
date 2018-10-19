import java.util.Scanner;

public class HorsePath {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        int[] horseRow = {-2, -2, -1, -1, +1, +1, +2, +2};
        int[] horseCol = {-1, +1, -2, +2, -2, +2, -1, +1};
        int counter = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int row = i;
                int col = j;
                while(matrix[row][col] == 0){
                    matrix[row][col] = counter;
                    counter++;
                    for (int k = 0; k < horseCol.length; k++) {
                        int nextRow = row + horseRow[k];
                        int nextCol = col + horseCol[k];
                        if(nextRow < 0 || nextRow >= matrix.length ||
                                nextCol < 0 || nextCol >= matrix.length){
                            continue;
                        }
                        if (matrix[nextRow][nextCol] != 0){
                            continue;
                        }
                        row = nextRow;
                        col = nextCol;
                        break;
                    }
                }
            }
        }
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
