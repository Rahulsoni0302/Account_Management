/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Abhishek
 */
public class GenerateBillInF extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewIF
     */
    public GenerateBillInF() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        LocalDateTime bd = LocalDateTime.now();
        LocalDateTime date = bd;
        String datetime = date;
        
        dateshowlbl.setd(date);
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
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        printpnl = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        enterpriselbl = new javax.swing.JLabel();
        customernamelbl = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        addresslbl = new javax.swing.JLabel();
        contactlbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        nettotallbl = new javax.swing.JLabel();
        nettotalshowlbl = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        dateshowlbl = new javax.swing.JLabel();
        printlbl = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setMaximumSize(new java.awt.Dimension(1300, 850));
        setMinimumSize(new java.awt.Dimension(1300, 850));
        setPreferredSize(new java.awt.Dimension(1300, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 850));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 850));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 850));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printpnl.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("");
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        enterpriselbl.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        enterpriselbl.setText("Enterp. Name here");

        customernamelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customernamelbl.setText("Customer Name here");

        datelbl.setText("DATE : ");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOpaque(true);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setToolTipText("");
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        addresslbl.setText("address here ");

        contactlbl.setText("Contact details");

        table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null, null, null, null},
                {"2", null, null, null, null, null},
                {"3", null, null, null, null, null},
                {"4", null, null, null, null, null},
                {"5", null, null, null, null, null},
                {"6", null, null, null, null, null},
                {"7", null, null, null, null, null},
                {"8", null, null, null, null, null},
                {"9", null, null, null, null, null},
                {"10", null, null, null, null, null}
            },
            new String [] {
                "s. no.", "desc", "quantity", "item wgt", "rate", "total"
            }
        ));
        table.setRowHeight(40);
        jScrollPane2.setViewportView(table);

        nettotallbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nettotallbl.setText("Net Total : ");

        nettotalshowlbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jSeparator4.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator4.setOpaque(true);

        javax.swing.GroupLayout printpnlLayout = new javax.swing.GroupLayout(printpnl);
        printpnl.setLayout(printpnlLayout);
        printpnlLayout.setHorizontalGroup(
            printpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(printpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(printpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(printpnlLayout.createSequentialGroup()
                        .addComponent(customernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(printpnlLayout.createSequentialGroup()
                        .addComponent(addresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(contactlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(printpnlLayout.createSequentialGroup()
                .addComponent(enterpriselbl, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(printpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(dateshowlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
            .addGroup(printpnlLayout.createSequentialGroup()
                .addGroup(printpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(printpnlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nettotallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(printpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(printpnlLayout.createSequentialGroup()
                                .addComponent(nettotalshowlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addComponent(jSeparator4)))
                    .addGroup(printpnlLayout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        printpnlLayout.setVerticalGroup(
            printpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printpnlLayout.createSequentialGroup()
                .addGroup(printpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(printpnlLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(dateshowlbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(printpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterpriselbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(printpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresslbl)
                    .addComponent(contactlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(printpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nettotallbl, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(nettotalshowlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(printpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 960, 720));

        printlbl.setBackground(new java.awt.Color(0, 153, 153));
        printlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        printlbl.setForeground(new java.awt.Color(255, 255, 255));
        printlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        printlbl.setText("PRINT");
        printlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printlbl.setOpaque(true);
        printlbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                printlblMouseMoved(evt);
            }
        });
        printlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printlblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printlblMouseExited(evt);
            }
        });
        jPanel1.add(printlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 750, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1297, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printlblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printlblMouseMoved
        printlbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_printlblMouseMoved

    private void printlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printlblMouseClicked
        printBill(printpnl);
    }//GEN-LAST:event_printlblMouseClicked

    private void printlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printlblMouseExited
        printlbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_printlblMouseExited

    private void printBill(JPanel panel){
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("print bill");
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
               if(pageIndex>0){
                   return Printable.NO_SUCH_PAGE;
               }
               Graphics2D graphics2D = (Graphics2D)graphics;
               graphics2D.translate(pageFormat.getImageableX()*2,pageFormat.getImageableY()*2);
               graphics2D.scale(0.5,0.5 );
               panel.paint(graphics2D);
               return Printable.PAGE_EXISTS;
            }
        });
        boolean returningResult = printerJob.printDialog();
            if(returningResult){
                try{
                    printerJob.print();
                }catch(PrinterException printerex){
                    JOptionPane.showMessageDialog(this,"Print error: "+printerex.getMessage());
                }
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslbl;
    private javax.swing.JLabel contactlbl;
    private javax.swing.JLabel customernamelbl;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel dateshowlbl;
    private javax.swing.JLabel enterpriselbl;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel nettotallbl;
    private javax.swing.JLabel nettotalshowlbl;
    private javax.swing.JLabel printlbl;
    private javax.swing.JPanel printpnl;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
