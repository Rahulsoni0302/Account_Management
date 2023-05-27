/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import backend.User;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class LoginFrame extends javax.swing.JFrame {
    
    public String usrnm ;
    public String pass;
    public String pass1;
    byte a; //for stating the login credential method

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        proceedforedit.setVisible(false);
        passwordlbl1.setVisible(false);
        passwordtxt1.setVisible(false);
        jSeparator3.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgrndpanel = new javax.swing.JPanel();
        foregrndpanel = new javax.swing.JPanel();
        loginlbl = new javax.swing.JLabel();
        usernamelbl = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        passwordlbl = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JPasswordField();
        submitlbl = new javax.swing.JLabel();
        forgotpasswordlbl = new javax.swing.JLabel();
        newuserlbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        error = new javax.swing.JLabel();
        proceedforedit = new javax.swing.JLabel();
        passwordlbl1 = new javax.swing.JLabel();
        passwordtxt1 = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgrndpanel.setBackground(new java.awt.Color(0, 153, 153));

        foregrndpanel.setBackground(new java.awt.Color(255, 255, 255));
        foregrndpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginlbl.setText("LOGIN");
        foregrndpanel.add(loginlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, 20));

        usernamelbl.setText("Username");
        usernamelbl.setRequestFocusEnabled(false);
        foregrndpanel.add(usernamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 68, -1));

        usernametxt.setBorder(null);
        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });
        usernametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernametxtKeyPressed(evt);
            }
        });
        foregrndpanel.add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 196, -1));

        passwordlbl.setText("Password");
        foregrndpanel.add(passwordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 86, -1));

        passwordtxt.setBorder(null);
        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });
        passwordtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordtxtKeyPressed(evt);
            }
        });
        foregrndpanel.add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 196, -1));

        submitlbl.setBackground(new java.awt.Color(0, 153, 153));
        submitlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submitlbl.setForeground(new java.awt.Color(255, 255, 255));
        submitlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submitlbl.setText("SUBMIT");
        submitlbl.setOpaque(true);
        submitlbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                submitlblMouseMoved(evt);
            }
        });
        submitlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitlblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitlblMouseExited(evt);
            }
        });
        foregrndpanel.add(submitlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 196, 26));

        forgotpasswordlbl.setForeground(new java.awt.Color(51, 153, 255));
        forgotpasswordlbl.setText("Forgot password ?");
        forgotpasswordlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        foregrndpanel.add(forgotpasswordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 139, -1));

        newuserlbl.setForeground(new java.awt.Color(51, 153, 255));
        newuserlbl.setText("new user / edit");
        newuserlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newuserlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newuserlblMouseClicked(evt);
            }
        });
        foregrndpanel.add(newuserlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 139, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        foregrndpanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 221, 196, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 153));
        foregrndpanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 196, 10));

        error.setForeground(new java.awt.Color(255, 0, 51));
        foregrndpanel.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 20));

        proceedforedit.setBackground(new java.awt.Color(0, 153, 153));
        proceedforedit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        proceedforedit.setForeground(new java.awt.Color(255, 255, 255));
        proceedforedit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceedforedit.setText("PROCEED");
        proceedforedit.setOpaque(true);
        proceedforedit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                proceedforeditMouseMoved(evt);
            }
        });
        proceedforedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceedforeditMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proceedforeditMouseExited(evt);
            }
        });
        foregrndpanel.add(proceedforedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 116, 26));

        passwordlbl1.setText("Password");
        foregrndpanel.add(passwordlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 86, -1));

        passwordtxt1.setBorder(null);
        passwordtxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordtxt1KeyPressed(evt);
            }
        });
        foregrndpanel.add(passwordtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 200, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 153));
        foregrndpanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 200, 10));

        javax.swing.GroupLayout backgrndpanelLayout = new javax.swing.GroupLayout(backgrndpanel);
        backgrndpanel.setLayout(backgrndpanelLayout);
        backgrndpanelLayout.setHorizontalGroup(
            backgrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrndpanelLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(foregrndpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        backgrndpanelLayout.setVerticalGroup(
            backgrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrndpanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(foregrndpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(backgrndpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 721, 538));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernametxtActionPerformed

    private void submitlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitlblMouseClicked
      
      usrnm = usernametxt.getText();
       pass =  passwordtxt.getText();
       a=2;
       
       User lc = new User();
       boolean result = lc.getlogincredentials(usrnm,pass,a);
       
       if(result == true){
                   this.dispose();
                   MainFrame mf = new MainFrame();
                   mf.setVisible(true);
       }
       else{
                
               error.setText("invalid username or password !");
            }
        
    }//GEN-LAST:event_submitlblMouseClicked

    private void submitlblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitlblMouseMoved
       submitlbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_submitlblMouseMoved

    private void submitlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitlblMouseExited
        submitlbl.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_submitlblMouseExited

    private void newuserlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newuserlblMouseClicked
        passwordtxt1.requestFocus();
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            String sql = "select * from user_registration";
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()){
                proceedforedit.setVisible(true);
                passwordlbl1.setVisible(true);
                passwordtxt1.setVisible(true);
                jSeparator3.setVisible(true);
            }
            else{
                 RegistrationFrame rf = new RegistrationFrame();
                 rf.setVisible(true);
                 dispose();
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_newuserlblMouseClicked

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_passwordtxtActionPerformed

    private void proceedforeditMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceedforeditMouseMoved
        // TODO add your handling code here:
        proceedforedit.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_proceedforeditMouseMoved

    private void proceedforeditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceedforeditMouseClicked
        // TODO add your handling code here:
        
        pass1 = passwordtxt1.getText();
        a=1;
        User lc = new User();
        boolean result = lc.getlogincredentials(null, pass1,a);
        
        if(result == true){
            this.dispose();
             new RegistrationFrame(1).setVisible(true);
        }
        else{
            error.setText("Invalid Password !");
        }
    }//GEN-LAST:event_proceedforeditMouseClicked

    private void proceedforeditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceedforeditMouseExited
        proceedforedit.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_proceedforeditMouseExited

    private void usernametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernametxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            passwordtxt.requestFocus();
        }
    }//GEN-LAST:event_usernametxtKeyPressed

    private void passwordtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordtxtKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            usrnm = usernametxt.getText();
            pass =  passwordtxt.getText();
            a=2;

            User lc = new User();
            boolean result = lc.getlogincredentials(usrnm,pass,a);

            if(result == true){
                        this.dispose();
                        MainFrame mf = new MainFrame();
                        mf.setVisible(true);
            }
            else{

                    error.setText("invalid username or password !");
                 }
        }
    }//GEN-LAST:event_passwordtxtKeyPressed

    private void passwordtxt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordtxt1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                    pass1 = passwordtxt1.getText();
        a=1;
        User lc = new User();
        boolean result = lc.getlogincredentials(null, pass1,a);
        
        if(result == true){
            this.dispose();
             new RegistrationFrame(1).setVisible(true);
        }
        else{
            error.setText("Invalid Password !");
        }
        }
    }//GEN-LAST:event_passwordtxt1KeyPressed

 
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgrndpanel;
    public javax.swing.JLabel error;
    private javax.swing.JPanel foregrndpanel;
    private javax.swing.JLabel forgotpasswordlbl;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel loginlbl;
    private javax.swing.JLabel newuserlbl;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel passwordlbl1;
    public javax.swing.JPasswordField passwordtxt;
    public javax.swing.JPasswordField passwordtxt1;
    private javax.swing.JLabel proceedforedit;
    private javax.swing.JLabel submitlbl;
    private javax.swing.JLabel usernamelbl;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
