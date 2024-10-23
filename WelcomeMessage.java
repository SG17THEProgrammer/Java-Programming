import java.util.Scanner;
class WelcomeMessage
{
	public static void main (String [] args)
	{
	System.out.print("Enter your name:");
		Scanner sc= new Scanner(System.in);
	String Name= sc.nextLine();
	System.out.println("Welcome\t"+Name);
 	}
}