import java.util.ArrayList;
import java.util.Vector;
public class vector{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(80);
        al.add(90);
        al.add(100);
        Vector<Integer> v = new Vector<>();
        //System.out.println(v.add(12));  // true aayega
        v.add(13);
        v.addElement(14);
        //System.out.println(v);
        v.equals(12);
       // System.out.println(v);
        v.clone();
        v.addAll(al);

        v.removeAllElements(); // yeh vector ka apna hai
        v.clear();   // list method  se hai
//        System.out.println(v);
//        System.out.println(al);
        v.ensureCapacity(22);
       // System.out.println(v.capacity());
        Object arr[] = new Object[]{73,27,17,67,45,89,12,34};
        v.copyInto(arr);
        System.out.println(v);
    }
}
