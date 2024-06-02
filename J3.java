import java.sql.*;

public class J3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","munnaaziz");
        PreparedStatement ps = con.prepareStatement("SELECT * from Sam");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String sname = rs.getString("name");
            int id = rs.getInt("id");
            String email = rs.getString("email");
            int age  = rs.getInt("age");
            System.out.println(id +" ---->  "+age +" ----> "+sname+" ----> "+ email);
        }
        ResultSet rs1 = ps.executeQuery();
        while (rs.previous()) {
            String sname = rs1.getString("name");
            int id = rs.getInt("id");
            String email = rs1.getString("email");
            int age  = rs1.getInt("age");
            System.out.println(id +" ---->  "+age +" ----> "+sname+" ----> "+ email);
        }

        ps.close();
        con.close();
        rs.close();
    }
}
