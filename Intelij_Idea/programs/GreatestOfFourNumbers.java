public class GreatestOfFourNumbers  {
    public static void main(String args[]) {
        int a = 5;
        int b = 10;
        int c = 20;
        int d = 25;
        if ((a > b && a > c) && (a > d)) {
            System.out.println("a is greatest");
        } else if ((b > a && b > c) && (b > d)) {
            System.out.println("b is greatest");
        } else if ((c > a && c > b) && (c > d)) {
            System.out.println("c is greatest");
        } else {
            System.out.println("d is greatest");
        }
    }
}



