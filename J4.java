import java.sql.*;

public class J4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","munnaaziz");
        PreparedStatement pst = con.prepareStatement("SELECT * from Sam");
      //  ResultSet rs = pst.executeQuery();
//        rs.first();
//        rs.last();
//        rs.beforeFirst();
//        rs.afterLast();
//        rs.previous();
//        String sname = rs.getString("name");
//        int id = rs.getInt("id");
//        int age  = rs.getInt("age");
//        String email = rs.getString("email");
//        System.out.println(id + "  " + age +"   "+  sname + "   "  + email);
//        PreparedStatement pst2 = con.prepareStatement("update Sam set name = ? where id = ?");
//        pst2.setString(1, "Munnaaziz");
//        pst2.setInt(2, 101);
//        pst2.executeUpdate();
        PreparedStatement pst2 = con.prepareStatement(" insert into Sam values(?,?,?,?)");
        pst2.setInt(1,104);
        pst2.setString(2,"Shyam");
        pst2.setInt(3,21);
        pst2.setString(4,"shyam@gmail.com");
    pst2.executeUpdate();
    }
}
