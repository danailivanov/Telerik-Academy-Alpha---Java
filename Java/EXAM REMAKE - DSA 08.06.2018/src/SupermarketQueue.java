import java.util.*;

public class SupermarketQueue {
    private static List<String> supermarketQueue = new ArrayList<>();
    private static HashMap<String, Integer> counter = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> command = Arrays.asList(in.nextLine().split(" "));
        while (!command.get(0).equals("End")) {
            switch(command.get(0)){
                case "Append":
                    Append(command.get(1));
                    break;
                case "Insert":
                    Insert(Integer.parseInt(command.get(1)),command.get(2));
                    break;
                case "Find":
                    Find(command.get(1));
                    break;
                case"Serve":
                    Serve(Integer.parseInt(command.get(1)));
                    break;
            }
            command = Arrays.asList(in.nextLine().split(" "));
        }


    }

    private static void Serve(int numberOfPeopleToServe) {
        if(numberOfPeopleToServe <= supermarketQueue.size()) {
            StringBuilder sb = new StringBuilder();
            String personName = "";
            for (int i = 0; i < numberOfPeopleToServe; i++) {
                personName = supermarketQueue.get(i);
                sb.append(personName).append(" ");
                int count = counter.get(personName);
                counter.put(personName, count - 1);
            }
            supermarketQueue.subList(0, numberOfPeopleToServe).clear();
            System.out.println(sb.toString().trim());
        }else {
            System.out.println("Error");
        }
    }

    private static void Find(String nameToFind) {
        if(counter.containsKey(nameToFind)){
            System.out.println(counter.get(nameToFind));
        }else{
            System.out.println(0);
        }
    }

    private static void Insert(int positionToInsert, String nameOfPerson) {
        if(positionToInsert >= 0 && positionToInsert <= supermarketQueue.size()){
            supermarketQueue.add(positionToInsert,nameOfPerson);
            if(!counter.containsKey(nameOfPerson)){
                counter.put(nameOfPerson, 0);
            }
            int count = counter.get(nameOfPerson);
            counter.put(nameOfPerson, count + 1);
            System.out.println("OK");
        }else{
            System.out.println("Error");
        }
    }

    private static void Append(String nameOfPerson) {
        supermarketQueue.add(nameOfPerson);
        if(!counter.containsKey(nameOfPerson)){
            counter.put(nameOfPerson,0);
        }
        int count = counter.get(nameOfPerson);
        counter.put(nameOfPerson, count + 1);
        System.out.println("OK");
    }

}
