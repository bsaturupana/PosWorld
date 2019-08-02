package Forms;

import javax.swing.JOptionPane;

public class frmSalesInvoicePOP extends javax.swing.JFrame {

    public frmSalesInvoicePOP() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        lblBatchNO = new javax.swing.JLabel();
        txtBatchNO = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblDiscription = new javax.swing.JLabel();
        txtDiscription = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblUnitPrice = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        lblDiscount = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        lblSalesPrice = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SALES INVOICE");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 62, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCode.setForeground(new java.awt.Color(255, 255, 255));
        lblCode.setText("CODE");
        jPanel1.add(lblCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        txtCode.setBackground(new java.awt.Color(110, 122, 136));
        txtCode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 250, 30));

        lblBatchNO.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBatchNO.setForeground(new java.awt.Color(255, 255, 255));
        lblBatchNO.setText("BATCH NO");
        jPanel1.add(lblBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 130, 30));

        txtBatchNO.setBackground(new java.awt.Color(110, 122, 136));
        txtBatchNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 260, 30));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("NAME");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        txtName.setBackground(new java.awt.Color(0, 0, 102));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 250, 30));

        lblDiscription.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDiscription.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscription.setText("DISCRIPTION");
        jPanel1.add(lblDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 130, 30));

        txtDiscription.setBackground(new java.awt.Color(0, 0, 102));
        txtDiscription.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 260, 30));

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("QUANTITY");
        jPanel1.add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 30));

        txtQuantity.setBackground(new java.awt.Color(110, 122, 136));
        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 250, 30));

        lblUnitPrice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUnitPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblUnitPrice.setText("UNIT PRICE");
        jPanel1.add(lblUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 130, 30));

        txtUnitPrice.setBackground(new java.awt.Color(0, 0, 102));
        txtUnitPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 260, 30));

        lblDiscount.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscount.setText("DISCOUNT");
        jPanel1.add(lblDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        txtDiscount.setBackground(new java.awt.Color(0, 0, 102));
        txtDiscount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 250, 30));

        lblSalesPrice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSalesPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblSalesPrice.setText("SALES  PRICE");
        jPanel1.add(lblSalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 130, 30));

        txtSalesPrice.setBackground(new java.awt.Color(0, 0, 102));
        txtSalesPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtSalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 260, 30));

        jPanel2.setBackground(new java.awt.Color(45, 62, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setBackground(new java.awt.Color(53, 189, 252));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 140, 60));

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 13, 140, 60));

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 13, 140, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 473, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 902, 329));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 405, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Saved.", "Sales Invoice", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(frmSalesInvoicePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSalesInvoicePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSalesInvoicePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSalesInvoicePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSalesInvoicePOP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBatchNO;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblDiscription;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSalesPrice;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JTextField txtBatchNO;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtBatchNO.setText(null);
        txtCode.setText(null);
        txtDiscount.setText(null);
        txtDiscription.setText(null);
        txtName.setText(null);
        txtQuantity.setText(null);
        txtSalesPrice.setText(null);
        txtUnitPrice.setText(null);

        txtCode.requestFocus();
    }

    private void formFormat() {
        txtName.setEditable(false);
        txtDiscount.setEditable(false);
        txtDiscription.setEditable(false);
        txtUnitPrice.setEditable(false);
        txtSalesPrice.setEditable(false);

        this.setLocationRelativeTo(null);
        
        clearFields();
    }
}
