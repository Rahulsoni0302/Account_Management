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
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rahul
 * 
 * pending work :- check for new or existing customer 
 *                cust id generation , bill copy save to db
 * 
 * 
 * this class contains methods : new customer registration 
 *                               set amount records values
 *                               billing info 
 */
public class BillingInfo {
    
    /**
     *
     * @return
     */
    public static int newcustregister ()/*this method will register new cust in cust_info db 
     
            to check for existing cust , use AddNewRecord.checkforexistingcust*/
    {
        int lastid=0,newid=0;
       
        try
        {
            try  {
                String dbURL = "jdbc:mysql://localhost:3306/app_dev";
                String user = "root";
                String password = "#@Rahul8269";
                Connection conn = null;
                
                conn = DriverManager.getConnection(dbURL, user, password);
                
                Statement st = conn.createStatement();
                String sql = "select id from cust_info order by id desc limit 1;";
                ResultSet rs = st.executeQuery(sql);
                
                while(rs.next()){
                    lastid = rs.getInt(1);
                    
                }
                
                conn.close();
                System.out.println(lastid);
            } catch (SQLException ex) {
                Logger.getLogger(BillingInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            newid = lastid+1;
            
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            String sql = "insert into cust_info (id , name , mob_no) values (cust_id , cust_name, cust_mob);";            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
           conn.close();
            

        } catch (SQLException ex) {
            Logger.getLogger(BillingInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return newid;
        
    }
    
   public static void setamountrecordsvalues()//this method should be called only after billing info is called ,and it will set the amount values
    {
         String dbURL = "jdbc:mysql://localhost:3306/app_dev";
           String user = "root";
           String password = "#@Rahul8269";
           Connection conn = null;
           
           conn = DriverManager.getConnection(dbURL, user, password);
           
         CallableStatement sarv = conn.prepareCall("call set_amount_records_values (?,?,?,?,?)");
         
         sarv.setDate(1, x);// transaction date
         sarv.setFloat(2, 0);//total amount 
         sarv.setFloat(3, 0);//discount
         sarv.setFloat(4, 0);//received amount 
         sarv.setFloat(5, 0);// due amount
    }
    
    public static void billinginfo(){
        
           String dbURL = "jdbc:mysql://localhost:3306/app_dev";
           String user = "root";
           String password = "#@Rahul8269";
           Connection conn = null;
           
           conn = DriverManager.getConnection(dbURL, user, password);
           
           LocalDateTime bd = LocalDateTime.now();
           
                    
            
                 CallableStatement cbi = conn.prepareCall("call billing_info (?,?,?,?,?,?,?)");
                 cbi.setInt(1, );//id
                 cbi.setDate(2, );//date
                 cbi.setString(3, str[i]);//dscription
                 cbi.setInt(4,);//quantity
                 cbi.setFloat(5, );//weight
                 cbi.setFloat(6, i);//rate
                 cbi.setFloat(7, i);//total
             
            
    
    }
}
