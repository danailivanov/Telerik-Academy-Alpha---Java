import java.util.Scanner;

public class StringReverse {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(stringReverse(input));
    }

    static String stringReverse (String str){
        if (str.length() == 0){
            return str;
        }
        return stringReverse(str.substring(1)) + str.charAt(0);
    }

}
