import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class JDBC6
{
    static final String DB_URL = "jdbc:postgresql://localhost:5432/";
    static final String USER = "postgres";
    static final String PASS = "#SG@postgres";
    static final String QUERY = "create table Practical (roll_no int , name varchar(15) , sec varchar(5))";
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
public class create_table {
    public static void main(String[] args) {
        try {
            JDBC6 j = new JDBC6();
            j.exec();
        } catch (Exception e) {
            System.out.println("Class Not Found");
        }
    }
}