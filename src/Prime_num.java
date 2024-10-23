import java.util.Scanner;
public class Prime_num {
    public static void main(String[] args) {
        int num,i,count=0;

        Scanner sc=new Scanner(System.in) ;
        System.out.print("Enter Any Integer:");
        num=sc.nextInt();

        i=1;
        while(i<=num)
        {
            if(num%i == 0)
                count ++;
            if(count>2)
                break;
            i ++;
        }
        if(count == 2)
            System.out.println(num+" is a Prime Number");
        else
            System.out.println(num+" is not a Prime Number");
            }
        }

