import java.util.Scanner;
/*Петър забравил паролата за сейфа си. Единственото, което си спомня е, че тя се получава от цяло положително шестцифрено число N по следния начин:
Разменят се първата и шестата, втората и петата, третата и четвъртата цифри на N;
Пресмятат се частното и остатъка при деление на новополученото число на цялото положително число K;
Събират се получените частно и остатък.
Направете програма, която да извежда получената по описания начин парола.
 */
public class Password {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int divider = in.nextInt();
        int reverse = 0;
        int pass = 0;

        while (number > 0){
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        pass = (reverse / divider) + (reverse % divider);
        System.out.println(pass);
    }
}
