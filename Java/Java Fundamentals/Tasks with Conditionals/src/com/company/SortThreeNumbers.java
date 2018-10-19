package com.company;

/*Write a program that enters 3 real numbers and prints them sorted in descending order.
- Use nested "if" statements.
- Don’t use arrays and the built-in sorting functionality._
*/

import java.util.Scanner;

public class SortThreeNumbers {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//Solution 1 with " Nasted if " Statementa
        if(a < b){
            if(a < c){
                if(b < c){
                    System.out.println(c + " " + b + " " + a);
                }else{
                    System.out.println(b + " " + c + " " + a);
                }
            }else {
                System.out.println(b + " " + a + " " + c);
            }
        }else {
            if(b < c){
                if(a < c){
                    System.out.println(c + " " + a + " " + b);
                }else {
                    System.out.println(a + " " + c + " " + b);
                }
            }else {
                System.out.println(a + " " + b + " " + c);
            }
        }

// Solution 2 with " if - else if"
//        if(a < b && b < c){
//            System.out.println(a + " " + b + " " + c);
//        }else if(a < b && a < c && c < b){
//            System.out.println(a + " " + c + " " + b);
//        }else if (b < a && a < c){
//            System.out.println(b + " " + a + " " + c);
//        }else if (b < a && b < c && c < a){
//            System.out.println(b + " " + c + " " + a);
//        }else if (c < a && a < b){
//            System.out.println(c + " " + a + " " + b);
//        }else{
//            System.out.println(c + " " + b + " " + a);
//        }
    }
}
