import java.util.Scanner;
import java.util.StringTokenizer;

public class Slogan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String[] slogan = in.nextLine().split(" ");
            String test = in.nextLine();
            int count = 0;
            for (int j = 0; j < slogan.length; j++) {
                if (test.contains(slogan[j])) {
                    String temp = slogan[j];
                    test = test.replace(temp, "");
                }
            }
            if(test.length() ==0){
                test = "wearetelerikacademy";
                for (int j = 0; j < slogan.length; j++) {
                    String[] tmp = test.split(slogan[i]);
                }

            }
        }
    }
}



//        int n =in.nextInt();
//        in.nextLine();
//        for (int i = 0; i < n; i++) {
//            char[] chars = in.nextLine().toCharArray();
//            String[] slogan = in.nextLine().split(" ");
//            for (int j = 0; j < slogan.length; j++) {
//                int len = slogan[i].length();
//                iterate(chars, len, new char[len], 0,slogan);
//            }
//        }
//    }
//
//    public static void iterate(char[] chars, int len, char[] build, int pos,String[]slogan) {
//        if (pos == len) {
//            String word = new String(build);
//            for (int i = 0; i < slogan.length; i++) {
//                if(slogan[i].contains(word)){
//                    System.out.println(word + " ");
//                    break;
//                }
//            }
//            return;
//        }
//
//        for (int i = 0; i < chars.length; i++) {
//            build[pos] = chars[i];
//            iterate(chars, len, build, pos + 1,slogan);
//        }
//    }
//}


