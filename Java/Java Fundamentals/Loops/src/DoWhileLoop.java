import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
// Calculate the product of all numbers in the interval [n...m]:

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int number = n;
        int product = 1;
        do {
            product *= number;
            number++;
        }while(number <= m);
        System.out.println(product);

// Calculate N!:
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int factoriel = 1;
//
//        do {
//            factoriel *= n;
//            n--;
//        }while (n >= 1);
//        System.out.println(factoriel);
    }
}
