//Method 1: Using if statement

//public class printing_without_semicolon {
//    public static void main(String[] args) {
//        if(System.out.printf("Hello")==null){
//        }
//
//        }
//    }

//Method 2: Using append() method of StringBuilder class

//public class printing_without_semicolon {
//    public static void main(String[] args) {
//        if(System.out.append("Hello")==null){
//        }
//
//    }
//}

//Method 3: Using equals method of String class

public class printing_without_semicolon {
    public static void main(String[] args) {
        if(System.out.append("Hello").equals(null)){
        }

    }
}