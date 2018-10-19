import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String output = "";
        for (int i = input.length() - 1; i >= 0   ; i--) {
            char ch = input.charAt(i);
            if(Character.isAlphabetic(ch)){
                output += ch;
            }
        }
        System.out.println(output);
    }
}