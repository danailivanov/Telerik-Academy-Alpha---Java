public class CountingSort {
    void sort (int[] arr){
        int[] counts = new int[256];
        int max = 0;

        for (int val : arr) {
            counts[val] =+ 1;
            max = Math.max(max, val);
        }
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < counts[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
