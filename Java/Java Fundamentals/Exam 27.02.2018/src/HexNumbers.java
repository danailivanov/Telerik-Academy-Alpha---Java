import java.util.Scanner;

public class HexNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String hex = "";
        int max = 1;
        int times = 1;
        int times1 = 0;
        int count = 1;

        for (int i = 0; i < n ; i++) {
            int number = in.nextInt();
            hex += Integer.toHexString(number);
        }
        for (int i = 0; i < hex.length() ; i++) {
            int ch1 = hex.charAt(i);
            for (int j = i + 1; j < hex.length() ; j++) {
                if(ch1 == hex.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }
            if (count == max && count == 1){
                times1++;
            }
            if (count == max){
                times++;
            }
            max = Math.max(max, count);
            count = 1;
        }
        if(max > 1) {
            System.out.println(max + " " + times);
        }else{
            System.out.println(max + " " + times1);
        }
    }
}
