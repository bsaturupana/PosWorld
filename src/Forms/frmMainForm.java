package Forms;

public class frmMainForm extends javax.swing.JFrame {

    public frmMainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JDesktopPane();
        mnuMenuBar = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuFile_Log_In = new javax.swing.JMenuItem();
        mnuFile_Log_Out = new javax.swing.JMenuItem();
        mnuFile_Separator = new javax.swing.JPopupMenu.Separator();
        mnuFile_Exit = new javax.swing.JMenuItem();
        mnuEdit = new javax.swing.JMenu();
        mnuSetup = new javax.swing.JMenu();
        mnuSetup_Accounts = new javax.swing.JMenuItem();
        mnuSetup_Separator = new javax.swing.JPopupMenu.Separator();
        mnuSetup_Product = new javax.swing.JMenuItem();
        mnuTransaction = new javax.swing.JMenu();
        mnuTransaction_Purchase_Order = new javax.swing.JMenuItem();
        mnuTransaction_Purchase_Return = new javax.swing.JMenuItem();
        mnuTransaction_Separator_1 = new javax.swing.JPopupMenu.Separator();
        mnuTransaction_Goods_Received_Note = new javax.swing.JMenuItem();
        mnuTransaction_Goods_Return_Note = new javax.swing.JMenuItem();
        mnuTransaction_Separator_2 = new javax.swing.JPopupMenu.Separator();
        mnuTransaction_Sales_Invoice = new javax.swing.JMenuItem();
        mnuTransaction_Sales_Return = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mnuFile.setText("File");

