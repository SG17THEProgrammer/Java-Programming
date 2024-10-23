import java.sql.*;
import java.util.*;

class JDBC8 {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/GLA";
    static final String USER = "postgres";
    static final String PASS = "#SG@postgres";

    void exec() throws SQLException {
        // Open a connection
        Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement("insert into student" + "(roll_no,name,age)" + " values(?,?,?)");
        //Taking input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of rows you want to enter : ");
        int rows = scanner.nextInt();
        while(rows>0) {
            System.out.print("Enter roll no: ");
            int roll_no = scanner.nextInt();
            System.out.print("Enter Name: ");
            String name = scanner.next();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            //Inserting
            ps.setInt(1, roll_no);   // 1,2,3  are the positions
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.executeUpdate();
            System.out.println("Row Inserted ");
            rows--;
        }
    }
}


public class Practical2 {
    public static void main(String[] args) {
        try {
            JDBC8 j=new JDBC8();
            j.exec();
        }
        catch (Exception e)
        {
            System.out.println("Class Not Found");
        }
    }
}