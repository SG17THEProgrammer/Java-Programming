import java.util.Scanner;
class Conversion1
{
	public static void main (String [] args)
	{
		float e;
		int a;
		Scanner sc = new Scanner(System.in);
        	System.out.print("Enter any float value :");
       	 	e = sc.nextFloat();
		a = (int) e;
		System.out.println("Conversion into int:"+a);
}
}