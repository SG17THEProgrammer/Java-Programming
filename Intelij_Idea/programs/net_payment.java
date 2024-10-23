import java.util.Scanner;

public class net_payment {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amount =sc.nextDouble();

        if (amount >= 20000) {
            amount = amount - 0.1 * amount;
        }
        else if (amount >= 10000 && amount < 20000) {
            amount = amount - 0.05 * amount;
        }
        else if (amount >= 5000 && amount < 10000) {
            amount = amount -  0.02 * amount;
        }
        else if (amount < 5000) {
           amount = amount - 0.00 * amount;
        }
        System.out.println("Net Payment : " +amount);
    }
}