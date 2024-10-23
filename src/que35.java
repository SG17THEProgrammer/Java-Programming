import java.util.Scanner;

class Area{
    int a,b;
    Area(int length , int breadth){
        int a=length;
        int b=breadth;

    }
    int returnArea(int length , int breadth){
        return length*breadth;
    }
}

public class que35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int l=sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int b=sc.nextInt();
        Area a=new Area(l, b);
        System.out.println("Area of the rectangle is : "+a.returnArea(l, b));
        
    }
    
}
