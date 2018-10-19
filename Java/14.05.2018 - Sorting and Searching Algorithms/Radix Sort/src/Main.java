public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        RadixSort rs = new RadixSort();
        int tmp = rs.getMax(arr);
        for (int exp = 1;tmp / exp > 0; exp *= 10) {
            rs.sort(arr,exp);
        }
        rs.printArr(arr);
    }
}
