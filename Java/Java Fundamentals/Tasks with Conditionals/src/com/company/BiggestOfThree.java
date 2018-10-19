package com.company;

//Write a program that finds the biggest of three numbers that are read from the console.

import java.text.DecimalFormat;
import java.util.Scanner;

public class BiggestOfThree {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.###");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double max = a;
        if (a < b){
            max = b;
        }if (max < c){
            max = c;
        }
        System.out.println(df.format(max));

//        if (a > b && a > c) {
//            System.out.println(a);
//        } else if (b > a && b > c) {
//            System.out.println(b);
//        }else if (c > a && c > b){
//            System.out.println(c);
//        }
    }
}
