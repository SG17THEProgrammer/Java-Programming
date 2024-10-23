import java.util.Scanner;

public class average_value_of_array_elements {
    public static void main(String[] args) {
        double sum=0;
        double avg=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        double  arr[] = new double[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        for(double s:arr){
            sum+=s;
        }
        avg=sum/(arr.length);
        System.out.println("Average of all the elements is "+avg);
    }
}