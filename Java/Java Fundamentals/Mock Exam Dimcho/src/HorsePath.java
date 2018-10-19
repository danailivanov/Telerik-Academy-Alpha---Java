import java.util.Scanner;

public class HorsePath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        int[] dRow = {-2, -2, -1, -1, +1, +1, +2, +2};
        int[] dCol = {-1, +1, -2, +2, -2, +2, -1, +1};
        int counter = 1;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                int row = r;
                int col = c;
                while(matrix[row][col] == 0) {
                    matrix[row][col] = counter;
                    counter++;
                    for (int dir = 0; dir < dRow.length; dir++) {
                        int nextRow = row + dRow[dir];
                        int nextCol = col +dCol[dir];
                        if (nextRow < 0 || nextRow >= matrix.length ||
                                nextCol < 0 || nextCol >= matrix.length){
                            continue;
                        }
                        if(matrix[nextRow][nextCol] != 0){
                            continue;
                        }
                        row = nextRow;
                        col = nextCol;
                        break;
                    }
                }
            }
        }
        for (int[] rol : matrix) {
            String result = "";
            for (int cell : rol) {
                result += cell + " ";
            }
            System.out.println(result.trim());
        }
    }
}
