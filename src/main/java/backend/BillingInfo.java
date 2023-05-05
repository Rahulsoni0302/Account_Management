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
    public static int getnewid ()/*this method will register new cust in cust_info db 
     
            to check for existing cust , use AddNewRecord.checkforexistingcust*/
    {
        int lastid=0,newid=0;
       
       
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
               
            } catch (SQLException ex) {
                Logger.getLogger(BillingInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            newid = lastid+1;
            
           /*String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            String sql = "insert into cust_info (id , name , mob_no) values (cust_id , cust_name, cust_mob);";            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
           conn.close();
            */

         return newid;
           
    }
    
   public static void setamountrecordsvalues()//this method should be called only after billing info is called ,and it will set the amount values
    {
        try //this method should be called only after billing info is called ,and it will set the amount values
        {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            
            CallableStatement sarv = conn.prepareCall("call set_amount_records_values (?,?,?,?,?)");
            
            sarv.setDate(1, );// transaction date
            sarv.setFloat(2, 0);//total amount
            sarv.setFloat(3, 0);//discount
            sarv.setFloat(4, 0);//received amount
            sarv.setFloat(5, 0);// due amount
        } catch (SQLException ex) {
            Logger.getLogger(BillingInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  
}
