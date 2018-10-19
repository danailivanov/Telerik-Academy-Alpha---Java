import java.util.Scanner;

public class PrintDeck {
    public static void main(String[] args) {

/*Write a program that reads a card sign(as a string) from the console
and generates and prints all possible cards from a standard deck of 52
cards up to the card with the given sign (without the jokers).
The cards should be printed using the classical notation
(like 5 of spades, A of hearts, 9 of clubs; and K of diamonds). */

        Scanner in = new Scanner(System.in);
        String N = in.nextLine();

        switch (N) {
            case "2":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                break;
            case "3":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                System.out.println("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds");
                break;
            case "4":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                System.out.println("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds");
                System.out.println("4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds");
                break;
            case "5":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                System.out.println("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds");
                System.out.println("4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds");
                System.out.println("5 of spades, 5 of clubs, 5 of hearts, 5 of diamonds");
                break;
            case "6":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                System.out.println("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds");
                System.out.println("4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds");
                System.out.println("5 of spades, 5 of clubs, 5 of hearts, 5 of diamonds");
                System.out.println("6 of spades, 6 of clubs, 6 of hearts, 6 of diamonds");
                break;
            case "7":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                System.out.println("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds");
                System.out.println("4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds");
                System.out.println("5 of spades, 5 of clubs, 5 of hearts, 5 of diamonds");
                System.out.println("6 of spades, 6 of clubs, 6 of hearts, 6 of diamonds");
                System.out.println("7 of spades, 7 of clubs, 7 of hearts, 7 of diamonds");
                break;
            case "8":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                System.out.println("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds");
                System.out.println("4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds");
                System.out.println("5 of spades, 5 of clubs, 5 of hearts, 5 of diamonds");
                System.out.println("6 of spades, 6 of clubs, 6 of hearts, 6 of diamonds");
                System.out.println("7 of spades, 7 of clubs, 7 of hearts, 7 of diamonds");
                System.out.println("8 of spades, 8 of clubs, 8 of hearts, 8 of diamonds");
                break;

            case "9":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                System.out.println("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds");
                System.out.println("4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds");
                System.out.println("5 of spades, 5 of clubs, 5 of hearts, 5 of diamonds");
                System.out.println("6 of spades, 6 of clubs, 6 of hearts, 6 of diamonds");
                System.out.println("7 of spades, 7 of clubs, 7 of hearts, 7 of diamonds");
                System.out.println("8 of spades, 8 of clubs, 8 of hearts, 8 of diamonds");
                System.out.println("9 of spades, 9 of clubs, 9 of hearts, 9 of diamonds");
                break;
            case "10":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                System.out.println("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds");
                System.out.println("4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds");
                System.out.println("5 of spades, 5 of clubs, 5 of hearts, 5 of diamonds");
                System.out.println("6 of spades, 6 of clubs, 6 of hearts, 6 of diamonds");
                System.out.println("7 of spades, 7 of clubs, 7 of hearts, 7 of diamonds");
                System.out.println("8 of spades, 8 of clubs, 8 of hearts, 8 of diamonds");
                System.out.println("9 of spades, 9 of clubs, 9 of hearts, 9 of diamonds");
                System.out.println("10 of spades, 10 of clubs, 10 of hearts, 10 of diamonds");
                break;
            case "J":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                System.out.println("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds");
                System.out.println("4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds");
                System.out.println("5 of spades, 5 of clubs, 5 of hearts, 5 of diamonds");
                System.out.println("6 of spades, 6 of clubs, 6 of hearts, 6 of diamonds");
                System.out.println("7 of spades, 7 of clubs, 7 of hearts, 7 of diamonds");
                System.out.println("8 of spades, 8 of clubs, 8 of hearts, 8 of diamonds");
                System.out.println("9 of spades, 9 of clubs, 9 of hearts, 9 of diamonds");
                System.out.println("10 of spades, 10 of clubs, 10 of hearts, 10 of diamonds");
                System.out.println("J of spades, J of clubs, J of hearts, J of diamonds");
                break;
            case "Q":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                System.out.println("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds");
                System.out.println("4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds");
                System.out.println("5 of spades, 5 of clubs, 5 of hearts, 5 of diamonds");
                System.out.println("6 of spades, 6 of clubs, 6 of hearts, 6 of diamonds");
                System.out.println("7 of spades, 7 of clubs, 7 of hearts, 7 of diamonds");
                System.out.println("8 of spades, 8 of clubs, 8 of hearts, 8 of diamonds");
                System.out.println("9 of spades, 9 of clubs, 9 of hearts, 9 of diamonds");
                System.out.println("10 of spades, 10 of clubs, 10 of hearts, 10 of diamonds");
                System.out.println("J of spades, J of clubs, J of hearts, J of diamonds");
                System.out.println("Q of spades, Q of clubs, Q of hearts, Q of diamonds");
                break;
            case "K":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                System.out.println("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds");
                System.out.println("4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds");
                System.out.println("5 of spades, 5 of clubs, 5 of hearts, 5 of diamonds");
                System.out.println("6 of spades, 6 of clubs, 6 of hearts, 6 of diamonds");
                System.out.println("7 of spades, 7 of clubs, 7 of hearts, 7 of diamonds");
                System.out.println("8 of spades, 8 of clubs, 8 of hearts, 8 of diamonds");
                System.out.println("9 of spades, 9 of clubs, 9 of hearts, 9 of diamonds");
                System.out.println("10 of spades, 10 of clubs, 10 of hearts, 10 of diamonds");
                System.out.println("J of spades, J of clubs, J of hearts, J of diamonds");
                System.out.println("Q of spades, Q of clubs, Q of hearts, Q of diamonds");
                System.out.println("K of spades, K of clubs, K of hearts, K of diamonds");
                break;
            case "A":
                System.out.println("2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds");
                System.out.println("3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds");
                System.out.println("4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds");
                System.out.println("5 of spades, 5 of clubs, 5 of hearts, 5 of diamonds");
                System.out.println("6 of spades, 6 of clubs, 6 of hearts, 6 of diamonds");
                System.out.println("7 of spades, 7 of clubs, 7 of hearts, 7 of diamonds");
                System.out.println("8 of spades, 8 of clubs, 8 of hearts, 8 of diamonds");
                System.out.println("9 of spades, 9 of clubs, 9 of hearts, 9 of diamonds");
                System.out.println("10 of spades, 10 of clubs, 10 of hearts, 10 of diamonds");
                System.out.println("J of spades, J of clubs, J of hearts, J of diamonds");
                System.out.println("Q of spades, Q of clubs, Q of hearts, Q of diamonds");
                System.out.println("K of spades, K of clubs, K of hearts, K of diamonds");
                System.out.println("A of spades, A of clubs, A of hearts, A of diamonds");
                break;
        }
    }
}