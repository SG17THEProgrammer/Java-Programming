/* 
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

*/

class p19
{
public static void main(String[] args)
{
	int rows=5;
	for(int i=1;i<=5;i++)
	{
		for (int space=1; space<=(rows-i);space++)
		{
			System.out.print(" ");
		}	
			for (int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
		
	System.out.println("");
	}
}
}