//all in one jdbc program
import java.sql.*;
public class Test {

    public static void main(String[] args) throws SQLException{
        Connection connection=DriverManager.getConnection("jdbc:postgres://localhost:5432/","root","root");
        Statement statement=connection.createStatement();

        String query1="create table employee(eid int,ename varchar(10), salary int)";
        statement.executeUpdate(query1);
        System.out.println("Table created :");

        String query2="insert into employee values(0000 , 'Vikas' , 90000)";
        String query3="insert into employee values(0001 , 'Suraj' , 85000)";
        String query4="insert into employee values(0002 , 'Ankit' , 80000)";
        statement.executeUpdate(query2);
        statement.executeUpdate(query3);
        statement.executeUpdate(query4);
        System.out.println("inserted a row");


        String query5="select * from employee";
        ResultSet resultset=statement.executeQuery(query5);
        System.out.println("eid"+"\t"+"ename"+"\t"+"salary");
        while(resultset.next()) {
            System.out.print(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getInt(3));
            System.out.println();
        }
    }

}
