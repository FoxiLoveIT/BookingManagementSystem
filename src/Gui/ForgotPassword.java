/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import Model.Client;
import javax.swing.JOptionPane;
import Dao.ClientDao;

/**
 *
 * @author user
 */
public class ForgotPassword extends javax.swing.JFrame {

    public String dbAnswer = null;
    public String email = null;
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
        btnUpdate.setEnabled(false);
        btnSearch.setEnabled(false);
    }

    private void clear() {
        btnUpdate.setEnabled(false);
        btnSearch.setEnabled(false);
        txtEmail.setEditable(true);
        txtEmail.setText("");
        txtAnswer.setText("");
        txtNewPassword.setText("");
    }

    public void validateEmail() {
        email = txtEmail.getText();
        if (email.matches(emailPattern)) {
            btnSearch.setEnabled(true);
        } else {
            btnSearch.setEnabled(false);
        }
    }

    public void validateFields() {
        String password = txtNewPassword.getText();
        String answer = txtAnswer.getText();
        if (!password.equals("") && !answer.equals("")) {
            btnUpdate.setEnabled(true);
        } else {
            btnUpdate.setEnabled(false);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMain = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JPasswordField();
        btnSearch = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnMain1 = new javax.swing.JButton();
        lblQuestion = new javax.swing.JLabel();
        lblSecrQuestion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        btnMain.setText("Main");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Signup");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 159, 64, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Enter New Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 244, 145, -1));

        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnswerKeyReleased(evt);
            }
        });
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 400, 25));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 159, 400, 25));

        txtNewPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 244, 400, 25));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 156, -1, -1));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 90, 30));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 90, 30));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 306, 90, 30));

        btnSignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSignup.setText("Signup");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 90, 30));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 90, 30));

        btnMain1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMain1.setText("Main");
        btnMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMain1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMain1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 60, 30));

        lblQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuestion.setText("Question");
        getContentPane().add(lblQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        lblSecrQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSecrQuestion.setText("What programming language do you love???");
        getContentPane().add(lblSecrQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Your Answer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 216, -1, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ForgotPassword?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateEmail();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        email = txtEmail.getText();
        Client client = null;
        client = ClientDao.getSecurityQuestion(email);
        if (client == null) {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\"> Incorrect Email</b></html>", "Massage", JOptionPane.ERROR_MESSAGE);
        } else {
            btnSearch.setEnabled(false);
            txtEmail.setEnabled(false);
            dbAnswer = client.getAnswer();
            validateFields();
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login1().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String answer = txtAnswer.getText();
        String newPassword = txtNewPassword.getText();
        if (answer.equals(dbAnswer)) {
             ClientDao.update(email, newPassword);
             clear();
        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\"> Incorrect Answer</b></html>", "Massage", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Signup().setVisible(true);
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Main().setVisible(true);
    }//GEN-LAST:event_btnMainActionPerformed

    private void btnMain1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMain1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Main().setVisible(true);
    }//GEN-LAST:event_btnMain1ActionPerformed

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNewPasswordKeyReleased

    private void txtAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtAnswerKeyReleased

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnMain1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSignup;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblSecrQuestion;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNewPassword;
    // End of variables declaration//GEN-END:variables

}
