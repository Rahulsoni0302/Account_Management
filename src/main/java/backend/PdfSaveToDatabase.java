/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rahul
 */
public class PdfSaveToDatabase {
    
   /* public void getpdf(){
        try {
           
            String sql="";
            PreparedStatement st =conn.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(PdfSaveToDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    public void savepdftodb(String file,String date,String id){
        
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            
           CallableStatement ps = conn.prepareCall("call pdfsavetodb (?,?,?)");
            
            ps.setString(1, file);
            ps.setString(3, id);
            ps.setString(2, date);
            
            ps.execute();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PdfSaveToDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
  
   
}
