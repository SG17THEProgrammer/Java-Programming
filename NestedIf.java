class NestedIf
{
	public static void main (String [] args)
	{
	double amount=0;
	double discount;
	amount = Integer.parseInt(args[0]);
	if (amount >=20000)
	{
		amount= amount- (0.1 *amount);
		System.out.println(amount);
	}
	if (amount>=10000 && amount<20000)
	{
		amount= amount- (0.05 *amount);;
		System.out.println(amount);
	}
	if (amount>=5000 && amount<10000)
	{
		amount= amount - (0.02 *amount);
		System.out.println(amount);
	}
	if (amount < 5000)
	{
		amount= amount - (0*amount);
		System.out.println(amount);
	}
}
}		 