/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import backend.User;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


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
    public LoginFrame() throws HeadlessException{
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

        contacDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        doklbl = new javax.swing.JLabel();
        backgrndpanel = new javax.swing.JPanel();
        icon = new javax.swing.JPanel();
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

        contacDialog.setAlwaysOnTop(true);
        contacDialog.setMinimumSize(new java.awt.Dimension(380, 308));
        contacDialog.setUndecorated(true);
        contacDialog.setResizable(false);
        contacDialog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contacDialogKeyPressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setMaximumSize(new java.awt.Dimension(380, 308));
        jPanel3.setMinimumSize(new java.awt.Dimension(380, 308));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("please contact your vendor");

        doklbl.setBackground(new java.awt.Color(0, 153, 153));
        doklbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        doklbl.setForeground(new java.awt.Color(255, 255, 255));
        doklbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doklbl.setText("OK");
        doklbl.setOpaque(true);
        doklbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                doklblMouseMoved(evt);
            }
        });
        doklbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doklblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doklblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                doklblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(doklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(doklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contacDialogLayout = new javax.swing.GroupLayout(contacDialog.getContentPane());
        contacDialog.getContentPane().setLayout(contacDialogLayout);
        contacDialogLayout.setHorizontalGroup(
            contacDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contacDialogLayout.setVerticalGroup(
            contacDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgrndpanel.setBackground(new java.awt.Color(0, 153, 153));

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginlbl.setText("LOGIN");
        icon.add(loginlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 100, 20));

        usernamelbl.setText("Username");
        usernamelbl.setRequestFocusEnabled(false);
        icon.add(usernamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 68, -1));

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
        icon.add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 196, -1));

        passwordlbl.setText("Password");
        icon.add(passwordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 86, -1));

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
        icon.add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 196, -1));

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
        icon.add(submitlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 196, 26));

        forgotpasswordlbl.setForeground(new java.awt.Color(51, 153, 255));
        forgotpasswordlbl.setText("Forgot password ?");
        forgotpasswordlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotpasswordlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpasswordlblMouseClicked(evt);
            }
        });
        icon.add(forgotpasswordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 139, -1));

        newuserlbl.setForeground(new java.awt.Color(51, 153, 255));
        newuserlbl.setText("new user / edit");
        newuserlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newuserlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newuserlblMouseClicked(evt);
            }
        });
        icon.add(newuserlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 139, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        icon.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 221, 196, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 153));
        icon.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 196, 10));

        error.setForeground(new java.awt.Color(255, 0, 51));
        icon.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 20));

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
        icon.add(proceedforedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 116, 26));

        passwordlbl1.setText("Password");
        icon.add(passwordlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 86, -1));

        passwordtxt1.setBorder(null);
        passwordtxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordtxt1KeyPressed(evt);
            }
        });
        icon.add(passwordtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 200, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 153));
        icon.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 200, 10));

        javax.swing.GroupLayout backgrndpanelLayout = new javax.swing.GroupLayout(backgrndpanel);
        backgrndpanel.setLayout(backgrndpanelLayout);
        backgrndpanelLayout.setHorizontalGroup(
            backgrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrndpanelLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        backgrndpanelLayout.setVerticalGroup(
            backgrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrndpanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(backgrndpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 721, 538));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addAdmin() throws IOException {
        
        try {
            String name=null , pass=null;
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            conn = DriverManager.getConnection(dbURL, user, password);
            Statement st = conn.createStatement();
            String sql = "select name,u_password from user_registration ";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                name = rs.getString(1);
                pass = rs.getString(2);
               
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Account_management\\temp\\AdminUserData.txt"));
            writer.write(name + " " + pass);
            writer.newLine();
            writer.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
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
                passwordtxt1.requestFocus();
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
        if(evt.getKeyCode()==KeyEvent.VK_DOWN){
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
        
         if(evt.getKeyCode()==KeyEvent.VK_UP){
            usernametxt.requestFocus();
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

    private void forgotpasswordlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpasswordlblMouseClicked
        try {
            addAdmin();
            contacDialog.setLocationRelativeTo(null);
            contacDialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_forgotpasswordlblMouseClicked

    private void doklblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doklblMouseMoved
        doklbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_doklblMouseMoved

    private void doklblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doklblMouseClicked
        this.dispose();
        contacDialog.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_doklblMouseClicked

    private void doklblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doklblMouseExited
        doklbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_doklblMouseExited

    private void doklblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doklblMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_doklblMousePressed

    private void contacDialogKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contacDialogKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            dispose();
            contacDialog.dispose();
            new LoginFrame().setVisible(true);
        }
    }//GEN-LAST:event_contacDialogKeyPressed

 
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgrndpanel;
    private javax.swing.JDialog contacDialog;
    private javax.swing.JLabel doklbl;
    public javax.swing.JLabel error;
    private javax.swing.JLabel forgotpasswordlbl;
    private javax.swing.JPanel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
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
