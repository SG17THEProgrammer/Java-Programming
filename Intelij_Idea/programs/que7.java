class Shray{
    void method(int n, char c){
        System.out.print(n);
        System.out.println(c);
    }
    void method(char c, int n){
        System.out.print(c);
        System.out.println(n);
    }
}
public class que7 {
    public static void main(String[] args) {
        Shray obj = new Shray();
        obj.method(5,'a');
        obj.method('a',5);
    }

}
