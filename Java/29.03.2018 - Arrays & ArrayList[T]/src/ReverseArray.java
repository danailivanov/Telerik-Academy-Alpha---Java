import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] numbers = in.nextLine()
                .split(" ");

        for (int i = numbers.length - 1; i > 0 ; i--) {
            System.out.print(numbers[i] + ", ");

        }
        System.out.println(numbers[0]);
    }
}