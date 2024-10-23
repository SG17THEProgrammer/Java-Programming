//public class Interface {
//    public static void main(String[] args) {
//        // n no. of interface bna skte hai
//        interface inter{
//            void sum();
//            void sub();
//        }
//        // ek class ko multiple interface implement krwa skte hai
//        class Test implements inter{
//            public void sum(){
//
//            }
//            public void sub(){
//
//            }
//        }
//    }
//
//}
//// multiple inheritance
////class class_name extends class_name  implements interface_name

import java.util.Scanner;
        interface Area {
            void length();

            void breadth();

            void area();

        }
        class Rectangle implements Area {

            int length, breadth, area;
            Scanner sc = new Scanner(System.in);

            public void length() {
                System.out.println("Enter the length:");
                length = sc.nextInt();
                System.out.println("the length is:" + " " + length);
            }

            public void breadth() {
                System.out.println("Enter the breadth:");
                breadth = sc.nextInt();
                System.out.println("the breadth is:" + " " + breadth);
            }

            public void area() {
                System.out.println(length);
                System.out.println(breadth);
                area = length * breadth;
                System.out.println("The area is :"+" " +area);
            }

        }
        class Square implements Area {

            int length, breadth, area;
            Scanner sc = new Scanner(System.in);

            public void length() {
                System.out.println("Enter the length:");
                 length = sc.nextInt();
                System.out.println("the length is:" + " " + length);

            }

            public void breadth() {
                breadth = length;
                System.out.println("the breadth is:" + " " + breadth);
            }

            public void area() {
                area= length * breadth;
                System.out.println("the area of square is:" + " " + area);
            }

        }
        class Interface  {
            public static void main(String[] args) {
                Rectangle obj = new Rectangle();
                obj.length();
                obj.breadth();
                obj.area();

                Square s = new Square();
                s.length();
                s.breadth();
                s.area();


            }
        }

