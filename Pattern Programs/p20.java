/*      1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

*/

class p20 
{
   public static void main(String args[]) 
   {
       int rows = 5;
       for(int i=1; i<=rows; i++) 
	{
           for(int spaces=1; spaces<=(rows-i); spaces++) {
               System.out.print("  ");
           }
 
           //first part
           for(int j=i; j>=1; j--) {
               System.out.print(j+" ");
           }
 
           //second part
           for(int j=2; j<=i; j++) {
               System.out.print(j+" ");
           }
           System.out.println();
       }
   }   
}
