package Forms;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmProductMaster extends javax.swing.JFrame {

    public frmProductMaster() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        lblCode = new javax.swing.JLabel();
        lblBatchNO = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblCode1 = new javax.swing.JLabel();
        lblBatchNO1 = new javax.swing.JLabel();
        lblProductName1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProductMaster1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnEdit1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnClose1 = new javax.swing.JButton();
        btnAddNew1 = new javax.swing.JButton();
        lblStatus1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnReset1 = new javax.swing.JButton();
        btnSearch1 = new javax.swing.JButton();
        txtBatchNO = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        comboStatus = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PRODUCT MASTOR");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCode.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCode.setForeground(new java.awt.Color(255, 255, 255));
        lblCode.setText("CODE");
        jPanel1.add(lblCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblBatchNO.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblBatchNO.setForeground(new java.awt.Color(255, 255, 255));
        lblBatchNO.setText("BATCH NO ");
        jPanel1.add(lblBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        lblProductName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(255, 255, 255));
        lblProductName.setText("PRODUCT NAME ");
        jPanel1.add(lblProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        lblStatus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("STATUS");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, -1, 20));

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
                .addContainerGap(20, Short.MAX_VALUE)
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 330, 70));

        jPanel4.setBackground(new java.awt.Color(45, 62, 80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCode1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblCode1.setText("CODE");
        jPanel4.add(lblCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblBatchNO1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblBatchNO1.setText("BATCH NO ");
        jPanel4.add(lblBatchNO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        lblProductName1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblProductName1.setText("PRODUCT NAME ");
        jPanel4.add(lblProductName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        tableProductMaster1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableProductMaster1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CODE", "BATCH NO", "PRODUCT NAME", "DISCRIPTION", "SUPPLIER NAME", "STATUS", "RUNNING STOCK", "REORDER LEVEL", "MANUFACTURE DATE", "PACKED DATE", "EXPIRY DATE", "PURCHACE PRICE", "SALES PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProductMaster1.setRowHeight(30);
        jScrollPane2.setViewportView(tableProductMaster1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1440, 340));

        jPanel5.setBackground(new java.awt.Color(45, 62, 80));

        btnEdit1.setBackground(new java.awt.Color(53, 189, 252));
        btnEdit1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnEdit1.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit1.setText("EDIT");
        btnEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit1ActionPerformed(evt);
            }
        });

        btnDelete1.setBackground(new java.awt.Color(53, 189, 252));
        btnDelete1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnDelete1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete1.setText("DELETE");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnClose1.setBackground(new java.awt.Color(255, 56, 29));
        btnClose1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose1.setForeground(new java.awt.Color(255, 255, 255));
        btnClose1.setText("CLOSE");
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        btnAddNew1.setBackground(new java.awt.Color(53, 189, 252));
        btnAddNew1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAddNew1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNew1.setText("ADD NEW");
        btnAddNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNew1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addComponent(btnAddNew1)
                .addGap(18, 18, 18)
                .addComponent(btnEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, 80));

        lblStatus1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblStatus1.setText("STATUS");
        jPanel4.add(lblStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, -1, 20));

        btnReset1.setBackground(new java.awt.Color(155, 194, 230));
        btnReset1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset1.setText("RESET");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });

        btnSearch1.setBackground(new java.awt.Color(155, 194, 230));
        btnSearch1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSearch1.setText("SEARCH");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 330, 70));

        txtBatchNO.setBackground(new java.awt.Color(110, 122, 136));
        txtBatchNO.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtBatchNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 140, 30));

        txtProductName.setBackground(new java.awt.Color(110, 122, 136));
        txtProductName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 200, 30));

        txtCode.setBackground(new java.awt.Color(110, 122, 136));
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 140, 30));

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL", "ACTIVE", "INACTIVE" }));
        jPanel4.add(comboStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 32, 150, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1469, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
        new frmProduct().setVisible(true);
    }//GEN-LAST:event_btnEdit1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Deleted.", "Product Master", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void btnAddNew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNew1ActionPerformed
        new frmProduct().setVisible(true);
    }//GEN-LAST:event_btnAddNew1ActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReset1ActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearch1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmProductMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew1;
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnEdit1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboStatus;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBatchNO;
    private javax.swing.JLabel lblBatchNO1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblCode1;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductName1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JTable tableProductMaster1;
    private javax.swing.JTextField txtBatchNO;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtCode.setText(null);
        txtBatchNO.setText(null);
        txtProductName.setText(null);
        comboStatus.setSelectedIndex(0);

        txtCode.requestFocus();
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);

        clearFields();

//        String = "{"CODE", "BATCH NO", "PRODUCT NAME", "DISCRIPTION", "SUPPLIER NAME", "STATUS	Double", "RUNNING STOCK", "REORDER LEVEL", "MANUFACTURE DATE", "PACKED DATE", "EXPIRY DATE", "PURCHACE PRICE", "SALES PRICE"}";
    }
}
