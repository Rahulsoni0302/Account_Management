/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import UI.BillingHistoryInF;


/**
 *
 * @author Rahul
 * 
 * perfectly running code , only needs to add some logic and jtable
 * 
 * this class contains methods : billing history 
 *                               search customer bills
 */
public class SearchCustBills{
    
    
   
    
    void searchcustbills()/* or billing history for custom customer */{
        
        
        try {
           String dbURL = "jdbc:mysql://localhost:3306/app_dev";
           String user = "root";
           String password = "#@Rahul8269";
           Connection conn = null;
           
           conn = DriverManager.getConnection(dbURL, user, password);
           CallableStatement cscb = conn.prepareCall("{call search_customer_bills(?,?,?,?)}");
           
           cscb.setInt(1, 1);
           cscb.setDate(4, null);
           cscb.setString(2, null);
           cscb.setString(3, null);
           
           ResultSet rs = cscb.executeQuery();
           
           while(rs.next()){
               
              
          
            
           }
           
           conn.close();
          
       } catch (SQLException ex) {
           Logger.getLogger(SearchCustBills.class.getName()).log(Level.SEVERE, null, ex);
       }
            
            
    }
    
    void billinghistorycustomdates(){
        
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            CallableStatement cbhcd = conn.prepareCall("call billing_history_custom_dates(?,?)");
            
           // cbhcd.setDate(1, x);
            //cbhcd.setDate(2, x);
            
            ResultSet rs = cbhcd.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustBills.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }
}
   
            
    

