import java.sql.*;

public class J5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","munnaaziz");

//        //PreparedStatement pst = con.prepareStatement("create table std (id int, name varchar(30),email varchar(30))");
//        System.out.println("Table created");
//          int count =   pst.executeUpdate();
//          pst.close();


           Statement stmt = con.createStatement();

//        stmt.addBatch("insert into std values(1,'shyam','shy@gmail.com')");
//        stmt.addBatch("insert into std values(2,'ram','ram@gmail.com')");
//        stmt.addBatch("insert into std values(3,'anil','anil@gmail.com')");
//        stmt.addBatch("insert into std values(4,'sen','sen@gmail.com')");
//        stmt.addBatch("insert into std values(5,'mohan','mohan@gmail.com')");
       // stmt.addBatch("UPDATE std set name ='MONU', email = 'monu@gmail.com' WHERE id = 5");
//        stmt.addBatch("DELETE from std where id = 4");
//        int [] arr = stmt.executeBatch();
//        for(int i: arr)
//        {
//            System.out.println(i+ ": Successfull");
//        }
//            PreparedStatement pstmt = con.prepareStatement("insert into std values(?,?,?)");
//
//            pstmt.setInt(1,6);
//            pstmt.setString(2, "Munna_Aziz");
//            pstmt.setString(3, "Munnaaziz@gmail.com");
//            pstmt.addBatch();
//
//            pstmt.setInt(1,7);
//            pstmt.setString(2, "jhanvi_kapoor");
//            pstmt.setString(3, "jhanvi_kapoor@gmail.com");
//            pstmt.addBatch();

            PreparedStatement ps = con.prepareStatement("UPDATE std SET name = ?, email = ? WHERE name = ?");
            ps.setString(1,"RajKumar");
            ps.setString(2,"rajkumar@gmail.com");
            ps.setString(3,"MONU");
            ps.addBatch();

            int[] count = ps.executeBatch();
            for(int i: count)
            {

                System.out.println(i  +"Sucessfull");
            }

    }
}
