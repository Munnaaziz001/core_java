
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Jam {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/main","root","18122002");

        System.out.println("Connection Establish");
        //3
        //PreparedStatement ps1= conn.prepareStatement("create table Student1(ID int,Name varchar(30),Email varchar(50))");
        PreparedStatement ps2= conn.prepareStatement("insert into Student1 values(1,'Vijay','Vij@')");

        //ps1.executeUpdate();
        int i = ps2.executeUpdate();
        ps2.close();
}
}