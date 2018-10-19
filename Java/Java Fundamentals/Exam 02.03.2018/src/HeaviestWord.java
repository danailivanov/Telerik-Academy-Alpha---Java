import java.util.Scanner;

public class HeaviestWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 0;
        String heaviest = "";
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n ; i++) {
            String str = in.nextLine();
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                int a = str.charAt(j);
                if (a <= 122 && a >= 97) {
                    a = a - 96;
                    sum += a;
                } else if (a <= 90 && a >= 65) {
                    a = a - 64;
                    sum += a;
                }
            }
            if (sum > max) {
                max = sum;
                heaviest = str;
            }
        }
        System.out.println(max + " " + heaviest);
    }
}