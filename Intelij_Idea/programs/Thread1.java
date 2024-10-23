class A1 implements Runnable{
    public void run() {

        for(int i=0;i<=15;i++) {
//			System.out.println("I am Suraj Omar");
            String s=Thread.currentThread().getName();
            System.out.println(i);
            System.out.println("bye");
        }
    }
}
class B1 implements Runnable{
    public void run() {

        for(int i=100;i>=85;i--) {
            System.out.println("Hello");
            System.out.println(i);
        }
    }
}

public class Thread1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        A1 a1= new A1();
        B1 b1= new B1();

        Thread t1=new Thread(a1);
        Thread t2=new Thread(b1);


        t1.start();
        t2.start();

    }

}
