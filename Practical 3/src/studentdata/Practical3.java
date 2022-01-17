/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdata;
import java.sql.*;
/**
 *
 * @author Jay Patel
 */
public class Practical3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studInfo","imjp19","3222");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM IMJP19.STUDENTDETAILS");
            
            rs.next();
            
            String index = rs.getString("ID");
            String name = rs.getString("NAME");
            String dept = rs.getString("DEPT");
            String sem = rs.getString("SEM");

            System.out.print(index + " "+name+" "+dept+" "+sem);
                    
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        
        }
    }
    
}
