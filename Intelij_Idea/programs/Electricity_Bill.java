import java.util.Scanner;
class Solution3
{
    public static void main(String args[])
    {

        int total;
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();

        if(unit <= 10)
        {
            total = unit*5;
        }

        else if (unit > 10)
        {
            total = 10*5+(unit-10)*10 ;
            System.out.println(total);
        }


    }
}  