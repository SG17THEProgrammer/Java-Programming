import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
//        # 1 -d array
//        int [] marks = new int [5];
//        marks[0]= 10 ;
//        marks[1]= 15  ;      //you got to do it one by one for all

        // Input from user
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }

         */

//        int[] marks = {10, 45, 86, 22, 6};
////        Accessing elements using for each loop
//        for (int element : marks) {
//            System.out.println(element);
//        }


////        # 2-d Array
//        int[][] flats = new int[2][3];
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//


//        // # Displaying the 2-D Array (for loop)

//        System.out.println("Printing a 2-D array using for loop");
//        for (int i = 0; i < flats.length; i++) {
//            for (int j = 0; j < flats[i].length; j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//
//
//        }


        // # Element is present in the array or not

        /*

        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in the array");
        }
        */


        // # Java program to add two matrices of size 2x3.

        /*

        int [][] mat1 ={{1,2,3},
                        {4,5,5}};

        int [][] mat2 ={{2,6,8},
                        {5,7,6}};

        int [][] result ={{0,0,0},
                         {0,0,0}};

        for (int i=0;i<mat1.length;i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for ( int i=0 ; i<= mat1.length ; i++){
            for ( int j=0 ; j< mat1[i].length ; j++){
                result [i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result [i][j] + "  ");
            }
            System.out.println("");
        }

        */

        // Reverse an array

        /*
        
        int[] arr = {12, 45, 56, 10, 12};
        int len = arr.length;
        double kab_tak_chalega = Math.floor((len) / 2);
        for (int i = 0; i < kab_tak_chalega; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;

        }
        for (int element : arr) {
            System.out.print(element + " ");

        }

         */

        // min and max value in the array (will work for both +ve and -ve numbers)

        /*

        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr) {
            if (e > max) {
                max = e;
            }
        }
            int min = Integer.MAX_VALUE;
            for(int element: arr) {
                if (element < min) {
                    min = element;
                }
            }
        System.out.println("the value of the maximum element in this array is: "+ max);
        System.out.println("the value of the minimum element in this array is: "+ min);

         */

        // To check whether the array is sorted or not

        boolean isSorted = true;
        int[] arr = {12, 45, 56, 10, 14};
        for (int i=1 ; i<arr.length-1 ; i++) {
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted ");
        }


    }
}