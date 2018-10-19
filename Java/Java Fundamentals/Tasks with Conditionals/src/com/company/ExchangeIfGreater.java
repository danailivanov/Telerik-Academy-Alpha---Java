package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeIfGreater {
    public static void main (String[] args){
        DecimalFormat df = new DecimalFormat("0.###");
        Scanner in = new Scanner (System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();

        if(A > B){
            System.out.println (df.format(B) + " " + df.format(A));
        }else {
            System.out.println (df.format(A) + " " + df.format(B));
        }
    }
}
