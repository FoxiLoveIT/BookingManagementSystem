/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import Dao.ClientDao;
import Model.Client;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Signup extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";
    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        btnSave.setEnabled(false);
    }
    
    public void clear(){
        txtName.setText("");
        txtEmail.setText("");
        txtMobileNumber.setText("");
        txtPassword.setText("");
        txtAnswer.setText("");
        btnSave.setEnabled(false);
    }
    
    public void validateFields(){
        String name = txtName.getText();
        String email = txtEmail.getText();
        String mobileNumber = txtMobileNumber.getText();
        String password = txtPassword.getText();
        String answer = txtAnswer.getText();
        if(!name.equals("") && email.matches(emailPattern) && mobileNumber.matches(mobileNumberPattern) && mobileNumber.length()== 10 && !password.equals("") && !answer.equals(""))
            btnSave.setEnabled(true);
        else
            btnSave.setEnabled(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnFP = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnMain = new javax.swing.JButton();
        lblSecrQuestion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 119, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Signup");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 119, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mobile Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 119, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnswerKeyReleased(evt);
            }
        });
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 390, 30));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 390, 30));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 390, 30));

        txtMobileNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyReleased(evt);
            }
        });
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 390, 30));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(60, 20));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 390, 30));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 90, 30));

        btnFP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFP.setText("Forgot Password?");
        btnFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFPActionPerformed(evt);
            }
        });
        getContentPane().add(btnFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 200, 40));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 90, 30));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 90, 30));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 400, 90, 30));

        btnMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMain.setText("Main");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });
        getContentPane().add(btnMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 60, 30));

        lblSecrQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSecrQuestion.setText("What programming language do you love???");
        getContentPane().add(lblSecrQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Answer");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        lblQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuestion.setText("Question");
        getContentPane().add(lblQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNumberKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtMobileNumberKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login1().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFPActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_btnFPActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Client client = new Client();
        client.setName(txtName.getText());
        client.setEmail(txtEmail.getText());
        client.setMobileNumber(txtMobileNumber.getText());
        client.setPassword(txtPassword.getText());
        client.setAnswer(txtAnswer.getText());
        ClientDao.save(client);
        clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"Do you really want to Close Application","Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtAnswerKeyReleased

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Main().setVisible(true);
    }//GEN-LAST:event_btnMainActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFP;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblSecrQuestion;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

}
