package com.learnJava;
import java.sql.*;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        try
        {


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","3222");
            Statement stmt=con.createStatement();
           // ResultSet rs=stmt.executeQuery("SELECT * FROM AJAVA.STUDINFO");
            PreparedStatement pstmt = con.prepareStatement("Insert  into ajava.prac3 values(?,?,?,?)");
            Scanner sc=new Scanner(System.in);
         //   rs.next();

           /* String name = rs.getString("name");
            String enr = rs.getString("enr");
            String email = rs.getString("email");
            String dept = rs.getString("dept"); */

            //System.out.print(name + " "+enr+" "+email+" "+dept);
            System.out.print("enter your name: ");
            String name = sc.next();
            System.out.print("Enter enrollment: ");
           String enr = sc.next();
           System.out.print("Enter email: ");
            String email = sc.next();
            System.out.print("Enter department: ");
            String dept = sc.next();


            pstmt.setString(1,name);
            pstmt.setString(2,enr);
            pstmt.setString(3,email);
            pstmt.setString(4,dept);
            pstmt.executeUpdate();


        }
        catch(Exception e)
        {
            System.out.println(e);

        }
    }
}
