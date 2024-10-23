import java.util.Scanner;
class Conversion3
{
	public static void main (String [] args)
	{
		byte c;
		short b ;
		Scanner sc = new Scanner(System.in);
        	System.out.print("Enter any Byte:");
       	 	c = sc.nextByte();
		b = (short) c;
		System.out.println("Conversion into short:"+b);
}
}