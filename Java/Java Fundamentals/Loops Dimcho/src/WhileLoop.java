import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

// Basic
//        int index = 0;
//        while (index <= 10) {
//            System.out.println(index);
//            index++;

// Calculate the sum of all numbers between 1 and n
//         int m = 10;//to start from other number
//         int n = 15;
//         int number = m;
//         int sum = 0;
//
//         while(number <= n){
//             sum += number;
//             number++; //number +=2; - sum only even numbers if it start from even
//        }
//        System.out.println(sum);

// checking number is prime and print only prime numbers in some interval
            int m = 1;
            int n = 15;
            int k = 3;// stop on that number
            int index = 0;
            int number = m;

            while (index < k && number <= n) {
                int divider = 2;
                int maxDivider = (int) Math.sqrt(number);
                boolean isPrime = true;
                while (isPrime && divider <= maxDivider) {
                    if (number % divider == 0) {
                        isPrime = false;
                    }
                    divider++;
                }
                if (isPrime) {
                    System.out.println(number);
                    index ++;
                }
                number++;
            }


//Special loop operators break and continue (print only even numbers)

//        int index = 1;
//        int n = 10;
//
//        while(true) {
//            index++;
//            if (index > n){
//                break;
//            }
//            if (index % 2 == 1){
//                continue;
//            }
//            System.out.println(index);
//        }

// Check the email is correct

//        System.out.println("Enter email: ");
//        Scanner in = new Scanner(System.in);
//        String email = in. nextLine();
//        while(true){
//            if(email.contains("@")){
//                System.out.println("The email is accepted.");
//                break;
//            }
//            System.out.println("Whrong email !!!  ");
//            email = in.nextLine();
//        }

        }
    }

