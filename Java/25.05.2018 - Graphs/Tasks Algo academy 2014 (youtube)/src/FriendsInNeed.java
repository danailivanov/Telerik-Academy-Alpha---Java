import java.io.*;
import java.util.Arrays;

public class FriendsInNeed {
    private static int numberOfHospitals;
    private static int shortestPathToAllPoints;
    private static int printLength = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        shortestPathToAllPoints = Integer.MAX_VALUE;
        String[] initialInput = in.readLine().split(" ");
        int totalEdges = Integer.parseInt(initialInput[0]);
        int numberOfStreets = Integer.parseInt(initialInput[1]) * 2;
        numberOfHospitals = Integer.parseInt(initialInput[2]);
        boolean[] isHospital = new boolean[numberOfStreets];
        String[] hospitalsInput = in.readLine().split(" ");

        for (int i = 0; i < hospitalsInput.length; i++) {
            isHospital[Integer.parseInt(hospitalsInput[i]) - 1] = true;
        }
        int[][] weights = new int[numberOfStreets][3];
        for (int i = 0; i < weights.length; i += 2) {
            String[] currentStreet = in.readLine().split(" ");
            weights[i][0] = Integer.parseInt(currentStreet[0]);
            weights[i][1] = Integer.parseInt(currentStreet[1]);
            weights[i][2] = Integer.parseInt(currentStreet[2]);
            weights[i + 1][0] = Integer.parseInt(currentStreet[1]);
            weights[i + 1][1] = Integer.parseInt(currentStreet[0]);
            weights[i + 1][2] = Integer.parseInt(currentStreet[2]);

        }

        floydWarshall(weights, numberOfStreets, isHospital);

        System.out.println(shortestPathToAllPoints);
    }

    private static void floydWarshall(int[][] weights, int numVertices, boolean[] isHospital) {

        double[][] dist = new double[numVertices][numVertices];
        for (double[] row : dist)
            Arrays.fill(row, Double.POSITIVE_INFINITY);

        for (int[] w : weights)
            dist[w[0] - 1][w[1] - 1] = w[2];

        int[][] next = new int[numVertices][numVertices];
        for (int i = 0; i < next.length; i++) {
            for (int j = 0; j < next.length; j++)
                if (i != j)
                    next[i][j] = j + 1;
        }

        for (int k = 0; k < numVertices; k++)
            for (int i = 0; i < numVertices; i++)
                for (int j = 0; j < numVertices; j++)
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        next[i][j] = next[i][k];
                    }

        printResult(dist, next, isHospital);
    }

    private static void printResult(double[][] dist, int[][] next, boolean[] isHospital) {
        //System.out.println("pair     dist    path");
        if (numberOfHospitals % 2 == 0) {
            printLength = next.length / 2;
        } else {
            printLength = (next.length / 2) + 1;
        }


        for (int i = 0; i < next.length; i++) {
            int shortestLengthToThisHospital = 0;
            for (int j = 0; j < next.length; j++) {
                if (i != j) {
                    int u = i + 1;
                    int v = j + 1;
                    if (isHospital[u - 1] && !isHospital[v - 1] && (int) dist[i][j] != 2147483647) {
                        StringBuilder path = new StringBuilder(String.format("%d -> %d    %2d     %s", u, v,
                                (int) dist[i][j], u));
                        shortestLengthToThisHospital += dist[i][j];
                        do {
                            u = next[u - 1][v - 1];
                            path.append(" -> ").append(u);
                        } while (u != v);
                        //System.out.println(path);
                    }
                }
            }

            if (shortestPathToAllPoints > shortestLengthToThisHospital && shortestLengthToThisHospital != 0) {
                shortestPathToAllPoints = shortestLengthToThisHospital;
            }

        }
    }
}
