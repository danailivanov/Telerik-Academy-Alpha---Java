import java.util.*;
import java.util.stream.Collectors;

public class Pacages {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, List<Integer>> graph = readGraph(in);

        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            int vertex = in.nextInt();
            install(vertex, graph);
        }
    }

    private static void install(int vertex, Map<Integer, List<Integer>> graph) {
//        Set<Integer> used = new TreeSet<>();
//        used.add(vertex);

//        if (graph.containsKey(vertex)) {
//            dfs(vertex, graph, used);
//        }

        Set<Integer> result = bfs(vertex, graph);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }

    private static Set<Integer> bfs(int vertex, Map<Integer, List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> used = new TreeSet<>();
        queue.offer(vertex);
        used.add(vertex);

        if (!graph.containsKey(vertex)) {
            return used;
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next :
                    graph.get(current)) {
                if (used.contains(next)) {
                    continue;
                }

                used.add(next);

                if (!graph.containsKey(next)) {
                    continue;
                }

                queue.offer(next);
            }
        }

        return used;
    }

    private static void dfs(int vertex, Map<Integer, List<Integer>> graph, Set<Integer> used) {
        for (int next : graph.get(vertex)) {
            if (used.contains(next)) {
                continue;
            }

            used.add(next);
            if (!graph.containsKey(next)) {
                continue;
            }

            dfs(next, graph, used);
        }
    }

    private static Map<Integer, List<Integer>> readGraph(Scanner in) {
        int m = in.nextInt();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int from = in.nextInt();
            int to = in.nextInt();
            if (!graph.containsKey(from)) {
                graph.put(from, new ArrayList<>());
            }

            graph.get(from)
                    .add(to);
        }

        return graph;
    }

}
