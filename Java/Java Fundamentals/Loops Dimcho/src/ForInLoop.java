public class ForInLoop {
    public static void main(String[] args){
        //for-in loop
        String name = "Jhon";
        for(char ch : name.toCharArray()) {
            System.out.println(ch);
        }
        //the same with for loop
        for (int i =0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}
