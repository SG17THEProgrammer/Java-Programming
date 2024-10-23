	/*	1
		2 3
		4 5 6
		7 8 9 10
		11 12 13 14 15  */

class p7NumberWala
{
public static void main(String[] args)
{
	int number=1;
	for(int i=0;i<=4;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(number+" ");
			number++;	
		}
		System.out.println("");
	}
}			
			
}