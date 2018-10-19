public class BucketSort {

    public void sort (int[] arr, int maxValue){

        int[] bucket = new int [maxValue + 1];

        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }
        int x = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                arr[x++] = i;
            }
        }
    }
    public int maxValue(int[] arr){
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public void printArr(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
