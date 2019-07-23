package Forms;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmPasswordReset extends javax.swing.JFrame {

    int maxPwdLength = 12;

    public frmPasswordReset() {
        initComponents();

        form_Format();
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
        txtSecurityQuestion1 = new javax.swing.JTextField();
        lblSecurityAnswer2 = new javax.swing.JLabel();
        txtSecurityAnswer1 = new javax.swing.JTextField();
        lblSecurityQuestion2 = new javax.swing.JLabel();
        txtSecurityQuestion2 = new javax.swing.JTextField();
        lblSecurityAnswer3 = new javax.swing.JLabel();
        txtSecurityAnswer2 = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        panelButtonArea = new javax.swing.JPanel();
        btnSave1 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblMsgAreaPwdStrength = new javax.swing.JLabel();
        lblMsgAreaPwdMaxLength = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(242, 242, 242));
        setResizable(false);

        panelBodyArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNewPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblNewPassword.setText("NEW PASSWORD");
        panelBodyArea.add(lblNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblConfirmPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblConfirmPassword.setText("CONFIRM PASSWORD");
        panelBodyArea.add(lblConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        txtNewPassword.setBackground(new java.awt.Color(255, 255, 150));
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
        panelBodyArea.add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 30));

        txtConfirmPassword.setBackground(new java.awt.Color(255, 255, 150));
        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyTyped(evt);
            }
        });
        panelBodyArea.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 270, 30));

        lblSecurityQuestion1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSecurityQuestion1.setText("SECURITY QUESTION 1");
        panelBodyArea.add(lblSecurityQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, -1));

        txtSecurityQuestion1.setBackground(new java.awt.Color(255, 255, 150));
        txtSecurityQuestion1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSecurityQuestion1.setText("vbdgnfhmg,jh,mhvmhg");
        txtSecurityQuestion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecurityQuestion1ActionPerformed(evt);
            }
        });
        txtSecurityQuestion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSecurityQuestion1KeyTyped(evt);
            }
        });
        panelBodyArea.add(txtSecurityQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 270, 30));

        lblSecurityAnswer2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSecurityAnswer2.setText("SECURITY ANSWER 1");
        panelBodyArea.add(lblSecurityAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        txtSecurityAnswer1.setBackground(new java.awt.Color(255, 255, 150));
        txtSecurityAnswer1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
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
        panelBodyArea.add(txtSecurityAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 270, 30));

        lblSecurityQuestion2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSecurityQuestion2.setText("SECURITY QUESTION 2");
        panelBodyArea.add(lblSecurityQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, -1));

        txtSecurityQuestion2.setBackground(new java.awt.Color(255, 255, 150));
        txtSecurityQuestion2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSecurityQuestion2.setText("bfdbdfbdgbd");
        txtSecurityQuestion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecurityQuestion2ActionPerformed(evt);
            }
        });
        txtSecurityQuestion2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSecurityQuestion2KeyTyped(evt);
            }
        });
        panelBodyArea.add(txtSecurityQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 270, 30));

        lblSecurityAnswer3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSecurityAnswer3.setText("SECURITY ANSWER 2");
        panelBodyArea.add(lblSecurityAnswer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        txtSecurityAnswer2.setBackground(new java.awt.Color(255, 255, 150));
        txtSecurityAnswer2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
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
        panelBodyArea.add(txtSecurityAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 270, 30));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblEmail.setText("E-MAIL");
        panelBodyArea.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, -1));

        txtEmail.setBackground(new java.awt.Color(255, 255, 150));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
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
        panelBodyArea.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 270, 30));

        lblPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPhoneNumber.setText("PHONE NUMBER");
        panelBodyArea.add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        txtPhoneNumber.setBackground(new java.awt.Color(255, 255, 150));
        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
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
        panelBodyArea.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 270, 30));

        btnSave1.setBackground(new java.awt.Color(155, 194, 230));
        btnSave1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSave1.setText("SAVE");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
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

        lblMsgAreaPwdStrength.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMsgAreaPwdStrength.setForeground(new java.awt.Color(0, 204, 0));

        lblMsgAreaPwdMaxLength.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMsgAreaPwdMaxLength.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBodyArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMsgAreaPwdStrength)
                            .addComponent(lblMsgAreaPwdMaxLength))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelButtonArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelBodyArea, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMsgAreaPwdStrength)
                        .addGap(18, 18, 18)
                        .addComponent(lblMsgAreaPwdMaxLength)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelButtonArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyTyped
//        int len = txtNewPassword.getText().length();

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
//        int len = txtNewPassword.getText().length();

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

    private void txtSecurityQuestion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityQuestion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityQuestion1ActionPerformed

    private void txtSecurityQuestion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityQuestion1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityQuestion1KeyTyped

    private void txtSecurityAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityAnswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityAnswer1ActionPerformed

    private void txtSecurityAnswer1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityAnswer1KeyTyped
        if (txtSecurityAnswer1.getText().length() >= 100) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtSecurityAnswer1KeyTyped

    private void txtSecurityQuestion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityQuestion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityQuestion2ActionPerformed

    private void txtSecurityQuestion2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityQuestion2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityQuestion2KeyTyped

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
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMsgAreaPwdMaxLength;
    private javax.swing.JLabel lblMsgAreaPwdStrength;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSecurityAnswer2;
    private javax.swing.JLabel lblSecurityAnswer3;
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
    private javax.swing.JTextField txtSecurityQuestion1;
    private javax.swing.JTextField txtSecurityQuestion2;
    // End of variables declaration//GEN-END:variables

    private void ClearFields() {
        txtNewPassword.setText("");
        txtConfirmPassword.setText("");
        txtSecurityQuestion1.setText("");
        txtSecurityAnswer1.setText("");
        txtSecurityQuestion2.setText("");
        txtSecurityAnswer2.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");
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

    private void form_Format() {
        lblMsgAreaPwdStrength.setVisible(false);
        lblMsgAreaPwdStrength.setForeground(Color.BLACK);
        lblMsgAreaPwdStrength.setText("");

        txtSecurityQuestion1.setEditable(false);
        txtSecurityQuestion2.setEditable(false);

        this.setLocationRelativeTo(null);
    }
}
