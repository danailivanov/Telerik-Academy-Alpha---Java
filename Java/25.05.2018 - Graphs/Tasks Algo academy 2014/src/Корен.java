import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Корен {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Boolean> visited = Stream.generate(() -> false)
                .limit(N + 1)
                .collect(Collectors.toList());
        for (int i = 0; i < N; i++) {
            int parent = in.nextInt();
            int children = in.nextInt();
            visited.set(children, true);
        }
        for (int i = 0; i < visited.size(); i++) {
            if (!visited.get(i)) {
                System.out.println(i);
            }
        }
    }
}
