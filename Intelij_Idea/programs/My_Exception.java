import java.util.Scanner;
public class My_Exception extends Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        try {
            if (num % 10 == 0) {
                throw new My_Exception();
            }
            else{
                System.out.println(num);
            }
        }
        catch (My_Exception e) {
            System.out.println("The input number is divisible by 10 ");
        }
    }
}
