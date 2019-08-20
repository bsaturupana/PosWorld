package frames;

import Connection.MySqlConnection;
import Forms.MDIMain;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UserManager extends javax.swing.JInternalFrame {

    MDIMain mdiMain = new MDIMain();

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int maxLengthFullName = 250;
    int maxLengthEmployeeID = 10;
    int maxLengthEmail = 50;
    int maxLengthNICNumber = 15;
    int maxLengthPassportNumber = 15;
    int maxLengthMobileNumber = 10;
    int maxLengthResidentNumber = 10;
    int maxLengthUsername = 50;
    int maxLengthPassword = 50;
    int maxLengthAddress = 250;
    int maxLengthSecurityAnswer1 = 250;
    int maxLengthSecurityAnswer2 = 250;

    public UserManager() {
        initComponents();
        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUserManager = new javax.swing.JPanel();
        panelUserManagerMain = new javax.swing.JPanel();
        tabbedUserManager = new javax.swing.JTabbedPane();
        panelGeneral = new javax.swing.JPanel();
        lblFullName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lblEmployeeID = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblNICNumber = new javax.swing.JLabel();
        txtNICNumber = new javax.swing.JTextField();
        lblPassportNumber = new javax.swing.JLabel();
        txtPassportNumber = new javax.swing.JTextField();
        lblMobileNumber = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        lblResidentNumber = new javax.swing.JLabel();
        txtResidentNumber = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox();
        lblNationality = new javax.swing.JLabel();
        comboNationality = new javax.swing.JComboBox();
        lblRace = new javax.swing.JLabel();
        comboRace = new javax.swing.JComboBox();
        lblReligion = new javax.swing.JLabel();
        comboReligion = new javax.swing.JComboBox();
        lblErrorEmail = new javax.swing.JLabel();
        lblErrorFullName = new javax.swing.JLabel();
        lblErrorEmployeeID = new javax.swing.JLabel();
        lblErrorNICNumber = new javax.swing.JLabel();
        lblErrorPassportNumber = new javax.swing.JLabel();
        lblErrorMobileNumber = new javax.swing.JLabel();
        lblErrorResidentNumber = new javax.swing.JLabel();
        lblErrorGender = new javax.swing.JLabel();
        lblErrorNationality = new javax.swing.JLabel();
        lblErrorRace = new javax.swing.JLabel();
        lblErrorReligion = new javax.swing.JLabel();
        panelDetails = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblConfirmPassword = new javax.swing.JLabel();
        lblSecurityQuestion1 = new javax.swing.JLabel();
        comboSecurityQuestion1 = new javax.swing.JComboBox();
        lblSecurityAnswer1 = new javax.swing.JLabel();
        txtSecurityAnswer1 = new javax.swing.JTextField();
        lblSecurityQuestion2 = new javax.swing.JLabel();
        comboSecurityQuestion2 = new javax.swing.JComboBox();
        lblSecurityAnswer2 = new javax.swing.JLabel();
        txtSecurityAnswer2 = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblErrorUsername = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        lblErrorAddress = new javax.swing.JLabel();
        lblErrorConfirmPassword = new javax.swing.JLabel();
        lblErrorSecurityQuestion1 = new javax.swing.JLabel();
        lblErrorSecurityAnswer1 = new javax.swing.JLabel();
        lblErrorSecurityQuestion2 = new javax.swing.JLabel();
        lblErrorSecurityAnswer2 = new javax.swing.JLabel();
        panelOther = new javax.swing.JPanel();
        panelSearchButtons = new javax.swing.JPanel();
        lblCity = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblDivision = new javax.swing.JLabel();
        lblDesignation = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox();
        comboLocation = new javax.swing.JComboBox();
        comboDivision = new javax.swing.JComboBox();
        comboDesignation = new javax.swing.JComboBox();
        lblUserRole = new javax.swing.JLabel();
        comboUserRole = new javax.swing.JComboBox();
        lblErrorUserRole = new javax.swing.JLabel();
        lblErrorCity = new javax.swing.JLabel();
        lblErrorLocation = new javax.swing.JLabel();
        lblErrorDivision = new javax.swing.JLabel();
        lblErrorDesignation = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        radioStatusActive = new javax.swing.JRadioButton();
        radioStatusInactive = new javax.swing.JRadioButton();
        panelSearchButtons1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelMainButtons = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelUserManager.setBackground(new java.awt.Color(45, 62, 80));
        panelUserManager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelUserManagerMain.setBackground(new java.awt.Color(45, 62, 80));
        panelUserManagerMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelUserManagerMain.setForeground(new java.awt.Color(255, 255, 255));
        panelUserManagerMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedUserManager.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        panelGeneral.setBackground(new java.awt.Color(45, 62, 80));
        panelGeneral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGeneral.setForeground(new java.awt.Color(255, 255, 255));
        panelGeneral.setToolTipText("");
        panelGeneral.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFullName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(255, 255, 255));
        lblFullName.setText("FULL NAME");
        panelGeneral.add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        txtFullName.setBackground(new java.awt.Color(110, 122, 136));
        txtFullName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(255, 255, 255));
        txtFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFullNameKeyReleased(evt);
            }
        });
        panelGeneral.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 680, 30));

        lblEmployeeID.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblEmployeeID.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeID.setText("EMPLOYEE ID");
        panelGeneral.add(lblEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 95, -1, -1));

        txtEmployeeID.setBackground(new java.awt.Color(110, 122, 136));
        txtEmployeeID.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtEmployeeID.setForeground(new java.awt.Color(255, 255, 255));
        panelGeneral.add(txtEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 250, 30));

        lblEmail.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E - MAIL ");
        panelGeneral.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 95, -1, -1));

        txtEmail.setBackground(new java.awt.Color(110, 122, 136));
        txtEmail.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        panelGeneral.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 250, 30));

        lblNICNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNICNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblNICNumber.setText("NIC NUMBER");
        panelGeneral.add(lblNICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 165, -1, -1));

        txtNICNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtNICNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtNICNumber.setForeground(new java.awt.Color(255, 255, 255));
        panelGeneral.add(txtNICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 250, 30));

        lblPassportNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblPassportNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPassportNumber.setText("PASSPORT NO");
        panelGeneral.add(lblPassportNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 165, -1, -1));

        txtPassportNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtPassportNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtPassportNumber.setForeground(new java.awt.Color(255, 255, 255));
        panelGeneral.add(txtPassportNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 250, 30));

        lblMobileNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblMobileNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblMobileNumber.setText("MOBILE NO");
        panelGeneral.add(lblMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 235, -1, -1));

        txtMobileNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtMobileNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtMobileNumber.setForeground(new java.awt.Color(255, 255, 255));
        panelGeneral.add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 250, 30));

        lblResidentNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblResidentNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblResidentNumber.setText("RESIDENT NO ");
        panelGeneral.add(lblResidentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 235, -1, -1));

        txtResidentNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtResidentNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtResidentNumber.setForeground(new java.awt.Color(255, 255, 255));
        panelGeneral.add(txtResidentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 250, 30));

        lblGender.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("GENDER");
        panelGeneral.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 305, -1, -1));

        comboGender.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Gender -", "Male", "Female", "Other" }));
        panelGeneral.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 250, 30));

        lblNationality.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNationality.setForeground(new java.awt.Color(255, 255, 255));
        lblNationality.setText("NATIONALITY");
        panelGeneral.add(lblNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 305, -1, -1));

        comboNationality.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboNationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Nationality -", "Sri Lanken", "Other" }));
        panelGeneral.add(comboNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 250, 30));

        lblRace.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblRace.setForeground(new java.awt.Color(255, 255, 255));
        lblRace.setText("RACE");
        panelGeneral.add(lblRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 375, -1, -1));

        comboRace.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboRace.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Race -", "Sinhala", "Tamil", "Muslim", "Burgher", "Other" }));
        panelGeneral.add(comboRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 250, 30));

        lblReligion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblReligion.setForeground(new java.awt.Color(255, 255, 255));
        lblReligion.setText("RELIGION");
        panelGeneral.add(lblReligion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 375, -1, -1));

        comboReligion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboReligion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Religion -", "Buddhism", "Christianity", "Hinduism", "Islam", "Other" }));
        panelGeneral.add(comboReligion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 250, 30));

        lblErrorEmail.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorEmail.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorEmail.setText("* \"E-mail\" is required");
        panelGeneral.add(lblErrorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 250, -1));

        lblErrorFullName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorFullName.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorFullName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorFullName.setText("* \"Full Name\" is required");
        panelGeneral.add(lblErrorFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 670, -1));

        lblErrorEmployeeID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorEmployeeID.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorEmployeeID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorEmployeeID.setText("* \"Employee ID\" is required");
        panelGeneral.add(lblErrorEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 250, -1));

        lblErrorNICNumber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorNICNumber.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorNICNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorNICNumber.setText("* \"NIC Number\" is required");
        panelGeneral.add(lblErrorNICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 250, -1));

        lblErrorPassportNumber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorPassportNumber.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorPassportNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorPassportNumber.setText("* \"Passport Number\" is required");
        panelGeneral.add(lblErrorPassportNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 250, -1));

        lblErrorMobileNumber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorMobileNumber.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorMobileNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorMobileNumber.setText("* \"Mobile Number\" is required");
        panelGeneral.add(lblErrorMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 250, -1));

        lblErrorResidentNumber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorResidentNumber.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorResidentNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorResidentNumber.setText("* \"Resident Number\" is required");
        panelGeneral.add(lblErrorResidentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 250, -1));

        lblErrorGender.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorGender.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorGender.setText("* \"Gender\" is required");
        panelGeneral.add(lblErrorGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 250, -1));

        lblErrorNationality.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorNationality.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorNationality.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorNationality.setText("* \"Nationality\" is required");
        panelGeneral.add(lblErrorNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 250, -1));

        lblErrorRace.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorRace.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorRace.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorRace.setText("* \"Race\" is required");
        panelGeneral.add(lblErrorRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 250, -1));

        lblErrorReligion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorReligion.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorReligion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorReligion.setText("* \"Religion\" is required");
        panelGeneral.add(lblErrorReligion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 250, -1));

        tabbedUserManager.addTab("GENERAL", panelGeneral);

        panelDetails.setBackground(new java.awt.Color(45, 62, 80));
        panelDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDetails.setToolTipText("");
        panelDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("USERNAME");
        panelDetails.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        txtUsername.setBackground(new java.awt.Color(110, 122, 136));
        txtUsername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        panelDetails.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 220, 30));

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("PASSWORD");
        panelDetails.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtPassword.setBackground(new java.awt.Color(110, 122, 136));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        panelDetails.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 220, 30));

        txtConfirmPassword.setBackground(new java.awt.Color(110, 122, 136));
        txtConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        panelDetails.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 220, 30));

        lblConfirmPassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmPassword.setText("CONFIRM PASSWORD");
        panelDetails.add(lblConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblSecurityQuestion1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityQuestion1.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityQuestion1.setText("SECURITY QUESTION - 1");
        panelDetails.add(lblSecurityQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        comboSecurityQuestion1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Security Question 1 -" }));
        panelDetails.add(comboSecurityQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 610, 30));

        lblSecurityAnswer1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityAnswer1.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityAnswer1.setText("SECURITY ANSWER - 1");
        panelDetails.add(lblSecurityAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtSecurityAnswer1.setBackground(new java.awt.Color(110, 122, 136));
        txtSecurityAnswer1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSecurityAnswer1.setForeground(new java.awt.Color(255, 255, 255));
        txtSecurityAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecurityAnswer1ActionPerformed(evt);
            }
        });
        panelDetails.add(txtSecurityAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 610, 30));

        lblSecurityQuestion2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityQuestion2.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityQuestion2.setText("SECURITY QUESTION - 2");
        panelDetails.add(lblSecurityQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        comboSecurityQuestion2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Security Question 2 -" }));
        panelDetails.add(comboSecurityQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 610, 30));

        lblSecurityAnswer2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityAnswer2.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityAnswer2.setText("SECURITY ANSWER - 2");
        panelDetails.add(lblSecurityAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        txtSecurityAnswer2.setBackground(new java.awt.Color(110, 122, 136));
        txtSecurityAnswer2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSecurityAnswer2.setForeground(new java.awt.Color(255, 255, 255));
        txtSecurityAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecurityAnswer2ActionPerformed(evt);
            }
        });
        panelDetails.add(txtSecurityAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 610, 30));

        lblAddress.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("ADDRESS");
        panelDetails.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 25, -1, -1));

        txtAddress.setBackground(new java.awt.Color(110, 122, 136));
        txtAddress.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        panelDetails.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 220, 150));

        lblErrorUsername.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorUsername.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorUsername.setText("* \"Username\" is required");
        panelDetails.add(lblErrorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 55, 220, -1));

        lblErrorPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorPassword.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorPassword.setText("* \"Password\" is required");
        panelDetails.add(lblErrorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 115, 220, -1));

        lblErrorAddress.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorAddress.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorAddress.setText("* \"Address\" is required");
        panelDetails.add(lblErrorAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 175, 220, -1));

        lblErrorConfirmPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorConfirmPassword.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorConfirmPassword.setText("* \"Confirm Password\" is required");
        panelDetails.add(lblErrorConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 175, 220, -1));

        lblErrorSecurityQuestion1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorSecurityQuestion1.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorSecurityQuestion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorSecurityQuestion1.setText("* \"Security Question - 1\" is required");
        panelDetails.add(lblErrorSecurityQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 235, 610, -1));

        lblErrorSecurityAnswer1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorSecurityAnswer1.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorSecurityAnswer1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorSecurityAnswer1.setText("* \"Security Answer - 1\" is required");
        panelDetails.add(lblErrorSecurityAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 295, 610, -1));

        lblErrorSecurityQuestion2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorSecurityQuestion2.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorSecurityQuestion2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorSecurityQuestion2.setText("* \"Security Question - 2\" is required");
        panelDetails.add(lblErrorSecurityQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 355, 610, -1));

        lblErrorSecurityAnswer2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorSecurityAnswer2.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorSecurityAnswer2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorSecurityAnswer2.setText("* \"Security Answer - 2\" is required");
        panelDetails.add(lblErrorSecurityAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 415, 610, -1));

        tabbedUserManager.addTab("DETAILS", panelDetails);

        panelOther.setBackground(new java.awt.Color(45, 62, 80));
        panelOther.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelOther.setToolTipText("");

        panelSearchButtons.setBackground(new java.awt.Color(45, 62, 80));
        panelSearchButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelSearchButtons.setForeground(new java.awt.Color(255, 255, 255));
        panelSearchButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCity.setForeground(new java.awt.Color(255, 255, 255));
        lblCity.setText("CITY");
        panelSearchButtons.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        lblLocation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblLocation.setText("LOCATION");
        panelSearchButtons.add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, -1, -1));

        lblDivision.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDivision.setForeground(new java.awt.Color(255, 255, 255));
        lblDivision.setText("DIVISION");
        panelSearchButtons.add(lblDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 145, -1, -1));

        lblDesignation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDesignation.setForeground(new java.awt.Color(255, 255, 255));
        lblDesignation.setText("DESIGNATION");
        panelSearchButtons.add(lblDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, -1, -1));

        comboCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select City -" }));
        comboCity.setToolTipText("");
        panelSearchButtons.add(comboCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 420, 30));

        comboLocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Location -", "Colombo", "Kandy" }));
        comboLocation.setToolTipText("");
        panelSearchButtons.add(comboLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 420, 30));

        comboDivision.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Division -", "Billing", "Showroom", "Stores", "Accounts", "Management" }));
        comboDivision.setToolTipText("");
        panelSearchButtons.add(comboDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 420, 30));

        comboDesignation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Designation -", "Cashier", "Billing Officer", "Salesman", "Showroom Manager", "Accounts Assistant", "Accountant", "Storekeeper", "Purchase Manager", "Store Assistant" }));
        comboDesignation.setToolTipText("");
        panelSearchButtons.add(comboDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 420, 30));

        lblUserRole.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblUserRole.setForeground(new java.awt.Color(255, 255, 255));
        lblUserRole.setText("USER ROLE");
        panelSearchButtons.add(lblUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 265, -1, -1));

        comboUserRole.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        comboUserRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select User Role -" }));
        panelSearchButtons.add(comboUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 420, 30));

        lblErrorUserRole.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorUserRole.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorUserRole.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorUserRole.setText("* \"User Role\" is required");
        panelSearchButtons.add(lblErrorUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 295, 420, -1));

        lblErrorCity.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorCity.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorCity.setText("* \"City\" is required");
        panelSearchButtons.add(lblErrorCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 55, 420, -1));

        lblErrorLocation.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorLocation.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorLocation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorLocation.setText("* \"Location\" is required");
        panelSearchButtons.add(lblErrorLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 115, 420, -1));

        lblErrorDivision.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorDivision.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorDivision.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorDivision.setText("* \"Division\" is required");
        panelSearchButtons.add(lblErrorDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 175, 420, -1));

        lblErrorDesignation.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblErrorDesignation.setForeground(new java.awt.Color(255, 0, 2));
        lblErrorDesignation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrorDesignation.setText("* \"Designation\" is required");
        panelSearchButtons.add(lblErrorDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 235, 420, -1));

        lblStatus.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("STATUS");
        panelSearchButtons.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        radioStatusActive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioStatusActive.setForeground(new java.awt.Color(255, 255, 255));
        radioStatusActive.setText("ACTIVE");
        radioStatusActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioStatusActiveActionPerformed(evt);
            }
        });
        panelSearchButtons.add(radioStatusActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 80, 30));

        radioStatusInactive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioStatusInactive.setForeground(new java.awt.Color(255, 255, 255));
        radioStatusInactive.setText("INACTIVE");
        panelSearchButtons.add(radioStatusInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, 30));

        panelSearchButtons1.setBackground(new java.awt.Color(45, 62, 80));
        panelSearchButtons1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelSearchButtons1.setForeground(new java.awt.Color(255, 255, 255));
        panelSearchButtons1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USER IMAGE");
        panelSearchButtons1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 35));

        jLabel1.setBackground(new java.awt.Color(110, 122, 136));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/User.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setOpaque(true);
        panelSearchButtons1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 220, 260));

        jButton1.setBackground(new java.awt.Color(53, 189, 252));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("BROWS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelSearchButtons1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 120, -1));

        javax.swing.GroupLayout panelOtherLayout = new javax.swing.GroupLayout(panelOther);
        panelOther.setLayout(panelOtherLayout);
        panelOtherLayout.setHorizontalGroup(
            panelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSearchButtons, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSearchButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelOtherLayout.setVerticalGroup(
            panelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOtherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelSearchButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSearchButtons1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        tabbedUserManager.addTab("OTHER", panelOther);

        panelUserManagerMain.add(tabbedUserManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 470));

        panelUserManager.add(panelUserManagerMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 490));

        panelMainButtons.setBackground(new java.awt.Color(45, 62, 80));
        panelMainButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));
        panelMainButtons.setForeground(new java.awt.Color(255, 255, 255));
        panelMainButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setBackground(new java.awt.Color(53, 189, 252));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.setToolTipText("");
        btnSave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnSaveFocusLost(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 70));

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 70));

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.setToolTipText("");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panelMainButtons.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 70));

        panelUserManager.add(panelMainButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 460, 90));

        getContentPane().add(panelUserManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 879, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtFullName.getText() == null) {
            lblErrorFullName.setText("'FULL NAME' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'FULL NAME' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtFullName.requestFocus();
        }

        if (txtFullName.getText().equals("")) {
            lblErrorFullName.setText("'FULL NAME' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'FULL NAME' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtFullName.requestFocus();
        }

        if (txtEmployeeID.getText() == null) {
            lblErrorEmployeeID.setText("'EMPLOYEE ID' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'EMPLOYEE ID' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtEmployeeID.requestFocus();
        }

        if (txtEmployeeID.getText().equals("")) {
            lblErrorEmployeeID.setText("'EMPLOYEE ID' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'EMPLOYEE ID' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtEmployeeID.requestFocus();
        }

        if (txtEmail.getText() == null) {
            lblErrorEmail.setText("'E-MAIL' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'E-MAIL' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtEmail.requestFocus();
        }

        if (txtEmail.getText().equals("")) {
            lblErrorEmail.setText("'E-MAIL' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'E-MAIL' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtEmail.requestFocus();
        }

        if (txtNICNumber.getText() == null) {
            lblErrorNICNumber.setText("'NIC Number' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'NIC Number' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtNICNumber.requestFocus();
        }

        if (txtNICNumber.getText().equals("")) {
            lblErrorNICNumber.setText("'NIC Number' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'NIC Number' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtNICNumber.requestFocus();
        }

        if (txtPassportNumber.getText() == null) {
            lblErrorPassportNumber.setText("'PASSPORT Number' can not be blank");
//            JOptionPane.showMessageDialog(this, "'PASSPORT Number' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtPassportNumber.requestFocus();
        }

        if (txtPassportNumber.getText().equals("")) {
            lblErrorPassportNumber.setText("'PASSPORT Number' can not be blank");
//            JOptionPane.showMessageDialog(this, "'PASSPORT Number' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtPassportNumber.requestFocus();
        }

        if (txtMobileNumber.getText() == null) {
            lblErrorMobileNumber.setText("'MOBILE Number' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'MOBILE Number' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtMobileNumber.requestFocus();
        }

        if (txtMobileNumber.getText().equals("")) {
            lblErrorMobileNumber.setText("'MOBILE Number' can not be blank.");
//            JOptionPane.showMessageDialog(this, "''MOBILE Number' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtMobileNumber.requestFocus();
        }

        if (txtResidentNumber.getText() == null) {
            lblErrorResidentNumber.setText("'RESIDENT Number' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'RESIDENT Number' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtResidentNumber.requestFocus();
        }

        if (txtResidentNumber.getText().equals("")) {
            lblErrorResidentNumber.setText("'RESIDENT Number' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'RESIDENT Number' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtResidentNumber.requestFocus();
        }

        if (comboGender.getSelectedItem().equals("")) {
            lblErrorGender.setText("'GENDER' should can not be blank.");
//            JOptionPane.showMessageDialog(this, "'GENDER' should can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboGender.requestFocus();
        }

        if ("- Select Gender -".equals(comboGender.getSelectedItem())) {
            lblErrorGender.setText("'GENDER' should be a valid value.");
//            JOptionPane.showMessageDialog(this, "'GENDER' should be a valid value.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboGender.requestFocus();
        }

        if (comboNationality.getSelectedItem().equals("")) {
            lblErrorNationality.setText("'NATIONALITY' should can not be blank.");
//            JOptionPane.showMessageDialog(this, "'NATIONALITY' should can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboNationality.requestFocus();
        }

        if ("- Select Nationality -".equals(comboNationality.getSelectedItem())) {
            lblErrorNationality.setText("'NATIONALITY' should be a valid value.");
//            JOptionPane.showMessageDialog(this, "'NATIONALITY' should be a valid value.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboNationality.requestFocus();
        }

        if (comboRace.getSelectedItem().equals("")) {
            lblErrorRace.setText("'RACE' should can not be blank.");
//            JOptionPane.showMessageDialog(this, "'RACE' should can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboRace.requestFocus();
        }

        if ("- Select Race -".equals(comboRace.getSelectedItem())) {
            lblErrorRace.setText("'RACE' should be a valid value.");
//            JOptionPane.showMessageDialog(this, "'RACE' should be a valid value.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboRace.requestFocus();
        }

        if (comboReligion.getSelectedItem().equals("")) {
            lblErrorReligion.setText("'RELIGION' should can not be blank.");
//            JOptionPane.showMessageDialog(this, "'RELIGION' should can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboReligion.requestFocus();
        }

        if ("- Select Religion -".equals(comboReligion.getSelectedItem())) {
            lblErrorReligion.setText("'RELIGION' should be a valid value.");
//            JOptionPane.showMessageDialog(this, "'RELIGION' should be a valid value.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboReligion.requestFocus();
        }

        if (txtUsername.getText() == null) {
            lblErrorUsername.setText("'USERNAME' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'USERNAME' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtUsername.requestFocus();
        }

        if (txtUsername.getText().equals("")) {
            lblErrorUsername.setText("'USERNAME' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'USERNAME' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtUsername.requestFocus();
        }

        if (txtPassword.getText() == null) {
            lblErrorPassword.setText("'PASSWORD' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'PASSWORD' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtPassword.requestFocus();
        }

        if (txtPassword.getText().equals("")) {
            lblErrorPassword.setText("'PASSWORD' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'PASSWORD' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtPassword.requestFocus();
        }

        if (txtConfirmPassword.getText() == null) {
            lblErrorConfirmPassword.setText("'CONFIRM PASSWORD' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'CONFIRM PASSWORD' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtConfirmPassword.requestFocus();
        }

        if (txtConfirmPassword.getText().equals("")) {
            lblErrorConfirmPassword.setText("'CONFIRM PASSWORD' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'CONFIRM PASSWORD' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtConfirmPassword.requestFocus();
        }

        if (txtAddress.getText() == null) {
            lblErrorAddress.setText("'ADDRESS' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'ADDRESS' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtAddress.requestFocus();
        }

        if (txtAddress.getText().equals("")) {
            lblErrorAddress.setText("'ADDRESS' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'ADDRESS' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtAddress.requestFocus();
        }

        if (comboSecurityQuestion1.getSelectedItem().equals("")) {
            lblErrorSecurityQuestion1.setText("'SECURITY QUESTION - 1' should can not be blank.");
//            JOptionPane.showMessageDialog(this, "'SECURITY QUESTION - 1' should can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboSecurityQuestion1.requestFocus();
        }

        if ("- Select Security Question 1 -".equals(comboSecurityQuestion1.getSelectedItem())) {
            lblErrorSecurityQuestion1.setText("'SECURITY QUESTION - 1' should be a valid value.");
//            JOptionPane.showMessageDialog(this, "'SECURITY QUESTION - 1' should be a valid value.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboSecurityQuestion1.requestFocus();
        }

        if (txtSecurityAnswer1.getText() == null) {
            lblErrorSecurityAnswer1.setText("'SECURITY ANSWER - 1' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'SECURITY ANSWER - 1' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtSecurityAnswer1.requestFocus();
        }

        if (txtSecurityAnswer1.getText().equals("")) {
            lblErrorSecurityAnswer1.setText("'SECURITY ANSWER - 1' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'SECURITY ANSWER - 1' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtSecurityAnswer1.requestFocus();
        }

        if (comboSecurityQuestion2.getSelectedItem().equals("")) {
            lblErrorSecurityQuestion2.setText("'SECURITY QUESTION - 2' should can not be blank.");
//            JOptionPane.showMessageDialog(this, "'SECURITY QUESTION - 2' should can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboSecurityQuestion2.requestFocus();
        }

        if ("- Select Security Question 2 -".equals(comboSecurityQuestion2.getSelectedItem())) {
            lblErrorSecurityQuestion2.setText("'SECURITY QUESTION - 2' should be a valid value.");
//            JOptionPane.showMessageDialog(this, "'SECURITY QUESTION - 2' should be a valid value.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboSecurityQuestion2.requestFocus();
        }

        if (txtSecurityAnswer2.getText() == null) {
            lblErrorSecurityAnswer2.setText("'SECURITY ANSWER - 2' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'SECURITY ANSWER - 2' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtSecurityAnswer2.requestFocus();
        }

        if (txtSecurityAnswer2.getText().equals("")) {
            lblErrorSecurityAnswer2.setText("'SECURITY ANSWER - 2' can not be blank.");
//            JOptionPane.showMessageDialog(this, "'SECURITY ANSWER - 2' can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            txtSecurityAnswer2.requestFocus();
        }

        if (comboCity.getSelectedItem().equals("")) {
            lblErrorCity.setText("'CITY' should can not be blank.");
//            JOptionPane.showMessageDialog(this, "'CITY' should can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboCity.requestFocus();
        }

        if ("- Select City -".equals(comboCity.getSelectedItem())) {
            lblErrorCity.setText("'CITY' should be a valid value.");
//            JOptionPane.showMessageDialog(this, "'CITY' should be a valid value.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboCity.requestFocus();
        }

        if (comboLocation.getSelectedItem().equals("")) {
            lblErrorLocation.setText("'LOCATION' should can not be blank.");
//            JOptionPane.showMessageDialog(this, "'LOCATION' should can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboLocation.requestFocus();
        }

        if ("- Select Location -".equals(comboLocation.getSelectedItem())) {
            lblErrorLocation.setText("'LOCATION' should be a valid value.");
//            JOptionPane.showMessageDialog(this, "'LOCATION' should be a valid value.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboLocation.requestFocus();
        }

        if (comboDivision.getSelectedItem().equals("")) {
            lblErrorDivision.setText("'DIVISION' should can not be blank.");
//            JOptionPane.showMessageDialog(this, "'DIVISION' should can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboDivision.requestFocus();
        }

        if ("- Select Division -".equals(comboDivision.getSelectedItem())) {
            lblErrorDivision.setText("'DIVISION' should be a valid value.");
//            JOptionPane.showMessageDialog(this, "'DIVISION' should be a valid value.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboDivision.requestFocus();
        }

        if (comboDesignation.getSelectedItem().equals("")) {
            lblErrorDesignation.setText("'DESIGNATION' should can not be blank.");
//            JOptionPane.showMessageDialog(this, "'DESIGNATION' should can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboDesignation.requestFocus();
        }

        if ("- Select Designation -".equals(comboDesignation.getSelectedItem())) {
            lblErrorDesignation.setText("'DESIGNATION' should be a valid value.");
//            JOptionPane.showMessageDialog(this, "'DESIGNATION' should be a valid value.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboDesignation.requestFocus();
        }

        if (comboUserRole.getSelectedItem().equals("")) {
            lblErrorUserRole.setText("'USER ROLE' should can not be blank.");
//            JOptionPane.showMessageDialog(this, "'USER ROLE' should can not be blank.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboUserRole.requestFocus();
        }

        if ("- Select User Role -".equals(comboUserRole.getSelectedItem())) {
            lblErrorUserRole.setText("'USER ROLE' should be a valid value.");
//            JOptionPane.showMessageDialog(this, "'USER ROLE' should be a valid value.", "USER MANAGEMENT", JOptionPane.ERROR_MESSAGE);
            comboUserRole.requestFocus();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearField();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSaveFocusLost
    }//GEN-LAST:event_btnSaveFocusLost

    private void txtSecurityAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityAnswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityAnswer1ActionPerformed

    private void txtSecurityAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityAnswer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityAnswer2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioStatusActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioStatusActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioStatusActiveActionPerformed

    private void txtFullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullNameKeyReleased
        int len = txtFullName.getText().length();

        ViewMessage(len);
    }//GEN-LAST:event_txtFullNameKeyReleased

    private String errorMessage ViewMessage(String fieldName,int len) {
        if (len == 0) {
            errorMessage = "* Required Field";
        } else {
            switch (fieldName) {
                case "Full Name":
                    
            }
        }
        
        return errorMessage;
    }

    private void showRole() {
        try {
            conn = MySqlConnection.ConnectDB();

            String sSql = "select * from role_master";

            pst = conn.prepareStatement(sSql);
            rs = pst.executeQuery();
            pst = conn.prepareStatement(sSql);

            comboUserRole.removeAllItems();

            comboUserRole.addItem("- Select User Role -");

            while (rs.next()) {
                comboUserRole.addItem(rs.getString("rm_role_name"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void formFormat() {
        setScreenSize();
        clearField();
        clearErrorLable();
        showRole();
    }

    private void setScreenSize() {
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    private void clearField() {
//        showRole();

        txtFullName.setText(null);
        txtEmployeeID.setText(null);
        txtEmail.setText(null);
        txtNICNumber.setText(null);
        txtPassportNumber.setText(null);
        txtMobileNumber.setText("");
        txtResidentNumber.setText("");
        comboGender.setSelectedIndex(0);
        comboNationality.setSelectedIndex(0);
        comboRace.setSelectedIndex(0);
        comboReligion.setSelectedIndex(0);
        txtAddress.setText(null);
        comboUserRole.setSelectedIndex(0);

        txtUsername.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
        comboSecurityQuestion1.setSelectedIndex(0);
        txtSecurityAnswer1.setText("");
        comboSecurityQuestion2.setSelectedIndex(0);
        txtSecurityAnswer2.setText("");

        comboCity.setSelectedIndex(0);
        comboLocation.setSelectedIndex(0);
        comboDivision.setSelectedIndex(0);
        comboDesignation.setSelectedIndex(0);

        txtFullName.requestFocus();
    }
    
    private void clearErrorLable() {
        lblErrorFullName.setText("");
        lblErrorEmployeeID.setText("");
        lblErrorEmail.setText("");
        lblErrorNICNumber.setText("");
        lblErrorPassportNumber.setText("");
        lblErrorMobileNumber.setText("");
        lblErrorResidentNumber.setText("");
        lblErrorGender.setText("");
        lblErrorNationality.setText("");
        lblErrorRace.setText("");
        lblErrorReligion.setText("");
        lblErrorUsername.setText("");
        lblErrorPassword.setText("");
        lblErrorConfirmPassword.setText("");
        lblErrorAddress.setText("");
        lblErrorSecurityQuestion1.setText("");
        lblErrorSecurityAnswer1.setText("");
        lblErrorSecurityQuestion2.setText("");
        lblErrorSecurityAnswer2.setText("");
        lblErrorCity.setText("");
        lblErrorLocation.setText("");
        lblErrorDivision.setText("");
        lblErrorDesignation.setText("");
        lblErrorUserRole.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox comboCity;
    private javax.swing.JComboBox comboDesignation;
    private javax.swing.JComboBox comboDivision;
    private javax.swing.JComboBox comboGender;
    private javax.swing.JComboBox comboLocation;
    private javax.swing.JComboBox comboNationality;
    private javax.swing.JComboBox comboRace;
    private javax.swing.JComboBox comboReligion;
    private javax.swing.JComboBox comboSecurityQuestion1;
    private javax.swing.JComboBox comboSecurityQuestion2;
    private javax.swing.JComboBox comboUserRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblDesignation;
    private javax.swing.JLabel lblDivision;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblErrorAddress;
    private javax.swing.JLabel lblErrorCity;
    private javax.swing.JLabel lblErrorConfirmPassword;
    private javax.swing.JLabel lblErrorDesignation;
    private javax.swing.JLabel lblErrorDivision;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorEmployeeID;
    private javax.swing.JLabel lblErrorFullName;
    private javax.swing.JLabel lblErrorGender;
    private javax.swing.JLabel lblErrorLocation;
    private javax.swing.JLabel lblErrorMobileNumber;
    private javax.swing.JLabel lblErrorNICNumber;
    private javax.swing.JLabel lblErrorNationality;
    private javax.swing.JLabel lblErrorPassportNumber;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorRace;
    private javax.swing.JLabel lblErrorReligion;
    private javax.swing.JLabel lblErrorResidentNumber;
    private javax.swing.JLabel lblErrorSecurityAnswer1;
    private javax.swing.JLabel lblErrorSecurityAnswer2;
    private javax.swing.JLabel lblErrorSecurityQuestion1;
    private javax.swing.JLabel lblErrorSecurityQuestion2;
    private javax.swing.JLabel lblErrorUserRole;
    private javax.swing.JLabel lblErrorUsername;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMobileNumber;
    private javax.swing.JLabel lblNICNumber;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblPassportNumber;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblReligion;
    private javax.swing.JLabel lblResidentNumber;
    private javax.swing.JLabel lblSecurityAnswer1;
    private javax.swing.JLabel lblSecurityAnswer2;
    private javax.swing.JLabel lblSecurityQuestion1;
    private javax.swing.JLabel lblSecurityQuestion2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUserRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelDetails;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelMainButtons;
    private javax.swing.JPanel panelOther;
    private javax.swing.JPanel panelSearchButtons;
    private javax.swing.JPanel panelSearchButtons1;
    private javax.swing.JPanel panelUserManager;
    private javax.swing.JPanel panelUserManagerMain;
    private javax.swing.JRadioButton radioStatusActive;
    private javax.swing.JRadioButton radioStatusInactive;
    private javax.swing.JTabbedPane tabbedUserManager;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtNICNumber;
    private javax.swing.JTextField txtPassportNumber;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtResidentNumber;
    private javax.swing.JTextField txtSecurityAnswer1;
    private javax.swing.JTextField txtSecurityAnswer2;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
