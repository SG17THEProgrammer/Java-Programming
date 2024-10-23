import java.util.Scanner;
// public class Fibonacci_using_recursion {
//     static int a=0 , b=1;
//     static  int fibonacci (int c){
//         if (c==0){
//             return 0;
//         }
//         else if (c==1){
//             return a;
//         }
//         else if (c==2){
//             return b;   
//         }
//         else{
//             int x=a+b;
//             return x ;  
//             b=a;
//             x=b; 
//         }
//     }
// public static void main(String[] args) {
//     int c=3;
   
//     System.out.println("The fibonacci series is:"+ fibonacci(3));
// }
    
// }

class FibonacciExample{  
    static int n1=0,n2=1,n3=0;    
    static void printFibonacci(int count){    
       if(count>0){    
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print(" "+n3);   
            printFibonacci(count-1);    
        }    
    }    
    public static void main(String args[]){  

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int count = sc.nextInt();    

     System.out.print(n1+" "+n2);
     printFibonacci(count-2);
    }  
   }  
 