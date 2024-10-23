import java.util.Arrays;
public class Bubble_sort {

//    boolean isSorted(int[] arr) {
//        for (int i = 0; i < arr.length -1; i++) {
//            if (arr[i] > arr[i + 1])
//                return false;
//        }
//        return true;
//    }
    public static void main(String[] args) {
        boolean flag=true;
//        Bubble_sort obj = new Bubble_sort();
        int arr[]= {7,8,3,2,4};
        //int arr[]= {2,1,5,4,7,6};

        for (int i=0 ; i<arr.length-1 ; i++) {
//            if (obj.isSorted(arr)) {
//                flag=false;
//            }
//            if(flag==true) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }

                }
           // }
        }
            for ( int i=0 ; i< arr.length ; i++){
                System.out.print(arr[i]+ " ");
            }


        }
    }

