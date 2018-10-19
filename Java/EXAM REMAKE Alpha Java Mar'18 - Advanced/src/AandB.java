
import java.util.Scanner;

public class AandB {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in. nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        String input = "";
        if(A < B){
            input = A + "" + B;
        }else{
            input = B + "" + A;
        }
        getVariations(N,input,new StringBuffer());

    }
    private static void getVariations(int N,String input,
                                      StringBuffer output){
        if(N == 0){
            System.out.println(output);
        }else{
            for (int i = 0; i < input.length(); i++) {
                output.append(input.charAt(i));
                getVariations(N - 1, input, output);
                output.deleteCharAt(output.length() - 1);
            }
        }

    }
}
