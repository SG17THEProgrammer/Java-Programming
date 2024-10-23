import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class JDBC2
{
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Assignment_6";
    static final String USER = "postgres";
    static final String PASS = "#SG@postgres";
    static final String QUERY = "update college set enrollment=20000 where cname='MIT'";
    void exec()
    {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ){
            stmt.executeUpdate(QUERY);
            System.out.println("Row Updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
public class Update_using_JDBC {
    public static void main(String[] args) {
        try {
            JDBC2 j = new JDBC2();
            j.exec();
        } catch (Exception e) {
            System.out.println("Class Not Found");
        }
    }
}