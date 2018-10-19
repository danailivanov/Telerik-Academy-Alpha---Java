import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        N = N.replaceFirst("-", "");
        int numbers = Integer.parseInt(N);
        int[] arrNumbers = new int[N.length()];
        for (int i = 0; i < arrNumbers.length ; i++) {

            arrNumbers[i] = numbers % 10;
            numbers /= 10;
        }
        int sum = 0;
        for (int i = 0; i < arrNumbers.length ; i++) {
            sum += arrNumbers[i];
        }
        while (sum > 9){
            numbers = sum;
            N = String.valueOf(sum);
            arrNumbers = new int[N.length()];
            for (int i = 0; i < arrNumbers.length; i++) {
                arrNumbers[i] = numbers % 10;
                numbers /= 10;
            }
            sum = 0;
            for (int i = 0; i < arrNumbers.length ; i++) {
                sum += arrNumbers[i];
            }
        }
        System.out.println(sum);
    }
}
