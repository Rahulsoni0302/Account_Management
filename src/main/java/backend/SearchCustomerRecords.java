/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rahul
 * 
 * this class will search for the existing records of the customer
 */
public class SearchCustomerRecords {
    
    public static ResultSet getcustrecords (){
        
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            CallableStatement cscr = conn.prepareCall("{call search_customer_records(?,?,?,?)}");
            
            cscr.setInt(1, 1);
            cscr.setString(2, null);
            cscr.setString(3, null);
            cscr.setDate(4, null);
            
            ResultSet rs = cscr.executeQuery();
             conn.close();
            
            return rs;
           /*while(rs.next()){
                
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getInt(3));
                System.out.println(rs.getDate(4));
            }*/
            
           
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustomerRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           
           
    }
 
    public static boolean addrecord(){
        
        String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            CallableStatement cscr = conn.prepareCall("{call search_customer_records(?,?,?,?)}");
    }
}
