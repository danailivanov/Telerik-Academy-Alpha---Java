import java.util.*;
import java.util.stream.Collectors;

public class OnlineMarket {
    private static final String PRODUCT_ALREADY_EXIST_MESSAGE_FORMAT =
            "Error: Product %s already exists%n";
    private static final String PRODUCT_CREATED_MESSAGE_FORMAT =
            "Ok: Product %s added successfully%n";
    private static final String PRODUCTS_LIST_MESSAGE_FORMAT =
            "Ok: %s%n";
    private static final long NUMBER_OF_PRODUCTS_TO_LIST = 10;
    private static final String PRODUCT_LIST_BY_TYPE_DOES_NOT_EXIST_MESSAGE_FORMAT =
            "Error: Type %s does not exists%n";

    private static Set<String> products;
    private static Map<String, List<Product>> productsByType;
    private static TreeMap<Double, List<Product>> productsByPrice;

    public static void main(String[] args) {
        products = new HashSet<>();
        productsByPrice = new TreeMap<>();
        productsByType = new TreeMap<>();
        Scanner in = new Scanner(System.in);
        List<String> command = Arrays.asList(in.nextLine().split(" "));
        while (!command.get(0).equals("end")) {
            switch (command.get(0)) {
                case "add":
                    handleAddCommand(command.subList(1, command.size()));
                    break;
                case "filter":
                    handleFilterCommand(command.subList(2, command.size()));
                    break;
            }
            command = Arrays.asList(in.nextLine().split(" "));
        }
    }

    private static void handleFilterCommand(List<String> params) {
        List<Product> products = null;
        switch (params.get(0)) {
            case "price":
                double from = Double.MIN_VALUE;
                int fromIndex = params.indexOf("from");
                if (fromIndex >= 0) {
                    from = Double.parseDouble(params.get(fromIndex + 1));
                }

                double to = Double.MAX_VALUE;
                int toIndex = params.indexOf("to");
                if (toIndex >= 0) {
                    to = Double.parseDouble(params.get(toIndex + 1));
                }

                products = getProductsByPrice(from, to);
                break;
            case "type":
                String type = params.get(1);
                try {
                    products = getProductsByType(type);
                } catch (Exception ex) {
                    System.out.printf(PRODUCT_LIST_BY_TYPE_DOES_NOT_EXIST_MESSAGE_FORMAT, type);
                    return;
                }
                break;
        }

        products.sort(Comparator.naturalOrder());
        String result = products.stream()
                .limit(NUMBER_OF_PRODUCTS_TO_LIST)
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.printf(PRODUCTS_LIST_MESSAGE_FORMAT, result);
    }

    private static List<Product> getProductsByPrice(double from, double to) {
        List<Product> products = new ArrayList<>();
        productsByPrice.keySet()
                .stream()
                .filter(price -> from <= price && price <= to)
                .forEach(price -> products.addAll(productsByPrice.get(price)));
        return products;
    }

    private static List<Product> getProductsByType(String type) throws Exception {
        if (!productsByType.containsKey(type)) {
            throw new Exception();
        }
        return productsByType.get(type);
    }

    private static void handleAddCommand(List<String> params) {
        String name = params.get(0);
        double price = Double.parseDouble(params.get(1));
        String type = params.get(2);
        if (products.contains(name)) {
            System.out.printf(PRODUCT_ALREADY_EXIST_MESSAGE_FORMAT, name);
            return;
        }

        products.add(name);
        Product product = new Product(name, type, price);

        if (!productsByType.containsKey(type)) {
            productsByType.put(type, new ArrayList<>());
        }
        productsByType.get(type)
                .add(product);

        if (!productsByPrice.containsKey(price)) {
            productsByPrice.put(price, new ArrayList<>());
        }
        productsByPrice.get(price)
                .add(product);

        System.out.printf(PRODUCT_CREATED_MESSAGE_FORMAT, name);
    }

    static class Product implements Comparable<Product> {
        private final String name;
        private final String type;
        private final double price;

        public Product(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Product o) {
            int compareResult = Double.compare(getPrice(), o.getPrice());
            if (compareResult != 0) {
                return compareResult;
            }
            compareResult = getName().compareTo(o.getName());
            return compareResult;
        }

        @Override
        public String toString() {
            int price = (int) getPrice();
            if (price == getPrice()) {
                return String.format("%s(%d)", getName(), price);
            }

            return String.format("%s(%s)", getName(), getPrice() + "");
        }
    }

}
