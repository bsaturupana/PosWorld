package Forms;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmPurchaseOrder extends javax.swing.JFrame {

    public frmPurchaseOrder() {
        initComponents();
        
        formFormat();
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
        panelPurchaseOrderItemDetail = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePurchaseOrder = new javax.swing.JTable();
        panelPurchaseOrderItemHeader = new javax.swing.JPanel();
        lblPurchaseOrderNumber = new javax.swing.JLabel();
        txtPurchaseOrderNumber = new javax.swing.JTextField();
        lblSupplierName = new javax.swing.JLabel();
        comboSupplierName = new javax.swing.JComboBox();
        lblPurchaseOrderDate = new javax.swing.JLabel();
        dccPurchaseOrderDate = new com.toedter.calendar.JDateChooser();
        dccPurchaseOrderExpectedDeliveryDate = new com.toedter.calendar.JDateChooser();
        lblPurchaseOrderExpectedDiliveryDate = new javax.swing.JLabel();

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

        getContentPane().add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, -1, 80));

        tablePurchaseOrder.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablePurchaseOrder.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePurchaseOrder.setRowHeight(30);
        jScrollPane1.setViewportView(tablePurchaseOrder);

        javax.swing.GroupLayout panelPurchaseOrderItemDetailLayout = new javax.swing.GroupLayout(panelPurchaseOrderItemDetail);
        panelPurchaseOrderItemDetail.setLayout(panelPurchaseOrderItemDetailLayout);
        panelPurchaseOrderItemDetailLayout.setHorizontalGroup(
            panelPurchaseOrderItemDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPurchaseOrderItemDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPurchaseOrderItemDetailLayout.setVerticalGroup(
            panelPurchaseOrderItemDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPurchaseOrderItemDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelPurchaseOrderItemDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1020, 380));

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

        lblPurchaseOrderDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPurchaseOrderDate.setText("PURCHASE ORDER DATE");

        lblPurchaseOrderExpectedDiliveryDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPurchaseOrderExpectedDiliveryDate.setText("EXPECTED DELIVERY DATE");

        javax.swing.GroupLayout panelPurchaseOrderItemHeaderLayout = new javax.swing.GroupLayout(panelPurchaseOrderItemHeader);
        panelPurchaseOrderItemHeader.setLayout(panelPurchaseOrderItemHeaderLayout);
        panelPurchaseOrderItemHeaderLayout.setHorizontalGroup(
            panelPurchaseOrderItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPurchaseOrderItemHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPurchaseOrderItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPurchaseOrderNumber)
                    .addComponent(lblSupplierName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPurchaseOrderItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPurchaseOrderNumber)
                    .addComponent(comboSupplierName, 0, 287, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(panelPurchaseOrderItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPurchaseOrderDate)
                    .addComponent(lblPurchaseOrderExpectedDiliveryDate))
                .addGap(21, 21, 21)
                .addGroup(panelPurchaseOrderItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dccPurchaseOrderExpectedDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dccPurchaseOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelPurchaseOrderItemHeaderLayout.setVerticalGroup(
            panelPurchaseOrderItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPurchaseOrderItemHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPurchaseOrderItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPurchaseOrderItemHeaderLayout.createSequentialGroup()
                        .addGroup(panelPurchaseOrderItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPurchaseOrderItemHeaderLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblPurchaseOrderDate))
                            .addComponent(dccPurchaseOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPurchaseOrderItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPurchaseOrderItemHeaderLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblPurchaseOrderExpectedDiliveryDate))
                            .addGroup(panelPurchaseOrderItemHeaderLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(dccPurchaseOrderExpectedDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelPurchaseOrderItemHeaderLayout.createSequentialGroup()
                        .addGroup(panelPurchaseOrderItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPurchaseOrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPurchaseOrderNumber))
                        .addGap(20, 20, 20)
                        .addGroup(panelPurchaseOrderItemHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPurchaseOrderItemHeaderLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblSupplierName))
                            .addComponent(comboSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(panelPurchaseOrderItemHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1020, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Saved.", "Purchase Order", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPurchaseOrderNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPurchaseOrderNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPurchaseOrderNumberActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        JOptionPane.showMessageDialog(this, "Print Successfully.", "Purchase Order", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtPurchaseOrderNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPurchaseOrderNumberKeyTyped
        if (txtPurchaseOrderNumber.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPurchaseOrderNumberKeyTyped

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
            java.util.logging.Logger.getLogger(frmPurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPurchaseOrder().setVisible(true);
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
    private com.toedter.calendar.JDateChooser dccPurchaseOrderDate;
    private com.toedter.calendar.JDateChooser dccPurchaseOrderExpectedDeliveryDate;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPurchaseOrderDate;
    private javax.swing.JLabel lblPurchaseOrderExpectedDiliveryDate;
    private javax.swing.JLabel lblPurchaseOrderNumber;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelPurchaseOrderItemDetail;
    private javax.swing.JPanel panelPurchaseOrderItemHeader;
    private javax.swing.JTable tablePurchaseOrder;
    private javax.swing.JTextField txtPurchaseOrderNumber;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtPurchaseOrderNumber.setText(null);
        dccPurchaseOrderDate.setDate(null);
        comboSupplierName.setSelectedIndex(0);
        dccPurchaseOrderExpectedDeliveryDate.setDate(null);
        
        txtPurchaseOrderNumber.requestFocus();
    }

    private void formFormat() {
        clearFields();
        
        this.setLocationRelativeTo(null);
    }
}
