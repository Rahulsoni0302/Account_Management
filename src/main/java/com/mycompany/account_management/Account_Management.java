/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.account_management;

import UI.LoginFrame;
import java.time.LocalDateTime;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import backend.*;
import java.io.File;
import ui.*;
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