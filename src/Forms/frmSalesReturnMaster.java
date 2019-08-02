package Forms;

public class frmSalesReturnMaster extends javax.swing.JFrame {

    public frmSalesReturnMaster() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        lblInvoiceNO = new javax.swing.JLabel();
        lblInvoiceDate = new javax.swing.JLabel();
        lblPrivilageCardNO = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGRN = new javax.swing.JTable();
        lblPaymentType = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JPasswordField();
        lblCustomerName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        comboPaymentType = new javax.swing.JComboBox();
        dccInvoiceDate = new com.toedter.calendar.JDateChooser();
        txtPrivilageCardNO = new javax.swing.JTextField();
        txtInvoiceNO = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SALES RETURN MASTER");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 62, 80));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInvoiceNO.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblInvoiceNO.setForeground(new java.awt.Color(255, 255, 255));
        lblInvoiceNO.setText("INVOICE NO.");
        jPanel1.add(lblInvoiceNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblInvoiceDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblInvoiceDate.setForeground(new java.awt.Color(255, 255, 255));
        lblInvoiceDate.setText("INVOICE DATE");
        jPanel1.add(lblInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        lblPrivilageCardNO.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPrivilageCardNO.setForeground(new java.awt.Color(255, 255, 255));
        lblPrivilageCardNO.setText("PRIVILAGE CARD NO.");
        jPanel1.add(lblPrivilageCardNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        tableGRN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableGRN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "INVOICE NO", "INVOICE DATE", "PRIVILAGE CARD NO", "CUSTOMER NAME", "GROSS TOTAL", "RETURN PURPOSE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableGRN.setRowHeight(30);
        jScrollPane1.setViewportView(tableGRN);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 890, 340));

        lblPaymentType.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPaymentType.setForeground(new java.awt.Color(255, 255, 255));
        lblPaymentType.setText("PAYMENT TYPE");
        jPanel1.add(lblPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtCustomerName.setBackground(new java.awt.Color(110, 122, 136));
        txtCustomerName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 250, 30));

        lblCustomerName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerName.setText("CUSTOMER NAME");
        jPanel1.add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jPanel3.setBackground(new java.awt.Color(45, 62, 80));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 310, 70));

        comboPaymentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Payment Type -" }));
        jPanel1.add(comboPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 250, 30));
        jPanel1.add(dccInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 210, 30));

        txtPrivilageCardNO.setBackground(new java.awt.Color(110, 122, 136));
        txtPrivilageCardNO.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPrivilageCardNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 210, 30));

        txtInvoiceNO.setBackground(new java.awt.Color(110, 122, 136));
        txtInvoiceNO.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtInvoiceNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 250, 30));

        jPanel2.setBackground(new java.awt.Color(45, 62, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEdit.setBackground(new java.awt.Color(53, 189, 252));
        btnEdit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel2.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 13, 140, 60));

        btnDelete.setBackground(new java.awt.Color(53, 189, 252));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 13, 140, 60));

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 13, 140, 60));

        btnAddNew.setBackground(new java.awt.Color(53, 189, 252));
        btnAddNew.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAddNew.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNew.setText("ADD NEW");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 640, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        new frmSalesReturnNote().setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearfields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        new frmSalesReturnNote().setVisible(true);
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
            java.util.logging.Logger.getLogger(frmSalesReturnMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSalesReturnMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSalesReturnMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSalesReturnMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSalesReturnMaster().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblInvoiceDate;
    private javax.swing.JLabel lblInvoiceNO;
    private javax.swing.JLabel lblPaymentType;
    private javax.swing.JLabel lblPrivilageCardNO;
    private javax.swing.JTable tableGRN;
    private javax.swing.JPasswordField txtCustomerName;
    private javax.swing.JTextField txtInvoiceNO;
    private javax.swing.JTextField txtPrivilageCardNO;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
        txtInvoiceNO.setText(null);
        txtPrivilageCardNO.setText(null);
        txtCustomerName.setText(null);

        dccInvoiceDate.setDate(null);

        comboPaymentType.setSelectedIndex(0);

        txtInvoiceNO.requestFocus();
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);
        
        clearfields();
    }
}
