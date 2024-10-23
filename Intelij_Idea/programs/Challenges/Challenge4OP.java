package Challenges;
import java.util.*;
        import java.util.concurrent.TimeUnit;
class Node1{
    Node next;
    String data;
    Node1(String data){
        this.data=data;
    }
}
class Challenge4OP{
    static int c=0;
    Node remo=null;
    Node push(Node top,String data){
        c++;
        Node n=new Node(data);
        if(top!=null){
            n.next=top;
            top=n;}
        else{
            top=n;
        }
        return top;
    }
    void pushBogie(Node top){
        if(remo==null){
            remo=top;
        }
        else{
            top.next=remo;
            remo=top;
        }
    }

    Node pop(Node top){
        Node temp=top;
        if(top!=null){
            System.out.println("bogie "+top.data+" detached");
            top=top.next;
            temp.next=null;
            pushBogie(temp);
        }
        else{
            System.out.println("stack overflow");
        }
        return top;
    }
    void print(Node top){
        while(top!=null){
            System.out.println(top.data);
            top=top.next;
        }}
    Node finalOP(Node top){
        try{
            remo=remo.next;
            while(remo!=null){
                Node temp=remo;
                System.out.print("loading");
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.print(".");
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.print(".");
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.print(".");
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.println();
                System.out.println("bogie "+remo.data+" attached");
                remo=remo.next;
                temp.next=top;
                top=temp;
            }}
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }

        return top;
    }
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            Node myStack=null;
            Challenge4OP a=new Challenge4OP();
            System.out.print("enter size of train : ");
            int size=sc.nextInt();
            System.out.println();
            for(int i=1; i<=size; i++){
                System.out.print("enter bogie "+i+" : ");
                String data=sc.next();
                myStack=a.push(myStack, data);
            }
            System.out.println();
            System.out.print("enter position of bogie which you detached : ");
            int pos=sc.nextInt();
            System.out.println();
            System.out.println("boggy is detaching.....");
            for(int i=c;i>=pos;i--){
                System.out.print("loading");
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.print(".");
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.print(".");
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.print(".");
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.println();
                myStack=a.pop(myStack);
            }
            System.out.println();
            System.out.println("bogie is attaching.....");
            myStack=a.finalOP(myStack);
            System.out.println();
            System.out.print("your train after processing");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println();
            a.print(myStack);
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
}
}
}