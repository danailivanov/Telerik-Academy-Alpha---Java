import java.util.Scanner;

public class SymmetricArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        for (int testIndex = 0; testIndex < N; testIndex++) {
            String[] elements = in.nextLine()
                    .split(" ");
            boolean isSymmetric = true;

            for (int i = 0; i < elements.length / 2; i++) {
                if (!elements[i].equals(elements[elements.length - 1 - i])) {
                    isSymmetric = false;
                    break;
                }
            }
            System.out.println(isSymmetric ? "Yes" : "No");
        }
    }
}
