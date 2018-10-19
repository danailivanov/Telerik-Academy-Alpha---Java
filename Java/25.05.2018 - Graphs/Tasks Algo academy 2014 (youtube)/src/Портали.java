import java.util.Scanner;

public class Портали {
    private static int MAX_POWER = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startRow = in.nextInt();
        int startCol = in.nextInt();
        int rows = in.nextInt();
        int cols = in.nextInt();
        in.nextLine();
        int[][] lab = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] currentRows = in.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                if (!currentRows[j].equals("#")) {
                    lab[i][j] = Integer.parseInt(currentRows[j]);
                } else {
                    lab[i][j] = -1;
                }
            }
        }

        System.out.println(dfs(startRow, startCol, 0, lab));

    }

    private static int dfs(int startRow, int startCol, int power, int[][] lab) {
        int currentPower = lab[startRow][startCol];
        if (currentPower == 0) {
            if (power > MAX_POWER) {
                MAX_POWER = power;
            }
            return MAX_POWER;
        }
        int[] dRow = {currentPower, -currentPower, 0, 0};
        int[] dCol = {0, 0, currentPower, -currentPower};
        for (int i = 0; i < dRow.length; i++) {
            int nextRow = startRow + dRow[i];
            int nextCol = startCol + dCol[i];
            if (isInLab(nextRow, nextCol, lab) && isFrog(nextRow, nextCol, lab)) {
                lab[startRow][startCol] = 0;
                power += currentPower;
                dfs(nextRow, nextCol, power, lab);
                lab[startRow][startCol] = currentPower;
                power -= currentPower;
            }
        }

        if (power > MAX_POWER) {
            MAX_POWER = power;
        }
        return MAX_POWER;
    }

    private static boolean isFrog(int nextRow, int nextCol, int[][] lab) {
        return lab[nextRow][nextCol] != -1;
    }

    private static boolean isInLab(int nextRow, int nextCol, int[][] lab) {
        return nextRow > -1 && nextRow < lab.length && nextCol > -1 && nextCol < lab[0].length;
    }
}
