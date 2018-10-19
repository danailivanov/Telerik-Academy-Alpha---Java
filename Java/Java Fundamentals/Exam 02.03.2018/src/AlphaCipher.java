import java.util.Scanner;

public class AlphaCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5 ; i++) {
            int sum = 0;
            int number = in.nextInt();
            int z = number % 10;
            int y = number / 10 % 10;
            int x = number / 100 % 10;
            sum = z * y * x;
            if (sum > 9){
                int w = sum % 10;
                System.out.print(w);
            }else{
                System.out.print(sum);
            }
        }
    }
}
