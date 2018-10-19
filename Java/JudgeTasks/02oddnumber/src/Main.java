import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int numbers = in.nextInt();
        HashMap<Long, Integer> oddNumbers = new HashMap<>();
        for (int i = 0; i < numbers; i++) {
            long temp = in.nextLong();
            if(!oddNumbers.containsKey(temp)){
                oddNumbers.put(temp, 1);
            }else {
                int count = oddNumbers.get(temp);
                oddNumbers.put(temp, count + 1);
            }
        }
        for (long x : oddNumbers.keySet()) {
            int value = oddNumbers.get(x);
            if(value % 2 == 1){
                System.out.println(x);
                break;
            }
        }
    }
}
