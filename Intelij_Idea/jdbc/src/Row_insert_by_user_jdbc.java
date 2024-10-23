import java.sql.*;
import java.util.*;

class JDBC4 {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Assignment_6";
    static final String USER = "postgres";
    static final String PASS = "#SG@postgres";
    //static final String QUERY = "update college set enrollment=20000 where cname='MIT'";
    void exec() throws SQLException {
        // Open a connection
        Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement ps = con.prepareStatement("insert into college" + "(cname,state,enrollment)" + " values(?,?,?)");
        //Taking input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of rows you want to enter : ");
        int rows = scanner.nextInt();
        while(rows>0) {
            System.out.print("Enter College name: ");
            String cname = scanner.next();
            System.out.print("Enter State: ");
            String state = scanner.next();
            System.out.print("Enter Enrollment: ");
            int enrollment = scanner.nextInt();

            //Inserting
            ps.setString(1, cname);   // 1,2,3  are the positions
            ps.setString(2, state);
            ps.setInt(3, enrollment);
            ps.executeUpdate();
            System.out.println("Row Inserted ");
            rows--;
        }
            }
        }


public class Row_insert_by_user_jdbc {
    public static void main(String[] args) {
        try {
            JDBC4 j=new JDBC4();
            j.exec();
        }
        catch (Exception e)
        {
            System.out.println("Class Not Found");
        }
    }
}