package Forms;

public class frmPurchaseOrder extends javax.swing.JFrame {

    public frmPurchaseOrder() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        lblOrderNumber = new javax.swing.JLabel();
        lblOrderDate = new javax.swing.JLabel();
        lblSupplier = new javax.swing.JLabel();
        lblExpectedDiliveryDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePurchaseOrder = new javax.swing.JTable();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDiscription = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        ComboSupplier = new javax.swing.JComboBox();
        dccExpectedDeliveryDate = new com.toedter.calendar.JDateChooser();
        dccOrderDate = new com.toedter.calendar.JDateChooser();
        txtOrderNumber = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PURCHASE ORDER");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrderNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblOrderNumber.setText("ORDER NUMBER");
        jPanel1.add(lblOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lblOrderDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblOrderDate.setText("ORDER DATE");
        jPanel1.add(lblOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        lblSupplier.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSupplier.setText("SUPPLIER");
        jPanel1.add(lblSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lblExpectedDiliveryDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblExpectedDiliveryDate.setText("EXPECTED DELIVERY DATE");
        jPanel1.add(lblExpectedDiliveryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

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
                "CODE", "NAME", "DISCRIPTION", "QUANTITY"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1000, 360));

        txtCode.setBackground(new java.awt.Color(255, 255, 150));
        txtCode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 250, 30));

        txtName.setBackground(new java.awt.Color(255, 255, 150));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 250, 30));

        txtDiscription.setBackground(new java.awt.Color(255, 255, 150));
        txtDiscription.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 250, 30));

        txtQuantity.setBackground(new java.awt.Color(255, 255, 150));
        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 250, 30));

        ComboSupplier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Supplier -" }));
        jPanel1.add(ComboSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 310, 30));
        jPanel1.add(dccExpectedDeliveryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 250, 30));
        jPanel1.add(dccOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 250, 30));

        txtOrderNumber.setBackground(new java.awt.Color(255, 255, 150));
        txtOrderNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtOrderNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 310, 30));

        btnUpdate.setBackground(new java.awt.Color(155, 194, 230));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearfields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        clearfields();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtOrderNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderNumberActionPerformed

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
    private javax.swing.JComboBox ComboSupplier;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dccExpectedDeliveryDate;
    private com.toedter.calendar.JDateChooser dccOrderDate;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExpectedDiliveryDate;
    private javax.swing.JLabel lblOrderDate;
    private javax.swing.JLabel lblOrderNumber;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JTable tablePurchaseOrder;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrderNumber;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
      txtOrderNumber.setText(null);
      
      dccOrderDate.setDate(null);
      dccExpectedDeliveryDate.setDate(null);
      
      ComboSupplier.setSelectedIndex(0);
      
    }
}
