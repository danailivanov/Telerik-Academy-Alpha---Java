public class RadixSort {

    public int getMax(int arr[]){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public void sort(int[] arr, int exp){
        int[] count = new int[10];
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int tmp = (arr[i] / exp) % 10;
            count[tmp]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i -1 ];
        }
        for (int i = arr.length -1 ; i >= 0 ; i--) {
            output[count[(arr[i]/exp)%10] - 1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }

    }
    public void printArr(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
