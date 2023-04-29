/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Abhishek
 */
public class AddRecInF extends javax.swing.JInternalFrame {

    /**
     * Creates new form BillingHistoryInF
     */
    public AddRecInF() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headinglbl = new javax.swing.JLabel();
        customernamelbl = new javax.swing.JLabel();
        customernametxt = new javax.swing.JTextField();
        amountgivenlbl = new javax.swing.JLabel();
        amountgiventxt = new javax.swing.JTextField();
        mobilenumberlbl = new javax.swing.JLabel();
        mobilenumbertxt = new javax.swing.JTextField();
        decriptionlbl = new javax.swing.JLabel();
        descriptiontxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        savelbl = new javax.swing.JLabel();
        registrationshowlbl = new javax.swing.JLabel();
        registrationlbl = new javax.swing.JLabel();
        registrationlbl1 = new javax.swing.JLabel();
        customernametxt1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1300, 850));
        setMinimumSize(new java.awt.Dimension(1300, 850));
        setPreferredSize(new java.awt.Dimension(1300, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 850));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 850));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 850));

        headinglbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        headinglbl.setText("Add New Record");

        customernamelbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customernamelbl.setText("Customer Name : ");

        customernametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        customernametxt.setBorder(null);
        customernametxt.setMaximumSize(new java.awt.Dimension(64, 25));
        customernametxt.setName(""); // NOI18N
        customernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customernametxtActionPerformed(evt);
            }
        });

        amountgivenlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amountgivenlbl.setText("Amount given : ");

        amountgiventxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        amountgiventxt.setBorder(null);
        amountgiventxt.setMaximumSize(new java.awt.Dimension(64, 25));

        mobilenumberlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mobilenumberlbl.setText("Mobile number :");

        mobilenumbertxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mobilenumbertxt.setBorder(null);

        decriptionlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        decriptionlbl.setText("Description : ");

        descriptiontxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descriptiontxt.setBorder(null);
        descriptiontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptiontxtActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator1.setOpaque(true);

        jSeparator2.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator2.setOpaque(true);

        jSeparator3.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator3.setOpaque(true);

        jSeparator4.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator4.setOpaque(true);

        savelbl.setBackground(new java.awt.Color(0, 153, 153));
        savelbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        savelbl.setForeground(new java.awt.Color(255, 255, 255));
        savelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savelbl.setText("SAVE");
        savelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savelbl.setOpaque(true);
        savelbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                savelblMouseMoved(evt);
            }
        });
        savelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savelblMouseExited(evt);
            }
        });

        registrationshowlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registrationshowlbl.setText("0000001");

        registrationlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registrationlbl.setText("Registration id : ");

        registrationlbl1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registrationlbl1.setText("DATE :");

        customernametxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        customernametxt1.setBorder(null);
        customernametxt1.setMaximumSize(new java.awt.Dimension(64, 25));
        customernametxt1.setName(""); // NOI18N
        customernametxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customernametxt1ActionPerformed(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator5.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator5.setOpaque(true);

        jLabel1.setText("(optional)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(registrationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(registrationshowlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registrationlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(customernametxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(headinglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(amountgivenlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(amountgiventxt, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(mobilenumberlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mobilenumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(decriptionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(descriptiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(savelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(customernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(customernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))))
                .addContainerGap(379, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(headinglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(registrationshowlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registrationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registrationlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(customernametxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountgivenlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountgiventxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobilenumberlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobilenumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decriptionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(savelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customernametxtActionPerformed

    private void descriptiontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptiontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptiontxtActionPerformed

    private void savelblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savelblMouseMoved
        savelbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_savelblMouseMoved

    private void savelblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savelblMouseExited
        savelbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_savelblMouseExited

    private void customernametxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customernametxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customernametxt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountgivenlbl;
    private javax.swing.JTextField amountgiventxt;
    private javax.swing.JLabel customernamelbl;
    private javax.swing.JTextField customernametxt;
    private javax.swing.JTextField customernametxt1;
    private javax.swing.JLabel decriptionlbl;
    private javax.swing.JTextField descriptiontxt;
    private javax.swing.JLabel headinglbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel mobilenumberlbl;
    private javax.swing.JTextField mobilenumbertxt;
    private javax.swing.JLabel registrationlbl;
    private javax.swing.JLabel registrationlbl1;
    private javax.swing.JLabel registrationshowlbl;
    private javax.swing.JLabel savelbl;
    // End of variables declaration//GEN-END:variables
}
