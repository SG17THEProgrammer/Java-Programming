
import java.util.Scanner;
//class Distance to read, print and add distance
class Distance {
    int feet;
    int inches;
    public void getDistance() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in  feets: ");
        feet = sc.nextInt();
        System.out.print("Enter distance in inches: ");
        inches = sc.nextInt();
    }
    public void showDistance() {
        System.out.println("Feet: " + feet + "\tInches: " + inches);
    }

    public void addDistance(Distance D1, Distance D2) {
        inches = D1.inches + D2.inches;
        feet = D1.feet + D2.feet + (inches / 12);
        inches = inches % 12;
    }
}

public class InchFeet {
    public static void main(String[] s) {


        Distance D1 = new Distance();
        Distance D2 = new Distance();
        Distance D3 = new Distance();

        //read first distance
        System.out.println("Enter 1st pair of distance: ");
        D1.getDistance();

        //read second distance
        System.out.println("Enter 2nd pair of distance: ");
        D2.getDistance();

        //add distances
        D3.addDistance(D1, D2);
        //print distance
        System.out.println("Total distance is:");
        D3.showDistance();
    }
}


