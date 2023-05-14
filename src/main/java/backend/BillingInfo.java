/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    public static int getnewid ()
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
           
         return newid;
           
    }
    
   public static void setamountrecordsvalues(String id , String trxndate,float ttlamou ,float amoudue , float amourec , String descrptn)
    {
        try 
        {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            
            CallableStatement sarv = conn.prepareCall("call set_amount_records_values (?,?,?,?,?,?)");
            
            sarv.setString(1,id );// id
            sarv.setString(2, trxndate);//trnx date
            sarv.setFloat(3, ttlamou);//total amount
            sarv.setFloat(4, amoudue);//received amount
            sarv.setFloat(5, amourec);// due amount
            sarv.setString(6, descrptn);
            
            sarv.execute();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BillingInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   public static void setdatetobill(String id , String date){
       
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            
            PreparedStatement st = conn.prepareStatement("insert into bills (id , date) values (? , ?); ");
            
            st.setString(1, id);
            st.setString(2, date);
            
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BillingInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
       
   }
    
  
}
