import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoroTheNaughty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();
        int cols = in.nextInt();
        int jumps = in.nextInt();
        int nextRow = in.nextInt();
        int nextCol = in.nextInt();

        int count = 0;
        int[][] moves = new int[jumps][2];
        int[][] field = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                field[i][j] = (i * cols) + j + 1;
            }
        }
        long sum = field[nextRow][nextCol];
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < moves[2].length; j++) {
                int x = in.nextInt();
                moves[i][j] = x;
            }
        }
        while(true){
            for (int i = 0; i < moves.length; i++) {
                nextRow += moves[i][0];
                nextCol += moves[i][1];
                if (inRange(nextRow, rows) && inRange(nextCol, cols)){
                sum += field[nextRow][nextCol];
                count ++;

                }else {
                    break;
                }
                if(field[nextRow][nextCol] == 0){
                    System.out.println("caught " + count);
                    break;
                }
                field[nextRow][nextCol] = 0;
            }
            if (!inRange(nextRow, rows) || !inRange(nextCol, cols)  ) {
                break;
            }

        }
        System.out.println("escaped " + sum);

//        int rows = in.nextInt();
//        int cols = in.nextInt();
//        int jumps = in.nextInt();
//        int nextRow = in.nextInt();
//        int nextCol = in.nextInt();
//        int sum = getValue(nextRow, nextCol, cols);
//        int count = 0;
//        int[][] moves = new int[jumps][2];
//        ArrayList<Integer> check = new ArrayList<>();
//        check.add(getValue(nextRow, nextCol, cols));
//        for (int i = 0; i < moves.length; i++) {
//            for (int j = 0; j < moves[2].length; j++) {
//                int x = in.nextInt();
//                moves[i][j] = x;
//            }
//        }
//        if(moves.length > 0) {
//            while (true) {
//                for (int i = 0; i < moves.length; i++) {
//                    nextRow += moves[i][0];
//                    nextCol += moves[i][1];
//                    if (inRange(nextRow, rows) && inRange(nextCol, cols)) {
//                        sum += getValue(nextRow, nextCol, cols);
//                        count++;
//                    } else {
//                        break;
//                    }
//                    if (check.contains(getValue(nextRow, nextCol, cols))) {
//                        System.out.println("caught " + count);
//                        break;
//                    }
//                    check.add(getValue(nextRow, nextCol, cols));
//                }
//                if (!inRange(nextRow, rows) || !inRange(nextCol, cols)) {
//                    break;
//                }
//            }
//            System.out.println("escaped " + sum);
//        }
//    }
//    private static int getValue(int row, int col, int cols){
//        return (row * cols) + col + 1;
//    }
//    private static boolean inRange(int value, int max) {
//        return 0 <= value && value < max;
//    }
    }
        private static boolean inRange(int value, int max) {
        return 0 <= value && value < max;
    }
}
