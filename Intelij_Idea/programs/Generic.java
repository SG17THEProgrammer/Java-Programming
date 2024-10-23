class Name<J>{
    void naam(J a , J b){
        System.out.print(a);
        System.out.println(b);
    }
}

public class Generic {
    public static void main(String[] args) {
        Name obj = new Name<>();
        String s = new String("Shray");
        Integer i=17;
        obj.naam(s,i);
        obj.naam(i,s);
    }
}