import java.util.Arrays;
public class array1 {
    public static void main(String[] args) {
       // int arr[]= {1,2,3,4,5};


        //reverse an array
//        for (int i=4 ; i>=0; i--){
//            System.out.println(arr[i]);
//        }
       // System.out.println(Arrays.toString(arr));


        // clone an array
//        int arr1[]= {1,2,3,4,5};
//        int arr2[]= new int[5];
//        for (int i=0; i<arr1.length; i++){
//            arr2[i]= arr1[i];
//            System.out.println(arr2[i]);


        // clone an array in reverse order
        int arr1[]= {1,2,3,4,5};
        int arr2[]= new int[5];
        for (int i=arr1.length-1; i>=0; i--) {
            arr2[i] = arr1[i];
            System.out.println(arr2[i]);
        }

        // Max and min element in array
//       int arr1[]= {-10,12,5,-4,6};
//        Arrays.sort(arr1);
//        for(int i=0; i<=4 ; i++) {
//            System.out.println(arr1[i]);
//        }
//        System.out.println("Max element:"+arr1[arr1.length-1]);
//        System.out.println("Min element:"+arr1[0]);


        }
    }



