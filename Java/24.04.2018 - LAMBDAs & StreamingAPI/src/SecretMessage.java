import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecretMessage {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        String password = Stream.generate(in::nextLine)
                .limit(1)
                .map(x -> new StringBuilder(x).reverse())
                .map(StringBuilder::toString)
                .map(x -> x.replaceAll("[0-9]+", ""))
                .collect(Collectors.joining(""));


        System.out.println(password);
    }
}
