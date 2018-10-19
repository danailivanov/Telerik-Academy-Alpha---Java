public class Maze {
    private static char[][] lab = {
            {' ', ' ', ' ', '*', ' ', ' ', ' '},
            {'*', '*', ' ', '*', ' ', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', '*', '*', '*', '*', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', 'е'},
    };
    private static void findPath(int row, int col) {
        if ((col<0) || (row<0) ||
                (col>=lab[0].length) || (row >= lab.length)) {
// We are out of the labyrinth
            return;
        }
        // Check if we have found the exit
        if (lab[row][col] == 'е') {
            System.out.println("Found the exit!");
        }
        if (lab[row][col] != ' ') {
// The current cell is not free
            return;
        }
// Mark the current cell as visited
        lab[row][col] = 's';
// Invoke recursion the explore all possible directions
        findPath(row, col-1); // left
        findPath(row-1, col); // up
        findPath(row, col+1); // right
        findPath(row+1, col); // down
// Mark back the current cell as free
        lab[row][col] = ' ';
    }
    public static void main(String[] args) {
        findPath(0, 0);
    }





//    static boolean inRange(int value, int max) {
//        return 0 <= value && value < max;
//    }
//
//    static boolean pathsExist(int row, int col, char[][] lab) {
//        //TODO: checks
//        // outside of the lap
//        int rows = lab.length;
//        int cols = lab[row].length;
//
//        int[] dRows = {0, -1, 0, 1};
//        int[] dCols = {-1, 0, 1, 0};
//
//        lab[row][col] = 'x';
//        for (int dir = 0; dir < dRows.length; dir++) {
//            int nextRow = row + dRows[dir];
//            int nextCol = col + dCols[dir];
//
//            if (!inRange(nextRow, rows) ||
//                    !inRange(nextCol, cols)) {
//                continue;
//            }
//
//            // cell already visited or wall
//            if (lab[nextRow][nextCol] == 'x') {
//                continue;
//            }
//
//            // isExit
//            if (lab[nextRow][nextCol] == 'e') {
//                return true;
//            }
//
//            lab[nextRow][nextCol] = 'x';
//            boolean hasPath = pathsExist(nextRow, nextCol, lab);
//            lab[row][col] = ' ';
//
//            if (hasPath) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//        char[][] lab = new char[][]{
//                {'x', ' ', ' ', ' ', 'x', ' ', 'x', 'x'},
//                {'s', ' ', 'x', ' ', ' ', ' ', 'x', ' '},
//                {'x', ' ', 'x', ' ', 'x', ' ', ' ', ' '},
//                {'x', ' ', 'x', ' ', 'x', 'x', ' ', ' '},
//                {'x', ' ', ' ', ' ', 'x', 'x', ' ', ' '},
//                {' ', ' ', ' ', 'e', 'x', 'x', ' ', 'x'}
//        };
//
//        boolean hasExit = pathsExist(1, 0, lab);
//        System.out.println(hasExit);
//
//    }
}
