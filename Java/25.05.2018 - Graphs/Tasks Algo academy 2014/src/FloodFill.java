import java.util.ArrayDeque;
import java.util.Queue;

public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (newColor == image[sr][sc]) {
            return image;
        }

        int currentColor = image[sr][sc];
        int rows = image.length;
        int cols = image[0].length;
        int codeFactor = cols;

        int[][] directions = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(codePixel(sr, sc, codeFactor));

        while (!queue.isEmpty()) {
            int x = queue.remove();
            int r = decodeRow(x, codeFactor);
            int c = decodeCol(x, codeFactor);

            image[r][c] = newColor;
            for (int[] d : directions) {
                int nextr = r + d[0];
                int nextc = c + d[1];

                if (-1 < nextr && nextr < rows
                        && -1 < nextc && nextc < cols
                        && image[nextr][nextc] == currentColor) {
                    queue.add(codePixel(nextr, nextc, codeFactor));
                }
            }
        }

        return image;
    }

    private static int codePixel(int x, int y, int factor) {
        return x * factor + y;
    }

    private static int decodeRow(int x, int factor) {
        return x / factor;
    }

    private static int decodeCol(int x, int factor) {
        return x % factor;
    }
}
