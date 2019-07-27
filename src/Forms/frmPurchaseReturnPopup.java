package Forms;

import java.awt.Toolkit;
import java.text.Normalizer.Form;
import javax.swing.JOptionPane;

public class frmPurchaseReturnPopup extends javax.swing.JFrame {

    public frmPurchaseReturnPopup() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        panelPurchaseReturnItemDetail = new javax.swing.JPanel();
        lblItemCode = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        txtItemDiscription = new javax.swing.JTextField();
        lblItemDiscription = new javax.swing.JLabel();
        lblItemName = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PURCHASE ORDER");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1015, -1));

        panelPurchaseReturnItemDetail.setBackground(new java.awt.Color(45, 62, 80));
        panelPurchaseReturnItemDetail.setToolTipText("");
        panelPurchaseReturnItemDetail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblItemCode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblItemCode.setForeground(new java.awt.Color(255, 255, 255));
        lblItemCode.setText("ITEM CODE");
        panelPurchaseReturnItemDetail.add(lblItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        txtItemCode.setBackground(new java.awt.Color(255, 255, 150));
        txtItemCode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        panelPurchaseReturnItemDetail.add(txtItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 250, 30));

        txtItemDiscription.setBackground(new java.awt.Color(255, 102, 153));
        txtItemDiscription.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        panelPurchaseReturnItemDetail.add(txtItemDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 250, 30));

        lblItemDiscription.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblItemDiscription.setForeground(new java.awt.Color(255, 255, 255));
        lblItemDiscription.setText("ITEM DISCRIPTION");
        panelPurchaseReturnItemDetail.add(lblItemDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 30));

        lblItemName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblItemName.setForeground(new java.awt.Color(255, 255, 255));
        lblItemName.setText("ITEM NAME");
        panelPurchaseReturnItemDetail.add(lblItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 130, 30));

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("QUANTITY");
        panelPurchaseReturnItemDetail.add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 130, 30));

        txtQuantity.setBackground(new java.awt.Color(255, 255, 150));
        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        panelPurchaseReturnItemDetail.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 260, 30));

        txtItemName.setBackground(new java.awt.Color(255, 102, 153));
        txtItemName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        panelPurchaseReturnItemDetail.add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 260, 30));

        jPanel2.setBackground(new java.awt.Color(45, 62, 80));
        jPanel2.setToolTipText("");

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
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPurchaseReturnItemDetail.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        getContentPane().add(panelPurchaseReturnItemDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 900, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Saved.", "Purchase Return", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(frmPurchaseReturnPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseReturnPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseReturnPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseReturnPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPurchaseReturnPopup().setVisible(true);
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
    private javax.swing.JLabel lblItemCode;
    private javax.swing.JLabel lblItemDiscription;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JPanel panelPurchaseReturnItemDetail;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemDiscription;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtItemCode.setText(null);
        txtItemDiscription.setText(null);
        txtItemName.setText(null);
        txtQuantity.setText(null);

        txtItemCode.requestFocus();
    }

    private void formFormat() {
        txtItemDiscription.setEditable(false);
        txtItemName.setEditable(false);

        this.setLocationRelativeTo(null);
        
        clearFields();
    }
}
