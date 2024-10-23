import java.util.Scanner;
 class UnderAgeException extends Exception {

    UnderAgeException(){
        super("You are under age");
    }
    UnderAgeException(String message){
        super(message);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();

        try {
            if (age>=18) {
                System.out.println("You are eligible to cast your vote");
            }
            else{
                throw new UnderAgeException("You are not eligible to cast your vote");
            }
        }
        catch (UnderAgeException e) {
            System.out.println(e);
        }
    }
}
