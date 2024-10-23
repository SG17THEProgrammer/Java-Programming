import java.util.Scanner;
class Conversion
{
	public static void main (String [] args)
	{
		int a;
		short b ;
		Scanner sc = new Scanner(System.in);
        	System.out.print("Enter any integer:");
       	 	a = sc.nextInt();
        	b = (short) a;  
        	System.out.println("Conversion into short:"+b);
        	
		
		}
}