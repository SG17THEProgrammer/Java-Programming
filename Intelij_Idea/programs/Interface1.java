import java.sql.SQLOutput;
        interface Calculation{
            void sum(int num1,int num2);
            void sub(int num1,int num2);

        }
        class Parent {
            public void mul(int num1, int num2) {
                System.out.println(num1 * num2);
            }

            public void div(int num1, int num2) {
                System.out.println(num1 / num2);

            }
        }
        class ChildE extends Parent implements Calculation{
            public void sum(int num1,int num2){
                System.out.println(num1+num2);
            }
            public void sub(int num1,int num2){
                System.out.println(num1-num2);


                    }
                }
            public class Interface1 {
                public static void main(String [] args) {
                    int a=Integer.parseInt(args[0]);
                    int b=Integer.parseInt(args[1]);
                    ChildE obj= new ChildE();
                    obj.sum(a,b);
                    obj.sub(a,b);
                    obj.mul(a,b);
                    obj.div(a,b);

                }

        }


