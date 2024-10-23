public class Stopwatch extends Thread {
    public static void main(String[] args) {
        try {
            int i, j, k;
            for (k = 0; k <= 23; k++) {

                for (j = 0; j < 60; j++) {

                    for (i = 0; i < 60; i++) {
                        sleep(1000);
                        System.out.println(k + ":" + j + ":" + i);
                    }
                }

                if ((++k) == 24) {
                    k =-1;
                } else {
                    continue;
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}


