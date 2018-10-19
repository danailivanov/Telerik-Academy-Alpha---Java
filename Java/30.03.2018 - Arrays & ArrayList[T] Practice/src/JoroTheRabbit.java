import java.util.ArrayList;
import java.util.Scanner;

public class JoroTheRabbit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine()
                .split(", ");
        ArrayList<Integer> terrain = new ArrayList<>();
        for (String str : input) {
            int x = Integer.parseInt(str);
            terrain.add(x);
        }


        int best_length = 0;

        for (int start_position = 0; start_position < terrain.size(); start_position++) {
            for (int step = 1; step < terrain.size() + 1 ; step++) {
                int position = start_position;
                int cur_length = 0;
                while(true){
                    int next_position = 0;
                    cur_length++;
                    next_position = (position + step) % terrain.size();
                    if (terrain.get(next_position) <= terrain.get(position)){
                        break;
                    }
                    position = next_position;
                }
                best_length = Math.max(best_length, cur_length);

            }
        }
        System.out.println(best_length);
    }
}