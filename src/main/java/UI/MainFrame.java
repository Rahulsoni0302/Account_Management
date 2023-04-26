/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import java.awt.Component;
import java.awt.event.MouseEvent;
/**
 *
 * @author Abhishek
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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
        jTable1 = new javax.swing.JTable();
        dashboardpanel = new javax.swing.JPanel();
        welcomelbl = new javax.swing.JLabel();
        menuinfo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        homelbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        genbilllbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        billinghislbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        addreclbl = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        importreclbl = new javax.swing.JLabel();
        basepanel = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1676, 850));
        setMinimumSize(new java.awt.Dimension(1676, 850));
        setPreferredSize(new java.awt.Dimension(1676, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardpanel.setBackground(new java.awt.Color(0, 153, 153));
        dashboardpanel.setMaximumSize(new java.awt.Dimension(360, 346));
        dashboardpanel.setMinimumSize(new java.awt.Dimension(360, 346));
        dashboardpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomelbl.setForeground(new java.awt.Color(255, 255, 255));
        welcomelbl.setText("WELCOME......");
        dashboardpanel.add(welcomelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 116, -1));

        menuinfo.setText("SEARCH CUSTOMER");
        dashboardpanel.add(menuinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, 307, 65));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        homelbl.setBackground(new java.awt.Color(0, 153, 153));
        homelbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homelbl.setForeground(new java.awt.Color(255, 255, 255));
        homelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homelbl.setText("HOME");
        homelbl.setOpaque(true);
        homelbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                homelblMouseMoved(evt);
            }
        });
        homelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homelblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homelblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(homelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dashboardpanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 354, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        genbilllbl.setBackground(new java.awt.Color(0, 153, 153));
        genbilllbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genbilllbl.setForeground(new java.awt.Color(255, 255, 255));
        genbilllbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genbilllbl.setText("Generate Bill");
        genbilllbl.setOpaque(true);
        genbilllbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                genbilllblMouseMoved(evt);
            }
        });
        genbilllbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genbilllblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                genbilllblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genbilllbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(genbilllbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dashboardpanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 354, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        billinghislbl.setBackground(new java.awt.Color(0, 153, 153));
        billinghislbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        billinghislbl.setForeground(new java.awt.Color(255, 255, 255));
        billinghislbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billinghislbl.setText("Billing History");
        billinghislbl.setOpaque(true);
        billinghislbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                billinghislblMouseMoved(evt);
            }
        });
        billinghislbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                billinghislblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                billinghislblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billinghislbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(billinghislbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dashboardpanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 354, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        addreclbl.setBackground(new java.awt.Color(0, 153, 153));
        addreclbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addreclbl.setForeground(new java.awt.Color(255, 255, 255));
        addreclbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addreclbl.setText("Add New Record");
        addreclbl.setOpaque(true);
        addreclbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addreclblMouseMoved(evt);
            }
        });
        addreclbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addreclblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addreclblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addreclbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addreclbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dashboardpanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 354, -1));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        importreclbl.setBackground(new java.awt.Color(0, 153, 153));
        importreclbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        importreclbl.setForeground(new java.awt.Color(255, 255, 255));
        importreclbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        importreclbl.setText("Import Records");
        importreclbl.setOpaque(true);
        importreclbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                importreclblMouseMoved(evt);
            }
        });
        importreclbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                importreclblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                importreclblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(importreclbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(importreclbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dashboardpanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 354, -1));

        getContentPane().add(dashboardpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 369, 850));

        basepanel.setBackground(new java.awt.Color(255, 255, 255));
        basepanel.setMaximumSize(new java.awt.Dimension(1300, 850));
        basepanel.setMinimumSize(new java.awt.Dimension(1300, 850));
        basepanel.setPreferredSize(new java.awt.Dimension(1300, 850));
        basepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(basepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 1, 1300, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homelblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homelblMouseMoved
        homelbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_homelblMouseMoved

    private void homelblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homelblMouseExited
       homelbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_homelblMouseExited

    private void billinghislblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billinghislblMouseExited
        billinghislbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_billinghislblMouseExited

    private void billinghislblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billinghislblMouseMoved
        billinghislbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_billinghislblMouseMoved

    private void genbilllblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genbilllblMouseMoved
        genbilllbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_genbilllblMouseMoved

    private void genbilllblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genbilllblMouseExited
        genbilllbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_genbilllblMouseExited

    private void addreclblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addreclblMouseMoved
        addreclbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_addreclblMouseMoved

    private void addreclblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addreclblMouseExited
        addreclbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_addreclblMouseExited

    private void importreclblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importreclblMouseMoved
        importreclbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_importreclblMouseMoved

    private void importreclblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importreclblMouseExited
        importreclbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_importreclblMouseExited

    private void genbilllblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genbilllblMouseClicked
        GenerateBillInF inf = new GenerateBillInF();
        basepanel.removeAll();
        basepanel.add(inf).setVisible(true);
    }//GEN-LAST:event_genbilllblMouseClicked

    private void homelblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homelblMousePressed
        SearchInF sif = new SearchInF();
        basepanel.removeAll();
        basepanel.add(sif).setVisible(true);
    }//GEN-LAST:event_homelblMousePressed

    private void billinghislblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billinghislblMousePressed
        BillingHistoryInF bif = new BillingHistoryInF(); 
        basepanel.removeAll();
        basepanel.add(bif).setVisible(true);
    }//GEN-LAST:event_billinghislblMousePressed

    private void addreclblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addreclblMousePressed
        AddRecInF aif = new AddRecInF(); 
        basepanel.removeAll();
        basepanel.add(aif).setVisible(true);
    }//GEN-LAST:event_addreclblMousePressed

    private void importreclblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importreclblMousePressed
        ImportRecInF iif = new ImportRecInF(); 
        basepanel.removeAll();
        basepanel.add(iif).setVisible(true);
    }//GEN-LAST:event_importreclblMousePressed
void setpanel(Component com){
    basepanel.add(com).setVisible(true);
}
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
        SearchInF sif = new SearchInF();
        basepanel.removeAll();
        basepanel.add(sif).setVisible(true);
        
    };
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addreclbl;
    private static javax.swing.JPanel basepanel;
    private javax.swing.JLabel billinghislbl;
    private javax.swing.JPanel dashboardpanel;
    private javax.swing.JLabel genbilllbl;
    private javax.swing.JLabel homelbl;
    private javax.swing.JLabel importreclbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel menuinfo;
    private javax.swing.JLabel welcomelbl;
    // End of variables declaration//GEN-END:variables
}
