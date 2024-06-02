import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","munnaaziz");

        System.out.println("Connection Established!");

       // PreparedStatement pst = con.prepareStatement("create table Sam(id int ,name varchar(20),age int,email varchar(20))");
        PreparedStatement pst1 = con.prepareStatement("insert into Sam(id,name,age,email) values" +
                "(102,'sharma',22,'sharma@gmail.com')," +
                "(101,'anil',12,'anil@gmail.com'), " +
                "(103,'kapil',34,'kapil@gmail.com')");
//        UPDATE table_name
//        SET column_name='value1',
//                column_name='value2', -,
//
//                WHERE column_name='value3';

        PreparedStatement pst2  = con.prepareStatement("UPDATE  Sam set email = 'anilkumar@gmail.com' ,name = 'anilkumar'  where age = 12" );

        int i1 = pst1.executeUpdate();
        //int i = pst.executeUpdate();
        int i2 = pst2.executeUpdate();

        pst1.close();
       // pst.close();
        pst2.close();

    }
}
