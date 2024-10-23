public class while1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9) {
            if (i % 2 == 0) {
                int j=i;    //yeh kro
                int sum = 0;
                     while (j<= 9) {       //iss while loop ke liye alag varaible banao
                         if (j% 2 == 0) {
                             sum += j;
                    }
                    j++;
                }
                System.out.println(sum);
                i += 1;
            }
            else {
                System.out.println(i);
                i += 1;
            }
        }
    }
}