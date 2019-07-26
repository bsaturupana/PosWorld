package Forms;

public class frmUser extends javax.swing.JFrame {

    public frmUser() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        lblEmployeeID = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lblNICNumber = new javax.swing.JLabel();
        txtNICNumber = new javax.swing.JTextField();
        lblMobileNO = new javax.swing.JLabel();
        txtMobileNO = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPassportNO = new javax.swing.JLabel();
        txtPassportNO = new javax.swing.JTextField();
        lblResidentNO = new javax.swing.JLabel();
        txtResidentNO = new javax.swing.JTextField();
        lblNationality = new javax.swing.JLabel();
        comboNationality = new javax.swing.JComboBox();
        lblRelegon = new javax.swing.JLabel();
        comboRelegon = new javax.swing.JComboBox();
        lblGender1 = new javax.swing.JLabel();
        comboGender1 = new javax.swing.JComboBox();
        lblRace = new javax.swing.JLabel();
        comboRace = new javax.swing.JComboBox();
        lblAddress1 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        radioActive = new javax.swing.JRadioButton();
        radioInactive = new javax.swing.JRadioButton();
        txtAddress1 = new javax.swing.JTextField();
        lblUserRole = new javax.swing.JLabel();
        comboUserRole = new javax.swing.JComboBox();
        lblFullName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        panel1 = new javax.swing.JPanel();
        txtRemark = new javax.swing.JTextField();
        lblRemarks = new javax.swing.JLabel();
        txtAnswer1 = new javax.swing.JTextField();
        comboSQ1 = new javax.swing.JComboBox();
        lblAnswer1 = new javax.swing.JLabel();
        lblSQ1 = new javax.swing.JLabel();
        lblSQ2 = new javax.swing.JLabel();
        comboSQ2 = new javax.swing.JComboBox();
        txtAnswer2 = new javax.swing.JTextField();
        lblAnswer2 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblConfirmPassword = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USER");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmployeeID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblEmployeeID.setText("EMPLOYEE ID");
        jPanel4.add(lblEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtEmployeeID.setBackground(new java.awt.Color(255, 255, 150));
        txtEmployeeID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel4.add(txtEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 250, 30));

        lblNICNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblNICNumber.setText("NIC NUMBER");
        jPanel4.add(lblNICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        txtNICNumber.setBackground(new java.awt.Color(255, 255, 150));
        txtNICNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel4.add(txtNICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 250, 30));

        lblMobileNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblMobileNO.setText("MOBILE NO");
        jPanel4.add(lblMobileNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txtMobileNO.setBackground(new java.awt.Color(255, 255, 150));
        txtMobileNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel4.add(txtMobileNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 250, 30));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblEmail.setText("E - MAIL ");
        jPanel4.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        txtEmail.setBackground(new java.awt.Color(255, 255, 150));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel4.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 250, 30));

        lblPassportNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPassportNO.setText("PASSPORT NO");
        jPanel4.add(lblPassportNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        txtPassportNO.setBackground(new java.awt.Color(255, 255, 150));
        txtPassportNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel4.add(txtPassportNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 250, 30));

        lblResidentNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblResidentNO.setText("RESIDENTS NO ");
        jPanel4.add(lblResidentNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        txtResidentNO.setBackground(new java.awt.Color(255, 255, 150));
        txtResidentNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel4.add(txtResidentNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 250, 30));

        lblNationality.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblNationality.setText("NATIONALITY");
        jPanel4.add(lblNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        comboNationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Nationality-", "Srilanken", "Other" }));
        jPanel4.add(comboNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 250, 30));

        lblRelegon.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRelegon.setText("RELEGON");
        jPanel4.add(lblRelegon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        comboRelegon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Relegon -", "Budhist", "Catholic", "Hindu", "Islam", "Other" }));
        jPanel4.add(comboRelegon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 250, 30));

        lblGender1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblGender1.setText("GENDER");
        jPanel4.add(lblGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        comboGender1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Gender -", "Male", "Female", "Other" }));
        jPanel4.add(comboGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 250, 30));

        lblRace.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRace.setText("RACE");
        jPanel4.add(lblRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        comboRace.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Race -", "Sinhala", "Tamil", "Muslim", "Burgher", "Other" }));
        jPanel4.add(comboRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 250, 30));

        lblAddress1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblAddress1.setText("ADDRESS");
        jPanel4.add(lblAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        lblStatus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblStatus.setText("STATUS");
        jPanel4.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        buttonGroup1.add(radioActive);
        radioActive.setText("ACTIVE");
        radioActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioActiveActionPerformed(evt);
            }
        });
        jPanel4.add(radioActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 80, -1));

        buttonGroup1.add(radioInactive);
        radioInactive.setText("INACTIVE");
        jPanel4.add(radioInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, -1));

        txtAddress1.setBackground(new java.awt.Color(255, 255, 150));
        txtAddress1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel4.add(txtAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 250, 90));

        lblUserRole.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblUserRole.setText("USER ROLE");
        jPanel4.add(lblUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        comboUserRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select User Role -" }));
        jPanel4.add(comboUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 250, 30));

        lblFullName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblFullName.setText("FULL NAME");
        jPanel4.add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtFullName.setBackground(new java.awt.Color(255, 255, 150));
        txtFullName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel4.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 250, 30));

        jTabbedPane1.addTab("GENERAL", jPanel4);

        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRemark.setBackground(new java.awt.Color(255, 255, 150));
        txtRemark.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        panel1.add(txtRemark, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 570, 30));

        lblRemarks.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRemarks.setText("REMARKS");
        panel1.add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        txtAnswer1.setBackground(new java.awt.Color(255, 255, 150));
        txtAnswer1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer1ActionPerformed(evt);
            }
        });
        panel1.add(txtAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 570, 30));

        comboSQ1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Sequrity Quection 1 -" }));
        panel1.add(comboSQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 570, 30));

        lblAnswer1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblAnswer1.setText("SECURITY ANSWER  1");
        panel1.add(lblAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        lblSQ1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSQ1.setText("SECURITY QUECTION 1");
        panel1.add(lblSQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lblSQ2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSQ2.setText("SECURITY QUECTION 2");
        panel1.add(lblSQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        comboSQ2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Sequrity Quection 2 -" }));
        panel1.add(comboSQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 570, 30));

        txtAnswer2.setBackground(new java.awt.Color(255, 255, 150));
        txtAnswer2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer2ActionPerformed(evt);
            }
        });
        panel1.add(txtAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 570, 30));

        lblAnswer2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblAnswer2.setText("SECURITY ANSWER  2");
        panel1.add(lblAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        lblUsername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblUsername.setText("USERNAME");
        panel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtUsername.setBackground(new java.awt.Color(255, 255, 150));
        txtUsername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        panel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 30));

        txtConfirmPassword.setBackground(new java.awt.Color(255, 255, 150));
        panel1.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 250, 30));

        lblConfirmPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblConfirmPassword.setText("CONFIRM PASSWORD");
        panel1.add(lblConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lblPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPassword.setText("PASSWORD");
        panel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, -1, -1));

        txtPassword.setBackground(new java.awt.Color(255, 255, 150));
        panel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 250, 30));

        jTabbedPane1.addTab("DETAILS", panel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton1.setBackground(new java.awt.Color(155, 194, 230));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("BROWS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USER IMAGE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("OTHER", jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 830, 520));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        clearFields();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswer2ActionPerformed

    private void txtAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswer1ActionPerformed

    private void radioActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioActiveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox comboGender1;
    private javax.swing.JComboBox comboNationality;
    private javax.swing.JComboBox comboRace;
    private javax.swing.JComboBox comboRelegon;
    private javax.swing.JComboBox comboSQ1;
    private javax.swing.JComboBox comboSQ2;
    private javax.swing.JComboBox comboUserRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblAnswer1;
    private javax.swing.JLabel lblAnswer2;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblGender1;
    private javax.swing.JLabel lblMobileNO;
    private javax.swing.JLabel lblNICNumber;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblPassportNO;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblRelegon;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblResidentNO;
    private javax.swing.JLabel lblSQ1;
    private javax.swing.JLabel lblSQ2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUserRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panel1;
    private javax.swing.JRadioButton radioActive;
    private javax.swing.JRadioButton radioInactive;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAnswer1;
    private javax.swing.JTextField txtAnswer2;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtMobileNO;
    private javax.swing.JTextField txtNICNumber;
    private javax.swing.JTextField txtPassportNO;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRemark;
    private javax.swing.JTextField txtResidentNO;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtAddress1.setText(null);
        txtAnswer1.setText(null);
        txtAnswer2.setText(null);
        txtConfirmPassword.setText(null);
        txtEmail.setText(null);
        txtEmployeeID.setText(null);
        txtFullName.setText(null);
        txtMobileNO.setText(null);
        txtNICNumber.setText(null);
        txtPassportNO.setText(null);
        txtPassword.setText(null);
        txtRemark.setText(null);
        txtResidentNO.setText(null);
        txtUsername.setText(null);

        comboGender1.setSelectedIndex(0);
        comboNationality.setSelectedIndex(0);
        comboRace.setSelectedIndex(0);
        comboRelegon.setSelectedIndex(0);
        comboSQ1.setSelectedIndex(0);
        comboSQ2.setSelectedIndex(0);
        comboUserRole.setSelectedIndex(0);

        radioActive.setSelected(true);
        radioInactive.setSelected(false);
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);
        
        clearFields();
    }
}
