package Forms;

public class frmSalesMaster extends javax.swing.JFrame {

    public frmSalesMaster() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        lblPrivilageCardNO = new javax.swing.JPanel();
        lblInvoiceNO = new javax.swing.JLabel();
        lblInvoiceDate = new javax.swing.JLabel();
        lblPurchaseOrderNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGRN = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        lblPaymentType = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        comboPaymentType = new javax.swing.JComboBox();
        dccInvoiceDate = new com.toedter.calendar.JDateChooser();
        txtPurchaseOrderNumber = new javax.swing.JTextField();
        txtInvoiceNO = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SALES MASTER");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        lblPrivilageCardNO.setBackground(new java.awt.Color(45, 62, 80));
        lblPrivilageCardNO.setToolTipText("");
        lblPrivilageCardNO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInvoiceNO.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblInvoiceNO.setForeground(new java.awt.Color(255, 255, 255));
        lblInvoiceNO.setText("INVOICE NO.");
        lblPrivilageCardNO.add(lblInvoiceNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblInvoiceDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblInvoiceDate.setForeground(new java.awt.Color(255, 255, 255));
        lblInvoiceDate.setText("INVOICE DATE");
        lblPrivilageCardNO.add(lblInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        lblPurchaseOrderNumber.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPurchaseOrderNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPurchaseOrderNumber.setText("PRIVILAGE CARD NO.");
        lblPrivilageCardNO.add(lblPurchaseOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, -1));

        tableGRN.setBackground(new java.awt.Color(110, 122, 136));
        tableGRN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableGRN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "INVOICE NO", "INVOICE DATE", "PRIVILAGE CARD NO", "CUSTOMER NAME", "GROSS TOTAL", "TOTAL ITEM DISCOUNTL", "TOTAL ITEM DISCOUNT", "SPECIAL DISCOUNT", "SPECIAL DISCOUNT", "TOTAL DISCOUNT", "NET TOTAL", "PAYMENT TYPE", "CASH RECEIVED", "CREDIT RECEVED", "CASH BALANCE", "BANK NAME", "CARD NAME", "CARD YPE", "CARD NO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableGRN.setToolTipText("");
        tableGRN.setRowHeight(30);
        jScrollPane1.setViewportView(tableGRN);

        lblPrivilageCardNO.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1440, 340));

        jPanel2.setBackground(new java.awt.Color(45, 62, 80));
        jPanel2.setToolTipText("");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(btnAddNew)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblPrivilageCardNO.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 690, 80));

        lblPaymentType.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPaymentType.setForeground(new java.awt.Color(255, 255, 255));
        lblPaymentType.setText("PAYMENT TYPE");
        lblPrivilageCardNO.add(lblPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        lblCustomerName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerName.setText("CUSTOMER NAME");
        lblPrivilageCardNO.add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jPanel3.setBackground(new java.awt.Color(45, 62, 80));
        jPanel3.setToolTipText("");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        lblPrivilageCardNO.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 340, 70));

        comboPaymentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Payment Type -", "Cash", "Credit Card", "Debit Card" }));
        lblPrivilageCardNO.add(comboPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 180, 30));
        lblPrivilageCardNO.add(dccInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 180, 30));

        txtPurchaseOrderNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtPurchaseOrderNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtPurchaseOrderNumber.setToolTipText("");
        lblPrivilageCardNO.add(txtPurchaseOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 200, 30));

        txtInvoiceNO.setBackground(new java.awt.Color(110, 122, 136));
        txtInvoiceNO.setForeground(new java.awt.Color(255, 255, 255));
        txtInvoiceNO.setToolTipText("");
        lblPrivilageCardNO.add(txtInvoiceNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 250, 30));

        txtCustomerName.setBackground(new java.awt.Color(110, 122, 136));
        txtCustomerName.setForeground(new java.awt.Color(255, 255, 255));
        txtCustomerName.setToolTipText("");
        lblPrivilageCardNO.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrivilageCardNO, javax.swing.GroupLayout.PREFERRED_SIZE, 1462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPrivilageCardNO, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
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
        new frmSalesInvoice().setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearField();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        new frmSalesInvoice().setVisible(true);
    }//GEN-LAST:event_btnAddNewActionPerformed

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
            java.util.logging.Logger.getLogger(frmSalesMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSalesMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSalesMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSalesMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSalesMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboPaymentType;
    private com.toedter.calendar.JDateChooser dccInvoiceDate;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblInvoiceDate;
    private javax.swing.JLabel lblInvoiceNO;
    private javax.swing.JLabel lblPaymentType;
    private javax.swing.JPanel lblPrivilageCardNO;
    private javax.swing.JLabel lblPurchaseOrderNumber;
    private javax.swing.JTable tableGRN;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtInvoiceNO;
    private javax.swing.JTextField txtPurchaseOrderNumber;
    // End of variables declaration//GEN-END:variables

    private void clearField() {
        txtInvoiceNO.setText(null);
        txtPurchaseOrderNumber.setText(null);
        txtCustomerName.setText(null);

        dccInvoiceDate.setDate(null);

        comboPaymentType.setSelectedIndex(0);
        txtInvoiceNO.requestFocus();
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);
        
        clearField();
    }
}
