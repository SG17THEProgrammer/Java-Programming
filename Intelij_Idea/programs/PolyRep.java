
class Node1 {
    Node1 next;
    int data1;
    String deg;

    Node1(int data1, String s) {
        this.data1 = data1;
        this.deg = s;
    }
}

public class PolyRep {
    static String[] l = new String[3];
    static String[] o = { "x^2", "x", "x^0" };

    static Node1 create(int data, String deg, Node1 head) {
        Node1 n = new Node1(data, deg);
        if (head == null) {
            head = n;
        } else {
            Node1 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        return head;
    }

    static void print(Node1 head) {
        while (head != null) {
            System.out.print(head.data1 + " ");
            head = head.next;
        }
        System.out.println();
    }

    static void pprint(Node1 head1, Node1 head2) {
        Node1 t2 = head1;
        Node1 t1 = head2;
        int c = 0;
        while (head1 != null) {
            Node1 temp = head2;
            while (temp != null) {
                if (head1.deg == temp.deg) {
                    System.out.println("(" + (head1.data1 + temp.data1) + ")" + temp.deg);
                    l[c] = head1.deg;
                    c++;
                }
                temp = temp.next;
            }
            head1 = head1.next;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (o[i] == l[j]) {
                    o[i] = null;
                }
            }
        }
        while (t2 != null) {
            for (int i = 0; i < 3; i++) {
                if (t2.deg.equals(o[i]) && o[i] != null) {
                    System.out.println("(" + t2.data1 + ")" + t2.deg);
                }
            }
            t2 = t2.next;
        }
        while (t1 != null) {
            for (int i = 0; i < 3; i++) {
                if (t1.deg.equals(o[i]) && o[i] != null) {
                    System.out.println("(" + t1.data1 + ")" + t1.deg);
                }
            }
            t1 = t1.next;
        }
    }

    public static void main(String[] args) {
        Node1 head1 = null;
        Node1 head2 = null;
        head1 = create(2, "x^2", head1);
        head1 = create(4, "x", head1);
        head1 = create(6, "x^0", head1);
        head2 = create(3, "x^2", head2);
        head2 = create(5, "x", head2);
        head2 = create(7, "x^0", head2);
        pprint(head1,head2);
    }
}
