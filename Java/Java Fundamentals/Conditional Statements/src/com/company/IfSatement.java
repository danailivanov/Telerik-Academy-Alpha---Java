package com.company;

import java.util.Scanner;

public class IfSatement {
    public static void main(String[] args) {
	    Scanner in = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        if (x % 2 == 0) {
            System.out.println("This number is even.");
        }
        else {
            System.out.println("This number is odd.");
        }
//        System.out.println("Please enter your password :");
//        String password = in.nextLine();
//        if (password.length() >=6){
//            System.out.println("Valid password ");
//        }
//        else {
//            System.out.println("Invalid password");
//        }

    }
}
