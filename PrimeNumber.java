//kisi bhi no. ka factor 1 hota hai , wo num khud hota hai , ya unn dono ke beech mein koi number ho skta hai 

import java.util.Scanner;
class PrimeNumber
{
	public static void main (String [] args)
	{
		int num , i , count = 0;
		System.out.print("Enter the number:");
		Scanner sc = new Scanner (System.in);
		num=sc.nextInt();

		for (i=1;i<=num;i++)
		{
			if (num%i==0)
			count++;
			
			if (count>2)
			break;
		}
		if (count==2)
		System.out.print(num +" is a prime number");
		else
		System.out.print(num +" is not a prime number");
	}
}
		