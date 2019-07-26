package Forms;

import java.awt.Toolkit;

public class frmPurchaseOrderMaster extends javax.swing.JFrame {

    public frmPurchaseOrderMaster() {
        initComponents();
        
        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPurchaseItems = new javax.swing.JPanel();
        scrollPanePurchaseItems = new javax.swing.JScrollPane();
        tablePurchaseItems = new javax.swing.JTable();
        panelButtonsSearch = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        panelPurchaseSearchSection = new javax.swing.JPanel();
        lblPurchaseOrderNO = new javax.swing.JLabel();
        lblSupplierName = new javax.swing.JLabel();
        txtPurchaseOrderNO = new javax.swing.JTextField();
        comboSupplierName = new javax.swing.JComboBox();
        lblPurchaseOrderDate = new javax.swing.JLabel();
        dccPurchaseOrderDate = new com.toedter.calendar.JDateChooser();
        comboPaymentType = new javax.swing.JComboBox();
        lblPaymentType = new javax.swing.JLabel();
        panelButtonsMain = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PURCHASE ORDER MASTER");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        panelPurchaseItems.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablePurchaseItems.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablePurchaseItems.setModel(new javax.swing.table.DefaultTableModel(
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
                "PURCHASE ORDER NO", "PURCHASE ORDER DATE", "EXPECTED DELIVERY DATE", "SUPPLIER NAME", "ITEM CODE", "ITEM NAME", "ITEM DESCRIPTION", "QUANTITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePurchaseItems.setRowHeight(30);
        scrollPanePurchaseItems.setViewportView(tablePurchaseItems);

        panelPurchaseItems.add(scrollPanePurchaseItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1230, 330));

        btnReset.setBackground(new java.awt.Color(155, 194, 230));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(155, 194, 230));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsSearchLayout = new javax.swing.GroupLayout(panelButtonsSearch);
        panelButtonsSearch.setLayout(panelButtonsSearchLayout);
        panelButtonsSearchLayout.setHorizontalGroup(
            panelButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        panelButtonsSearchLayout.setVerticalGroup(
            panelButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelPurchaseItems.add(panelButtonsSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 310, 80));

        lblPurchaseOrderNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPurchaseOrderNO.setText("PURCHASE ORDER NO");

        lblSupplierName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSupplierName.setText("SUPPLIER NAME");

        txtPurchaseOrderNO.setBackground(new java.awt.Color(255, 255, 150));
        txtPurchaseOrderNO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPurchaseOrderNOKeyTyped(evt);
            }
        });

        comboSupplierName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Supplier Name -" }));

        lblPurchaseOrderDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPurchaseOrderDate.setText("PURCHASE ORDER DATE");

        dccPurchaseOrderDate.setBackground(new java.awt.Color(255, 255, 150));

        comboPaymentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Payment Type -" }));
        comboPaymentType.setToolTipText("");

        lblPaymentType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPaymentType.setText("PAYMENT TYPE");

        javax.swing.GroupLayout panelPurchaseSearchSectionLayout = new javax.swing.GroupLayout(panelPurchaseSearchSection);
        panelPurchaseSearchSection.setLayout(panelPurchaseSearchSectionLayout);
        panelPurchaseSearchSectionLayout.setHorizontalGroup(
            panelPurchaseSearchSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPurchaseSearchSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPurchaseSearchSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPurchaseSearchSectionLayout.createSequentialGroup()
                        .addComponent(lblPurchaseOrderNO)
                        .addGap(12, 12, 12)
                        .addComponent(txtPurchaseOrderNO, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblPurchaseOrderDate)
                        .addGap(17, 17, 17)
                        .addComponent(dccPurchaseOrderDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPurchaseSearchSectionLayout.createSequentialGroup()
                        .addComponent(lblSupplierName)
                        .addGap(45, 45, 45)
                        .addComponent(comboSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblPaymentType)
                        .addGap(67, 67, 67)
                        .addComponent(comboPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPurchaseSearchSectionLayout.setVerticalGroup(
            panelPurchaseSearchSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPurchaseSearchSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPurchaseSearchSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPurchaseOrderNO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dccPurchaseOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPurchaseSearchSectionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelPurchaseSearchSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPurchaseOrderNO)
                            .addComponent(lblPurchaseOrderDate))))
                .addGap(20, 20, 20)
                .addGroup(panelPurchaseSearchSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPurchaseSearchSectionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelPurchaseSearchSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSupplierName)
                            .addComponent(lblPaymentType))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPurchaseItems.add(panelPurchaseSearchSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 100));

        btnEdit.setBackground(new java.awt.Color(155, 194, 230));
        btnEdit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(155, 194, 230));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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

        btnAddNew.setBackground(new java.awt.Color(155, 194, 230));
        btnAddNew.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAddNew.setText("ADD NEW");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(155, 194, 230));
        btnRefresh.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsMainLayout = new javax.swing.GroupLayout(panelButtonsMain);
        panelButtonsMain.setLayout(panelButtonsMainLayout);
        panelButtonsMainLayout.setHorizontalGroup(
            panelButtonsMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelButtonsMainLayout.setVerticalGroup(
            panelButtonsMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelButtonsMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPurchaseItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelButtonsMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPurchaseItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelButtonsMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        new frmPurchaseOrder().setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearfields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        new frmPurchaseOrder().setVisible(true);
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtPurchaseOrderNOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPurchaseOrderNOKeyTyped
        if (txtPurchaseOrderNO.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPurchaseOrderNOKeyTyped

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
            java.util.logging.Logger.getLogger(frmPurchaseOrderMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseOrderMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseOrderMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseOrderMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPurchaseOrderMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox comboPaymentType;
    private javax.swing.JComboBox comboSupplierName;
    private com.toedter.calendar.JDateChooser dccPurchaseOrderDate;
    private javax.swing.JLabel lblPaymentType;
    private javax.swing.JLabel lblPurchaseOrderDate;
    private javax.swing.JLabel lblPurchaseOrderNO;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JPanel panelButtonsMain;
    private javax.swing.JPanel panelButtonsSearch;
    private javax.swing.JPanel panelPurchaseItems;
    private javax.swing.JPanel panelPurchaseSearchSection;
    private javax.swing.JScrollPane scrollPanePurchaseItems;
    private javax.swing.JTable tablePurchaseItems;
    private javax.swing.JTextField txtPurchaseOrderNO;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
        txtPurchaseOrderNO.setText(null);
        dccPurchaseOrderDate.setDate(null);
        comboSupplierName.setSelectedIndex(0);
        comboPaymentType.setSelectedIndex(0);
        
        txtPurchaseOrderNO.requestFocus();
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);
    }
}
