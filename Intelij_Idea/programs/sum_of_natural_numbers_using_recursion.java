public class sum_of_natural_numbers_using_recursion {
    static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    public static void main(String[] args) {
        int c=sumRec(3);
        System.out.println(c);
    }
}
