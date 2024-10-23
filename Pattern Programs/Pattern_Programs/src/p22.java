import java.util.Scanner;
class p22
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the no of rows(upto centre) : ");
        int n=scan.nextInt();
        int i,j;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(i=2;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}