/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import UI.LoginFrame;
import UI.MainFrame;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rahul
 * 
 * this class contains following methods : getlogincredentials 
 */
public class User {
    
        
        
    
    /**
     *this method will get login credentials , needed at the time of login 
     * @param a username
     * @param b password
     * @return 
     */
    
    String name = null;
   
   public  boolean getlogincredentials(String a , String b ){
        
        
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            String sql = "select name , u_password from user_registration where name = ? and u_password = ? ;";
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, a);
            st.setString(2, b);
            
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                
                name = rs.getNString(1);
            }
            
            conn.close();
           
            
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(name == null){
            return false;
        }
         else
          return true;
        }
    
    
    
    
    public void userregistration (){
        
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            
            CallableStatement cr = conn.prepareCall("call registration(?,?,?,?,?,?,?,?)");
            
            cr.setString(1, user);
            cr.setString(2, user);
            cr.setString(3, user);
            cr.setString(4, user);
            cr.setString(5, user);
            cr.setString(6, user);
            cr.setString(7, user);
            cr.setString(8, user);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }
    
    public void editregistration(){
        
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            
            CallableStatement cr = conn.prepareCall("call edit_registration_details(?,?,?,?,?,?,?,?)");
            
            cr.setString(1, user);
            cr.setString(2, user);
            cr.setString(3, user);
            cr.setString(4, user);
            cr.setString(5, user);
            cr.setString(6, user);
            cr.setString(7, user);
            cr.setString(8, user);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
