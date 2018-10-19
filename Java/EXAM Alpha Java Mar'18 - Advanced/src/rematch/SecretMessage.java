package rematch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SecretMessage {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String input = in.readLine();

        System.out.println(brack(input));


        System.out.println();


    }
    public static int checkForBrackets(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '}') {
                return i;
            }
        }
        return -1;
    }
    public static String brack(String s) {
        int end = checkForBrackets(s);
        if(end == -1) {
            return s;
        }
        int start = 0;

        String num = "";
        StringBuilder sb = new StringBuilder();
        for (int j = end - 1; j >= 0; j--) {
            if(Character.isLetter(s.charAt(j))) {
                sb.append(s.charAt(j));
            }
            else if(s.charAt(j) == '{') {
                start = j;
                break;
            }
        }
        //The actual string;
        String toRepeat1 = "";
        //The temporary string for reversing;
        String toRepeat = sb.toString();
        for (int i = toRepeat.length()-1; i >= 0; i--) {
            toRepeat1 += toRepeat.charAt(i);
        }
        sb.delete(0, sb.length()+1);
        int index = start - 1;
        while(Character.isDigit(s.charAt(index))) {
            num += s.charAt(index);
            index--;
            start = index + 1;
            if(index < 0) {
                start = index + 1;
                break;
            }
        }
        //The string for the number
        String newN = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            newN += num.charAt(i);
        }
        //The actuall number
        int rep = Integer.parseInt(newN);
        for (int i = 0; i < rep; i++) {
            sb.append(toRepeat1);
        }
        String middle = sb.toString();
        String newS = s.substring(0, start) + middle + s.substring(end + 1, s.length());

        return brack(newS);

    }
}
