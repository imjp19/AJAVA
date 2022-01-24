/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdata;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Jay Patel
 */
public class Practical4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
              Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studInfo","imjp19","3222");
             PreparedStatement pstmt=con.prepareStatement("Update IMJP19.STUDENTDETAILS set ENROLLMENT=? where id=?");
             Scanner sc=new Scanner(System.in);
          
         //System.out.print("Enter ID: ");
        //  System.out.print("Enter Name: ");
        // int id=sc.nextInt();
    //      String name=sc.next();
      //    System.out.print("Enter ENROLLMENT: ");
        //  int enr=sc.nextInt();
          //System.out.print("Enter EMAIL: ");
          //String email=sc.next();
     //     System.out.print("Enter DEPT: ");
       //   String dept=sc.next();
        //  System.out.print("Enter SEM: ");
        //  int sem=sc.nextInt();
        //  System.out.print("Enter MOBILE: ");
        //  String mobile=sc.next();
        //  pstmt.setInt(1,id);
        //  pstmt.setString(2,name);
        //  pstmt.setInt(3,enr);
        //  pstmt.setString(4, email);
        //  pstmt.setString(5, dept);
        //  pstmt.setInt(6, sem);
        //  pstmt.setString(7, mobile);
        //  pstmt.executeUpdate();
                    
        System.out.print("enter corrected enrollment: ");
        int enr = sc.nextInt();
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        
        pstmt.setInt(1,enr);
        pstmt.setInt(2,id);
         pstmt.executeUpdate();
                    
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        
        }
    }
    
}

