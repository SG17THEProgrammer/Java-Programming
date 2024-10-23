import java.util.Arrays;
class Anagram {
    static boolean check(char[] str1, char[] str2)
    {
        int n1 = str1.length;
        int n2 = str2.length;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    public static void main(String args[])
    {
        String x = "shray";
        String y = "spray";
        char[] str1 = x.toCharArray();
        char[] str2 = y.toCharArray();


        if (check(str1, str2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

