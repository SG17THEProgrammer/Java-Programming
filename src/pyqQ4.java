 import java.util.ArrayList;

 class pyqQ4 {
  public static int instances = 0;
private ArrayList<Student> studentList;

    public pyqQ4(){
        instances++;
    }
    public pyqQ4(int rollno, String name, double marks){
        this.studentList = new ArrayList<Student>();

    }

    public boolean addStudent(Student student){
        if (student==null || studentList.contains(student)) {
            return false;
        }
        studentList.add(student);
        return true;
    }

    public void printStudents(){
    for(Student s : studentList)
            if(s.getrollNumber()%2==0){
            System.out.println(s.getrollNumber() + "    " + s.getName() + "      " +s.getMarks());
            }
    }

public static class Student{
        private int rollnumber;
        private String name;
        private double marks;


        public Student(int rollnumber, String name, double marks){
            this.rollnumber = rollnumber;
            this.name = name;
            this.marks = marks;
        }

        // .... Getters and Setters.

        public int getrollNumber(){ 
            return this.rollnumber;
        }

        public String getName(){
            return this.name;
        }

        public double getMarks(){
            return this.marks;
        }
}
    // Testing code
    public static void main(String[] args){
        pyqQ4 oop = new pyqQ4 (6, "@kanishk_patel",55.3);
        oop.addStudent(new pyqQ4.Student(6, "Kanishk", 56));
        oop.addStudent(new pyqQ4.Student(8, "Ritik", 88));
        oop.addStudent(new pyqQ4.Student(12, "Govind", 28));
        oop.addStudent(new pyqQ4.Student(15, "Ayush", 50));
        oop.addStudent(new pyqQ4.Student(13, "Dheeraj", 48));
        oop.printStudents();
}

} 

