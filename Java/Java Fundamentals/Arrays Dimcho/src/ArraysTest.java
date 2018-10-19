import java.util.Scanner;

public class ArraysTest {
    public static void main(String[] args){

/* 1) enter N
   2) enter N names
   3) enter command
   3.1) if command is number i: print name i; go to 3
   3.2) if command "end": stop the program*/

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < names.length; i++){
            names[i] = in.nextLine();
        }
        while(true){
            String command = in.next();
            if(command.equals("end")){
                break;
            }
            int index = Integer.parseInt(command);
            if (index < 1 || index > names.length){
                System.out.println("Invalid name number");
                continue;
            }
            System.out.println(names[index - 1]);

        }
    }
}
