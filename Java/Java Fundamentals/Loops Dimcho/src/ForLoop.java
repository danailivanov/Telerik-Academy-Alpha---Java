import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){

// n^m = n*n*.......n
// not good to use Math.pow because its too slow:
//        int power = (int) Math.pow(n, m);
//        System.out.println(power);

//better than Math.pow:

        int n = 3;
        int m = 5;

        int power = 1;
        for(int i = 1; i <= m; i++){
            power *=n;
        }
        System.out.println(power);

// по битови оператори (по битово изместване на ляво и дясно) "<<, >>"
        // 7      -> 00000111
        // 7 << 3 -> 00111000 -> 56
        // 7      -> 00000111
        // 7 >> 2 -> 00000001 -> 1
        // x << n == x * 2^n
        // x >> n == x / (2^n)
//        int n = 10;
//        // 2^10 = 1 * 2^10
//        System.out.println(1 << n);
//        // 4^10 = (2^2)^10 = 2^20
//        System.out.println(1 << (2*n));

// Print all prime number in some interval

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a low number: ");
//        int n = in.nextInt();
//        System.out.println("Enter a high number: ");
//        int m = in.nextInt();
//
//        for(int number = n; number <= m; number++) {
//            int maxDivider = (int) Math.sqrt(number);
//            boolean isPrime = true;
//            for (int divider = 2; divider <= maxDivider; divider++) {
//                if (number % divider == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println(number + " is prime");
//            }
//        }

// check the number is prime
//        System.out.println("Enter a number: ");
//        Scanner in = new Scanner(System.in);
//        int number = in.nextInt();
//        int maxDivider = (int) Math.sqrt(number);
//        boolean isPrime = true;
//        for(int divider = 2; divider <= maxDivider; divider++){
//            if (number % divider== 0){
//                isPrime = false;
//                break;
//            }
//        }
//        if(isPrime){
//            System.out.println(number + " is prime");
//        }else {
//            System.out.println(number + " is not prime");
//        }

        // Basic
//        int n = 10;
//        for (int number = 0; number < n; number ++){
//            System.out.println(number);
//        }
    }
}
