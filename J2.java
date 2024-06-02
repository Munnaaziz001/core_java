import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J2 {
    public static void main(String[] args) {
        String name = "Munnaaziz";
        String email = "munnaaziz@gmail.com";
        int roll_id = 202;
        Connection conn = null;
        PreparedStatement pst = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","munnaaziz");
            //PreparedStatement pst1 = conn.prepareStatement("create table Details(name varchar(40),email varchar(40),roll_id int)");
           pst = conn.prepareStatement("insert into Details values('"+name+"','"+email+"','"+roll_id+"') ");
           // pst1.executeUpdate()
            int count = pst.executeUpdate();
            pst.executeUpdate();
            pst.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                conn.close();
                pst.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
