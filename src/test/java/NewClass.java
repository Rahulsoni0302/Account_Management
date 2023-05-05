
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
    
       String custinfo ="562    rahulsoni   9893475405";
    
      int index= custinfo.indexOf(32, 7);
      System.out.println(index);
      
      String mob=custinfo.substring(4);
       System.out.println(mob);
    
    
    }
}
