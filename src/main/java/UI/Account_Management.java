/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package UI;

import java.time.LocalDateTime;
import java.io.File;

/**
 *
 * @author Rahul
 */
public class Account_Management {

    public static void main(String[] args) {
            LocalDateTime bd = LocalDateTime.now(); // datetime method
            
             java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
            
        File file = new File("C:/Account_management/bills");
        boolean created = file.mkdirs();  
        System.out.println(created);
}
}