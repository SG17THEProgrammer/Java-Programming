 class Parent1 {
    void pops() {
        System.out.println("Daddy");
    }
        void grandpops(){
            System.out.println("granddaddy");
        }
    }

class Child extends Parent1{
    void lalla(){
        System.out.println("Baby");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Parent1 obj = new Parent1();
        Child obj1 = new Child();
        obj.pops();
        obj1.grandpops();
        //obj.lalla();    // not possible

    }

    }
