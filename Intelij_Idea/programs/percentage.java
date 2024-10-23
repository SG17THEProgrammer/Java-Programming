import java.util.Scanner;
public class percentage {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first subject marks");
        double m1= sc.nextInt();
        System.out.println("Enter second subject marks");
        double m2= sc.nextInt();
        System.out.println("Enter third subject marks");
        double m3= sc.nextInt();
        System.out.println("Enter forth subject marks");
        double m4= sc.nextInt();
        System.out.println("Enter fifth subject marks");
        double m5= sc.nextInt();

        double total=m1+m2+m3+m4+m5;
        double percentage=(total/500)*100;
        System.out.println("Your percentage is" +" "+ percentage);
    }
}
