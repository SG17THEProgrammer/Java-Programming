import java.util.Scanner;
class Power_function {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            double x = sc.nextDouble();
            System.out.print("Enter the power :");
            int n = sc.nextInt();
            double power = Math.pow(x, n);
            System.out.println("The answer is : " +power);
        }
    }
