import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.*;

class JDBC5
{
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Assignment_6";
    static final String USER = "postgres";
    static final String PASS = "#SG@postgres";
    static final String QUERY = "delete from college where cname='GLA'";
    void exec()
    {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ){
            stmt.executeUpdate(QUERY);
            System.out.println("Row Deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
 class delete_using_JDBC {
    public static void main(String[] args) {
        try {
            JDBC5 j = new JDBC5();
            j.exec();
        } catch (Exception e) {
            System.out.println("Class Not Found");
        }
    }
}