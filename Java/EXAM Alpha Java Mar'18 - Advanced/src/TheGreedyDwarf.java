//import java.util.Scanner;
//
//public class TheGreedyDwarf {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int rows = in.nextInt();
//        int cols = in.nextInt();
//        in.nextLine();
//        int[][] lab = new int[rows][cols];
//        int row = 0;
//        int col = 0;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                int x = in.nextInt();
//                lab[i][j] = x;
//                if (x == 0) {
//                    row = i;
//                    col = j;
//                }
//            }
//        }
//        int nextRow = 0;
//        int nextCol = 0;
//        int count = 0;
//        int dRow[] = {0, 0, -1, +1};
//        int dCol[] = {-1, +1, 0, 0};
//        while (true) {
//            for (int i = 1; i < dRow.length; i++) {
//                nextRow = row + dRow[i];
//                nextCol = col + dCol[i];
//                if (!inRange(nextRow, rows) ||
//                        !inRange(nextCol, cols)) {
//                    continue;
//                }
//                if (lab[nextRow][nextCol] > lab[row + dRow[i -1]][col + dCol[i -1]]) {
//                    nextRow = row + dRow[i - 1];
//                    nextCol = col + dCol[i -1];
//                }
//            }
//            if ((lab[row][col - 1] == 0) &&
//                    (lab[row][col + 1] == 0) &&
//                    (lab[row - 1][col] == 0) &&
//                    (lab[row + 1][col] == 0)) {
//                break;
//            }
//
//            lab[nextRow][nextCol] -= 1;
//            row = nextRow;
//            col = nextCol;
//            count++;
//
//            System.out.println(count);
//        }
//    }
//    static boolean inRange(int value, int max) {
//        return 0 <= value && value < max;
//    }
//}
