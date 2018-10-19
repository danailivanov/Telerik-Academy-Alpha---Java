public class DoWhileLoop {
    public static void main(String[] args){

        int index = 1;
        int n = 15;
// while loop - може да се изпулни 0 пъти
        while(index < n){
            System.out.println(index);
            index++;
        }
// do - while loop - винаги се изпълнява поне веднъж
        index = 1;
        do{
            System.out.println(index);
            index++;
        } while (index < n );
    }
}
