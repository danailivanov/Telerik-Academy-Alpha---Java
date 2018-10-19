public class Main {
    public static void main(String[] args){

        SelectionSort ss = new SelectionSort();
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        ss.sort(arr);
        ss.printArr(arr);
    }
}
