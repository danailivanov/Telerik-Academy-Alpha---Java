import java.util.Scanner;

public class AboveTheMainDiagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

// Version 1

//        int N = in.nextInt();
//        long[][] matrix = new long[N][N];
//        matrix[0][0] = 1;
//
//        for (int row = 0; row < matrix.length; row++) {
//            if (row > 0) {
//                matrix[row][0] = matrix[row - 1][0] * 2;
//            }
//            for (int col = 0; col < matrix[row].length; col++) {
//                if (col > 0){
//                    matrix[row][col] = matrix[row][col - 1] * 2;
//                }
//            }
//        }
//        long sum = 0;
//        int counter = 0;
//        for (int row = 0; row < matrix.length ; row++) {
//            for (int col = counter + 1; col < matrix[row].length; col++) {
//                sum += matrix[row][col];
//            }
//            counter++;
//        }
//        System.out.println(sum);
//
//        for (long[] row : matrix){
//            for (long col : row) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }

// Version 2
        int n = in.nextInt();
        long sum = 0;
        int counter = 0;

        for (int row = 0; row < n; row++) {
            for (int col = counter + 1; col < n; col++) {
                sum += getValue (row, col);
            }
            counter++;
        }
        System.out.println(sum);
    }

    private static long getValue(int row, int col) {
        long power = row + col;
        return (long) Math.pow(2, power);
    }
}

