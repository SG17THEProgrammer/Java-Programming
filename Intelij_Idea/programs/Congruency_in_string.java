public class Congruency_in_string {
    public static void main(String[] args) {
        int flag=0;
        String str = "cat dog cat dog";
        char[] str1 = str.toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            for (int j =str.length()/2 + 1 ; j < str.length(); j++) {
                if (str1[i] == str1[j]) {
                    flag=1;
                }
                }
            }
        if (flag==1){
            System.out.println("String are congruent");
        }
        if (flag==0){
            System.out.println("String are not congruent");
        }
    }
}