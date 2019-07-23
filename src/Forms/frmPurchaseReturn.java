package Forms;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmPurchaseReturn extends javax.swing.JFrame {

    public frmPurchaseReturn() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        panelButtons = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        panelPurchaseReturnItemDetail = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePurchaseReturnItems = new javax.swing.JTable();
        panelPurchaseReturnItemHeader = new javax.swing.JPanel();
        lblPurchaseOrderNumber = new javax.swing.JLabel();
        txtPurchaseOrderNumber = new javax.swing.JTextField();
        lblSupplierName = new javax.swing.JLabel();
        comboSupplierName = new javax.swing.JComboBox();
        lblPurchaseReturnDate = new javax.swing.JLabel();
        dccPurchaseReturnDate = new com.toedter.calendar.JDateChooser();
        lblPurchasereturnNumber = new javax.swing.JLabel();
        txtPurchasereturnNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PURCHASE ORDER");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1015, -1));

        btnSave.setBackground(new java.awt.Color(155, 194, 230));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(155, 194, 230));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(155, 194, 230));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(155, 194, 230));
        btnPrint.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, 80));

        tablePurchaseReturnItems.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablePurchaseReturnItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ITEM CODE", "ITEM NAME", "ITEM DISCRIPTION", "QUANTITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePurchaseReturnItems.setRowHeight(30);
        jScrollPane1.setViewportView(tablePurchaseReturnItems);

        javax.swing.GroupLayout panelPurchaseReturnItemDetailLayout = new javax.swing.GroupLayout(panelPurchaseReturnItemDetail);
        panelPurchaseReturnItemDetail.setLayout(panelPurchaseReturnItemDetailLayout);
        panelPurchaseReturnItemDetailLayout.setHorizontalGroup(
            panelPurchaseReturnItemDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPurchaseReturnItemDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPurchaseReturnItemDetailLayout.setVerticalGroup(
            panelPurchaseReturnItemDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPurchaseReturnItemDetailLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panelPurchaseReturnItemDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1020, 360));

        lblPurchaseOrderNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPurchaseOrderNumber.setText("PURCHASE ORDER NUMBER");

        txtPurchaseOrderNumber.setBackground(new java.awt.Color(255, 255, 150));
        txtPurchaseOrderNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPurchaseOrderNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPurchaseOrderNumberActionPerformed(evt);
            }
        });
        txtPurchaseOrderNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPurchaseOrderNumberKeyTyped(evt);
            }
        });

        lblSupplierName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSupplierName.setText("SUPPLIER NAME");

        comboSupplierName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Supplier Name -" }));

        lblPurchaseReturnDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPurchaseReturnDate.setText("PURCHASE RETURN DATE");

        lblPurchasereturnNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPurchasereturnNumber.setText("PURCHASE RETURN NUMBER");

        txtPurchasereturnNumber.setBackground(new java.awt.Color(255, 255, 150));
        txtPurchasereturnNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPurchasereturnNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPurchasereturnNumberActionPerformed(evt);
            }
        });
        txtPurchasereturnNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPurchasereturnNumberKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelPurchaseReturnItemHeaderLayout = new javax.swing.GroupLayout(panelPurchaseReturnItemHeader);
        panelPurchaseReturnItemHeader.setLayout(panelPurchaseReturnItemHeaderLayout);
        panelPurchaseReturnItemHeaderLayout.setHorizontalGroup(
            panelPurchaseReturnItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPurchaseReturnItemHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPurchaseReturnItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPurchaseOrderNumber)
                    .addComponent(lblSupplierName))
                .addGap(18, 18, 18)
                .addGroup(panelPurchaseReturnItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboSupplierName, 0, 320, Short.MAX_VALUE)
                    .addComponent(txtPurchaseOrderNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(panelPurchaseReturnItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPurchasereturnNumber)
                    .addComponent(lblPurchaseReturnDate))
                .addGap(18, 18, 18)
                .addGroup(panelPurchaseReturnItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dccPurchaseReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPurchasereturnNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPurchaseReturnItemHeaderLayout.setVerticalGroup(
            panelPurchaseReturnItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPurchaseReturnItemHeaderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelPurchaseReturnItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPurchaseReturnItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPurchasereturnNumber)
                        .addComponent(txtPurchasereturnNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPurchaseReturnItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPurchaseOrderNumber)
                        .addComponent(txtPurchaseOrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelPurchaseReturnItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dccPurchaseReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPurchaseReturnItemHeaderLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelPurchaseReturnItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSupplierName)
                            .addComponent(lblPurchaseReturnDate))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(panelPurchaseReturnItemHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1020, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearfields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Saved.", "Purchase Return", JOptionPane.INFORMATION_MESSAGE);
        clearfields();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPurchaseOrderNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPurchaseOrderNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPurchaseOrderNumberActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        JOptionPane.showMessageDialog(this, "Print Successfully.", "Purchase Return", JOptionPane.INFORMATION_MESSAGE);
        clearfields();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtPurchasereturnNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPurchasereturnNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPurchasereturnNumberActionPerformed

    private void txtPurchaseOrderNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPurchaseOrderNumberKeyTyped
        if (txtPurchaseOrderNumber.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPurchaseOrderNumberKeyTyped

    private void txtPurchasereturnNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPurchasereturnNumberKeyTyped
        if (txtPurchaseOrderNumber.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPurchasereturnNumberKeyTyped

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
            java.util.logging.Logger.getLogger(frmPurchaseReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPurchaseReturn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboSupplierName;
    private com.toedter.calendar.JDateChooser dccPurchaseReturnDate;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPurchaseOrderNumber;
    private javax.swing.JLabel lblPurchaseReturnDate;
    private javax.swing.JLabel lblPurchasereturnNumber;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelPurchaseReturnItemDetail;
    private javax.swing.JPanel panelPurchaseReturnItemHeader;
    private javax.swing.JTable tablePurchaseReturnItems;
    private javax.swing.JTextField txtPurchaseOrderNumber;
    private javax.swing.JTextField txtPurchasereturnNumber;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
        txtPurchaseOrderNumber.setText(null);
        dccPurchaseReturnDate.setDate(null);
        comboSupplierName.setSelectedIndex(0);
        dccPurchaseReturnDate.setDate(null);
    }
}
