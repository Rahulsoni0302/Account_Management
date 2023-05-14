/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import backend.SearchCustomerRecords;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.plaf.basic.BasicPopupMenuUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class SearchInF extends javax.swing.JInternalFrame {

    /**
     * Creates new form SearchPanel
     */
    DefaultListModel model = new DefaultListModel();
    public SearchInF() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        menu.add(jPanel2);
        menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicPopupMenuUI mui;
        mui = (BasicPopupMenuUI)menu.getUI();
        
        editrecordpnl.setVisible(false);
    }
    String custinfo=null, amouduelast=null,id=null;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        menu = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        successdialog = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customeracctbl = new javax.swing.JTable();
        customernamelbl = new javax.swing.JLabel();
        searchcustomertxt = new javax.swing.JTextField();
        editrecordpnl = new javax.swing.JPanel();
        receivedlbl = new javax.swing.JLabel();
        givenlbl = new javax.swing.JLabel();
        receivedtxt = new javax.swing.JTextField();
        giventxt = new javax.swing.JTextField();
        datelbl = new javax.swing.JLabel();
        dateshowtxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        savelbl = new javax.swing.JLabel();
        descrptn = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        descriptiontxt = new javax.swing.JTextField();
        errorlbl = new javax.swing.JLabel();
        searchlbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        editlbl = new javax.swing.JLabel();
        duelbl = new javax.swing.JLabel();
        dueshowlbl = new javax.swing.JLabel();

        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        successdialog.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        successdialog.setForeground(new java.awt.Color(0, 153, 153));
        successdialog.setText("Details Saved Sucessfully ");

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    OK");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(successdialog)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(successdialog, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setMaximumSize(new java.awt.Dimension(1300, 800));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1300, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 800));

        customeracctbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "MOB.NO.", "ID", "TRANS. DATE", "BILLING DATE", "TOTAL AMOUNT", "AMOUNT RECEIEVED", "AMOUNT DUE", "DESCRIPTION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customeracctbl.setColumnSelectionAllowed(true);
        customeracctbl.setGridColor(new java.awt.Color(0, 153, 153));
        customeracctbl.setRowHeight(30);
        jScrollPane1.setViewportView(customeracctbl);
        customeracctbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        customernamelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customernamelbl.setText("Enter the customer name:");

        searchcustomertxt.setBorder(null);
        searchcustomertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchcustomertxtKeyReleased(evt);
            }
        });

        editrecordpnl.setBackground(new java.awt.Color(255, 255, 255));
        editrecordpnl.setMaximumSize(new java.awt.Dimension(1920, 1080));
        editrecordpnl.setMinimumSize(new java.awt.Dimension(732, 259));
        editrecordpnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receivedlbl.setText("Amount Received : ");
        editrecordpnl.add(receivedlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, 110, 49));

        givenlbl.setText("Amount Given : ");
        editrecordpnl.add(givenlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 110, 49));

        receivedtxt.setBorder(null);
        editrecordpnl.add(receivedtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 72, 266, -1));

        giventxt.setBorder(null);
        editrecordpnl.add(giventxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 266, -1));

        datelbl.setText("Date : ");
        editrecordpnl.add(datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 40));

        dateshowtxt.setBorder(null);
        editrecordpnl.add(dateshowtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 154, 24));

        jSeparator2.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator2.setOpaque(true);
        editrecordpnl.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 270, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator3.setOpaque(true);
        editrecordpnl.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 270, -1));

        savelbl.setBackground(new java.awt.Color(0, 153, 153));
        savelbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savelblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savelblMouseExited(evt);
            }
        });
        editrecordpnl.add(savelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 146, 29));

        descrptn.setText("Description : ");
        editrecordpnl.add(descrptn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 110, 49));

        jSeparator4.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator4.setOpaque(true);
        editrecordpnl.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 203, 270, -1));

        descriptiontxt.setBorder(null);
        editrecordpnl.add(descriptiontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 266, -1));

        errorlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        errorlbl.setForeground(new java.awt.Color(255, 0, 0));
        editrecordpnl.add(errorlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 260, 30));

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

        editlbl.setBackground(new java.awt.Color(0, 153, 153));
        editlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editlbl.setForeground(new java.awt.Color(255, 255, 255));
        editlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editlbl.setText("Edit ");
        editlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editlbl.setOpaque(true);
        editlbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                editlblMouseMoved(evt);
            }
        });
        editlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editlblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editlblMouseExited(evt);
            }
        });

        duelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        duelbl.setForeground(new java.awt.Color(255, 0, 51));
        duelbl.setText("Amount due :");

        dueshowlbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dueshowlbl.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(editlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(382, 382, 382)
                                .addComponent(duelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dueshowlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchcustomertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(277, 277, 277)
                                    .addComponent(customernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(editrecordpnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(customernamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchcustomertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dueshowlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editrecordpnl, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchlblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchlblMouseMoved
        searchlbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_searchlblMouseMoved

    private void searchlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchlblMouseClicked
       
         custinfo = searchcustomertxt.getText();
         
        SearchCustomerRecords ci = new SearchCustomerRecords();
        
       String []indci = ci.returncustinfo(custinfo);
       
       String id=indci[0];
       String name=indci[1];
       String mobno=indci[2];
       
       search(id,name,mobno);
   
    }//GEN-LAST:event_searchlblMouseClicked

    private void searchlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchlblMouseExited
        searchlbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_searchlblMouseExited

    private void editlblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editlblMouseMoved
        editlbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_editlblMouseMoved

    private void editlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editlblMouseClicked
        // TODO add your handling code here:
       // jPanel1.add(editrecordpnl);
          editrecordpnl.setVisible(true);
    }//GEN-LAST:event_editlblMouseClicked

    private void editlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editlblMouseExited
        editlbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_editlblMouseExited

    private void savelblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savelblMouseMoved
        savelbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_savelblMouseMoved

    private void savelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savelblMouseClicked
        // TODO add your handling code here:
        
        LocalDateTime bd = LocalDateTime.now();
          String date=bd.toString();  
          
          
        String amourec=receivedtxt.getText();
        String amougiven = giventxt.getText();
        String descrptn=descriptiontxt.getText();
        
        if(amourec.isBlank() && amougiven.isBlank()){
            errorlbl.setText("both fields can't be empty !");
        }
        else if ((amourec.isBlank() && amougiven.isBlank())==true){
         errorlbl.setText("both fields can't be filled  !");
        }
        else{
            if(amourec.isBlank()){
               float amougvn = Float.valueOf(amougiven);
              float amoudue = Float.valueOf(amouduelast);
              
               System.out.println(amoudue);
              
              
              amourec = null;
               
               float updtamoudue= amougvn + amoudue;
               
               System.out.println(updtamoudue);
               
               SearchCustomerRecords.addrecord(descrptn, updtamoudue,amourec , date, id);
               jDialog1.setVisible(true);
            }
            else{
                float amourecvd=Float.valueOf(amourec);
                float amoudue = Float.valueOf(amouduelast);
                 float updtamoudue= amoudue - amourecvd;
                 
                  SearchCustomerRecords.addrecord(descrptn, updtamoudue,amourec , date, id);
                  jDialog1.setVisible(true);
                  
            }
        }
    }//GEN-LAST:event_savelblMouseClicked

    private void savelblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savelblMouseExited
        savelbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_savelblMouseExited

    private void searchcustomertxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchcustomertxtKeyReleased
        String search  = searchcustomertxt.getText().trim();
        Suggestion suggestion = new Suggestion(list,model);
        if(!search.equals("")){
            menu.show(searchcustomertxt,0,searchcustomertxt.getHeight()+12);
            searchcustomertxt.requestFocus();
            suggestion.searchFilter(searchcustomertxt.getText());
        }        
    }//GEN-LAST:event_searchcustomertxtKeyReleased

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        String custinfo = list.getSelectedValue();
        
        SearchCustomerRecords ci = new SearchCustomerRecords();
        
       String []indci = ci.returncustinfo(custinfo);
       
        id=indci[0];
       String name=indci[1];
       String mobno=indci[2];
       
       searchcustomertxt.setText(name);
       
      
       
       
       search(id,name,mobno);
       
        
    }//GEN-LAST:event_listMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jDialog1.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customeracctbl;
    private javax.swing.JLabel customernamelbl;
    private javax.swing.JLabel datelbl;
    private javax.swing.JTextField dateshowtxt;
    private javax.swing.JTextField descriptiontxt;
    private javax.swing.JLabel descrptn;
    private javax.swing.JLabel duelbl;
    private javax.swing.JLabel dueshowlbl;
    private javax.swing.JLabel editlbl;
    private javax.swing.JPanel editrecordpnl;
    private javax.swing.JLabel errorlbl;
    private javax.swing.JLabel givenlbl;
    private javax.swing.JTextField giventxt;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JList<String> list;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JLabel receivedlbl;
    private javax.swing.JTextField receivedtxt;
    private javax.swing.JLabel savelbl;
    private javax.swing.JTextField searchcustomertxt;
    private javax.swing.JLabel searchlbl;
    private javax.swing.JLabel successdialog;
    // End of variables declaration//GEN-END:variables


