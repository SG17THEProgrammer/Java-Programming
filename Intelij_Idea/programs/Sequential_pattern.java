//        1
//        2 3
//        4 5 6
//        7 8 9 10

import java.util.Scanner;
public class Sequential_pattern {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(b++ + " ");
            }
            System.out.println();
        }
    }
}
