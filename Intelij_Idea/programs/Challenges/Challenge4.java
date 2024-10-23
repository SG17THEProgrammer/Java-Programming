package Challenges;

import java.util.*;
class Node{
    Node next;
    String data;
    Node(String data){
        this.data=data;
    }
}
class Challenge4{
    static int c=0;
    Node remo=null;
    Node push(Node top,String data){
        c++;
        Node n=new Node(data);
        if(top!=null){
            n.next=top;
            top=n;
        }
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
            System.out.println("boggie "+top.data+" detached");
            top=top.next;
            temp.next=null;
            pushBogie(temp);
        }
        else{
            System.out.println("Stack overflow");
        }
        return top;
    }
    void print(Node top){
        while(top!=null){
            System.out.println(top.data);
            top=top.next;
        }}
    Node finalOP(Node top) {
        remo = remo.next;
        while (remo != null) {
            Node temp = remo;

                System.out.println("boggie "+remo.data+" attached");
                remo=remo.next;
                temp.next=top;
                top=temp;
        }
        return top;
    }

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Node myStack=null;
            Challenge4 a=new Challenge4();
            System.out.print("Enter size of train : ");
            int size=sc.nextInt();
            System.out.println();
            for(int i=1; i<=size; i++){
                System.out.print("Enter boggie "+i+" : ");
                String data=sc.next();
                myStack=a.push(myStack, data);
            }
            System.out.println();
            System.out.print("Enter position of boggie which you want to detach : ");
            int pos=sc.nextInt();
            System.out.println();

            for(int i=c;i>=pos;i--){
                myStack=a.pop(myStack);
            }
            System.out.println();
            myStack=a.finalOP(myStack);
            System.out.println();
            System.out.println("Your train after detaching the boggie");

            a.print(myStack);

}
}