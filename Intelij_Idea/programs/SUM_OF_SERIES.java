import java.util.Scanner;
public class SUM_OF_SERIES
{
    public static void main(String[] args)
    {
        double sum = 0;
        int n;
        System.out.println("1/1! + 2/2! + 3/3! + ..N/N!");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of terms in series:");
        n = s.nextInt();
        SUM_OF_SERIES obj = new SUM_OF_SERIES();
        for(int i = 1; i <= n; i++)
        {
            sum = sum + (double)i / (obj.fact(i));
        }
        System.out.println("Sum of series:"+sum);
    }
    int fact(int x)
    {
        int mul = 1;
        while(x > 0)
        {
            mul = mul * x;
            x--;
        }
        return mul;
    }
}