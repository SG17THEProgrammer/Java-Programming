import java.sql.*;

class JDBC3
{
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Assignment_6";
    static final String USER = "postgres";
    static final String PASS = "#SG@postgres";
    static final String QUERY = "update college set enrollment=20000 where cname='MIT'";
    void exec()
    {
        // Open a connection
        try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement ps=con.prepareStatement("insert into college values(?,?,?)");
        ){
            ps.setString(1,"Sanskriti");   // 1,2,3  are the positions
            ps.setString(2, "UP");
            ps.setInt(3,22000);
            ps.executeUpdate();
            System.out.println("Row Inserted by Using Prepared Statement");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
public class Insert_using_Prepared_Statement {
    public static void main(String[] args) {
        try {
            JDBC3 j=new JDBC3();
            j.exec();
        }
        catch (Exception e)
        {
            System.out.println("Class Not Found");
        }
    }
}