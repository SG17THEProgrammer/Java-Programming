import java.util.Scanner;

class que_30_of_pdf{

    static int setDim(int length, int breadth){
        int area=length*breadth;
        return area;
        
    }
    static void getArea(int area){
        System.out.println("The area of rectangle is : "+area);
         
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle: ");
        int length=sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth=sc.nextInt();

        getArea(setDim(length, breadth));
        
    }
    
}
