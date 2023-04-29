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
public class SearchInF extends javax.swing.JInternalFrame {

    /**
     * Creates new form SearchPanel
     */
    public SearchInF() {
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
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        customeracctbl = new javax.swing.JTable();
        customernamelbl = new javax.swing.JLabel();
        searchcustomertxt = new javax.swing.JTextField();
        editbtn = new javax.swing.JButton();
        editrecordpnl = new javax.swing.JPanel();
        searchlbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setMaximumSize(new java.awt.Dimension(1300, 800));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1300, 800));

        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 800));

        jScrollBar1.setBackground(new java.awt.Color(0, 153, 153));

        customeracctbl.setForeground(new java.awt.Color(255, 255, 255));
        customeracctbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customeracctbl.setColumnSelectionAllowed(true);
        customeracctbl.setGridColor(new java.awt.Color(0, 153, 153));
        jScrollPane1.setViewportView(customeracctbl);

        customernamelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customernamelbl.setText("Enter the customer name:");

        searchcustomertxt.setBorder(null);

        editbtn.setText("edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        editrecordpnl.setBackground(new java.awt.Color(204, 204, 204));
        editrecordpnl.setMaximumSize(new java.awt.Dimension(1920, 1080));
        editrecordpnl.setMinimumSize(new java.awt.Dimension(732, 259));

        javax.swing.GroupLayout editrecordpnlLayout = new javax.swing.GroupLayout(editrecordpnl);
        editrecordpnl.setLayout(editrecordpnlLayout);
        editrecordpnlLayout.setHorizontalGroup(
            editrecordpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        editrecordpnlLayout.setVerticalGroup(
            editrecordpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        searchlbl.setBackground(new java.awt.Color(0, 153, 153));
        searchlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchlbl.setForeground(new java.awt.Color(255, 255, 255));
        searchlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchlbl.setText("SEARCH");
        searchlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchlbl.setOpaque(true);
        searchlbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                searchlblMouseMoved(evt);
            }
        });
        searchlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchlblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchlblMouseExited(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchcustomertxt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(customernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(searchlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(editrecordpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(customernamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchcustomertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(searchlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(editrecordpnl, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editbtn)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1312, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed

    }//GEN-LAST:event_editbtnActionPerformed

    private void searchlblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchlblMouseMoved
        searchlbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_searchlblMouseMoved

    private void searchlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchlblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchlblMouseClicked

    private void searchlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchlblMouseExited
        searchlbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_searchlblMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customeracctbl;
    private javax.swing.JLabel customernamelbl;
    private javax.swing.JButton editbtn;
    private javax.swing.JPanel editrecordpnl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField searchcustomertxt;
    private javax.swing.JLabel searchlbl;
    // End of variables declaration//GEN-END:variables
}
