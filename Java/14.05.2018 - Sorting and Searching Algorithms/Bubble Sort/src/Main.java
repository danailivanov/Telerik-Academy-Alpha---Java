public class Main {
    public static void main(String[] args){

        BubbleSort bs = new BubbleSort();
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

        bs.sort(arr);
        bs.printArr(arr);
    }
}
