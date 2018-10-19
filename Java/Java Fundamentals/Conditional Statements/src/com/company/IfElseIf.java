package com.company;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.nextLine().charAt(0);
        if (ch == 'A' || ch == 'a' ) {
            System.out.println("Vowel [i:]");
        }
        else if (ch == 'O' || ch == 'o'){
            System.out.println("Vowel [ou]");
        }
        else {
            System.out.println("String is a consunant");
        }

    }
}
