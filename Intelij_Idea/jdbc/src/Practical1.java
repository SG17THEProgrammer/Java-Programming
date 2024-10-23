import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class JDBC7
{
    static final String DB_URL = "jdbc:postgresql://localhost:5432/GLA";
    static final String USER = "postgres";
    static final String PASS = "#SG@postgres";
    static final String QUERY = "create table Student (roll_no int , name varchar(50) , age int)";
    void exec()
    {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ){
            stmt.executeUpdate(QUERY);
            System.out.println("Table Created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
public class Practical1 {
    public static void main(String[] args) {
        try {
            JDBC7 j = new JDBC7();
            j.exec();
        } catch (Exception e) {
            System.out.println("Class Not Found");
        }
    }
}