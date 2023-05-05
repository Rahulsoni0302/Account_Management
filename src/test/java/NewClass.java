
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rahul
 */
public class NewClass {
    
    public static void main (String args[]){
    
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            
            Connection conn;
            conn = DriverManager.getConnection(dbURL, user, password);
            
            Statement st = conn.createStatement();
            String sql = "SELECT name FROM app_dev.cust_info";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                
               String str;
                str = rs.getString(1);
                
                System.out.println(str);

                
                
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    
    
    }
}
