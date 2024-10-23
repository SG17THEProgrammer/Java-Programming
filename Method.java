import java.util.Scanner;
class Method
{
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		Long res= Math.round(num);
		System.out.println(res);
	}
}