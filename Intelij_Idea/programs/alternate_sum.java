public class alternate_sum {
    public static void main(String[] args) {
        int i= 1;
        int j= 1;
        while(j<=9){
            int sum=0;  // local variable
                while(i<j+3){
                    sum=sum+i;
                    i++;
                }
            System.out.println(sum);
                j=j+3;
        }
    }
}
