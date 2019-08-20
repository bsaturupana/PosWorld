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
        lblReligion = new javax.swing.JLabel();
        comboReligion = new javax.swing.JComboBox();
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
        txtSecurityAnswer1 = new javax.swing.JTextField();
        comboSecurityQuestion1 = new javax.swing.JComboBox();
        lblSecurityAnswer1 = new javax.swing.JLabel();
        lblSecurityQuestion1 = new javax.swing.JLabel();
        lblSecurityQuestion2 = new javax.swing.JLabel();
        comboSecurityQuestion2 = new javax.swing.JComboBox();
        txtSecurityAnswer2 = new javax.swing.JTextField();
        lblSecurityAnswer2 = new javax.swing.JLabel();
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
        lblProvince = new javax.swing.JLabel();
        comboProvince = new javax.swing.JComboBox();
        lblDistrict = new javax.swing.JLabel();
        comboDistrict = new javax.swing.JComboBox();
        lblCity = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox();
        lblLocation = new javax.swing.JLabel();
        comboLocation = new javax.swing.JComboBox();
        comboDivision = new javax.swing.JComboBox();
        lblDivision = new javax.swing.JLabel();
        lblDesignation = new javax.swing.JLabel();
        comboDesignation = new javax.swing.JComboBox();
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
        lblResidentNO.setText("RESIDENT NO ");
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

        lblReligion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblReligion.setForeground(new java.awt.Color(255, 255, 255));
        lblReligion.setText("RELIGION");
        jPanel4.add(lblReligion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        comboReligion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Religion -", "Budhist", "Catholic", "Hindu", "Islam", "Other" }));
        jPanel4.add(comboReligion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 250, 30));

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
        jPanel4.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        buttonGroup1.add(radioActive);
        radioActive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioActive.setForeground(new java.awt.Color(255, 255, 255));
        radioActive.setText("ACTIVE");
        radioActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioActiveActionPerformed(evt);
            }
        });
        jPanel4.add(radioActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 435, 80, 30));

        buttonGroup1.add(radioInactive);
        radioInactive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioInactive.setForeground(new java.awt.Color(255, 255, 255));
        radioInactive.setText("INACTIVE");
        jPanel4.add(radioInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 435, -1, 30));

        txtAddress1.setBackground(new java.awt.Color(110, 122, 136));
        txtAddress1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAddress1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 250, 90));

        lblUserRole.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblUserRole.setForeground(new java.awt.Color(255, 255, 255));
        lblUserRole.setText("USER ROLE");
        jPanel4.add(lblUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        comboUserRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select User Role -" }));
        jPanel4.add(comboUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 250, 30));

        lblFullName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(255, 255, 255));
        lblFullName.setText("FULL NAME");
        jPanel4.add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtFullName.setBackground(new java.awt.Color(110, 122, 136));
        txtFullName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 650, 30));

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
        panel1.add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        txtSecurityAnswer1.setBackground(new java.awt.Color(110, 122, 136));
        txtSecurityAnswer1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSecurityAnswer1.setForeground(new java.awt.Color(255, 255, 255));
        txtSecurityAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecurityAnswer1ActionPerformed(evt);
            }
        });
        panel1.add(txtSecurityAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 570, 30));

        comboSecurityQuestion1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Security Question 1 -" }));
        panel1.add(comboSecurityQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 570, 30));

        lblSecurityAnswer1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityAnswer1.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityAnswer1.setText("SECURITY ANSWER 1");
        panel1.add(lblSecurityAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lblSecurityQuestion1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityQuestion1.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityQuestion1.setText("SECURITY QUESTION 1");
        panel1.add(lblSecurityQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lblSecurityQuestion2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityQuestion2.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityQuestion2.setText("SECURITY QUESTION 2");
        panel1.add(lblSecurityQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        comboSecurityQuestion2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Security Question 2 -" }));
        panel1.add(comboSecurityQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 570, 30));

        txtSecurityAnswer2.setBackground(new java.awt.Color(110, 122, 136));
        txtSecurityAnswer2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSecurityAnswer2.setForeground(new java.awt.Color(255, 255, 255));
        txtSecurityAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecurityAnswer2ActionPerformed(evt);
            }
        });
        panel1.add(txtSecurityAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 570, 30));

        lblSecurityAnswer2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityAnswer2.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityAnswer2.setText("SECURITY ANSWER 2");
        panel1.add(lblSecurityAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

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
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/User.png"))); // NOI18N
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

        lblProvince.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblProvince.setForeground(new java.awt.Color(255, 255, 255));
        lblProvince.setText("PROVINCE");

        comboProvince.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Province -" }));
        comboProvince.setToolTipText("");

        lblDistrict.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDistrict.setForeground(new java.awt.Color(255, 255, 255));
        lblDistrict.setText("DISTRICT");

        comboDistrict.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select District -" }));
        comboDistrict.setToolTipText("");

        lblCity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCity.setForeground(new java.awt.Color(255, 255, 255));
        lblCity.setText("CITY");

        comboCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select District -" }));
        comboCity.setToolTipText("");

        lblLocation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblLocation.setText("LOCATION");

        comboLocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Location -" }));
        comboLocation.setToolTipText("");

        comboDivision.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Division -" }));
        comboDivision.setToolTipText("");

        lblDivision.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDivision.setForeground(new java.awt.Color(255, 255, 255));
        lblDivision.setText("DIVISION");

        lblDesignation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDesignation.setForeground(new java.awt.Color(255, 255, 255));
        lblDesignation.setText("DESIGNATION");

        comboDesignation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select District -" }));
        comboDesignation.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCity)
                            .addComponent(lblProvince)
                            .addComponent(lblDistrict))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboProvince, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblDesignation)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDivision)
                                .addComponent(lblLocation))
                            .addGap(42, 42, 42)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblProvince)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCity))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(comboProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDistrict))
                                .addGap(28, 28, 28)
                                .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLocation))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDivision))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDesignation)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("OTHER", jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 830, 530));

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 820, 90));

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

    private void txtSecurityAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityAnswer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityAnswer2ActionPerformed

    private void txtSecurityAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityAnswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityAnswer1ActionPerformed

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
    private javax.swing.JComboBox comboCity;
    private javax.swing.JComboBox comboDesignation;
    private javax.swing.JComboBox comboDistrict;
    private javax.swing.JComboBox comboDivision;
    private javax.swing.JComboBox comboGender1;
    private javax.swing.JComboBox comboLocation;
    private javax.swing.JComboBox comboNationality;
    private javax.swing.JComboBox comboProvince;
    private javax.swing.JComboBox comboRace;
    private javax.swing.JComboBox comboReligion;
    private javax.swing.JComboBox comboSecurityQuestion1;
    private javax.swing.JComboBox comboSecurityQuestion2;
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
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblDesignation;
    private javax.swing.JLabel lblDistrict;
    private javax.swing.JLabel lblDivision;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblGender1;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMobileNO;
    private javax.swing.JLabel lblNICNumber;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblPassportNO;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblReligion;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblResidentNO;
    private javax.swing.JLabel lblSecurityAnswer1;
    private javax.swing.JLabel lblSecurityAnswer2;
    private javax.swing.JLabel lblSecurityQuestion1;
    private javax.swing.JLabel lblSecurityQuestion2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUserRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panel1;
    private javax.swing.JRadioButton radioActive;
    private javax.swing.JRadioButton radioInactive;
    private javax.swing.JTextField txtAddress1;
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
    private javax.swing.JTextField txtSecurityAnswer1;
    private javax.swing.JTextField txtSecurityAnswer2;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtAddress1.setText(null);
        txtSecurityAnswer1.setText(null);
        txtSecurityAnswer2.setText(null);
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
        comboReligion.setSelectedIndex(0);
        comboSecurityQuestion1.setSelectedIndex(0);
        comboSecurityQuestion2.setSelectedIndex(0);
        comboUserRole.setSelectedIndex(0);

        radioActive.setSelected(true);
        radioInactive.setSelected(false);
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);
        
        clearFields();
    }
}
