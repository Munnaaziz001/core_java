import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conn {
    public static void main(String[] args) throws  ClassNotFoundException, SQLException {
        int id = 3;
        String name = "muna";
        String email = "muna@gmail.com";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root","munnaaziz");
        System.out.println("Connection Establish");
        PreparedStatement ps1 = con.prepareStatement("CREATE TABLE Student(std_id int, Name varchar(50), email varchar(50))");
      //  PreparedStatement ps2 = con.prepareStatement("INSERT INTO Student VALUES (101,'munnaaziz','munnna@gmail.com');
       // PreparedStatement ps3 = con.prepareStatement("INSERT INTO Student VALUES ('"+id+"','"+name+"','"+email+"')");
        int count = ps1.executeUpdate();
       // int count1 = ps2.executeUpdate();
        //int count2 = ps3.executeUpdate();
        ps1.close();
      //  ps2.close();
      //  ps3.close();
        con.close();
    }
}