package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BiggestOfFive {
    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("0.###");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();

        if ((a >= b) && (a >= c) && (a >= d) && (a >= e)) { // a >= b,c,d,e
            System.out.println (df.format(a));
        } else if ((b >= c) && (b >= d) && (b >= e)) {      // b >= c,d,e
            System.out.println (df.format(b));
        } else if ((c >= d) && (c >= e)) {                  // c >= d,e
            System.out.println (df.format(c));
        } else if (d >= e) {                                // d >= e
            System.out.println (df.format(d));
        } else {                                            // e > d
            System.out.println (df.format(e));
        }
    }
}
