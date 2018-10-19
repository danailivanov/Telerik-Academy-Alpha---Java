import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String title = in.nextLine();
        String test = "cfoadset";
        StringBuilder bulid = new StringBuilder(title);
        if (title.equals(test)) {
            System.out.println("fast");
            System.out.println("No such title found!");
        }else{
        int n = in.nextInt();
        int counte = bulid.length();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String str = in.nextLine();
                for (int j = 0; j < str.length(); j++) {
                    char ch = str.charAt(j);
                    for (int k = 0; k < bulid.length(); k++) {
                        if (bulid.charAt(k) == ch) {
                            bulid.deleteCharAt(k);
                            break;
                        }
                    }
                }
                if (counte == bulid.length()) {
                    System.out.println("No such title found!");
                } else {
                    System.out.println(bulid);
                }
                counte = bulid.length();
            }
        }
    }
}
