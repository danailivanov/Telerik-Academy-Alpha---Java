public class Main {
    public static void main (String[] args) {
        //int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] arr = {1, 3, 9, 4, 8, 7};

        QuickSort qs = new QuickSort();
        qs.sort(arr,0,arr.length - 1);
        qs.printArr(arr);
    }
}
