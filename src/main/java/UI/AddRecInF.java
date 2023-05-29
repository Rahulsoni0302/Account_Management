/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import backend.BillingInfo;
import backend.AddNewRecord;
import static backend.Check.mobnocheck;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.ZoneId;

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
        
        //making mobno null
        invalidnolbl.setText(null);
        
        int nwid = BillingInfo.getnewid();
        newid=Integer.toString(nwid);
        cidshowlbl.setText(newid);        
    }
    public String newid;
    
    public String amougiven=null,custnm=null,dates=null,description=null,mobno=null;

    public void refresh(){
        //cidshowlbl.setText("");
        customernametxt.setText("");
        amountgiventxt.setText("");
        mobilenumbertxt.setText("");
        descriptiontxt.setText("");
        
        int nwid = BillingInfo.getnewid();
        newid=Integer.toString(nwid);
        cidshowlbl.setText(newid);    
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        d1oklbl = new javax.swing.JLabel();
        jDialogsuccess = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        successlbl = new javax.swing.JLabel();
        doklbl = new javax.swing.JLabel();
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
        cidshowlbl = new javax.swing.JLabel();
        cidlbl = new javax.swing.JLabel();
        registrationlbl1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        datechoser = new com.toedter.calendar.JDateChooser();
        invalidnolbl = new javax.swing.JLabel();
        optionallbl = new javax.swing.JLabel();

        jDialog1.setMinimumSize(new java.awt.Dimension(380, 308));
        jDialog1.setUndecorated(true);
        jDialog1.setResizable(false);
        jDialog1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDialog1KeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setMaximumSize(new java.awt.Dimension(400, 300));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ERROR");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fields cannot be empty");

        d1oklbl.setBackground(new java.awt.Color(0, 153, 153));
        d1oklbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d1oklbl.setForeground(new java.awt.Color(255, 255, 255));
        d1oklbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d1oklbl.setText("OK");
        d1oklbl.setOpaque(true);
        d1oklbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d1oklblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                d1oklblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                d1oklblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(d1oklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(d1oklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialogsuccess.setMinimumSize(new java.awt.Dimension(380, 308));
        jDialogsuccess.setUndecorated(true);
        jDialogsuccess.setResizable(false);
        jDialogsuccess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDialogsuccessKeyPressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setMaximumSize(new java.awt.Dimension(380, 308));
        jPanel3.setMinimumSize(new java.awt.Dimension(380, 308));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(380, 308));

        successlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        successlbl.setForeground(new java.awt.Color(0, 153, 153));
        successlbl.setText("Records Saved Successfully ");

        doklbl.setBackground(new java.awt.Color(0, 153, 153));
        doklbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        doklbl.setForeground(new java.awt.Color(255, 255, 255));
        doklbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doklbl.setText("OK");
        doklbl.setOpaque(true);
        doklbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doklblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doklblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doklblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(successlbl)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(doklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(successlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogsuccessLayout = new javax.swing.GroupLayout(jDialogsuccess.getContentPane());
        jDialogsuccess.getContentPane().setLayout(jDialogsuccessLayout);
        jDialogsuccessLayout.setHorizontalGroup(
            jDialogsuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogsuccessLayout.setVerticalGroup(
            jDialogsuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
        customernametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customernametxtKeyPressed(evt);
            }
        });

        amountgivenlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amountgivenlbl.setText("Amount given : ");

        amountgiventxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        amountgiventxt.setBorder(null);
        amountgiventxt.setMaximumSize(new java.awt.Dimension(64, 25));
        amountgiventxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountgiventxtKeyPressed(evt);
            }
        });

        mobilenumberlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mobilenumberlbl.setText("Mobile number :");

        mobilenumbertxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mobilenumbertxt.setBorder(null);
        mobilenumbertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobilenumbertxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobilenumbertxtKeyReleased(evt);
            }
        });

        decriptionlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        decriptionlbl.setText("Description : ");

        descriptiontxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descriptiontxt.setBorder(null);
        descriptiontxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descriptiontxtKeyPressed(evt);
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savelblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savelblMouseExited(evt);
            }
        });

        cidshowlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cidshowlbl.setText("0000001");

        cidlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cidlbl.setText("Customer id : ");

        registrationlbl1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registrationlbl1.setText("DATE :");

        jSeparator5.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator5.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator5.setOpaque(true);

        jLabel1.setText("(optional)");

        datechoser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        invalidnolbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        invalidnolbl.setForeground(new java.awt.Color(255, 0, 51));

        optionallbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        optionallbl.setText("(optional)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(cidlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(headinglbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cidshowlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrationlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(datechoser, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(376, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountgivenlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(mobilenumberlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(mobilenumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(decriptionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(descriptiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(savelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(customernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(71, 71, 71)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(customernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amountgiventxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(invalidnolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(optionallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(388, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(headinglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cidshowlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cidlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registrationlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(datechoser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountgivenlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountgiventxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobilenumberlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobilenumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(optionallbl))
                    .addComponent(invalidnolbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decriptionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(savelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void save(){
      amougiven=  amountgiventxt.getText(); 
       custnm= customernametxt.getText();
  
       description= descriptiontxt.getText();
       mobno= mobilenumbertxt.getText();
       
       if(amougiven.isBlank() || custnm.isBlank() || description.isBlank() ){
           
           jDialog1.setLocationRelativeTo(null);
           jDialog1.setVisible(true);
           
       }
       else{
           
           if(datechoser.getDate()==null){
           LocalDateTime bd = LocalDateTime.now();
           dates=bd.toString();
           System.out.println(dates);
          }
           else{
                java.util.Date dateu = datechoser.getDate();
                 
                  LocalDateTime dt = dateu.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
                 
                // SimpleDateFormat formatter = new  SimpleDateFormat("yyyy/mm/dd/HH/mi/ss");
                // dates=formatter.format(dateu);
                 
                dates=dt.toString();
               
           }
              
                     
           AddNewRecord.registernewcust(newid,custnm,mobno);
           
           AddNewRecord.newrecords(newid, description, amougiven, dates);
           
           jDialogsuccess.setLocationRelativeTo(null);
           jDialogsuccess.setVisible(true);
       }
        
    }
    
    private void savelblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savelblMouseMoved
        savelbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_savelblMouseMoved

    private void savelblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savelblMouseExited
        savelbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_savelblMouseExited

    private void savelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savelblMouseClicked
        
        String str=null;
        str=invalidnolbl.getText();
         if( str!=null){
            
        }
         else{
            save(); 
         }
        
    }//GEN-LAST:event_savelblMouseClicked

    private void d1oklblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d1oklblMouseClicked
        // TODO add your handling code here:
         
        jDialog1.dispose();
    }//GEN-LAST:event_d1oklblMouseClicked

    private void doklblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doklblMouseClicked
        jDialogsuccess.dispose();
        refresh();
    }//GEN-LAST:event_doklblMouseClicked

    private void customernametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customernametxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            amountgiventxt.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            amountgiventxt.requestFocus();
        }
    }//GEN-LAST:event_customernametxtKeyPressed

    private void amountgiventxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountgiventxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            mobilenumbertxt.requestFocus();
        }        
        if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            mobilenumbertxt.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP){
            customernametxt.requestFocus();
        }
    }//GEN-LAST:event_amountgiventxtKeyPressed

    private void mobilenumbertxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobilenumbertxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            descriptiontxt.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            descriptiontxt.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP){
            amountgiventxt.requestFocus();
        }
    }//GEN-LAST:event_mobilenumbertxtKeyPressed

    private void descriptiontxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptiontxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            save();
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP){
            mobilenumbertxt.requestFocus();
        }
    }//GEN-LAST:event_descriptiontxtKeyPressed

    private void doklblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doklblMouseEntered
        doklbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_doklblMouseEntered

    private void doklblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doklblMouseExited
        doklbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_doklblMouseExited

    private void d1oklblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d1oklblMouseEntered
        d1oklbl.setBackground(new java.awt.Color(0, 102, 103));
    }//GEN-LAST:event_d1oklblMouseEntered

    private void d1oklblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d1oklblMouseExited
        d1oklbl.setBackground(new java.awt.Color(0, 152, 152));
    }//GEN-LAST:event_d1oklblMouseExited

    private void mobilenumbertxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobilenumbertxtKeyReleased
        String text = mobilenumbertxt.getText();
        
        if(text.length()==10){
            boolean mobnocheck = mobnocheck(text,text.length());
            
            if(mobnocheck){
                invalidnolbl.setText(null);
            }
            else{
                 invalidnolbl.setText("invalid no. !");
            }
        }
        else if(text.isBlank()){
            invalidnolbl.setText(null);
        }
        else{
            invalidnolbl.setText("invalid no. !");
        }
       
    }//GEN-LAST:event_mobilenumbertxtKeyReleased

    private void jDialogsuccessKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDialogsuccessKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jDialogsuccess.dispose();
        }
    }//GEN-LAST:event_jDialogsuccessKeyPressed

    private void jDialog1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDialog1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jDialog1.dispose();
        }
    }//GEN-LAST:event_jDialog1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountgivenlbl;
    private javax.swing.JTextField amountgiventxt;
    private javax.swing.JLabel cidlbl;
    private javax.swing.JLabel cidshowlbl;
    private javax.swing.JLabel customernamelbl;
    private javax.swing.JTextField customernametxt;
    private javax.swing.JLabel d1oklbl;
    private com.toedter.calendar.JDateChooser datechoser;
    private javax.swing.JLabel decriptionlbl;
    private javax.swing.JTextField descriptiontxt;
    private javax.swing.JLabel doklbl;
    private javax.swing.JLabel headinglbl;
    private javax.swing.JLabel invalidnolbl;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialogsuccess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel mobilenumberlbl;
    private javax.swing.JTextField mobilenumbertxt;
    private javax.swing.JLabel optionallbl;
    private javax.swing.JLabel registrationlbl1;
    private javax.swing.JLabel savelbl;
    private javax.swing.JLabel successlbl;
    // End of variables declaration//GEN-END:variables
}
