
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class main2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Id: ");
//        int num = sc.nextInt();
//        System.out.println("Enter Name: ");
//        String name = sc.next();
//        System.out.println("Enter your email_Id: ");
//        String emailId = sc.next();

        //1
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/main","root","munnaaziz");

        System.out.println("Connection Establish");
        //3
       // PreparedStatement ps1= conn.prepareStatement("create table Student1(ID int,Name varchar(30),Email varchar(50))");
//        //PreparedStatement ps2= conn.prepareStatement("insert into Student1 values(1,'Vijay','Vij@'),(2,'Anilkumar','anilkumar@gmail'" +
//                "),(3,'Munnaaziz','munnaaziz@gmail')");
       // PreparedStatement ps  = conn.prepareStatement("DELETE from Student1 where id=1");
       // PreparedStatement pst = conn.prepareStatement("insert into Student1 values('"+num+"','"+name+"','"+emailId+"')");
        //PreparedStatement pst1 = conn.prepareStatement("DELETE  from Student1 where id = 102");
       // ps1.executeUpdate();
       // ps2.executeUpdate();
//        ps2.close();
       // ps.executeUpdate();
        //pst.executeUpdate();
      //  pst1.executeUpdate();
//        //int count  = pst1.executeUpdate();
//        if (count>1)
//        {
//            System.out.println("Inserted successfully");
//
//        }
//        else
//        {
//            System.out.println("There is some error");
//
//        }
//        pst1.close();
//        conn.close();


}
}