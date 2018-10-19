package com.company;

/*Write a program that applies bonus score to given score in the range [1…9] by the following rules:

If the score is between 1 and 3, the program multiplies it by 10.
If the score is between 4 and 6, the program multiplies it by 100.
If the score is between 7 and 9, the program multiplies it by 1000.
If the score is less than 0 or more than 9, the program prints "invalid score".
*/
import java.util.Scanner;

public class BonusScore {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  score = in.nextInt();
// Solution 1
        if (score <= 0) {
            System.out.println("invalid score");
        }else if (score < 4) {
            System.out.println(score * 10);
        }else if (score < 7) {
            System.out.println(score * 100);
        }else if (score < 10) {
            System.out.println(score * 1000);
        }else {
            System.out.println("invalid score");
        }
// Solution 2
//        if (score <= 0 || score > 9){
//            System.out.println("invalid score");
//        }
//        if (score >=1 && score <=3) {
//            System.out.println(score*10);
//        }
//        if (score >3 && score <=6) {
//            System.out.println(score*100);
//        }
//        if (score >6 && score <=9) {
//            System.out.println(score*1000);
//        }

    }
}
