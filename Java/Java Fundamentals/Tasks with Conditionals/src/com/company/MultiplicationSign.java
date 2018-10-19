package com.company;

//Write a program that shows the sign (+, - or 0) of the product of three real numbers, without calculating it.

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

// Solution 1

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("0");
        }else {
            int minusCounts = 0;
            if (a < 0){
                minusCounts += 1;
            }
            if (b < 0){
                minusCounts += 1;
            }
            if (c < 0){
                minusCounts += 1;
            }
            if (minusCounts == 0 || minusCounts == 2){
                System.out.println("+");
            }else{
                System.out.println("-");
            }
        }

// Solution 2

//        if (a == 0 || b == 0 || c == 0) {
//            System.out.println("0");
//        } else {
//            if (a < 0) {
//                if (b < 0) {
//                    if (c < 0) {
//                        System.out.println("-");
//                    } else {
//                        System.out.println("+");
//                    }
//                } else {
//                    if (c < 0) {
//                        System.out.println("+");
//                    } else {
//                        System.out.println("-");
//                    }
//                }
//            } else {
//                if (b < 0) {
//                    if (c < 0) {
//                        System.out.println("+");
//                    } else {
//                        System.out.println("-");
//                    }
//                } else {
//                    if (c < 0) {
//                        System.out.println("-");
//                    } else {
//                        System.out.println("+");
//                    }
//                }
//            }
//        }
    }
}
