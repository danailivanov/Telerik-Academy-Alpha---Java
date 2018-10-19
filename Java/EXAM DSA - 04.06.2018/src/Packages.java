import java.util.*;

public class Packages {
    private static HashMap<Integer,List<Integer>> graph = new HashMap<>();
    private static TreeSet<Integer> result = new TreeSet<>();
    private static HashSet<Integer> visited = new HashSet<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        in.nextLine();
        for (int i = 0; i < N; i++) {
            String[] str = in.nextLine().split(" ");
            if (!graph.containsKey(Integer.parseInt(str[0]))) {
                graph.put(Integer.parseInt(str[0]), new ArrayList<>());
            }
            graph.get(Integer.parseInt(str[0])).add(Integer.parseInt(str[1]));
        }
        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            int temp = in.nextInt();
            bfs(temp);
            result.forEach(x -> System.out.print(x + " "));
            System.out.println();
            result.clear();
            visited.clear();
        }

    }

    private static void bfs(int temp) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(temp);
        visited.add(temp);
        result.add(temp);
        while(!queue.isEmpty()){
            int node = queue.remove();
            if(graph.containsKey(node)) {

                for (int i = 0; i < graph.get(node).size(); i++) {
                    int x = graph.get(node).get(i);
                    if(!visited.contains(x)){
                        result.add(x);
                    }
                }
                for (int i = 0; i < graph.get(node).size(); i++) {
                    int x = graph.get(node).get(i);
                    if(!visited.contains(x)){
                        queue.add(x);
                    }
                }
                for (int i = 0; i < graph.get(node).size(); i++) {
                    int x = graph.get(node).get(i);
                    if(visited.contains(x)){
                        visited.add(x);
                    }
                }
//                graph.get(node)
//                        .stream()
//                        .filter(x -> !visited.contains(x))
//                        .forEach(x -> result.add(x));
//                graph.get(node)
//                        .stream()
//                        .filter(x -> !visited.contains(x))
//                        .forEach(x -> queue.add(x));
//                graph.get(node)
//                        .stream()
//                        .filter(x -> visited.contains(x))
//                        .forEach(x -> visited.remove(x));
            }
        }
    }
}
