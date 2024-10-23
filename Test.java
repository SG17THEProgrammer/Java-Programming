class Test 
{
	Test()
	{
		System.out.println("Test constructor runs");
	}

	static
	{
		System.out.println("Static runs");
	}

	{
		System.out.println("instance initiator runs");
	}
	
	public static void main(String []args)
	{
		Test t1= new Test();
		Test t2 = new Test();
		Test t3 = new Test();
	}	
}