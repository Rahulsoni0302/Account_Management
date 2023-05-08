/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

//import javax.swing.DefaultListModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Abhishek
 */
public class Suggestion{
   
    private javax.swing.JList<String> list;
    DefaultListModel model;
    public Suggestion(javax.swing.JList<String> listp , DefaultListModel modelp){
        list = listp;
        model = modelp;
    }
    
    private Connection databaseConnection(){
            Connection conn ;    
        try{
           String dbURL = "jdbc:mysql://localhost:3306/app_dev";
           String user = "root";
           String password = "#@Rahul8269";
           conn = DriverManager.getConnection(dbURL, user, password);
                    return conn;
        }catch (SQLException ex) {
            System.out.print(ex);
        }
        return null;
    }
    ArrayList arlist = new ArrayList();
    public ArrayList aList(){
        try {
            Connection conn = databaseConnection();
            String all;
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM app_dev.cust_info";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String nm = rs.getString("name");
                String name= nm.replaceAll("\\s", "");
                String id = rs.getString(1);
                String mobno = rs.getString(3);
                //if(mobno.isEmpty()|| mobno.is){
                    String str= id+"    "+name+"    "+mobno;
                    all=str;
                
                /*else{
                    String str= id+"    "+nm+"      "+mobno;
                    all=str;
                }*/
                // str = rs.getString(1);
                arlist.add(all);
                model.addElement(all);
                //System.out.println(all);
                
            }
            return arlist;
        } catch (SQLException ex) {
            Logger.getLogger(Suggestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
        public void bindData(){
        aList().stream().forEach((arlist)->{
            model.addElement(arlist);
        } );
        list.setModel(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    
    public void searchFilter(String search){
        DefaultListModel filteredsearch = new DefaultListModel();
        ArrayList flist = aList();
        flist.stream().forEach((arlist)->{
            String listitem =arlist.toString().toLowerCase();
            if(listitem.contains(search.toLowerCase())){
                filteredsearch.addElement(arlist);
            }
        });
        model=filteredsearch ;
        list.setModel(model);
        arlist.removeAll(arlist); 
    }
   
}
