package Forms;

public class frmsalesReturnNote extends javax.swing.JFrame {

    public frmsalesReturnNote() {
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
        lblPrivilageCard = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblInvoiceDate = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lblInvoiceNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSalesInvoice = new javax.swing.JTable();
        txtBatchNO = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtReturnPurpose = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtsalesPrice = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        txtDiscription1 = new javax.swing.JTextField();
        dccInvoiceDate = new com.toedter.calendar.JDateChooser();
        txtInvoiceNumber = new javax.swing.JTextField();
        txtPrivilageCard = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbltotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblPaymentType = new javax.swing.JLabel();
        txtPaymentType = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SALES RETURN NOTE");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrivilageCard.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPrivilageCard.setText("PRIVILAGE CARD");
        jPanel1.add(lblPrivilageCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblCustomerName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblCustomerName.setText("CUSTOMER NAME");
        jPanel1.add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        lblInvoiceDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblInvoiceDate.setText("INVOICE DATE");
        jPanel1.add(lblInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, -1));

        txtCustomerName.setBackground(new java.awt.Color(255, 255, 150));
        txtCustomerName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 320, 30));

        lblInvoiceNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblInvoiceNumber.setText("INVOICE NUMBER");
        jPanel1.add(lblInvoiceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        tableSalesInvoice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableSalesInvoice.setModel(new javax.swing.table.DefaultTableModel(
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
                "CODE", "BATCH NO.", "NAME", "DISCRIPTION", "RETURN PURPOSE", "UNIT PRICE", "QUANTITY", "SALES RETURN PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSalesInvoice.setRowHeight(30);
        jScrollPane1.setViewportView(tableSalesInvoice);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1230, 330));

        txtBatchNO.setBackground(new java.awt.Color(255, 255, 150));
        txtBatchNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 150, 30));

        txtName.setBackground(new java.awt.Color(255, 255, 150));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 150, 30));

        txtReturnPurpose.setBackground(new java.awt.Color(255, 255, 150));
        txtReturnPurpose.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtReturnPurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 160, 30));

        txtUnitPrice.setBackground(new java.awt.Color(255, 255, 150));
        txtUnitPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 140, 30));

        txtQuantity.setBackground(new java.awt.Color(255, 255, 150));
        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, 160, 30));

        txtsalesPrice.setBackground(new java.awt.Color(255, 255, 150));
        txtsalesPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtsalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 60, 170, 30));

        txtCode.setBackground(new java.awt.Color(255, 255, 150));
        txtCode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 30));

        txtDiscription1.setBackground(new java.awt.Color(255, 255, 150));
        txtDiscription1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtDiscription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 150, 30));
        jPanel1.add(dccInvoiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 160, 30));

        txtInvoiceNumber.setBackground(new java.awt.Color(255, 255, 150));
        txtInvoiceNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtInvoiceNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtInvoiceNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInvoiceNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtInvoiceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 120, 29));

        txtPrivilageCard.setBackground(new java.awt.Color(255, 255, 150));
        txtPrivilageCard.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPrivilageCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPrivilageCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrivilageCardActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrivilageCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, 29));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(669, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltotal.setText("TOTAL");
        lbltotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTotal.setBackground(new java.awt.Color(255, 255, 150));
        txtTotal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        lblPaymentType.setText("PAYMENT TYPE");
        lblPaymentType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPaymentType.setBackground(new java.awt.Color(255, 255, 150));
        txtPaymentType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPaymentType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPaymentType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPaymentType, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(txtTotal))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
          this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearfields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        clearfields();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtPaymentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentTypeActionPerformed

    private void txtInvoiceNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInvoiceNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInvoiceNumberActionPerformed

    private void txtPrivilageCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrivilageCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrivilageCardActionPerformed

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
            java.util.logging.Logger.getLogger(frmsalesReturnNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmsalesReturnNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmsalesReturnNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmsalesReturnNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmsalesReturnNote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dccInvoiceDate;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblInvoiceDate;
    private javax.swing.JLabel lblInvoiceNumber;
    private javax.swing.JLabel lblPaymentType;
    private javax.swing.JLabel lblPrivilageCard;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable tableSalesInvoice;
    private javax.swing.JTextField txtBatchNO;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDiscription1;
    private javax.swing.JTextField txtInvoiceNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPaymentType;
    private javax.swing.JTextField txtPrivilageCard;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtReturnPurpose;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUnitPrice;
    private javax.swing.JTextField txtsalesPrice;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
        txtPrivilageCard.setText(null);
        txtName.setText(null);
        txtInvoiceNumber.setText(null);
        txtTotal.setText(null);
        txtPaymentType.setText(null);
       
        dccInvoiceDate.setDate(null);
        
        txtPrivilageCard.requestFocus();
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);
    }
}
