package leetcode;
import java.util.Scanner;
public class twosum_1{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of the array: ");

        for (int i=0 ; i<n ; i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter the target:");
        int target = sc.nextInt();
        
        int flag=0;
        for (int j=0 ; j<n ;j++){
            if (nums[j]+nums[j+1]==target){
                System.out.println("["+ j + "," + (j+1) +"]");
                flag=1;
            }
                if (flag==1){
                break;
            }
        }

    }
}


