/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

/**
 *
 * @author Rahul
 */
public class PdfSaveToDatabase {
    
    public void getpdf(){
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            
            String sql="";
            PreparedStatement st =conn.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(PdfSaveToDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        File file = new File("C:/Account_management/bills");
        boolean created = file.mkdirs();
        System.out.println(file.getAbsolutePath()+" "+created);
    }
   
}
