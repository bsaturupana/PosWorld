package Forms;

import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class frmAccount extends javax.swing.JFrame {

    private double result;

    DecimalFormat currencyFormat = new DecimalFormat("#,###0.00");
    private DefaultComboBoxModel p;
    private DefaultComboBoxModel t;

    public frmAccount() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tabbedAccounts = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        lblAccountCode = new javax.swing.JLabel();
        txtOpeningBalance = new javax.swing.JTextField();
        lblCategory = new javax.swing.JLabel();
        lblParent = new javax.swing.JLabel();
        lblAccountName = new javax.swing.JLabel();
        txtAccountCode = new javax.swing.JTextField();
        lblSign = new javax.swing.JLabel();
        lblGroup = new javax.swing.JLabel();
        lblOpeningBalance = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        rbChild = new javax.swing.JRadioButton();
        rbParent = new javax.swing.JRadioButton();
        comboCategory = new javax.swing.JComboBox();
        comboType = new javax.swing.JComboBox();
        comboParent = new javax.swing.JComboBox();
        comboSign = new javax.swing.JComboBox();
        txtAccountName = new javax.swing.JTextField();
        panel1 = new javax.swing.JPanel();
        lblBank = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblVATNo = new javax.swing.JLabel();
        txtVATNo = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblAccountType = new javax.swing.JLabel();
        txtPhoneNo1 = new javax.swing.JTextField();
        lblBranch = new javax.swing.JLabel();
        lblRemarks = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        comboAccountType = new javax.swing.JComboBox();
        txtAccNo = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        lblAccNO = new javax.swing.JLabel();
        lblPhoneNo1 = new javax.swing.JLabel();
        lblPhoneNo2 = new javax.swing.JLabel();
        txtPhoneNo2 = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        comboBank = new javax.swing.JComboBox();
        comboBranch = new javax.swing.JComboBox();
        lblRemarksBank = new javax.swing.JLabel();
        lblRemarksCash = new javax.swing.JLabel();
        scroll_Remarks_Cash = new javax.swing.JScrollPane();
        txtRemarksCash = new javax.swing.JEditorPane();
        scroll_Remarks_Bank = new javax.swing.JScrollPane();
        txtRemarksBank = new javax.swing.JEditorPane();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACCOUNT");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedAccounts.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAccountCode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblAccountCode.setText("ACCOUNT CODE");
        jPanel4.add(lblAccountCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtOpeningBalance.setBackground(new java.awt.Color(255, 255, 150));
        txtOpeningBalance.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtOpeningBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOpeningBalance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOpeningBalanceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOpeningBalanceFocusLost(evt);
            }
        });
        txtOpeningBalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOpeningBalanceKeyTyped(evt);
            }
        });
        jPanel4.add(txtOpeningBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 240, 30));

        lblCategory.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblCategory.setText("CATEGORY");
        jPanel4.add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lblParent.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblParent.setText("PARENT");
        jPanel4.add(lblParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        lblAccountName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblAccountName.setText("ACCOUNT NAME");
        jPanel4.add(lblAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        txtAccountCode.setBackground(new java.awt.Color(255, 255, 150));
        txtAccountCode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAccountCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAccountCodeKeyTyped(evt);
            }
        });
        jPanel4.add(txtAccountCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 250, 30));

        lblSign.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSign.setText("SIGN");
        jPanel4.add(lblSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        lblGroup.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblGroup.setText("GROUP");
        jPanel4.add(lblGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lblOpeningBalance.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblOpeningBalance.setText("OPENING BALANCE");
        jPanel4.add(lblOpeningBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        lblType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblType.setText("TYPE");
        jPanel4.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        buttonGroup1.add(rbChild);
        rbChild.setText("CHILD");
        rbChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChildActionPerformed(evt);
            }
        });
        jPanel4.add(rbChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        buttonGroup1.add(rbParent);
        rbParent.setSelected(true);
        rbParent.setText("PARENT");
        rbParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbParentActionPerformed(evt);
            }
        });
        jPanel4.add(rbParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        comboCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Category -", "Asset", "Liability", "Income", "Expenses" }));
        comboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoryActionPerformed(evt);
            }
        });
        jPanel4.add(comboCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 250, 30));

        comboType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Type -", "Bank", "Cash", "Customer", "Customer Supplier", "Supplier" }));
        comboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTypeActionPerformed(evt);
            }
        });
        jPanel4.add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 240, 30));

        comboParent.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Parent Name -" }));
        jPanel4.add(comboParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 240, 30));

        comboSign.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Sign -", "Credit", "Debit" }));
        jPanel4.add(comboSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 250, 30));

        txtAccountName.setBackground(new java.awt.Color(255, 255, 150));
        txtAccountName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAccountName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAccountNameKeyTyped(evt);
            }
        });
        jPanel4.add(txtAccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 240, 30));

        tabbedAccounts.addTab("GENERAL", jPanel4);

        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBank.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblBank.setText("BANK");
        panel1.add(lblBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtContact.setBackground(new java.awt.Color(255, 255, 150));
        txtContact.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactKeyTyped(evt);
            }
        });
        panel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 240, 30));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblEmail.setText("E-MAIL");
        panel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, -1, -1));

        lblVATNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblVATNo.setText("VAT NO");
        panel1.add(lblVATNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtVATNo.setBackground(new java.awt.Color(255, 255, 150));
        txtVATNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtVATNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVATNoActionPerformed(evt);
            }
        });
        txtVATNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVATNoKeyTyped(evt);
            }
        });
        panel1.add(txtVATNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 240, 30));

        lblAddress.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblAddress.setText("ADDRESS");
        panel1.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtAddress.setBackground(new java.awt.Color(255, 255, 150));
        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });
        panel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 650, 30));

        lblAccountType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblAccountType.setText("ACCOUNT TYPE");
        panel1.add(lblAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        txtPhoneNo1.setBackground(new java.awt.Color(255, 255, 150));
        txtPhoneNo1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPhoneNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNo1KeyTyped(evt);
            }
        });
        panel1.add(txtPhoneNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 250, 30));

        lblBranch.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblBranch.setText("BRANCH");
        panel1.add(lblBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        lblRemarks.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRemarks.setText("REMARKS");
        panel1.add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        txtRemarks.setBackground(new java.awt.Color(255, 255, 150));
        txtRemarks.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRemarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemarksActionPerformed(evt);
            }
        });
        txtRemarks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRemarksKeyTyped(evt);
            }
        });
        panel1.add(txtRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 250, 30));

        comboAccountType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Account Type -", "Current Account", "Savings Account" }));
        panel1.add(comboAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 250, 30));

        txtAccNo.setBackground(new java.awt.Color(255, 255, 150));
        txtAccNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAccNoKeyTyped(evt);
            }
        });
        panel1.add(txtAccNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 240, 30));

        lblContact.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblContact.setText("CONTACT");
        panel1.add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblAccNO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblAccNO.setText("ACC.NO");
        panel1.add(lblAccNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblPhoneNo1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPhoneNo1.setText("PHONE NO - 1");
        panel1.add(lblPhoneNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        lblPhoneNo2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPhoneNo2.setText("PHONE NO - 2");
        panel1.add(lblPhoneNo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        txtPhoneNo2.setBackground(new java.awt.Color(255, 255, 150));
        txtPhoneNo2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPhoneNo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNo2KeyTyped(evt);
            }
        });
        panel1.add(txtPhoneNo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 250, 30));

        txtEmail.setBackground(new java.awt.Color(255, 255, 150));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        panel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 240, 30));

        comboBank.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Bank -", "Sampath Bank", "Commercial Bank", "Nation Trust Bank", "NDB Bank", "Hatton National Bank", "Bank Of Ceylon", "Peoples Bank", "NSB Bank", "Union Bank", "Seylan Bank", "HSBC Bank", "PABC Bank", "Standerd Charted Bank", "RDB Bank", "CDB Bank", "DFCC Bank", "Lanka Puthra Bank" }));
        panel1.add(comboBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 240, 30));

        comboBranch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Branch -", "Colombo", "Kadawatha", "Moratuwa", "Kandy", "Katunayake", "Galle" }));
        panel1.add(comboBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 250, 30));

        lblRemarksBank.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRemarksBank.setText("REMARKS");
        panel1.add(lblRemarksBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lblRemarksCash.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRemarksCash.setText("REMARKS");
        panel1.add(lblRemarksCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        scroll_Remarks_Cash.setBackground(new java.awt.Color(255, 255, 150));

        txtRemarksCash.setBackground(new java.awt.Color(255, 255, 150));
        txtRemarksCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRemarksCashKeyTyped(evt);
            }
        });
        scroll_Remarks_Cash.setViewportView(txtRemarksCash);

        panel1.add(scroll_Remarks_Cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 650, 210));

        scroll_Remarks_Bank.setBackground(new java.awt.Color(255, 255, 150));

        txtRemarksBank.setBackground(new java.awt.Color(255, 255, 150));
        txtRemarksBank.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRemarksBankKeyTyped(evt);
            }
        });
        scroll_Remarks_Bank.setViewportView(txtRemarksBank);

        panel1.add(scroll_Remarks_Bank, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 650, 90));

        tabbedAccounts.addTab("DETAILS", panel1);

        jPanel1.add(tabbedAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 790, 270));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRemarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemarksActionPerformed

    }//GEN-LAST:event_txtRemarksActionPerformed

    private void txtVATNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVATNoActionPerformed

    }//GEN-LAST:event_txtVATNoActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Saved.", "Account", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void comboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoryActionPerformed
        fill_Parent_Dropdown();
    }//GEN-LAST:event_comboCategoryActionPerformed

    private void comboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTypeActionPerformed
        detailTabFormating();
    }//GEN-LAST:event_comboTypeActionPerformed

    private void rbParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParentActionPerformed
        rb_Parent_Visibility();
    }//GEN-LAST:event_rbParentActionPerformed

    private void rbChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChildActionPerformed
        rb_Child_Visibility();
    }//GEN-LAST:event_rbChildActionPerformed

    private void txtAccountCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountCodeKeyTyped
        if (txtAccountCode.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtAccountCodeKeyTyped

    private void txtAccountNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountNameKeyTyped
        if (txtAccountName.getText().length() >= 100) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtAccountNameKeyTyped

    private void txtOpeningBalanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOpeningBalanceKeyTyped
        if (txtOpeningBalance.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtOpeningBalanceKeyTyped

    private void txtAccNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccNoKeyTyped
        if (txtAccNo.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtAccNoKeyTyped

    private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
        if (txtContact.getText().length() >= 100) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtContactKeyTyped

    private void txtPhoneNo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNo1KeyTyped
        if (txtPhoneNo1.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPhoneNo1KeyTyped

    private void txtPhoneNo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNo2KeyTyped
        if (txtPhoneNo2.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPhoneNo2KeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if (txtEmail.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtVATNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVATNoKeyTyped
        if (txtVATNo.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtVATNoKeyTyped

    private void txtRemarksKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemarksKeyTyped
        if (txtRemarks.getText().length() >= 250) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtRemarksKeyTyped

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        if (txtAddress.getText().length() >= 250) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtAddressKeyTyped

    private void txtRemarksBankKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemarksBankKeyTyped
        if (txtRemarksBank.getText().length() >= 250) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtRemarksBankKeyTyped

    private void txtRemarksCashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemarksCashKeyTyped
        if (txtRemarksCash.getText().length() >= 250) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtRemarksCashKeyTyped

    private void txtOpeningBalanceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOpeningBalanceFocusGained
        if (String.valueOf(convertDecimal(0)).equals(txtOpeningBalance.getText())) {
            txtOpeningBalance.setText("");
        }
    }//GEN-LAST:event_txtOpeningBalanceFocusGained

    private void txtOpeningBalanceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOpeningBalanceFocusLost
        if (txtOpeningBalance.getText().equals("")) {
            txtOpeningBalance.setText(String.valueOf(convertDecimal(0)));
        } else if (txtOpeningBalance.getText().equals("0")) {
            txtOpeningBalance.setText(String.valueOf(convertDecimal(0)));
        }
    }//GEN-LAST:event_txtOpeningBalanceFocusLost

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
            java.util.logging.Logger.getLogger(frmAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboAccountType;
    private javax.swing.JComboBox comboBank;
    private javax.swing.JComboBox comboBranch;
    private javax.swing.JComboBox comboCategory;
    private javax.swing.JComboBox comboParent;
    private javax.swing.JComboBox comboSign;
    private javax.swing.JComboBox comboType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAccNO;
    private javax.swing.JLabel lblAccountCode;
    private javax.swing.JLabel lblAccountName;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBank;
    private javax.swing.JLabel lblBranch;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGroup;
    private javax.swing.JLabel lblOpeningBalance;
    private javax.swing.JLabel lblParent;
    private javax.swing.JLabel lblPhoneNo1;
    private javax.swing.JLabel lblPhoneNo2;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblRemarksBank;
    private javax.swing.JLabel lblRemarksCash;
    private javax.swing.JLabel lblSign;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblVATNo;
    private javax.swing.JPanel panel1;
    private javax.swing.JRadioButton rbChild;
    private javax.swing.JRadioButton rbParent;
    private javax.swing.JScrollPane scroll_Remarks_Bank;
    private javax.swing.JScrollPane scroll_Remarks_Cash;
    private javax.swing.JTabbedPane tabbedAccounts;
    private javax.swing.JTextField txtAccNo;
    private javax.swing.JTextField txtAccountCode;
    private javax.swing.JTextField txtAccountName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtOpeningBalance;
    private javax.swing.JTextField txtPhoneNo1;
    private javax.swing.JTextField txtPhoneNo2;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JEditorPane txtRemarksBank;
    private javax.swing.JEditorPane txtRemarksCash;
    private javax.swing.JTextField txtVATNo;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        // GENARAL
        txtAccountCode.setText(null);
        txtAccountName.setText(null);
        comboCategory.setSelectedIndex(0);
        comboParent.setSelectedIndex(0);
        rbParent.setSelected(true);
        rbChild.setSelected(false);
        comboType.setSelectedIndex(0);
        comboSign.setSelectedIndex(0);
        txtOpeningBalance.setText(String.valueOf(convertDecimal(0)));

        // DETAILS 1
        txtContact.setText(null);
        txtPhoneNo1.setText(null);
        txtEmail.setText(null);
        txtPhoneNo2.setText(null);
        txtVATNo.setText(null);
        txtRemarks.setText(null);
        txtAddress.setText(null);

        // DETAILS 2
        txtAccNo.setText(null);
        comboAccountType.setSelectedIndex(0);
        comboBank.setSelectedIndex(0);
        comboBranch.setSelectedIndex(0);
        txtRemarksBank.setText(null);

        // DETAILS 3
        txtRemarksCash.setText(null);

        rb_Parent_Visibility();
        
        txtAccountCode.requestFocus();
    }

    private void fill_Parent_Dropdown() {
        p = new DefaultComboBoxModel();
        comboParent.setModel(p);
        comboParent.addItem("- Select Parent Name -");

        if ("Asset".equals(comboCategory.getSelectedItem())) {
            comboParent.addItem("Asset");
            comboParent.addItem("Fixed Asset");
            comboParent.addItem("Current Asset");
            comboParent.addItem("Bank");
            comboParent.addItem("Cash");
            comboParent.addItem("Customers");
        } else if ("Liability".equals(comboCategory.getSelectedItem())) {
            comboParent.addItem("Liability");
            comboParent.addItem("Suppliers");
        } else if ("Income".equals(comboCategory.getSelectedItem())) {
            comboParent.addItem("Income");
        } else if ("Expenses".equals(comboCategory.getSelectedItem())) {
            comboParent.addItem("Expenses");
        }
    }

    private void formFormat() {
        this.setLocationRelativeTo(null);

        clearFields();

        fill_Parent_Dropdown();

        rb_Parent_Visibility();

        detailTabFormating();
    }

    private void detailTabFormating() {
        if ("- Select Type -".equals(comboType.getSelectedItem())) {
            tab_Detail_Visibility_False();
        } else if ("Bank".equals(comboType.getSelectedItem())) {
            tab_Detail_Visibility_False();

            lblAccNO.setVisible(true);
            lblAccountType.setVisible(true);
            lblBank.setVisible(true);
            lblBranch.setVisible(true);
            lblRemarksBank.setVisible(true);
            txtAccNo.setVisible(true);
            comboAccountType.setVisible(true);
            comboBank.setVisible(true);
            comboBranch.setVisible(true);
            scroll_Remarks_Bank.setVisible(true);
            txtRemarksBank.setVisible(true);
        } else if ("Cash".equals(comboType.getSelectedItem())) {
            tab_Detail_Visibility_False();

            lblRemarksCash.setVisible(true);
            scroll_Remarks_Cash.setVisible(true);
            txtRemarksCash.setVisible(true);
        } else if ("Customer".equals(comboType.getSelectedItem())) {
            tab_Detail_Visibility_False();

            lblContact.setVisible(true);
            lblPhoneNo1.setVisible(true);
            lblEmail.setVisible(true);
            lblPhoneNo2.setVisible(true);
            lblVATNo.setVisible(true);
            lblRemarks.setVisible(true);
            lblAddress.setVisible(true);
            txtContact.setVisible(true);
            txtPhoneNo1.setVisible(true);
            txtEmail.setVisible(true);
            txtPhoneNo2.setVisible(true);
            txtVATNo.setVisible(true);
            txtRemarks.setVisible(true);
            txtAddress.setVisible(true);
        }
    }

    private String convertDecimal(double getValue) {
//        DecimalFormat currencyFormat = new DecimalFormat("#, ###.00");
        return currencyFormat.format(getValue);
    }

    private void tab_Detail_Visibility_False() {
        lblAccNO.setVisible(false);
        lblAccountType.setVisible(false);
        lblBank.setVisible(false);
        lblBranch.setVisible(false);
        lblRemarksBank.setVisible(false);
        txtAccNo.setVisible(false);
        comboAccountType.setVisible(false);
        comboBank.setVisible(false);
        comboBranch.setVisible(false);
        scroll_Remarks_Bank.setVisible(false);
        txtRemarksBank.setVisible(false);

        lblRemarksCash.setVisible(false);
        scroll_Remarks_Cash.setVisible(false);
        txtRemarksCash.setVisible(false);

        lblContact.setVisible(false);
        lblPhoneNo1.setVisible(false);
        lblEmail.setVisible(false);
        lblPhoneNo2.setVisible(false);
        lblVATNo.setVisible(false);
        lblRemarks.setVisible(false);
        lblAddress.setVisible(false);
        txtContact.setVisible(false);
        txtPhoneNo1.setVisible(false);
        txtEmail.setVisible(false);
        txtPhoneNo2.setVisible(false);
        txtVATNo.setVisible(false);
        txtRemarks.setVisible(false);
        txtAddress.setVisible(false);
    }

    private void rb_Parent_Visibility() {
        if (rbParent.isSelected()) {
            comboType.setEnabled(false);
            comboSign.setEnabled(false);
            txtOpeningBalance.setEnabled(false);
        }
    }

    private void rb_Child_Visibility() {
        if (rbChild.isSelected()) {
            comboType.setEnabled(true);
            comboSign.setEnabled(true);
            txtOpeningBalance.setEnabled(true);
        }
    }
}
