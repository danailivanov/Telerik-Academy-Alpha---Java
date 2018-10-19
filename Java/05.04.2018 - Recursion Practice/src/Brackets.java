import java.util.HashSet;
import java.util.Scanner;

public class Brackets {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        generateBracketsExpressions("dope", n)
                .forEach(System.out::println);

    }

    private static HashSet<String> generateBracketsExpressions(String exp, int n){
        HashSet<String> bracketsExpressions = new HashSet<>();
        if(exp.length() >= n){
            bracketsExpressions.add(exp);
            return bracketsExpressions;
        }
        bracketsExpressions.addAll(generateBracketsExpressions('(' + exp + ')', n));
        bracketsExpressions.addAll(generateBracketsExpressions("()" + exp, n));
        bracketsExpressions.addAll(generateBracketsExpressions(exp + "()", n));
        return bracketsExpressions;
    }
}
