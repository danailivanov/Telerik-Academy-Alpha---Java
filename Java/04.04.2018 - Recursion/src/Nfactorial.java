import java.util.Scanner;

public class Nfactorial {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(calcFactorial(N));
    }

    static int calcFactorial (int n){
        if(n == 0){
            return 1;
        }
        return n * calcFactorial(n - 1 );
    }
}
