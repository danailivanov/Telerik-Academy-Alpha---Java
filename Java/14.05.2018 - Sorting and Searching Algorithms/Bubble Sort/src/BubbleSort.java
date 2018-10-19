public class BubbleSort {
    public void sort(int[] arr) {
        boolean swapDone = true;

        while (swapDone) {
            swapDone = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapDone = true;
                }
            }
        }
    }

    public void printArr(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
