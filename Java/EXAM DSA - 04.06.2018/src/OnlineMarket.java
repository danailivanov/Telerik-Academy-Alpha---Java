import java.util.*;
import java.util.stream.Collectors;

public class OnlineMarket {
    private static HashMap<String, Product> productsMap = new HashMap<>();
    private static HashMap<String, List<Product>> orderedProductsByType = new HashMap<>();
    private static TreeMap<Double, Product> orderedProductsByPrice = new TreeMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String[] command = in.nextLine().split(" ");
            switch (command[0]) {
                case "add":
                    addProduct(command);
                    break;
                case "filter":
                    filterProductsByType(command);
                case "":
                    filterProductsByType(command);
                case "end":
                    return;
            }
        }
    }

    public static void addProduct(String[] arguments) {
        if (productsMap.containsKey(arguments[1])) {
            System.out.printf("Error: Product %s already exists\n", arguments[1]);
        } else {
            Product newProduct = new Product(arguments[1], Double.parseDouble(arguments[2]), arguments[3]);
            productsMap.put(arguments[1], newProduct);
            if (!orderedProductsByType.containsKey(arguments[3])) {
                orderedProductsByType.put(arguments[3], new ArrayList<>());
            }
            orderedProductsByType.get(arguments[3]).add(newProduct);
            orderedProductsByPrice.put(Double.parseDouble(arguments[2]), newProduct);
            System.out.printf("Ok: Product %s added successfully\n", arguments[1]);
        }
    }

    public static void filterProductsByType(String[] arguments) {
        System.out.print("Ok: ");
        String str = orderedProductsByType.get(arguments[3])
                .stream()
                .limit(10)
                .map(x -> x.toString())
                .collect(Collectors.joining(", "));
        System.out.println(str);

    }

    public static void filterByPriceFromTo(String[] arguments) {
        double min = Double.parseDouble(arguments[4]);
        double max = Double.parseDouble(arguments[6]);
        for (Map.Entry entry : orderedProductsByPrice.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }
    }

    static class Product {
        String name;
        double price;
        String type;

        public Product(String name, double price, String type) {
            this.name = name;
            this.price = price;
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("%s(%s)", name, price);
        }
    }
}

//
//import java.util.*;
//
//public class Packages {
//    private static HashMap<Integer,List<Integer>> graph = new HashMap<>();
//    private static TreeSet<Integer> result = new TreeSet<>();
//    private static List<Boolean> visited = new ArrayList<>();
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
////        ArrayList<ArrayList<Integer>> neighbours = new ArrayList<>();
////        in.nextLine();
////        for (int i = 0; i < N; i++) {
////            neighbours.add(new ArrayList<>());
////            String[] str = in.nextLine().split(" ");
////            neighbours.
////        }
//
//        in.nextLine();
//        for (int i = 0; i < N; i++) {
//            String[] str = in.nextLine().split(" ");
//            if (!graph.containsKey(Integer.parseInt(str[0]))) {
//                graph.put(Integer.parseInt(str[0]), new ArrayList<>());
//            }
//            graph.get(Integer.parseInt(str[0])).add(Integer.parseInt(str[1]));
//        }
//        int k = in.nextInt();
//        for (int i = 0; i < k; i++) {
//            int temp = in.nextInt();
//            bfs(temp);
//            result.forEach(System.out::print);
//        }
//
//    }
//
//    private static void bfs(int temp) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(temp);
//        visited.set(temp, true);
//        while(!queue.isEmpty()){
//            int node = queue.remove();
//
//            graph.get(node)
//                    .stream()
//                    .filter(x -> !visited.get(x))
//                    .forEach(x->result.add(x));
//            graph.get(node)
//                    .stream()
//                    .filter(x -> !visited.get(x))
//                    .forEach(x->queue.add(x));
//            graph.get(node)
//                    .stream()
//                    .filter(x -> !visited.get(x))
//                    .forEach(x->visited.set(x, true));
//        }
//    }
//}
