package com.company;
import java.util.Scanner;
// Find the smoller and bigger of tree integers

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double min = y;
        double max = x;

//use If
        if (x < y) {
            min = x;
            max = y;
        }

        if (z < min) {
            min = z;
        }

        if (max < z) {
            max = z;
        }
//use If-Else
//        if (x < y) {
//            if (x < z) {
//                min = x;
//            } else {
//                min = z;
//            }
//            if (z < y) {
//                max = y;
//            } else {
//                max = z;
//            }
//        }else {
//            if (y < z) {
//                min = y;
//            } else {
//                min = z;
//            }
//        }

        System.out.println("The bigger number is " + max);
        System.out.println("The smoller number is " + min);

    }
}
