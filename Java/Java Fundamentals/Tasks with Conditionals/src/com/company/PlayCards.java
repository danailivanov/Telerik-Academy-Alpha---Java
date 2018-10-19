package com.company;

/*Classical play cards use the following signs to designate the card face:
 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. Write a program that enters a string and prints
 "yes CONTENT_OF_STRING" if it is a valid card sign or "no CONTENT_OF_STRING" otherwise.
 */

import java.util.Scanner;

public class PlayCards {
    public static void main (String[] arfs) {
        Scanner in = new Scanner(System.in);
        String cardString = in.nextLine();
// Solution 1

        switch (cardString) {
            case "2":
                System.out.println("yes 2"); break;
            case "3":
                System.out.println("yes 3"); break;
            case "4":
                System.out.println("yes 4"); break;
            case "5":
                System.out.println("yes 5"); break;
            case "6":
                System.out.println("yes 6"); break;
            case "7":
                System.out.println("yes 7"); break;
            case "8":
                System.out.println("yes 8"); break;
            case "9":
                System.out.println("yes 9"); break;
            case "10":
                System.out.println("yes 10"); break;
            case "J":
                System.out.println("yes J"); break;
            case "Q":
                System.out.println("yes Q"); break;
            case "K":
                System.out.println("yes K"); break;
            case "A":
                System.out.println("yes A"); break;
                default:
                    System.out.println("no " + cardString); break;
        }

// Solution 2
//        if (cardString.equals("2")
//                || cardString.equals("3")
//                || cardString.equals("4")
//                || cardString.equals("5")
//                || cardString.equals("6")
//                || cardString.equals("7")
//                || cardString.equals("8")
//                || cardString.equals("9")
//                || cardString.equals("10")
//                || cardString.equals("J")
//                || cardString.equals("Q")
//                || cardString.equals("K")
//                || cardString.equals("A")){
//            System.out.println("yes " + cardString);
//        }else {
//            System.out.println("no " + cardString);
//        }
    }
}
