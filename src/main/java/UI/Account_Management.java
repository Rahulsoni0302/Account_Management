/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package UI;


import java.io.File;

/**
 *
 * @author Rahul
 */
public class Account_Management {

    public static void main(String[] args) {
            
             java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
            
        File file = new File("C:/Account_management/bills");
        File filet = new File("C:/Account_management/temp");
        boolean created = file.mkdirs();
         boolean created1 = filet.mkdirs();
      
}
}