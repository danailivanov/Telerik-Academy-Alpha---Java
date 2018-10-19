import java.util.Scanner;

public class Nfactorial {
    public static void main (String[]args) {
        var in = new Scanner(System.in);
        var N = in.nextInt();
        System.out.println(calcFactorial(N));
    }

    static int calcFactorial (int n){
        if(n == 0){
            return 1;
        }
        return n * calcFactorial(n - 1 );
    }
}
