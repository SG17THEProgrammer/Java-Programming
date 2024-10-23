import java.util.Scanner;
public class Binary_Search_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number");
        int x = sc.nextInt();
        int j=0;
        int flag=0;

        while(j< arr.length){
            if (arr[j]==x){
                System.out.println("Element found at index "+j);
                flag=1;
                break;
            }
            else{
                j++;
            }
        }
        if (flag==0){
            System.out.println("Element not found : -1 ");
        }
    }
    
}
