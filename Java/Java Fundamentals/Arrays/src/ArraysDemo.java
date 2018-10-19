import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args){

/* Jagged Arrays - check a set of a numbers group them by their remainder when
dividing to 3 (0, 1 and 2)*/

//        int[] arr = {0, 1, 4, 113, 55, 3, 1, 2, 66, 557, 124, 2};
//
//        int[] sizes = new int[3];
//        for (int i = 0; i < arr.length; i++) {
//            int remainder = arr[i] % 3;
//            switch(remainder){
//                case 0: sizes[0]++;break;
//                case 1: sizes[1]++;break;
//                case 2: sizes[2]++;break;
//            }
//        }
//        int[][] jagged = new int[3][];//jagged array
//        for (int i = 0; i < sizes.length; i++) {
//            jagged[i] = new int[sizes[i]];
//        }
//        for (int i = 0, j = 0, k = 0, l = 0; i < arr.length; i++) {
//            int remainder = arr[i]%3;
//            switch (remainder){
//                case 0:
//                    jagged[0][j] = arr[i];
//                    j++;
//                    break;
//                case 1:
//                    jagged[1][k] = arr[i];
//                    k++;
//                    break;
//                case 2:
//                    jagged[2][l] = arr[i];
//                    l++;
//                    break;
//            }
//        }
//        PrintMatrix(jagged);


//Multidimensional Arrays
// - reading a matrix from the console
//        Scanner in = new Scanner(System.in);
//        int[][] matrix = new int [3][5];
//
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                System.out.println(MessageFormat.format("Enter element[{0}][{1}]:",row , col));
//                matrix[row][col] = in.nextInt();
//            }
//        }
//        PrintMatrix(matrix);//method end of page

// - setting elements
        
//        int[][] matrix = new int [3][5];
//
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                matrix[row][col] = row + col;
//            }
//        }
//        PrintMatrix(matrix);//method end of page

//Arrays class - sort()

//        int[] arr1 = {101, 21, 13, 42, 15};
//        System.out.println(Arrays.toString(arr1));
//        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));

//Arrays class - clone()

//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = arr1;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        arr2[2] = 21;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = arr1.clone();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        arr2[2] = 21;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));


// ArrayList demo

//        ArrayList<Integer> intArr = new ArrayList();
//        for (int i = 0; i < 5; i++) {
//            intArr.add(i);
//        }
//        System.out.println(Arrays.toString(intArr.toArray()));

// for-each loop

//        int[] arr = {1, 2, 3, 4, 5, 6};
//        for (int i : arr) {
//            System.out.print(i + ", ");
//        }

//Print Array on the Console

//        String[] array = {"one", "two", "three"};
//        for (int i = 0; i < array.length ; i++) {
//            System.out.println(MessageFormat.format("element[{0}] = {1}", i, array[i]));
//        }

// Read int array from the console and check if it is symmetric

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter array length: ");
//        int n = in.nextInt();
//        int[] intArray = new int [n];
//        for(int i = 0; i < intArray.length; i++){
//            System.out.println(MessageFormat.format("Enter {0} number: ",i + 1));
//            intArray[i] = in.nextInt();
//        }
//        boolean isSymmetric = true;
//        for(int i = 0; i < intArray.length / 2; i++){
//            if (intArray[i] != intArray[intArray.length - 1 - i]){
//                isSymmetric = false;
//                break;
//            }
//        }
//        if(isSymmetric){
//            System.out.println("Array is symetric");
//
//        }else {
//            System.out.println("Array is not symetric");
//        }

//Reversing the contents of an array
// 1 way

//        int[] intArray = {1, 2, 3, 4, 5, 6};
//
//        for (int i = 0; i < intArray.length ; i++) {
//            System.out.print(intArray[intArray.length -1 -i] + ", ");
//        }

// 2 way
//        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
//        int[] reverted = new int[intArray.length];
//        for (int i = 0; i < reverted.length; i++) {
//            reverted[i] = intArray[intArray.length - 1 - i];
//        }
//        System.out.println(Arrays.toString(intArray));
//        System.out.println(Arrays.toString(reverted));

// Biggest of 10
//        Scanner in = new Scanner(System.in);
//        // read input
//
//        int n = 10;
//        int[] intArray = new int[n];
//        for (int i = 0; i < intArray.length; i++) {
//           intArray[i] = in.nextInt();
//        }
//        // process data
//        int result = Integer.MIN_VALUE;
//        for (int i = 0; i < intArray.length; i++) {
//            if (result < intArray[i]){
//                result = intArray[i];
//            }
//        }
//        // output
//        System.out.println(result);
    }

    private static void PrintMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length ; row++) {
            System.out.print("| ");
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
