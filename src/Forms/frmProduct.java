package Forms;

public class frmProduct extends javax.swing.JFrame {

    public frmProduct() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtBatchNo = new javax.swing.JTextField();
        lblProductCode = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblDiscription = new javax.swing.JLabel();
        lblBatchNO = new javax.swing.JLabel();
        lblExpiryDate = new javax.swing.JLabel();
        lblSupplier = new javax.swing.JLabel();
        lblPurchasePrice = new javax.swing.JLabel();
        lblSalePrice = new javax.swing.JLabel();
        lblRemarks = new javax.swing.JLabel();
        lblPackdDate = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        radioInactive = new javax.swing.JRadioButton();
        radioActive = new javax.swing.JRadioButton();
        txtProductCode = new javax.swing.JTextField();
        txtPurchasePrice = new javax.swing.JTextField();
        txtSalePrice = new javax.swing.JTextField();
        lblManufactureDate = new javax.swing.JLabel();
        comboSupplier = new javax.swing.JComboBox();
        dccExpirydate = new com.toedter.calendar.JDateChooser();
        dccManufactureDate = new com.toedter.calendar.JDateChooser();
        dccPackedDate = new com.toedter.calendar.JDateChooser();
        txtProductName = new javax.swing.JTextField();
        txtDiscription = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRODUCT");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBatchNo.setBackground(new java.awt.Color(255, 255, 150));
        txtBatchNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtBatchNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 250, 30));

        lblProductCode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblProductCode.setText("PRODUCT CODE");
        jPanel1.add(lblProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblProductName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblProductName.setText("PRODUCT NAME");
        jPanel1.add(lblProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, -1, -1));

        lblStatus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblStatus.setText("STATUS");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        lblDiscription.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDiscription.setText("DISCRIPTION");
        jPanel1.add(lblDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        lblBatchNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblBatchNO.setText("BATCH NO");
        jPanel1.add(lblBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        lblExpiryDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblExpiryDate.setText("EXPIRY DATE");
        jPanel1.add(lblExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        lblSupplier.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSupplier.setText("SUPPLIER");
        jPanel1.add(lblSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        lblPurchasePrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPurchasePrice.setText("PURCHASE PRICE");
        jPanel1.add(lblPurchasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lblSalePrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSalePrice.setText("SALE PRICE");
        jPanel1.add(lblSalePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        lblRemarks.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRemarks.setText("REMARKS");
        jPanel1.add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        lblPackdDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPackdDate.setText("PACKED DATE");
        jPanel1.add(lblPackdDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        txtRemarks.setBackground(new java.awt.Color(255, 255, 150));
        txtRemarks.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 250, 30));

        buttonGroup1.add(radioInactive);
        radioInactive.setText("INACTIVE");
        jPanel1.add(radioInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        buttonGroup1.add(radioActive);
        radioActive.setText("ACTIVE");
        radioActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioActiveActionPerformed(evt);
            }
        });
        jPanel1.add(radioActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 80, -1));

        txtProductCode.setBackground(new java.awt.Color(255, 255, 150));
        txtProductCode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 250, 30));

        txtPurchasePrice.setBackground(new java.awt.Color(255, 255, 150));
        txtPurchasePrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtPurchasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 250, 30));

        txtSalePrice.setBackground(new java.awt.Color(255, 255, 150));
        txtSalePrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtSalePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 250, 30));

        lblManufactureDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblManufactureDate.setText("MANUFACTURE DATE");
        jPanel1.add(lblManufactureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        comboSupplier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Supplier -" }));
        jPanel1.add(comboSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 250, 30));
        jPanel1.add(dccExpirydate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 250, 30));
        jPanel1.add(dccManufactureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 250, 30));
        jPanel1.add(dccPackedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 250, 30));

        txtProductName.setBackground(new java.awt.Color(255, 255, 150));
        txtProductName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 250, 30));

        txtDiscription.setBackground(new java.awt.Color(255, 255, 150));
        txtDiscription.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 250, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 821, 354));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setBackground(new java.awt.Color(155, 194, 230));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 13, 140, 60));

        btnReset.setBackground(new java.awt.Color(155, 194, 230));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 140, 60));

        btnClose.setBackground(new java.awt.Color(155, 194, 230));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 13, 140, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 372, -1, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        clearFields();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void radioActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioActiveActionPerformed

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
            java.util.logging.Logger.getLogger(frmProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboSupplier;
    private com.toedter.calendar.JDateChooser dccExpirydate;
    private com.toedter.calendar.JDateChooser dccManufactureDate;
    private com.toedter.calendar.JDateChooser dccPackedDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBatchNO;
    private javax.swing.JLabel lblDiscription;
    private javax.swing.JLabel lblExpiryDate;
    private javax.swing.JLabel lblManufactureDate;
    private javax.swing.JLabel lblPackdDate;
    private javax.swing.JLabel lblProductCode;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblPurchasePrice;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblSalePrice;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JRadioButton radioActive;
    private javax.swing.JRadioButton radioInactive;
    private javax.swing.JTextField txtBatchNo;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtProductCode;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtPurchasePrice;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtSalePrice;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtProductCode.setText(null);
        txtBatchNo.setText(null);
        txtProductName.setText(null);
        txtDiscription.setText(null);
        txtPurchasePrice.setText(null);
        txtSalePrice.setText(null);
        txtRemarks.setText(null);

        dccManufactureDate.setCalendar(null);
        dccPackedDate.setCalendar(null);
        dccExpirydate.setCalendar(null);

        comboSupplier.setSelectedIndex(0);

        radioActive.setSelected(true);
        radioInactive.setSelected(false);

        txtProductCode.requestFocus();
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);

        clearFields();
    }
}
