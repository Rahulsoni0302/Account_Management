/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    
    
    void billingHistory()//used to fetch the bills of the recent customers
    {
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            CallableStatement cbh= conn.prepareCall("call billing_history()");
            
            ResultSet rs= cbh.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustBills.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
   public static void main (String args[]) throws ClassNotFoundException{
       
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
               
              System.out.println("id = "+rs.getInt(1));
              System.out.println(rs.getDate(4)+ " date");
              System.out.println(rs.getString(2)+" name");
              System.out.println(rs.getString(3)+ " mob no");
          
            
           }
           
           conn.close();
          
       } catch (SQLException ex) {
           Logger.getLogger(SearchCustBills.class.getName()).log(Level.SEVERE, null, ex);
       }
            
            
         
       
    }
}
   
            
    

