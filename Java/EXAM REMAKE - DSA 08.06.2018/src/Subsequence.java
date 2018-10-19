import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String possibleSubstring = in.nextLine();
        String bigString = in.nextLine();
        boolean result = false;

        if(possibleSubstring.length() == 0){
            result = true;
        }
        int indexPossibleSubstring = 0;
        int indexBigString = 0;
        while(indexBigString < bigString.length()){
            if(bigString.charAt(indexBigString) == possibleSubstring.charAt(indexPossibleSubstring)){
                indexPossibleSubstring++;
                if(indexPossibleSubstring == possibleSubstring.length()){
                    result = true;
                    break;
                }
            }
            indexBigString++;
        }
        System.out.println(result);
    }
}
