import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int n=sc.nextInt();

        int n = Integer.parseInt(args[0]);
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        System.out.println("The factorial of the entered number is " + fact);
    }
}
