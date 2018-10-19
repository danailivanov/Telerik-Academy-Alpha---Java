import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        int oddSum = 0;
        int evenSum =0;

        for (int i = 0; i < input.length() ; i++) {
            char ch = input.charAt(i);
            int number = ch - '0';
            if (number % 2 == 0 || number == 0){
                evenSum += number;
            }else{
                oddSum += number;
            }
        }
        if (evenSum == oddSum){
            System.out.println(evenSum + " of both");
        }else if(evenSum > oddSum){
            System.out.println(evenSum + " energy drinks");
        }else{
            System.out.println(oddSum + " cups of coffee");
        }
    }
}
