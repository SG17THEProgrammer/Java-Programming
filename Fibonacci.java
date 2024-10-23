import java.util.Scanner;
class Fibonacci 
{
	public static void main (String [] args)
	{
		
		System.out.println("Enter the no. of terms you want in the series:");
		Scanner sc = new Scanner(System.in);
		int cnt= sc.nextInt();

		int num1=0, num2=1 ,num3, count=cnt,i;
		System.out.print(num1+" "+num2);
		
		for(i=2;i<count;++i)
		{
			num3=num1 +num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
}
}
