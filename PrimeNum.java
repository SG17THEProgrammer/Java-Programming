import java.util.Scanner;
public class PrimeNum
{
	public static void main (String [] args )
	{
	int num,i,count=0;
	Scanner sc=new Scanner(System.in) ;
	System.out.println("Enter Any Integer:");
	num=sc.nextInt();
	
	i=1;
	while(i<=num)
	{
		if(num%i == 0)
		count ++;
		if(cf>2)
		break;
		i ++;
	}
	if(cf == 2)
		System.out.println(num+" is a Prime Integer");
	else
		System.out.println(num+" is Not a Prime Integer");
	}
} 