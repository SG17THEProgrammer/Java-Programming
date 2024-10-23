public class p21{
    public static void main(String[] args){
//        System.out.println("Enter a no.");
//        Scanner a= new Scanner(System.in);
//        int n=a.nextInt();

        for (int i=1;i<=5;i++){
            for (int space=1;space<=5-i;space++){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}