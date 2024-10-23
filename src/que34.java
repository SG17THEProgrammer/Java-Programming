class Rectangle{
    int len,breadth;
    Rectangle(int a,int b){
        len=a;
        breadth=b;
    }
    public int Area(){
        int result=len*breadth;
        return result; 
    }
}
public class que34 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(4,5);
        Rectangle r2=new Rectangle(5,8);
        System.out.println(r1.Area());
        System.out.println(r2.Area());
    }
}
