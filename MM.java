import java.util.Scanner;
class MM 
{
	public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row and column of 1st matrix");
        System.out.print("Enter row : ");
        int r1 = s.nextInt();
        System.out.print("Enter column : ");
        int c1 = s.nextInt();

        System.out.println("Enter row and column of 2nd matrix");
        System.out.print("Enter row : ");
        int r2 = s.nextInt();
        System.out.print("Enter column : ");

        int c2 = s.nextInt();

        if ((r1 == c2) && (c1 == r2)) 
	{

            System.out.println("Enter 1st matrix : ");
            int m1[][] = new int[r1][c1];
            for (int i = 0; i < r1; i++) 
	    {
                for (int j = 0; j < c1; j++) 
		{
                    m1[i][j] = s.nextInt();
                }
            }

            System.out.println("Enter 2nd matrix : ");
            int m2[][] = new int[r2][c2];
            for (int i = 0; i < r2; i++) 
	    {
                for (int j = 0; j < c2; j++)
		{
                    m2[i][j] = s.nextInt();
                }
            }
	 
	 System.out.println("your 1st matrix is : ");
         for (int i = 0; i < r1; i++) 
	 {
                for (int j = 0; j < c1; j++) 
		{
                    System.out.print(m1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("your 2nd matrix is : ");
            for (int i = 0; i < r2; i++) 
	    {
                for (int j = 0; j < c2; j++)
		{
                    System.out.print(m2[i][j]);
                }
                System.out.println();
            }

            System.out.println("Multiplication of matrix 1 and matrix 2 is : ");
            int a[][] = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {

                    a[i][j] = 0;
                    for (int k = 0; k < r2; k++) {
                        a[i][j] += m1[i][k] * m2[k][j];
                    } 
                    System.out.print(a[i][j] + " "); 
                } 
                System.out.println();// new line
            }

        } 
	else {
            System.out.println("Your entered matrix is invalid");
        }
    	

	}
}