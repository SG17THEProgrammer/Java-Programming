

import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;

class JDBC
{
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Assignment_6";
    static final String USER = "postgres";
    static final String PASS = "#SG@postgres";
    static final String QUERY = "SELECT cname ,state , enrollment  FROM college";

    void exec()
    {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
        ) {
            while(rs.next()){
                //Display values
                System.out.print("Candidate Name: " + rs.getString("cname"));
                System.out.print(", State: " + rs.getString("state"));
                System.out.print(", Enrollment: " + rs.getInt("enrollment")+"\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
public class Select_query_by_JDBC {
    public static void main(String[] args) {
        try {
            JDBC j = new JDBC();
            j.exec();
        } catch (Exception e) {
            System.out.println("Class Not Found");
        }
    }
}