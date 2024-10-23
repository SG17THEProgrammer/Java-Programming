//Given a sorted array A (sorted in ascending order), having N integers, 
//find if there exists any pair of elements (A[i], A[j]) such that their sum is equal to X.

import java.util.Arrays;
import java.util.Scanner;

public class Two_Pointers {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr); // array ka sorted hona bhot jaruri hai  
        int i = 0;
        int j = n - 1;
        System.out.println("Enter the sum");
        int x = sc.nextInt();
        
        int flag=0;
        while (i < j) {
            
            if (arr[i] + arr[j] == x){
                System.out.println("Pair found");
                flag=1;
                break;
                
            }
 
            // If sum of elements at current pointers is less, we move towards
            // higher values by doing i++
            else if (arr[i] + arr[j] < x)
                i++;
 
            // If sum of elements at current pointers is more, we move towards
            // lower values by doing j--
            else
                j--;
        }
        if(flag==0)
        System.out.println("Pair not found");


}
}
