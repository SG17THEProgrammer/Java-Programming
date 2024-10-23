public class while3 {
    public static void main(String[] args) {
        int i=1;
        int freq=0;
        while(i<=9){
            if(i%3==0){
                freq=freq+1;
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(freq);
    }
}
