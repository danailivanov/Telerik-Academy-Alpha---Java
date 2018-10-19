import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int number = in.nextInt();
            int thirdNumber = number % 10;
            int secondNumber = number / 10 % 10;
            int firstNumber = number / 100 % 10;
            if (secondNumber == (firstNumber + thirdNumber)) {
                sum += number;
            }else{
                break;
            }
        }
        System.out.println(sum);
    }
}
