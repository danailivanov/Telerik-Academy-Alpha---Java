import java.util.Scanner;

public class Speeds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();
        int[] arrCars = new int[C];
        int max = Integer.MIN_VALUE;
        int oneMax = Integer.MIN_VALUE;
        int maxCount = 1;

        for (int i = 0; i < arrCars.length; i++) {
            arrCars[i] = in.nextInt();
        }
        for (int i = 0; i < arrCars.length; i++) {
            int sum = arrCars[i];
            int count = 1;
            for (int j = i + 1; j < arrCars.length && (arrCars[i] < arrCars[j]) ; j++) {
                sum += arrCars[j];
                count++;
                if(maxCount <= count){
                    maxCount = count;
                    max = Math.max(max, sum);
                }
            }
            if(maxCount == 1){
                oneMax = Math.max(oneMax, sum);
            }
        }
        if(maxCount > 1) {
            System.out.println(max);
        }else{
            System.out.println(oneMax);
        }
    }
}
