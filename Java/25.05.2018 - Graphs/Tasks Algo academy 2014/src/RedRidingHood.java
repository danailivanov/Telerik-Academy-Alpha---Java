import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RedRidingHood {
    private static int n;
    private static int[] money;
    private static ArrayList<ArrayList<Integer>> graph;
    private static int maxMoney;
    private static int bestNode;

    public static void redRidingHood() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(in.readLine());
        money = new int[n];
        graph = new ArrayList<>();
        String[] moneyStrings = in.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            money[i] = Integer.parseInt(moneyStrings[i]);
        }

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            String[] nodes = in.readLine().split(" ");
            int a = Integer.parseInt(nodes[0]) - 1;
            int b = Integer.parseInt(nodes[1]) - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        maxMoney = 0;
        bestNode = -1;
        dfs(0, -1, 0);

        maxMoney = 0;
        dfs(bestNode, -1, 0);
        System.out.println(maxMoney);
    }

    private static void dfs(int x, int prev, int tempMoney) {
        tempMoney += money[x];
        boolean hasNext = false;
        for (int i : graph.get(x)) {
            if (i != prev) {
                hasNext = true;
                dfs(i, x, tempMoney);
            }
        }
        if (!hasNext) {
            if (tempMoney > maxMoney) {
                maxMoney = tempMoney;
                bestNode = x;
            }
        }
    }

}
