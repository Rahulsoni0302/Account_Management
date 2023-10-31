/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import backend.SearchCustBills;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.plaf.basic.BasicPopupMenuUI;
import javax.swing.table.DefaultTableModel;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

/**
 *
 * @author Abhishek
 */
public class BillingHistoryInF extends javax.swing.JInternalFrame {

    /**
     * Creates new form BillingHistoryInF
     */
    public BillingHistoryInF() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        billingHistory();
        
        menu.add(listpnl);
        menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicPopupMenuUI mui;
        mui = (BasicPopupMenuUI)menu.getUI();
        
    }
    
    public void search(String cid,String nm,String no){
        String custnm,custid,custno;
        
        //custnm =txt.getText();
        custid = cid;
        custnm = nm;
        custno = no;
        
        try {
           String dbURL = "jdbc:mysql://localhost:3306/app_dev";
           String user = "root";
           String password = "#@Rahul8269";
           Connection conn = null;
           
           conn = DriverManager.getConnection(dbURL, user, password);
           CallableStatement cscb = conn.prepareCall("{call search_customer_bills(?,?,?,?)}");
           
           cscb.setString(1, custid);
           cscb.setDate(4, null);
           cscb.setString(2, custnm);
           cscb.setString(3, custno);
           
           ResultSet rs = cscb.executeQuery();
           
           DefaultTableModel model = (DefaultTableModel) table.getModel();
           
           int rows = model.getRowCount();
           for(int i= rows-1;i>=0;i-- ){
               
               model.removeRow(i);
           }
            
            
            String id,name,mobno,date,billcpy;
            
            while(rs.next()){
                id = rs.getString(1);
                name = rs.getString(2);
                mobno = rs.getString(3);
                date= rs.getString(4);
                billcpy=rs.getString(5);
               String [] row ={id,name,mobno,date,billcpy}; 
                model.addRow(row);
            }
            
           
            
            conn.close();
            rs.close();
            cscb.close();
            
            
          
          
       } catch (SQLException ex) {
           Logger.getLogger(SearchCustBills.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listpnl = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        menu = new javax.swing.JPopupMenu();
        pdfpanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        headinglbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        recentbillbl = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        search = new javax.swing.JLabel();
        infolbl = new javax.swing.JLabel();

        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        list.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(list);

        javax.swing.GroupLayout listpnlLayout = new javax.swing.GroupLayout(listpnl);
        listpnl.setLayout(listpnlLayout);
        listpnlLayout.setHorizontalGroup(
            listpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );
        listpnlLayout.setVerticalGroup(
            listpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );

        pdfpanel.setFocusable(false);
        pdfpanel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pdfpanelLayout = new javax.swing.GroupLayout(pdfpanel);
        pdfpanel.setLayout(pdfpanelLayout);
        pdfpanelLayout.setHorizontalGroup(
            pdfpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
        );
        pdfpanelLayout.setVerticalGroup(
            pdfpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );

        setMaximumSize(new java.awt.Dimension(1300, 1024));
        setMinimumSize(new java.awt.Dimension(1300, 1024));
        setPreferredSize(new java.awt.Dimension(1300, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1050, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 720));

        headinglbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        headinglbl.setText("Billing History");

        table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "MOB.NO.", "DATE", "BILL COPY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setFocusable(false);
        table.setRowHeight(30);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(10);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        recentbillbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        recentbillbl.setText("Most Recent Bills");

        txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt.setBorder(null);
        txt.setFocusCycleRoot(true);
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKeyReleased(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator1.setOpaque(true);

        search.setBackground(new java.awt.Color(0, 153, 153));
        search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setText("SEARCH");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.setFocusable(false);
        search.setOpaque(true);
        search.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                searchMouseMoved(evt);
            }
        });
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });

        infolbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        infolbl.setText("Search for customer name / id / number ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recentbillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(headinglbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infolbl)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(611, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headinglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(recentbillbl)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1570, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void searchMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseMoved
        search.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_searchMouseMoved

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        search.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_searchMouseExited

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        String str = txt.getText();
        //search(str);   
    }//GEN-LAST:event_searchMouseClicked

    private void txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyReleased
        DefaultListModel model = new DefaultListModel();
        String search  = txt.getText().trim();
        Suggestion suggestion = new Suggestion(list,model);
        if(!search.equals("")){
            menu.show(txt,0,txt.getHeight()+12);
            suggestion.searchFilter(txt.getText());
            txt.requestFocus();
        }
    }//GEN-LAST:event_txtKeyReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int selected = table.getSelectedRow();
        PdfFrame pf =new PdfFrame();
        pf.setVisible(true);
        pf.setAlwaysOnTop(false);
        String str = String.valueOf(table.getValueAt(selected,4)); 
        
              pf.openpdf(str);
    }//GEN-LAST:event_tableMouseClicked

