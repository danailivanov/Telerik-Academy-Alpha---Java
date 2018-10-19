import java.util.Scanner;

public class TitleSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String title = in.nextLine();
        StringBuilder bulid = new StringBuilder(title);
        int n = in.nextInt();

        in.nextLine();
        for (int i = 0; i < n ; i++) {
            int count = 0;
            String inStr = in.nextLine();
            StringBuilder str = new StringBuilder(inStr);
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                for (int k = count; k < bulid.length() ; k++) {
                    if (bulid.charAt(k) == ch){
                        bulid.deleteCharAt(k);
                        str.deleteCharAt(j);
                        j--;
                        count = k;
                        break;
                    }
                }
            }
            if (str.length() > 0){
                System.out.println("No such title found!");
            }else{
                System.out.println(bulid);
            }
        }
    }
}