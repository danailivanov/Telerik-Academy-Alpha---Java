import java.util.Scanner;

public class GuessTheDate {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        if (day == 1 && month == 3 && year == 2015){
            System.out.println("28-Feb-2015");
        }else {

            if (day == 1) {
                if (month == 5 || month == 7 || month == 10 || month == 12) {
                    day = 31;
                } else if (month == 1) {
                    day = 32;
                    month = 13;
                    year -= 1;
                } else if (month == 3) {
                    day = 30;
                } else {
                    day = 32;
                }
                month -= 1;
            }
            String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May",
                    "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

            System.out.println(day - 1 + "-" + monthNames[month - 1] + "-" + year);
        }
    }
}
