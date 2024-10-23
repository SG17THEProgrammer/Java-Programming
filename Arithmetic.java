class Arithmetic
{
	public static void main(String [] args)
	{
		float num1= Float.parseFloat(args[0]);
		float num2= Float.parseFloat(args[1]);
		float Addition = num1+num2;		
		float Subraction = num1-num2;
		float Divide = num1/num2;
		float multiply = num1*num2;
			System.out.println("Sum is : "+Addition);
			System.out.println("Subraction is :"+Subraction);
			System.out.println("Division is :"+Divide);
			System.out.println("Multiplication is :"+multiply);
	}
}
