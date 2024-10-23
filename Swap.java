class Swap
{
	public static void main (String [] args)
	{
		int num1 = Integer.parseInt(args[0]);
		System.out.println("Num1 before swapping: "+num1);
		int num2 = Integer.parseInt(args[1]) ;
		System.out.println("Num2 before swapping: "+num2);
		num1 = num1<<1;
		System.out.println("Num1 after swapping: "+num1);
		num2 = num2>>1;
		System.out.println("Num2 before swapping: "+num2);
		
	}
}