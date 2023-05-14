
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import UI.RegistrationFrame;
import backend.User;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rahul
 */
public class tester {
    
    String due=null;
    private String fetchlastamountdue(String id ){
        
        String due=null;
         
        try {
            
            
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            conn = DriverManager.getConnection(dbURL, user, password);
            
            String sql ="select amount_due from amount_records where id=? order by trnx_date desc;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "7");
            
            ResultSet rs = ps.executeQuery();
            
            
            if(rs.next()){
                due =rs.getString(1);
            }
           
           /*while (rs.next()){
                due =rs.getString(1);
                 System.out.println(due);
           }*/
        } catch (SQLException ex) {
            Logger.getLogger(tester.class.getName()).log(Level.SEVERE, null, ex);
        
        }    
         return due ;
    

 
 
}
    
public static void main (String args[]){
      
        tester test = new tester();
        
        String due= test.fetchlastamountdue("7");
        
       System.out.println(due);
    }


}