import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class JDBC1
{
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Assignment_6";
    static final String USER = "postgres";
    static final String PASS = "#SG@postgres";
    static final String QUERY = "insert into college values('Gla','UP',34000)";
    void exec()
    {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(QUERY);
            System.out.println("Row Inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
public class Insert_using_JDBC {
    public static void main(String[] args) {
        try {
            JDBC1 j=new JDBC1();
            j.exec();
        }
        catch (Exception e)
        {
            System.out.println("Class Not Found");
}
}
}