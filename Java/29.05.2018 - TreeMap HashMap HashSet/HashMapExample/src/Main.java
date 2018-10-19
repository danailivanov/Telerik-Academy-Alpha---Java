import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> students = new HashMap<>();
        students.put("Pesho", 3.00);
        students.put("Gosho", 3.00);
        students.put("Nakov", 5.50);
        students.put("Vesko", 3.50);
        students.put("Tsanev", 4.00);
        students.put("Nerdy", 6.00);

        Double tsanevMark = students.get("Tsanev");
        System.out.printf("Tsanev's mark: %.2f %n", tsanevMark);

        students.remove("Tsanev");
        System.out.println("Tsanev removed.");

        System.out.printf("Is Tsanev in the hash table: %b %n",
                students.containsKey("Tsanev"));

        students.put("Nerdy", 3.25);
        System.out.println("Nerdy's mark changed.");

        System.out.println("Students and marks:");
        for (Map.Entry<String, Double> studentMark : students.entrySet()) {
            System.out.printf("%s has %.2f\n", studentMark.getKey(), studentMark.getValue());
        }
        System.out.printf("There are %d students.\n",
                students.size());
        students.clear();
        System.out.println("Students hashmap cleared.");
        System.out.printf("Is hash table empty: %b%n",
                students.isEmpty());
    }
}
