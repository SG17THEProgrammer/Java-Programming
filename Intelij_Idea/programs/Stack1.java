import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;
public class Stack1 {
    public static void main(String[] args) {
        Stack<String> str = new Stack <>();
        str.push("Shray");
        str.push("Java");
        str.push("OOPs");
        //str.pop();
        Object st[] = str.toArray();  // generic type ka data dega "toArray" isleye Object lagana padega
        //System.out.println(str.peek());
        //System.out.println(str);
        Iterator i = str.iterator();
        while(i.hasNext()){
            System.out.println((i.next()));
        }
        i.remove();



    }
}
