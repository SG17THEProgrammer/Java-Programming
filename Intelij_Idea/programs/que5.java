class A{
    public static void method_of_class_A(){
        System.out.println("Parent");
    }
}
class B extends A {
    public static void method_of_class_A() {
        System.out.println("Child");
    }
}

class que5  {
public static void main(String[] args) {
        B obj = new B();
        A obj1 = new A();
        obj.method_of_class_A();
        obj1.method_of_class_A();


        A obj2 = new B();
        obj2.method_of_class_A();


        }
        }