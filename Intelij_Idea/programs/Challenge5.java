import java.util.*;
class Node{
    Node next;
    String data;
    Node(String data){
        this.data=data;
    }
}
class Challenge5 {
    static Node remo=null;
    Node push(Node top,String data){

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
            Node temp=remo;
            while(temp.next!=null){
                temp=temp.next;
            }temp.next=top;
        }
    }

    Node pop(Node top){
        Node temp=top;
        if(top!=null){
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
    Node finalOP(Node top,Node ntop){
        Node temp=ntop;
        if(ntop.next==null){
            return (top);
        }
        ntop=ntop.next;
        temp.next=null;
        temp.next=top;
        top=temp;
        return finalOP(top,ntop);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node myStack=null;
        Challenge5 a=new Challenge5();
        System.out.print("enter size of train : ");
        int size=sc.nextInt();
        System.out.println();
        for(int i=1; i<=size; i++){
            System.out.print("enter bogie "+i+" : ");
            String data=sc.next();
            myStack=a.push(myStack, data);
        }
        System.out.println();
        int pos;
        do{
            System.out.print("enter position of bogie which you want to detached : ");
            pos=sc.nextInt();
            if(pos<=0||size<pos){
                System.out.println("Invalid position--Enter again by keeping your mind open");
            }

        }while(pos<=0||size<pos);

        for(int i=size;i>=pos;i--){

            myStack=a.pop(myStack);
        }
        Node newN=remo;
        myStack=a.finalOP(myStack,newN);
        System.out.println();
        System.out.println("your train after processing");
        a.print(myStack);
}}
