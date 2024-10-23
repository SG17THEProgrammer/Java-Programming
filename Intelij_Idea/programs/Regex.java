import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
    public static void main(String[] args) {

        //[abc] - find one charcter from the options between the brackets
        //[^abc] -- execpt these gives all the charcters
        //[0-9]	 -- Find one character from the range 0 to 9

        // METACHARACTER
        // | - find a match for any one of the patterns seperated by | as in :cat|dog|fish
        // . -- Find just one instance of any character
        // ^ -- finds a match as the beggining of a string  (starting mein hogi string tbhi kuch output aayega)
        // $ -- finds a match at the end of the string ( string ke last mein hai ki nhi )
        // \d -- find a digit
        // \s -- find a whitesapce character
        // \b -- find a match at the begging of a word like this : \bWORD , or at the end of a word like this : WORD\b



        //QUANTIFIERS
//        n+ -- matches any string that contains at least one n
//        n* -- matches any string that contains zero or more occurences of n
//        n?-- matches any string that contains zero or one occurences of n
//        n{x} -- matches any string that contains a sequence of X n's
//        n{x,y} -- matches any string that contains a sequence of X to Y n's
//        n{x,} -- matches any string that contains a sequence of at least  X n's

        // 1st que -- koi bhi string match ho  jaaye  ( logical or ya pipeline wala sign hai )
//        Pattern p = Pattern.compile("nee|tar|eta|tne", Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("neetargetNeeStringeta");
//        int ctr = 0;
//        while (m.find()) {
//            System.out.println(m.start() + "   " + m.end() + "   " + m.group());
//            ctr++;
//        }
//        System.out.println(ctr);


        // 2nd que -- digits ko dekhega
//        Pattern p = Pattern.compile("\\d");
//        Matcher m = p.matcher("ne2et6ar8get9Nee7Str5ing0");
//        int ctr = 0;
//        while (m.find()) {
//            System.out.println(m.start() + "   " + m.end() + "   " + m.group());
//            ctr++;
//        }
//        System.out.println(ctr);


        // 3rd que -- character by character dekhega
//        Pattern p = Pattern.compile("[nee]", Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("neetargetNeeString");
//        int ctr = 0;
//        while (m.find()) {
//            System.out.println(m.start() + "   " + m.end() + "   " + m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

        //4th que -- uske alawa jo koi bhi hai
//        Pattern p = Pattern.compile("[^nee]",Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("neetargetNeeString");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

        //5th que -- 0 se 9 tk digits
//        Pattern p = Pattern.compile("[0-9]");
//        Matcher m = p.matcher("ne2et6ar8get9Nee7Str5ing0");
//        int ctr=0;
//        while(m.find())
//        {
//            System.out.println(m.start() + "   "+ m.end()+"   " +m.group());
//            ctr++;
//        }
//        System.out.println(ctr);

//        Pattern p = Pattern.compile("Nee", Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("neetargetNeeString");
//        int ctr = 0;
//        while (m.find()) {
//         System.out.println(m.start() + "   " + m.end() + "   " + m.group());
//         ctr++;
//     }
//     System.out.println(ctr);


//        Pattern p = Pattern.compile(".", Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("neetargetNeeString");
//        int ctr = 0;
//        while (m.find()) {
//         System.out.println(m.start() + "   " + m.end() + "   " + m.group());
//         ctr++;
//     }
//     System.out.println(ctr);

//        Pattern p = Pattern.compile("e{2,}", Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher("neetargetNeeString");
//        int ctr = 0;
//        while (m.find()) {
//         System.out.println(m.start() + "   " + m.end() + "   " + m.group());
//         ctr++;
//     }
//     System.out.println(ctr);

        Pattern p = Pattern.compile("\bnee", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("neetargetNeeString");
        int ctr = 0;
        while (m.find()) {
         System.out.println(m.start() + "   " + m.end() + "   " + m.group());
         ctr++;
        }
         System.out.println(ctr);

    }
}

