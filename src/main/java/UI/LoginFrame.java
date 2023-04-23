/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author Abhishek
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
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

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        backgrndpanel.setBackground(new java.awt.Color(0, 153, 153));

        foregrndpanel.setBackground(new java.awt.Color(255, 255, 255));

        loginlbl.setText("LOGIN");

        usernamelbl.setText("Username");
        usernamelbl.setRequestFocusEnabled(false);

        usernametxt.setBorder(null);
        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });

        passwordlbl.setText("Password");

        passwordtxt.setBorder(null);

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

        forgotpasswordlbl.setForeground(new java.awt.Color(51, 153, 255));
        forgotpasswordlbl.setText("Forgot password ?");

        newuserlbl.setForeground(new java.awt.Color(51, 153, 255));
        newuserlbl.setText("new user ? sign in");
        newuserlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newuserlblMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout foregrndpanelLayout = new javax.swing.GroupLayout(foregrndpanel);
        foregrndpanel.setLayout(foregrndpanelLayout);
        foregrndpanelLayout.setHorizontalGroup(
            foregrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foregrndpanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(foregrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foregrndpanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(loginlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(101, 101, 101))
                    .addGroup(foregrndpanelLayout.createSequentialGroup()
                        .addGroup(foregrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(foregrndpanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(foregrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(foregrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(newuserlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(submitlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(foregrndpanelLayout.createSequentialGroup()
                                            .addComponent(forgotpasswordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(57, 57, 57)))
                                    .addGroup(foregrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(usernametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                        .addComponent(passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordtxt)
                                        .addComponent(jSeparator1)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(20, 20, 20))))
        );
        foregrndpanelLayout.setVerticalGroup(
            foregrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foregrndpanelLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(loginlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(usernamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(passwordlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotpasswordlbl)
                .addGap(18, 18, 18)
                .addComponent(submitlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(newuserlbl)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout backgrndpanelLayout = new javax.swing.GroupLayout(backgrndpanel);
        backgrndpanel.setLayout(backgrndpanelLayout);
        backgrndpanelLayout.setHorizontalGroup(
            backgrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrndpanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(foregrndpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        backgrndpanelLayout.setVerticalGroup(
            backgrndpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrndpanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(foregrndpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrndpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrndpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxtActionPerformed

    private void submitlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitlblMouseClicked
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        dispose();
    }//GEN-LAST:event_submitlblMouseClicked

    private void submitlblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitlblMouseMoved
       submitlbl. setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_submitlblMouseMoved

    private void submitlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitlblMouseExited
        submitlbl.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_submitlblMouseExited

    private void newuserlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newuserlblMouseClicked
        RegistrationFrame rf = new RegistrationFrame();
        rf.setVisible(true);
        dispose();
    }//GEN-LAST:event_newuserlblMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgrndpanel;
    private javax.swing.JPanel foregrndpanel;
    private javax.swing.JLabel forgotpasswordlbl;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel loginlbl;
    private javax.swing.JLabel newuserlbl;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JLabel submitlbl;
    private javax.swing.JLabel usernamelbl;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
