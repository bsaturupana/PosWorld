package Forms;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmPasswordReset extends javax.swing.JFrame {

    int maxPwdLength = 12;

    public frmPasswordReset() {
        initComponents();

        formFormat();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBodyArea = new javax.swing.JPanel();
        lblNewPassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblSecurityQuestion1 = new javax.swing.JLabel();
        lblSecurityAnswer1 = new javax.swing.JLabel();
        txtSecurityAnswer1 = new javax.swing.JTextField();
        lblSecurityQuestion2 = new javax.swing.JLabel();
        lblSecurityAnswer2 = new javax.swing.JLabel();
        txtSecurityAnswer2 = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblMsgAreaPwdMaxLength = new javax.swing.JLabel();
        panelButtonArea = new javax.swing.JPanel();
        btnSave1 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        comboSecurityQuestion1 = new javax.swing.JComboBox();
        comboSecurityQuestion2 = new javax.swing.JComboBox();
        lblMsgAreaPwdStrength = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PASSWORD RESET");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(45, 62, 80));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBodyArea.setBackground(new java.awt.Color(45, 62, 80));

        lblNewPassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblNewPassword.setText("NEW PASSWORD");

        lblConfirmPassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmPassword.setText("CONFIRM PASSWORD");

        txtNewPassword.setBackground(new java.awt.Color(110, 122, 136));
        txtNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyTyped(evt);
            }
        });

        txtConfirmPassword.setBackground(new java.awt.Color(110, 122, 136));
        txtConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyTyped(evt);
            }
        });

        lblSecurityQuestion1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityQuestion1.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityQuestion1.setText("SECURITY QUESTION 1");

        lblSecurityAnswer1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityAnswer1.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityAnswer1.setText("SECURITY ANSWER 1");

        txtSecurityAnswer1.setBackground(new java.awt.Color(110, 122, 136));
        txtSecurityAnswer1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSecurityAnswer1.setForeground(new java.awt.Color(255, 255, 255));
        txtSecurityAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecurityAnswer1ActionPerformed(evt);
            }
        });
        txtSecurityAnswer1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSecurityAnswer1KeyTyped(evt);
            }
        });

        lblSecurityQuestion2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityQuestion2.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityQuestion2.setText("SECURITY QUESTION 2");

        lblSecurityAnswer2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSecurityAnswer2.setForeground(new java.awt.Color(255, 255, 255));
        lblSecurityAnswer2.setText("SECURITY ANSWER 2");

        txtSecurityAnswer2.setBackground(new java.awt.Color(110, 122, 136));
        txtSecurityAnswer2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSecurityAnswer2.setForeground(new java.awt.Color(255, 255, 255));
        txtSecurityAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecurityAnswer2ActionPerformed(evt);
            }
        });
        txtSecurityAnswer2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSecurityAnswer2KeyTyped(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E-MAIL");

        txtEmail.setBackground(new java.awt.Color(110, 122, 136));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        lblPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber.setText("PHONE NUMBER");

        txtPhoneNumber.setBackground(new java.awt.Color(110, 122, 136));
        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyTyped(evt);
            }
        });

        lblMsgAreaPwdMaxLength.setBackground(new java.awt.Color(45, 62, 80));
        lblMsgAreaPwdMaxLength.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMsgAreaPwdMaxLength.setForeground(new java.awt.Color(0, 204, 0));
        lblMsgAreaPwdMaxLength.setOpaque(true);

        panelButtonArea.setBackground(new java.awt.Color(45, 62, 80));

        btnSave1.setBackground(new java.awt.Color(53, 189, 252));
        btnSave1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave1.setForeground(new java.awt.Color(255, 255, 255));
        btnSave1.setText("SAVE");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(53, 189, 252));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(255, 56, 29));
        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonAreaLayout = new javax.swing.GroupLayout(panelButtonArea);
        panelButtonArea.setLayout(panelButtonAreaLayout);
        panelButtonAreaLayout.setHorizontalGroup(
            panelButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelButtonAreaLayout.setVerticalGroup(
            panelButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelButtonAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        comboSecurityQuestion1.setBackground(new java.awt.Color(110, 122, 136));
        comboSecurityQuestion1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Category -", "What is your first boss name ?", "What is your favourite colour ?", "What is your favourite country ?" }));
        comboSecurityQuestion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSecurityQuestion1ActionPerformed(evt);
            }
        });

        comboSecurityQuestion2.setBackground(new java.awt.Color(110, 122, 136));
        comboSecurityQuestion2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select Category -", "What's your first car model ?", "What is the capital of India ?", "Who is the best friend in school ?" }));
        comboSecurityQuestion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSecurityQuestion2ActionPerformed(evt);
            }
        });

        lblMsgAreaPwdStrength.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMsgAreaPwdStrength.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout panelBodyAreaLayout = new javax.swing.GroupLayout(panelBodyArea);
        panelBodyArea.setLayout(panelBodyAreaLayout);
        panelBodyAreaLayout.setHorizontalGroup(
            panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyAreaLayout.createSequentialGroup()
                .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyAreaLayout.createSequentialGroup()
                        .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBodyAreaLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblNewPassword)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBodyAreaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblSecurityQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblSecurityQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSecurityQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSecurityQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBodyAreaLayout.createSequentialGroup()
                                .addComponent(lblConfirmPassword)
                                .addGap(20, 20, 20)
                                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBodyAreaLayout.createSequentialGroup()
                                .addComponent(lblSecurityAnswer1)
                                .addGap(27, 27, 27)
                                .addComponent(txtSecurityAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBodyAreaLayout.createSequentialGroup()
                                .addComponent(lblSecurityAnswer2)
                                .addGap(27, 27, 27)
                                .addComponent(txtSecurityAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBodyAreaLayout.createSequentialGroup()
                                .addComponent(lblPhoneNumber)
                                .addGap(54, 54, 54)
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBodyAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelButtonArea, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBodyAreaLayout.createSequentialGroup()
                                .addComponent(lblMsgAreaPwdMaxLength, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(lblMsgAreaPwdStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        panelBodyAreaLayout.setVerticalGroup(
            panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyAreaLayout.createSequentialGroup()
                .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyAreaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBodyAreaLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblConfirmPassword)
                                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSecurityAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBodyAreaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblSecurityAnswer1)))
                        .addGap(33, 33, 33)
                        .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSecurityAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBodyAreaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblSecurityAnswer2)))
                        .addGap(31, 31, 31)
                        .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoneNumber)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(panelBodyAreaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNewPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBodyAreaLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboSecurityQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSecurityQuestion1))
                        .addGap(33, 33, 33)
                        .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboSecurityQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSecurityQuestion2))
                        .addGap(29, 29, 29)
                        .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelBodyAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsgAreaPwdStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMsgAreaPwdMaxLength, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(panelButtonArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelBodyArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyTyped
        if (txtNewPassword.getText().length() >= maxPwdLength) {
            lblMsgAreaPwdMaxLength.setVisible(true);
            lblMsgAreaPwdMaxLength.setForeground(Color.RED);
            lblMsgAreaPwdMaxLength.setText("Password Max Length " + maxPwdLength + " Characters Is Reached.");

            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } else {
            lblMsgAreaPwdMaxLength.setVisible(false);
            lblMsgAreaPwdMaxLength.setForeground(Color.BLACK);
            lblMsgAreaPwdMaxLength.setText("");
        }
    }//GEN-LAST:event_txtNewPasswordKeyTyped

    private void txtConfirmPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyTyped
        if (txtConfirmPassword.getText().length() >= maxPwdLength) {
            lblMsgAreaPwdMaxLength.setVisible(true);
            lblMsgAreaPwdMaxLength.setForeground(Color.RED);
            lblMsgAreaPwdMaxLength.setText("Password Max Length " + maxPwdLength + " Characters Is Reached.");

            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } else {
            lblMsgAreaPwdMaxLength.setVisible(false);
            lblMsgAreaPwdMaxLength.setForeground(Color.BLACK);
            lblMsgAreaPwdMaxLength.setText("");
        }
    }//GEN-LAST:event_txtConfirmPasswordKeyTyped

    private void txtSecurityAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityAnswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityAnswer1ActionPerformed

    private void txtSecurityAnswer1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityAnswer1KeyTyped
        if (txtSecurityAnswer1.getText().length() >= 100) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtSecurityAnswer1KeyTyped

    private void txtSecurityAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityAnswer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityAnswer2ActionPerformed

    private void txtSecurityAnswer2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityAnswer2KeyTyped
        if (txtSecurityAnswer2.getText().length() >= 100) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtSecurityAnswer2KeyTyped

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if (txtEmail.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped
        if (txtPhoneNumber.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPhoneNumberKeyTyped

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        if (txtNewPassword.getText().trim().isEmpty() && txtConfirmPassword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "PASSWORD can not be Empty.", "Password Reset", JOptionPane.ERROR_MESSAGE);
        } else if (!txtNewPassword.getText().equals(txtConfirmPassword.getText())) {
            JOptionPane.showMessageDialog(this, "PASSWORD and CONFIRM PASSWORD dose not match.", "Password Reset", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Successfully Saved.", "Password Reset", JOptionPane.INFORMATION_MESSAGE);
            ClearFields();
            this.dispose();
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        ClearFields();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyReleased
        int len = txtNewPassword.getText().length();

        ViewMessage(len);
    }//GEN-LAST:event_txtNewPasswordKeyReleased

    private void txtConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyReleased
        int len = txtConfirmPassword.getText().length();

        ViewMessage(len);
    }//GEN-LAST:event_txtConfirmPasswordKeyReleased

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void comboSecurityQuestion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSecurityQuestion1ActionPerformed
    }//GEN-LAST:event_comboSecurityQuestion1ActionPerformed

    private void comboSecurityQuestion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSecurityQuestion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSecurityQuestion2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPasswordReset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave1;
    private javax.swing.JComboBox comboSecurityQuestion1;
    private javax.swing.JComboBox comboSecurityQuestion2;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMsgAreaPwdMaxLength;
    private javax.swing.JLabel lblMsgAreaPwdStrength;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSecurityAnswer1;
    private javax.swing.JLabel lblSecurityAnswer2;
    private javax.swing.JLabel lblSecurityQuestion1;
    private javax.swing.JLabel lblSecurityQuestion2;
    private javax.swing.JPanel panelBodyArea;
    private javax.swing.JPanel panelButtonArea;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSecurityAnswer1;
    private javax.swing.JTextField txtSecurityAnswer2;
    // End of variables declaration//GEN-END:variables

    private void ClearFields() {
        txtNewPassword.setText("");
        txtConfirmPassword.setText("");
        comboSecurityQuestion1.setSelectedIndex(0);
        txtSecurityAnswer1.setText("");
        comboSecurityQuestion2.setSelectedIndex(0);
        txtSecurityAnswer2.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");
        lblMsgAreaPwdMaxLength.setText("");
        lblMsgAreaPwdStrength.setText("");
    }

    private void ViewMessage(int len) {
        if (len == 0) {
            lblMsgAreaPwdStrength.setVisible(true);
            lblMsgAreaPwdStrength.setForeground(Color.RED);
            lblMsgAreaPwdStrength.setText("Password can not be EMPTY.");
        } else if (len >= 1 && len <= 3) {
            lblMsgAreaPwdStrength.setVisible(true);
            lblMsgAreaPwdStrength.setForeground(Color.ORANGE);
            lblMsgAreaPwdStrength.setText("Password is TOO SHORT.");
        } else if (len >= 4 && len <= 5) {
            lblMsgAreaPwdStrength.setVisible(true);
            lblMsgAreaPwdStrength.setForeground(Color.YELLOW);
            lblMsgAreaPwdStrength.setText("Password is WEAK.");
        } else if (len >= 6 && len <= 8) {
            lblMsgAreaPwdStrength.setVisible(true);
            lblMsgAreaPwdStrength.setForeground(Color.BLUE);
            lblMsgAreaPwdStrength.setText("Password is MEDIUM.");
        } else if (len >= 9 && len <= 12) {
            lblMsgAreaPwdStrength.setVisible(true);
            lblMsgAreaPwdStrength.setForeground(Color.GREEN);
            lblMsgAreaPwdStrength.setText("Password is STRONG.");
        } else {
            lblMsgAreaPwdStrength.setVisible(false);
            lblMsgAreaPwdStrength.setForeground(Color.BLACK);
            lblMsgAreaPwdStrength.setText("");
        }
    }

    private void clearFields() {
        txtNewPassword.setText("");
        txtConfirmPassword.setText("");
        comboSecurityQuestion1.setSelectedIndex(0);
        txtSecurityAnswer1.setText("");
        comboSecurityQuestion2.setSelectedIndex(0);
        txtSecurityAnswer2.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");

        txtNewPassword.requestFocus();
    }

    private void formFormat() {
        lblMsgAreaPwdStrength.setVisible(false);
        lblMsgAreaPwdStrength.setForeground(Color.BLACK);
        lblMsgAreaPwdStrength.setText("");

        clearFields();

        this.setLocationRelativeTo(null);
    }
}
