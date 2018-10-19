public class Main {
    public static void main (String[] args) {

        MergeSort ms = new MergeSort();

        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        ms.printArr(arr);
        System.out.println();

        ms.sort(arr,0,arr.length - 1);
        ms.printArr(arr);
    }
}
