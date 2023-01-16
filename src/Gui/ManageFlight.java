/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

/**
 *
 * @author bzach
 */
public class ManageFlight extends javax.swing.JFrame {

    /**
     * Creates new form ManageFlight
     */
    public ManageFlight() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        btnAir = new javax.swing.JButton();
        btnNewFlight = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnManagerSeats = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 90, 30));

        btnAir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAir.setText("Add New Airports");
        btnAir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

        btnNewFlight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNewFlight.setText("New Flight");
        btnNewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewFlightActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Status Flight");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 130, 30));

        btnManagerSeats.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManagerSeats.setText("ManagerSeats");
        btnManagerSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerSeatsActionPerformed(evt);
            }
        });
        getContentPane().add(btnManagerSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, 30));

        jLabel11.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Admin Panel");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        btnStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        getContentPane().add(btnStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here
        setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirActionPerformed
        // TODO add your handling code here:
        new NewAirports().setVisible(true);
    }//GEN-LAST:event_btnAirActionPerformed

    private void btnNewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewFlightActionPerformed
        // TODO add your handling code here:
        new NewFlight().setVisible(true);
    }//GEN-LAST:event_btnNewFlightActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new StatusFlight().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnManagerSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerSeatsActionPerformed
        // TODO add your handling code here:
         new ManagerSeats().setVisible(true);
    }//GEN-LAST:event_btnManagerSeatsActionPerformed

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
            java.util.logging.Logger.getLogger(ManageFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAir;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnManagerSeats;
    private javax.swing.JButton btnNewFlight;
    private javax.swing.JLabel btnStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    // End of variables declaration//GEN-END:variables
}
