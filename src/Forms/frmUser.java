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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("USER");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(45, 62, 80));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setToolTipText("");
        jPanel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmployeeID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblEmployeeID.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeID.setText("EMPLOYEE ID");
        jPanel4.add(lblEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtEmployeeID.setBackground(new java.awt.Color(110, 122, 136));
        txtEmployeeID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtEmployeeID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, 30));

        lblNICNumber.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNICNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblNICNumber.setText("NIC NUMBER");
        jPanel4.add(lblNICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        txtNICNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtNICNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNICNumber.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtNICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 250, 30));

        lblMobileNO.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblMobileNO.setForeground(new java.awt.Color(255, 255, 255));
        lblMobileNO.setText("MOBILE NO");
        jPanel4.add(lblMobileNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txtMobileNO.setBackground(new java.awt.Color(110, 122, 136));
        txtMobileNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtMobileNO.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtMobileNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 250, 30));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E - MAIL ");
        jPanel4.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        txtEmail.setBackground(new java.awt.Color(110, 122, 136));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 250, 30));

        lblPassportNO.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPassportNO.setForeground(new java.awt.Color(255, 255, 255));
        lblPassportNO.setText("PASSPORT NO");
        jPanel4.add(lblPassportNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        txtPassportNO.setBackground(new java.awt.Color(110, 122, 136));
        txtPassportNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPassportNO.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtPassportNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 250, 30));

        lblResidentNO.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblResidentNO.setForeground(new java.awt.Color(255, 255, 255));
        lblResidentNO.setText("RESIDENTS NO ");
        jPanel4.add(lblResidentNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        txtResidentNO.setBackground(new java.awt.Color(110, 122, 136));
        txtResidentNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtResidentNO.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtResidentNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 250, 30));

        lblNationality.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNationality.setForeground(new java.awt.Color(255, 255, 255));
        lblNationality.setText("NATIONALITY");
        jPanel4.add(lblNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        comboNationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Nationality-", "Srilanken", "Other" }));
        jPanel4.add(comboNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 250, 30));

        lblRelegon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblRelegon.setForeground(new java.awt.Color(255, 255, 255));
        lblRelegon.setText("RELEGON");
        jPanel4.add(lblRelegon, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        comboRelegon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Relegon -", "Budhist", "Catholic", "Hindu", "Islam", "Other" }));
        jPanel4.add(comboRelegon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 250, 30));

        lblGender1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblGender1.setForeground(new java.awt.Color(255, 255, 255));
        lblGender1.setText("GENDER");
        jPanel4.add(lblGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        comboGender1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Gender -", "Male", "Female", "Other" }));
        jPanel4.add(comboGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 250, 30));

        lblRace.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblRace.setForeground(new java.awt.Color(255, 255, 255));
        lblRace.setText("RACE");
        jPanel4.add(lblRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        comboRace.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Race -", "Sinhala", "Tamil", "Muslim", "Burgher", "Other" }));
        jPanel4.add(comboRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 250, 30));

        lblAddress1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblAddress1.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress1.setText("ADDRESS");
        jPanel4.add(lblAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        lblStatus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("STATUS");
        jPanel4.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        buttonGroup1.add(radioActive);
        radioActive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioActive.setForeground(new java.awt.Color(255, 255, 255));
        radioActive.setText("ACTIVE");
        radioActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioActiveActionPerformed(evt);
            }
        });
        jPanel4.add(radioActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 80, -1));

        buttonGroup1.add(radioInactive);
        radioInactive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioInactive.setForeground(new java.awt.Color(255, 255, 255));
        radioInactive.setText("INACTIVE");
        jPanel4.add(radioInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, -1));

        txtAddress1.setBackground(new java.awt.Color(110, 122, 136));
        txtAddress1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAddress1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 250, 90));

        lblUserRole.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblUserRole.setForeground(new java.awt.Color(255, 255, 255));
        lblUserRole.setText("USER ROLE");
        jPanel4.add(lblUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        comboUserRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select User Role -" }));
        jPanel4.add(comboUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 250, 30));

        lblFullName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(255, 255, 255));
        lblFullName.setText("FULL NAME");
        jPanel4.add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtFullName.setBackground(new java.awt.Color(110, 122, 136));
        txtFullName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 250, 30));

        jTabbedPane1.addTab("GENERAL", jPanel4);

        panel1.setBackground(new java.awt.Color(45, 62, 80));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setToolTipText("");
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRemark.setBackground(new java.awt.Color(110, 122, 136));
        txtRemark.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRemark.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(txtRemark, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 570, 30));

        lblRemarks.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblRemarks.setForeground(new java.awt.Color(255, 255, 255));
        lblRemarks.setText("REMARKS");
        panel1.add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        txtAnswer1.setBackground(new java.awt.Color(110, 122, 136));
        txtAnswer1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAnswer1.setForeground(new java.awt.Color(255, 255, 255));
        txtAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer1ActionPerformed(evt);
            }
        });
        panel1.add(txtAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 570, 30));

        comboSQ1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Sequrity Quection 1 -" }));
        panel1.add(comboSQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 570, 30));

        lblAnswer1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblAnswer1.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer1.setText("SECURITY ANSWER  1");
        panel1.add(lblAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lblSQ1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSQ1.setForeground(new java.awt.Color(255, 255, 255));
        lblSQ1.setText("SECURITY QUECTION 1");
        panel1.add(lblSQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lblSQ2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSQ2.setForeground(new java.awt.Color(255, 255, 255));
        lblSQ2.setText("SECURITY QUECTION 2");
        panel1.add(lblSQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        comboSQ2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Sequrity Quection 2 -" }));
        panel1.add(comboSQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 570, 30));

        txtAnswer2.setBackground(new java.awt.Color(110, 122, 136));
        txtAnswer2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAnswer2.setForeground(new java.awt.Color(255, 255, 255));
        txtAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer2ActionPerformed(evt);
            }
        });
        panel1.add(txtAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 570, 30));

        lblAnswer2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblAnswer2.setForeground(new java.awt.Color(255, 255, 255));
        lblAnswer2.setText("SECURITY ANSWER  2");
        panel1.add(lblAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("USERNAME");
        panel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtUsername.setBackground(new java.awt.Color(110, 122, 136));
        txtUsername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 30));

        txtConfirmPassword.setBackground(new java.awt.Color(110, 122, 136));
        txtConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 250, 30));

        lblConfirmPassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmPassword.setText("CONFIRM PASSWORD");
        panel1.add(lblConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("PASSWORD");
        panel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtPassword.setBackground(new java.awt.Color(110, 122, 136));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 250, 30));

        jTabbedPane1.addTab("DETAILS", panel1);

        jPanel2.setBackground(new java.awt.Color(45, 62, 80));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(110, 122, 136));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(53, 189, 252));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("BROWS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
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
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("OTHER", jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 830, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(45, 62, 80));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setBackground(new java.awt.Color(53, 189, 252));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 140, 60));

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel3.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 140, 60));

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel3.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 140, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 820, 90));

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
