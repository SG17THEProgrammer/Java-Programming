/*  *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *        */


class p11
{
public static void main(String[] args)
{
	int rows=5;
	for(int i=1;i<=5;i++)
	{
		for(int space=1;space<=(rows-i);space++)
		{
			System.out.print(" ");
		}
			for (int j=1;j<=(2*i)-1;j++)
			{
					System.out.print("*");
			}
	System.out.println("");
	}

	for(int i=4;i>=1;i--)
	{
		for(int space=1;space<=(rows-i);space++)
		{
			System.out.print(" ");
		}
			for (int j=1;j<=(2*i)-1;j++)
			{
					System.out.print("*");
			}
	System.out.println("");
	}
}
}