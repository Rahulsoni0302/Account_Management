/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rahul
 * this class contains methods : check for existing customer or customer suggestions 
 *                               add records for both new as well as existing customer
 *                               
 *
 */

public class AddNewRecord {
    
    /**
     *this method will insert records for new customer as well as for existing customer 
     * depending upon the parameter value 
     */
    public static void newrecords(String usrid,String description,String amougiving , String date)//method for add new record frame
    {
        try {
           
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
          
            CallableStatement carc = conn.prepareCall("call add_records_cust(?,?,?,?,?)");
            
            carc.setString(1, usrid);
            carc.setString(2, description);
            carc.setString(3, null);
            carc.setString(4, amougiving);
            carc.setString(5,date );
            
            carc.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddNewRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
           
        
    }
    
    public static void registernewcust(String usrid,String usrnm,String usrmob){
        
        if(usrmob.isBlank()){
            usrmob=null;
        }
        
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            
            PreparedStatement st = conn.prepareStatement("insert into cust_info (id , name , mob_no) values (?,?,?);");
            
            st.setString(1, usrid);
            st.setString(2, usrnm);
            st.setString(3, usrmob);
            
             st.execute();
            conn.close();
           // System.out.println(result);
        } catch (SQLException ex) {
            Logger.getLogger(AddNewRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
}
