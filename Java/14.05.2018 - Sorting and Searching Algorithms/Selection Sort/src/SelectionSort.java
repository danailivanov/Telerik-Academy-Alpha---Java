public class SelectionSort {
    public void sort (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int best_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[best_index]){
                    best_index = j;
                }
            }
            if(best_index != i){
                int temp = arr[best_index];
                arr[best_index] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public void printArr(int arr[]){
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
