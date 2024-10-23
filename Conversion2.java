import java.util.Scanner;
class Conversion2
{
	public static void main (String [] args)
	{
		long d;
		float e ;
		Scanner sc = new Scanner(System.in);
        	System.out.print("Enter any long :");
       	 	d = sc.nextLong();
		e = (float) d;
		System.out.println("Conversion into float:"+e);
}
}