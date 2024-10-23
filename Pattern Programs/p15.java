/*
A
B B
C C C
D D D D
E E E E E
*/

class p15
{
public static void main(String[] args)
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(64+i) + " ");	
		}
		System.out.println("");
	}
}			
			
}