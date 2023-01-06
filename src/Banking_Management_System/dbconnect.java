package Banking_Management_System;


import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author sreeram medarametla
 */
public class dbconnect {
    Connection conn = null;

    public static Connection connectDb(){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Sreeram@16");
            
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
}
