class Test
{
	int a,b;
	void disp()
	{
		System.out.println("Hello");
	}
}

class Main 
{
	int c,d;
	void disp(int a)
	{
		System.out.println("bye");
	}
	
}


class SectionE
{
	public static void main(String [] args)
	{
		Main m=new Main();
		m.disp();
		m.disp(8);
	}
}
