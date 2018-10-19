import java.util.Scanner;
/*Вчера Гошо си купи крачкомер. За съжаление, Гошо все още не се е научил да гледа какво купува. Крачкомера му  мери в мили, а той разбира само от метри.
Напишете програма, която по отчетените мили от крачкомера пресмята колко метра е изминал Гошо.*/
public class walk {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum = N * 1609;
        System.out.println(sum);

    }
}