//    public String idString(String str){
//        String substring = str;
//        
//        return substring;
//    }
    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        String custinfo = list.getSelectedValue();

        int idlen= custinfo.indexOf(32);
        String idn = custinfo.substring(0, idlen);
        //  System.out.println(idn);

        int nmstrt=idlen+4;
        int nmend=custinfo.indexOf(32, nmstrt);

        String nmn= custinfo.substring(nmstrt, nmend);
        //    System.out.println(nmn);

        //        String mobn = " ";
        int mobstrt=nmend+4;
        String mobn=custinfo.substring(mobstrt);
        //  System.out.println(mobn);

        search(idn,nmn,mobn);
        txt.setText(nmn);
        //  System.out.print(idn+" "+nmn+" "+mobn);

    }//GEN-LAST:event_listMouseClicked

    private void listKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listKeyPressed
        int index = list.getSelectedIndex();
        DefaultListModel model = (DefaultListModel)list.getModel();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String custinfo = list.getSelectedValue();

            int idlen= custinfo.indexOf(32);
            String idn = custinfo.substring(0, idlen);
            //  System.out.println(idn);

            int nmstrt=idlen+4;
            int nmend=custinfo.indexOf(32, nmstrt);

            String nmn= custinfo.substring(nmstrt, nmend);
      //    System.out.println(nmn);

      //    String mobn = " ";
            int mobstrt=nmend+4;
            String mobn=custinfo.substring(mobstrt);
      //    System.out.println(mobn);

            search(idn,nmn,mobn);
            txt.setText(nmn);
      //    System.out.print(idn+" "+nmn+" "+mobn);
//            menu.setVisible(false);
//            list.setVisible(false);
//            listpnl.setVisible(false);
            txt.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP){
            if(index==0){
                index=0;
                list.setSelectedIndex(index);
            }
            list.setSelectedIndex(index-1);
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            list.setSelectedIndex(index);
        }
    }//GEN-LAST:event_listKeyPressed

    private void txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            list.requestFocus();
            list.setSelectedIndex(0);
        }
    }//GEN-LAST:event_txtKeyPressed

      private void billingHistory()//used to fetch the bills of the recent customers
    {
        try {
            String dbURL = "jdbc:mysql://localhost:3306/app_dev";
            String user = "root";
            String password = "#@Rahul8269";
            Connection conn = null;
            
            conn = DriverManager.getConnection(dbURL, user, password);
            CallableStatement cbh= conn.prepareCall("call billing_history()");
            
            ResultSet rs= cbh.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            
            String id,name,mobno,date,billcpy;
            
            while(rs.next()){
                id = rs.getString(1);
                name = rs.getString(2);
                mobno = rs.getString(3);
                date= rs.getString(4);
                billcpy=rs.getString(5);
               String [] row ={id,name,mobno,date,billcpy}; 
                model.addRow(row);
            }
            
            conn.close();
            rs.close();
            cbh.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustBills.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
       private void openpdf(String file){
  
    try {
           SwingController control=new SwingController();
            SwingViewBuilder factry=new SwingViewBuilder(control);
             JPanel veiwerCompntpnl=factry.buildViewerPanel();
            ComponentKeyBinding.install(control, veiwerCompntpnl);
            control.getDocumentViewController().setAnnotationCallback(
                    new org.icepdf.ri.common.MyAnnotationCallback(
                    control.getDocumentViewController()));
                   control.openDocument(file);
        jScrollPane3.setViewportView(veiwerCompntpnl); 
        } catch (Exception ex) {
            System.out.println("can't open pdf");
        }
}
//       private TableCellRenderer getRenderer(){
//           return new DefaultTableCellRenderer(){
//               public Component getTableCellRendererComponent(JTable table,
//                    Object value, boolean isSelected, boolean hasFocus,
//                    int row, int column){
//                   Component tableCellRendererComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus,row, column);
//                       JLabel label = new JLabel();
//                       tableCellRendererComponent.addComponentListener(search.addMouseListener());
//                   return tableCellRendererComponent;
//               }
//           };
//       }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headinglbl;
    private javax.swing.JLabel infolbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> list;
    private javax.swing.JPanel listpnl;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JPanel pdfpanel;
    private javax.swing.JLabel recentbillbl;
    private javax.swing.JLabel search;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
