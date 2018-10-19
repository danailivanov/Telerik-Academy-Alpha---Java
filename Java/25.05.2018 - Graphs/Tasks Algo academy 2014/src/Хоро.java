import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Хоро {
    private static HashMap<String,HashSet<String>> graphs = new HashMap<>();
    private static HashSet<String> visited = new HashSet<>();
    private static int MAX = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        String start = in.nextLine();
        for (int i = 0; i < N; i++) {
            String[] connections = in.nextLine().split(" ");
            String firstFriend = connections[0];
            String secondFriend = connections[1];

            addFriend(firstFriend,secondFriend);
            addFriend(secondFriend,firstFriend);
        }

        theBiggestGroup(start, 1);
        System.out.println(MAX);
    }

    private static void theBiggestGroup(String start, int count) {
        if(visited.contains(start) || !graphs.containsKey(start)){
            return;
        }
        if(count > MAX){
            MAX = count;
            }
            visited.add(start);
        HashSet<String> friends = graphs.get(start);
        for (String friend:friends) {
            theBiggestGroup(friend, count +1);
        }
        visited.remove(start);
    }

    private static void addFriend(String firstFriend, String secondFriend) {
        if(!graphs.containsKey(firstFriend)){
            graphs.put(firstFriend, new HashSet<>());
        }
        graphs.get(firstFriend).add(secondFriend);
    }

}