        mnuFile_Log_In.setText("Log In");
        mnuFile_Log_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFile_Log_InActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFile_Log_In);

        mnuFile_Log_Out.setText("Log Out");
        mnuFile.add(mnuFile_Log_Out);
        mnuFile.add(mnuFile_Separator);

        mnuFile_Exit.setText("Exit");
        mnuFile_Exit.setToolTipText("");
        mnuFile_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuFile_ExitMouseClicked(evt);
            }
        });
        mnuFile_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFile_ExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFile_Exit);

        mnuMenuBar.add(mnuFile);

        mnuEdit.setText("Edit");
        mnuMenuBar.add(mnuEdit);

        mnuSetup.setText("Setup");

        mnuSetup_Accounts.setText("Accounts");
        mnuSetup_Accounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSetup_AccountsActionPerformed(evt);
            }
        });
        mnuSetup.add(mnuSetup_Accounts);
        mnuSetup.add(mnuSetup_Separator);

        mnuSetup_Product.setText("Product");
        mnuSetup_Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSetup_ProductActionPerformed(evt);
            }
        });
        mnuSetup.add(mnuSetup_Product);

        mnuMenuBar.add(mnuSetup);

        mnuTransaction.setText("Transaction");

        mnuTransaction_Purchase_Order.setText("Purchase Order");
        mnuTransaction_Purchase_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTransaction_Purchase_OrderActionPerformed(evt);
            }
        });
        mnuTransaction.add(mnuTransaction_Purchase_Order);

        mnuTransaction_Purchase_Return.setText("Purchase Return");
        mnuTransaction_Purchase_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTransaction_Purchase_ReturnActionPerformed(evt);
            }
        });
        mnuTransaction.add(mnuTransaction_Purchase_Return);
        mnuTransaction.add(mnuTransaction_Separator_1);

        mnuTransaction_Goods_Received_Note.setText("Goods Received Note");
        mnuTransaction_Goods_Received_Note.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTransaction_Goods_Received_NoteActionPerformed(evt);
            }
        });
        mnuTransaction.add(mnuTransaction_Goods_Received_Note);

        mnuTransaction_Goods_Return_Note.setText("Goods Return Note");
        mnuTransaction_Goods_Return_Note.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTransaction_Goods_Return_NoteActionPerformed(evt);
            }
        });
        mnuTransaction.add(mnuTransaction_Goods_Return_Note);
        mnuTransaction.add(mnuTransaction_Separator_2);

        mnuTransaction_Sales_Invoice.setText("Sales Invoice");
        mnuTransaction_Sales_Invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTransaction_Sales_InvoiceActionPerformed(evt);
            }
        });
        mnuTransaction.add(mnuTransaction_Sales_Invoice);

        mnuTransaction_Sales_Return.setText("Sales Return");
        mnuTransaction_Sales_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTransaction_Sales_ReturnActionPerformed(evt);
            }
        });
        mnuTransaction.add(mnuTransaction_Sales_Return);

        mnuMenuBar.add(mnuTransaction);

        setJMenuBar(mnuMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFile_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuFile_ExitMouseClicked

    }//GEN-LAST:event_mnuFile_ExitMouseClicked

    private void mnuFile_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFile_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuFile_ExitActionPerformed

    private void mnuFile_Log_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFile_Log_InActionPerformed
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_mnuFile_Log_InActionPerformed

    private void mnuTransaction_Sales_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTransaction_Sales_ReturnActionPerformed
        new frmSalesReturnMaster().setVisible(true);
    }//GEN-LAST:event_mnuTransaction_Sales_ReturnActionPerformed

    private void mnuSetup_AccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSetup_AccountsActionPerformed
        new frmAccountMaster().setVisible(true);
    }//GEN-LAST:event_mnuSetup_AccountsActionPerformed

    private void mnuSetup_ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSetup_ProductActionPerformed
        new frmProductMaster().setVisible(true);
    }//GEN-LAST:event_mnuSetup_ProductActionPerformed

    private void mnuTransaction_Purchase_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTransaction_Purchase_OrderActionPerformed
        new frmPurchaseOrderMaster().setVisible(true);
    }//GEN-LAST:event_mnuTransaction_Purchase_OrderActionPerformed

    private void mnuTransaction_Purchase_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTransaction_Purchase_ReturnActionPerformed
    }//GEN-LAST:event_mnuTransaction_Purchase_ReturnActionPerformed

    private void mnuTransaction_Goods_Received_NoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTransaction_Goods_Received_NoteActionPerformed
        new frmGoodsReceivedMaster().setVisible(true);
    }//GEN-LAST:event_mnuTransaction_Goods_Received_NoteActionPerformed

    private void mnuTransaction_Goods_Return_NoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTransaction_Goods_Return_NoteActionPerformed
        new frmGoodsReturnMaster().setVisible(true);
    }//GEN-LAST:event_mnuTransaction_Goods_Return_NoteActionPerformed

    private void mnuTransaction_Sales_InvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTransaction_Sales_InvoiceActionPerformed
        new frmSalesMaster().setVisible(true);
    }//GEN-LAST:event_mnuTransaction_Sales_InvoiceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(frmMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jLayeredPane1;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuFile_Exit;
    private javax.swing.JMenuItem mnuFile_Log_In;
    private javax.swing.JMenuItem mnuFile_Log_Out;
    private javax.swing.JPopupMenu.Separator mnuFile_Separator;
    private javax.swing.JMenuBar mnuMenuBar;
    private javax.swing.JMenu mnuSetup;
    private javax.swing.JMenuItem mnuSetup_Accounts;
    private javax.swing.JMenuItem mnuSetup_Product;
    private javax.swing.JPopupMenu.Separator mnuSetup_Separator;
    private javax.swing.JMenu mnuTransaction;
    private javax.swing.JMenuItem mnuTransaction_Goods_Received_Note;
    private javax.swing.JMenuItem mnuTransaction_Goods_Return_Note;
    private javax.swing.JMenuItem mnuTransaction_Purchase_Order;
    private javax.swing.JMenuItem mnuTransaction_Purchase_Return;
    private javax.swing.JMenuItem mnuTransaction_Sales_Invoice;
    private javax.swing.JMenuItem mnuTransaction_Sales_Return;
    private javax.swing.JPopupMenu.Separator mnuTransaction_Separator_1;
    private javax.swing.JPopupMenu.Separator mnuTransaction_Separator_2;
    // End of variables declaration//GEN-END:variables
}
