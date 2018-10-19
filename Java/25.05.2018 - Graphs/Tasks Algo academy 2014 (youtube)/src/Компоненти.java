import java.util.*;

public class Компоненти {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int k = 0; k < T; k++) {
            int N = in.nextInt();
            ArrayList<ArrayList<Integer>> neighbours = new ArrayList<>();
            in.nextLine();
            for (int i = 0; i < N; i++) {
                neighbours.add(new ArrayList<>());
                String temp = in.nextLine();
                for (int j = 0; j < temp.length(); j++) {
                    if (temp.charAt(j) == '1') {
                        neighbours.get(i).add(j);
                    }
                }
            }
            neighbours.forEach(System.out::println);

            List<Boolean> visited = new ArrayList<>();
            neighbours.forEach(x -> visited.add(false));
            int componentsCount = 0;
            for (int i = 0; i < visited.size(); i++) {
                if (!visited.get(i)) {
                    componentsCount++;
                    BFS(i, visited, neighbours);
                }
            }
            System.out.println(componentsCount);
        }
    }

    private static void BFS(int i, List<Boolean> visited, ArrayList<ArrayList<Integer>> neighbours) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(i);
        visited.set(i, true);
        while (!queue.isEmpty()) {
            int node = queue.remove();
            neighbours.get(node)
                    .stream()
                    .filter(x -> !visited.get(x))
                    .forEach(x -> queue.add(x));
            neighbours.get(node)
                    .stream()
                    .filter(x -> !visited.get(x))
                    .forEach(x -> visited.set(x, true));

        }
    }
}
