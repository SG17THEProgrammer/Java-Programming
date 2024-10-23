interface Inter1
{
    void show();
    interface InnerInter
    {
        void msg();
    }
}
abstract class Implementation implements Inter1.InnerInter, Inter1{
    public void msg()
    {
        System.out.println("Nested Interface");
    }
}

public class Inner_class
{
    public static void main(String[] args)
    {
        Inter1.InnerInter InnerInter= new Implementation() {
            @Override
            public void show() {
                System.out.println("show");
            }
        };
        InnerInter.msg();
}
}