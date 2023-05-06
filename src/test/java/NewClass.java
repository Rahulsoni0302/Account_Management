
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
    
         String nwnm=null;
        String id="258";
        String name ="ra hul soni";
        
       String modname= name.replaceAll("\\s", "");
        
       
        String mob="9893475405";
        
       String custinfo = id+"   "+modname+"    "+mob;
    
      int idlen= custinfo.indexOf(32);
     String idn = custinfo.substring(0, idlen);
      System.out.println(idn);
      
      int nmstrt=idlen+3;
      int nmend=custinfo.indexOf(32, nmstrt);
      
     String nmn= custinfo.substring(nmstrt, nmend);
     System.out.println(nmn);
     
     int mobstrt=nmend+4;
     String mobn=custinfo.substring(mobstrt);
     System.out.println(mobn);
    
      
    
    
      
     
    
    }
}
