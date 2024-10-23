import java.util.Scanner;

public class Bubble_Sort_LL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter data:");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new_node;
            }
            System.out.println("For entering more data press 1 or press any other digit: ");
            n = sc.nextInt();
        }
        while (n == 1);
    }

    public static Node BubbleSort(Node head) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data > temp.next.data) {
                int copy = temp.data;
                temp.data = temp.next.data;
                temp.next.data = copy;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Node temp=head;
        Bubble_Sort_LL obj = new Bubble_Sort_LL();
        obj.creation();
        BubbleSort(temp);

    }


}
