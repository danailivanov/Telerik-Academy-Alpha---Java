import java.util.Scanner;

public class GoodNumbers {
    /*Иванчо нарича едно число добро, ако то се дели на всяка негова цифра различна от 0.
Например: - 13 не е добро - не се дели на 3 - 36 е добро - дели се на 3 и на 6 - 102 e добро - дели се на 1 и на 2 - 103 не е добро - не се дели на 3
Помогнете на Иванчо като напишете програма, която намира броя на всички добри числа между дадени A и B (включително).
*/

    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int number = 0;
        int count = 0;

        while(A <= B) {
            boolean itsGood = true;
            for (int i = A; i > 0 && itsGood; i /= 10) {
                number = i % 10;
                if (number == 0 || A % number == 0) {
                    itsGood = true;
                } else {
                    itsGood = false;
                }
            }
            if (itsGood) {
                count++;
            }
            A++;
        }
        System.out.println(count);
    }
}