private void search(String id , String nm , String mob){
    
    System.out.println(id);
    System.out.println(nm);
    System.out.println(mob);
    
     DefaultTableModel model = (DefaultTableModel) customeracctbl.getModel();
            
             int rows = model.getRowCount();
           for(int i= rows-1;i>=0;i-- ){
               
               model.removeRow(i);
           }
           
        //   dueshowlbl.setText("N/A"); 
     try {
            // TODO add your handling code here:
           
            
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            CallableStatement cscr = conn.prepareCall("{call search_customer_records(?,?,?,?)}");
            
            cscr.setString(1, id);
            cscr.setString(2, nm);
            cscr.setString(3, mob);
            cscr.setDate(4, null);
            
            ResultSet rs = cscr.executeQuery();
            
            
            
           
           // ResultSet rs = SearchCustomerRecords.getcustrecords(id,nm,mob);
            
           int a=1;
            
            while (rs.next()){
                String name=rs.getString(1);
               
                String mob_no=rs.getString(2);
                String i_d=rs.getString(3);
                String trnxdt=rs.getString(4);
                String billdt=rs.getString(5);
                String ttlamou=rs.getString(6);
                String amourec=rs.getString(7);
              String amoudue=rs.getString(8);
                String descrptn=rs.getString(9);
                
                //taking the last amount due cell value
                if(a==1){
                     amouduelast =rs.getString(8);
                     a++;
                }
               
                String []row={name,mob_no,i_d,trnxdt,billdt,ttlamou,amourec,amoudue,descrptn};
                
                model.addRow(row);
                
            } 
            
           // System.out.println(model.getRowCount());
            
            if(amouduelast ==null || model.getRowCount()==0){
                amouduelast="0";
                 dueshowlbl.setText(amouduelast);
            }
            else{
                 dueshowlbl.setText(amouduelast);
            }
           
           
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SearchInF.class.getName()).log(Level.SEVERE, null, ex);
        }
   
}



}
