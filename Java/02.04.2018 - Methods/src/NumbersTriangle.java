import java.util.Scanner;

public class NumbersTriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        numbersTriangle(N);
    }
    public static void numbersTriangle(int number){
        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = number; i >= 1 ; i--) {
            for (int j = 1; j < i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
