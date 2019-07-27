package Forms;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class frmSalesReturnNote extends javax.swing.JFrame {

    DecimalFormat currencyFormat = new DecimalFormat("#,###0.00");

    public frmSalesReturnNote() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblPrivilageCard = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblInvoiceDate = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lblInvoiceNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSalesInvoice = new javax.swing.JTable();
        dccInvoiceDate = new com.toedter.calendar.JDateChooser();
        txtInvoiceNumber = new javax.swing.JTextField();
        txtPrivilageCard = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lbltotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblPaymentType = new javax.swing.JLabel();
        comboPaymentType = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SALES RETURN NOTE");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 62, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrivilageCard.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPrivilageCard.setForeground(new java.awt.Color(255, 255, 255));
        lblPrivilageCard.setText("PRIVILAGE CARD");
        jPanel1.add(lblPrivilageCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblCustomerName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerName.setText("CUSTOMER NAME");
        jPanel1.add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        lblInvoiceDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblInvoiceDate.setForeground(new java.awt.Color(255, 255, 255));
        lblInvoiceDate.setText("INVOICE DATE");
        jPanel1.add(lblInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, -1));

        txtCustomerName.setBackground(new java.awt.Color(110, 122, 136));
        txtCustomerName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCustomerName.setForeground(new java.awt.Color(255, 255, 255));
        txtCustomerName.setToolTipText("");
        jPanel1.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 320, 30));

        lblInvoiceNumber.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblInvoiceNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblInvoiceNumber.setText("INVOICE NUMBER");
        jPanel1.add(lblInvoiceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        tableSalesInvoice.setBackground(new java.awt.Color(110, 122, 136));
        tableSalesInvoice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableSalesInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CODE", "BATCH NO.", "NAME", "DISCRIPTION", "RETURN PURPOSE", "UNIT PRICE", "QUANTITY", "SALES RETURN PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSalesInvoice.setToolTipText("");
        tableSalesInvoice.setRowHeight(30);
        jScrollPane1.setViewportView(tableSalesInvoice);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1220, 300));
        jPanel1.add(dccInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 160, 30));

        txtInvoiceNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtInvoiceNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtInvoiceNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtInvoiceNumber.setToolTipText("");
        txtInvoiceNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtInvoiceNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInvoiceNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtInvoiceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 120, 29));

        txtPrivilageCard.setBackground(new java.awt.Color(110, 122, 136));
        txtPrivilageCard.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPrivilageCard.setForeground(new java.awt.Color(255, 255, 255));
        txtPrivilageCard.setToolTipText("");
        txtPrivilageCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPrivilageCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrivilageCardActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrivilageCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, 29));

        jPanel5.setBackground(new java.awt.Color(45, 62, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltotal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(255, 255, 255));
        lbltotal.setText("TOTAL");
        lbltotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jPanel5.add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 152, 30));

        txtTotal.setBackground(new java.awt.Color(110, 122, 136));
        txtTotal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setToolTipText("");
        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalFocusLost(evt);
            }
        });
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel5.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 0, 185, 29));

        lblPaymentType.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPaymentType.setForeground(new java.awt.Color(255, 255, 255));
        lblPaymentType.setText("PAYMENT TYPE");
        lblPaymentType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jPanel5.add(lblPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, 152, 30));

        comboPaymentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Payment Type -", "Cash", "Credit Card", "Debit Card" }));
        jPanel5.add(comboPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 37, 185, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, -1, -1));

        jPanel2.setBackground(new java.awt.Color(45, 62, 80));

        btnSave.setBackground(new java.awt.Color(53, 189, 252));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 540));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 545, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearfields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Saved.", "Sales Return Note", JOptionPane.INFORMATION_MESSAGE);
        
        clearfields();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtInvoiceNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInvoiceNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInvoiceNumberActionPerformed

    private void txtPrivilageCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrivilageCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrivilageCardActionPerformed

    private void txtTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalFocusGained
        if (String.valueOf(convertDecimal(0)).equals(txtTotal.getText())) {
            txtTotal.setText("");
        }

        
//        if (String.valueOf(convertDecimal(0)).equals(comboPaymentType.setSelectedIndex(0))) {
//            txtTotal.setText("");
//        }
    }//GEN-LAST:event_txtTotalFocusGained

    private void txtTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalFocusLost
        if (txtTotal.getText().equals("")) {
            txtTotal.setText(String.valueOf(convertDecimal(0)));
        } else if (txtTotal.getText().equals("0")) {
            txtTotal.setText(String.valueOf(convertDecimal(0)));
        }
    }//GEN-LAST:event_txtTotalFocusLost

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmSalesReturnNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSalesReturnNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSalesReturnNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSalesReturnNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSalesReturnNote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboPaymentType;
    private com.toedter.calendar.JDateChooser dccInvoiceDate;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblInvoiceDate;
    private javax.swing.JLabel lblInvoiceNumber;
    private javax.swing.JLabel lblPaymentType;
    private javax.swing.JLabel lblPrivilageCard;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable tableSalesInvoice;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtInvoiceNumber;
    private javax.swing.JTextField txtPrivilageCard;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
        txtPrivilageCard.setText(null);
        txtCustomerName.setText(null);
        txtInvoiceNumber.setText(null);
        txtTotal.setText(null);
        
        comboPaymentType.setSelectedIndex(0);

        dccInvoiceDate.setDate(null);

        txtPrivilageCard.requestFocus();
    }

    private String convertDecimal(double getValue) {
        return currencyFormat.format(getValue);
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);
        
        clearfields();
    }
}
