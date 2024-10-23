class EThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException ie) {
            System.out.println("Bye");
        }
    }
}
public class First_10_Natural_Number_Using_Thread {
    public static void main(String[] args) {
        EThread e = new EThread ();
        Thread t = new Thread(e);
        e.start();
    }


}
