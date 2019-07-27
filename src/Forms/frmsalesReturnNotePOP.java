package Forms;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class frmsalesReturnNotePOP extends javax.swing.JFrame {

    DecimalFormat currencyFormat = new DecimalFormat("#,###0.00");

    public frmsalesReturnNotePOP() {
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
        lblPSRPrice = new javax.swing.JLabel();
        txtSRPPrice = new javax.swing.JTextField();
        lblRTNPurpose = new javax.swing.JLabel();
        comboRTNPurpose1 = new javax.swing.JComboBox();
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
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCode.setForeground(new java.awt.Color(255, 255, 255));
        lblCode.setText("CODE");
        jPanel1.add(lblCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        txtCode.setBackground(new java.awt.Color(110, 122, 136));
        txtCode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 250, 30));

        lblBatchNO.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBatchNO.setForeground(new java.awt.Color(255, 255, 255));
        lblBatchNO.setText("BATCH NO");
        jPanel1.add(lblBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 130, 30));

        txtBatchNO.setBackground(new java.awt.Color(110, 122, 136));
        txtBatchNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 260, 30));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("NAME");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        txtName.setBackground(new java.awt.Color(0, 0, 102));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtName.setToolTipText("");
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 250, 30));

        lblDiscription.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDiscription.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscription.setText("DISCRIPTION");
        jPanel1.add(lblDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 130, 30));

        txtDiscription.setBackground(new java.awt.Color(0, 0, 102));
        txtDiscription.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDiscription.setToolTipText("");
        jPanel1.add(txtDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 260, 30));

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("QUANTITY");
        jPanel1.add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 130, 30));

        txtQuantity.setBackground(new java.awt.Color(110, 122, 136));
        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 260, 30));

        lblUnitPrice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUnitPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblUnitPrice.setText("UNIT PRICE");
        jPanel1.add(lblUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 30));

        txtUnitPrice.setBackground(new java.awt.Color(0, 0, 102));
        txtUnitPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtUnitPrice.setToolTipText("");
        jPanel1.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 250, 30));

        lblPSRPrice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPSRPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPSRPrice.setText("SALES RETURN  PRICE");
        jPanel1.add(lblPSRPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 130, 30));

        txtSRPPrice.setBackground(new java.awt.Color(0, 0, 102));
        txtSRPPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSRPPrice.setToolTipText("");
        jPanel1.add(txtSRPPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 260, 30));

        lblRTNPurpose.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblRTNPurpose.setForeground(new java.awt.Color(255, 255, 255));
        lblRTNPurpose.setText("RETURN PURPOSE");
        jPanel1.add(lblRTNPurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        comboRTNPurpose1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Return Purpos -" }));
        jPanel1.add(comboRTNPurpose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 250, 30));

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
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 140, 60));

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 140, 60));

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 0, 140, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 470, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 900, 330));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 381, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Saved.", "Sales Return", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(frmsalesReturnNotePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmsalesReturnNotePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmsalesReturnNotePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmsalesReturnNotePOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmsalesReturnNotePOP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboRTNPurpose1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblBatchNO;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblDiscription;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPSRPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblRTNPurpose;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JTextField txtBatchNO;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSRPPrice;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtBatchNO.setText(null);
        txtCode.setText(null);
        txtDiscription.setText(null);
        txtName.setText(null);
        txtSRPPrice.setText(null);
        txtQuantity.setText(null);
        txtUnitPrice.setText(null);

        comboRTNPurpose1.setSelectedIndex(0);

        txtCode.requestFocus();
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);
        txtName.setEditable(false);
        txtDiscription.setEditable(false);
        txtUnitPrice.setEditable(false);
        txtSRPPrice.setEditable(false);

        this.setLocationRelativeTo(null);
        
        clearFields();
    }
}
