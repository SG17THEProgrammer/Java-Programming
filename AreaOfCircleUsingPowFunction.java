class AreaOfCircleUsingPowFunction
{
	public static void main(String [] args)
	{
		double radius=Double.parseDouble(args[0]);
		double Area = 3.14d*(Math.pow(radius,2.0));
			System.out.println(Area);
	}
}
