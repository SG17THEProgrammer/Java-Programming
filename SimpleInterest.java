class SimpleInterest
{
	public static void main (String args[])
	{ 
		float p  = Float.parseFloat(args[0]);
		float r  = Float.parseFloat(args[1]); 
		float t  = Float.parseFloat(args[2]);
		float SimpleInterest = (p*r*t)/(100*12);
			System.out.println("Simple Interest is: " +SimpleInterest);
	}
}