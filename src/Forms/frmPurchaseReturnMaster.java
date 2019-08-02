package Forms;

import java.awt.Toolkit;

public class frmPurchaseReturnMaster extends javax.swing.JFrame {

    public frmPurchaseReturnMaster() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPurchaseItems = new javax.swing.JPanel();
        panelPurchaseSearchSection = new javax.swing.JPanel();
        lblPurchaseReturnNO = new javax.swing.JLabel();
        lblSupplierName = new javax.swing.JLabel();
        txtPurchaseReturnNO = new javax.swing.JTextField();
        comboSupplierName = new javax.swing.JComboBox();
        lblPurchaseReturnDate = new javax.swing.JLabel();
        dccPurchaseReturnDate = new com.toedter.calendar.JDateChooser();
        panelButtonsSearch = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        scrollPanePurchaseReturnItems = new javax.swing.JScrollPane();
        tablePurchaseReturnItems = new javax.swing.JTable();
        panelButtonsMain = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PURCHASE RETURN MASTER");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        panelPurchaseItems.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPurchaseSearchSection.setBackground(new java.awt.Color(45, 62, 80));
        panelPurchaseSearchSection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPurchaseReturnNO.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPurchaseReturnNO.setForeground(new java.awt.Color(255, 255, 255));
        lblPurchaseReturnNO.setText("PURCHASE RETURN NO");
        panelPurchaseSearchSection.add(lblPurchaseReturnNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblSupplierName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSupplierName.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplierName.setText("SUPPLIER NAME");
        panelPurchaseSearchSection.add(lblSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtPurchaseReturnNO.setBackground(new java.awt.Color(110, 122, 136));
        txtPurchaseReturnNO.setForeground(new java.awt.Color(255, 255, 255));
        txtPurchaseReturnNO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPurchaseReturnNOKeyTyped(evt);
            }
        });
        panelPurchaseSearchSection.add(txtPurchaseReturnNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 280, 30));

        comboSupplierName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Supplier Name -" }));
        panelPurchaseSearchSection.add(comboSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 680, 30));

        lblPurchaseReturnDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPurchaseReturnDate.setForeground(new java.awt.Color(255, 255, 255));
        lblPurchaseReturnDate.setText("PURCHASE RETURN DATE");
        panelPurchaseSearchSection.add(lblPurchaseReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));
        panelPurchaseSearchSection.add(dccPurchaseReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 200, 30));

        panelButtonsSearch.setBackground(new java.awt.Color(45, 62, 80));

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(53, 189, 252));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGroup(panelButtonsSearchLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        panelPurchaseSearchSection.add(panelButtonsSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 80));

        tablePurchaseReturnItems.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablePurchaseReturnItems.setModel(new javax.swing.table.DefaultTableModel(
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
                "PURCHASE RETURN NO", "PURCHASE RETURN DATE", "PURCHASE ORDER NO", "SUPPLIER NAME", "ITEM CODE", "ITEM NAME", "ITEM DESCRIPTION", "QUANTITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePurchaseReturnItems.setRowHeight(30);
        scrollPanePurchaseReturnItems.setViewportView(tablePurchaseReturnItems);

        panelPurchaseSearchSection.add(scrollPanePurchaseReturnItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1230, 300));

        panelButtonsMain.setBackground(new java.awt.Color(45, 62, 80));

        btnEdit.setBackground(new java.awt.Color(53, 189, 252));
        btnEdit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(53, 189, 252));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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

        btnAddNew.setBackground(new java.awt.Color(53, 189, 252));
        btnAddNew.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAddNew.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNew.setText("ADD NEW");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(53, 189, 252));
        btnRefresh.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

        panelPurchaseSearchSection.add(panelButtonsMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        panelPurchaseItems.add(panelPurchaseSearchSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPurchaseItems, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPurchaseItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        new frmPurchaseReturn().setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearfields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        new frmPurchaseReturn().setVisible(true);
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtPurchaseReturnNOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPurchaseReturnNOKeyTyped
        if (txtPurchaseReturnNO.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPurchaseReturnNOKeyTyped

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
            java.util.logging.Logger.getLogger(frmPurchaseReturnMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseReturnMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseReturnMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPurchaseReturnMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPurchaseReturnMaster().setVisible(true);
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
    private javax.swing.JComboBox comboSupplierName;
    private com.toedter.calendar.JDateChooser dccPurchaseReturnDate;
    private javax.swing.JLabel lblPurchaseReturnDate;
    private javax.swing.JLabel lblPurchaseReturnNO;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JPanel panelButtonsMain;
    private javax.swing.JPanel panelButtonsSearch;
    private javax.swing.JPanel panelPurchaseItems;
    private javax.swing.JPanel panelPurchaseSearchSection;
    private javax.swing.JScrollPane scrollPanePurchaseReturnItems;
    private javax.swing.JTable tablePurchaseReturnItems;
    private javax.swing.JTextField txtPurchaseReturnNO;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
        txtPurchaseReturnNO.setText(null);
        dccPurchaseReturnDate.setDate(null);
        comboSupplierName.setSelectedIndex(0);

        txtPurchaseReturnNO.requestFocus();
    }

    private void formFormat() {
        clearfields();
        
        this.setLocationRelativeTo(null);
    }
}
