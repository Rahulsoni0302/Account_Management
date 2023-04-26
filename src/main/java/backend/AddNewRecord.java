/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import static backend.BillingInfo.newcustregister;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public void checkforexistingcust(){
        
         String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            
            CallableStatement ccs = conn.prepareCall("call cust_suggetions(?,?,?)");
            ccs.setInt(1, 0);
            ccs.setString(2, user);
            ccs.setString(3, user);
    }
    
    /**
     *this method will insert records for new customer as well as for existing customer 
     * depending upon the parameter value 
     */
    public static void newrecords(int a)
    {
            int newid=0;
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            
            if(a==1){
                
                    newid = newcustregister ();
                   
            }
            
            CallableStatement carc = conn.prepareCall("call add_record_cust(?,?,?,?)");
            
            carc.setInt(1, newid);
            carc.setString(2, user);
            carc.setFloat(3, a);
            carc.setDate(4, );
            
            
           
        
    }
    
   
}
