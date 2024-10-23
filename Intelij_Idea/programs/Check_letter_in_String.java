
public class Check_letter_in_String {
    public static void main(String[] args) {
        int flag=0;
        String str="Umbrella";
        char[] name = str.toCharArray();
        for (int i=0 ; i<str.length() ; i++) {
            if (name[i] == 'e') {
                flag = 1;
                System.out.println("'e' is present in entered string");
            }
        }
            if (flag==0)
                System.out.println("'e' is not present in entered string");
        }
            }



