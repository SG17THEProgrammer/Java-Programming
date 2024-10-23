public class while4 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int sum=0;
        while(i<=10){
            while(j<=10){
                sum=sum+j;
                j++;
            }
            System.out.println(sum-j);
            i++;
        }
    }
}
