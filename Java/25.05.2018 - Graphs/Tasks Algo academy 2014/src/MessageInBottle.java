//import java.io.BufferedReader;
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class MessageInBottle {
//    static void fakeInput() {
//        String test = "1122\n" +
//                "A1B12C11D2";
//        System.setIn(new ByteArrayInputStream(test.getBytes()));
//    }
//
//    public static void main(String[] args) throws IOException {
//        fakeInput();
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String message = in.readLine();
//        String chipher = in.readLine();
//
//        ArrayList<HashMap<Character, String>> chiphers = new ArrayList<>();
//
//        char key = '\0';
//        StringBuilder value = new StringBuilder();
//        for (int i = 0; i <chipher.length() ; i++) {
//            if (chipher.charAt(i)>='A' && chipher.charAt(i)<='Z'){
//
//            }else {
//                value.append(i);
//            }
//        }
//
//    }
//}
