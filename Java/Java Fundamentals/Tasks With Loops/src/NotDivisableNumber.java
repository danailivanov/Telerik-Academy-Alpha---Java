import java.util.Scanner;

public class NotDivisableNumber {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 1; i <= N; i++){
            if ((i % 3 == 0) || (i % 7 == 0)){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}