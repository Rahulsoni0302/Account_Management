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
    
   
 
    public static void addrecord(String description , float amou_due,String amou_rec,String date , String id){
        
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            CallableStatement cscr = conn.prepareCall("{call add_records_cust(?,?,?,?,?)}");
            
            cscr.setString(1, id);
            cscr.setString(2, description);
            cscr.setString(3, amou_rec);
            cscr.setFloat(4, amou_due);
            cscr.setString(5, date);
            
            cscr.execute();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustomerRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public String[] returncustinfo(String custinfo){
        
        int idlen= custinfo.indexOf(32);
        String idn = custinfo.substring(0, idlen);
       System.out.println(idn);
      
        int nmstrt=idlen+4;
        int nmend=custinfo.indexOf(32, nmstrt);

        String nmn= custinfo.substring(nmstrt, nmend);
        System.out.println(nmn);

//        String mobn = " ";
        int mobstrt=nmend+4;
        String mobn=custinfo.substring(mobstrt);
        System.out.println(mobn);
        
        String ci[]={idn,nmn,mobn};
        
        return  ci;
    }
}
