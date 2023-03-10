/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import Dao.BookingsSeatsDao;
import Dao.RegFlDao;
import Model.BookingsSeats;
import Model.FareConditions;
import Model.RegFl;
import SeatAssigner.SeatAssigner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author bzach
 */
public class Tickets extends javax.swing.JFrame {

    private final String email;

    /**
     * Creates new form Tickets
     */
    public Tickets() {
        initComponents();
        this.email = null;
    }

    public Tickets(String Email) {
        initComponents();
        email = Email;
    }

    public void removeAndInsert(String classType, String seatToRemove, String seatToInsert) {
        if (classType.equalsIgnoreCase("business")) {
            int indexToRemove = Arrays.asList(SeatAssigner.BUSINESS).indexOf(seatToRemove);
            if (indexToRemove != -1) {
                SeatAssigner.BUSINESS = SeatAssigner.removeElement(SeatAssigner.BUSINESS, indexToRemove);
                SeatAssigner.BUSINESS = SeatAssigner.addElement(SeatAssigner.BUSINESS, seatToInsert);
            }
        } else if (classType.equalsIgnoreCase("economyPlus")) {
            int indexToRemove = Arrays.asList(SeatAssigner.EconomyPlus).indexOf(seatToRemove);
            if (indexToRemove != -1) {
                SeatAssigner.EconomyPlus = SeatAssigner.removeElement(SeatAssigner.EconomyPlus, indexToRemove);
                SeatAssigner.EconomyPlus = SeatAssigner.addElement(SeatAssigner.EconomyPlus, seatToInsert);
            }
        } else if (classType.equalsIgnoreCase("economy")) {
            int indexToRemove = Arrays.asList(SeatAssigner.ECONOMY).indexOf(seatToRemove);
            if (indexToRemove != -1) {
                SeatAssigner.ECONOMY = SeatAssigner.removeElement(SeatAssigner.ECONOMY, indexToRemove);
                SeatAssigner.ECONOMY = SeatAssigner.addElement(SeatAssigner.ECONOMY, seatToInsert);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lblClass = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblSeat = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblSeat1 = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        txtSeat = new javax.swing.JLabel();
        txtPrice = new javax.swing.JLabel();
        txtClass = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ???", "FARECONDITIONS", "FLIGHDATE", "SEAT", "PRICE"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 91, 560, 328));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Change Seat");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 30));

        lblClass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblClass.setText("Your Class");
        getContentPane().add(lblClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, 30));

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblData.setText("Flight Date");
        getContentPane().add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 140, 30));

        lblPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrice.setText("Price");
        getContentPane().add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, 30));

        lblSeat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSeat.setText("Seat");
        getContentPane().add(lblSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 287, 200, 30));

        lblSeat1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSeat1.setText("Booking New Seat");
        getContentPane().add(lblSeat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, 30));

        txtDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 139, 200, 30));

        txtSeat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 200, 30));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 239, 200, 30));

        txtClass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 91, 200, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, 30));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String Email = email;
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<RegFl> list = RegFlDao.getAllRecords(Email);
        Iterator<RegFl> itr = list.iterator();
        while (itr.hasNext()) {
            RegFl regFlObj = itr.next();
            dtm.addRow(new Object[]{regFlObj.getFLIGHTNUM(), regFlObj.getFareConditions(), regFlObj.getFlightDate(), regFlObj.getSeat(), regFlObj.getPrice()});
        }
        
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String flightNum = model.getValueAt(index, 0).toString();
        String timeDep = model.getValueAt(index, 1).toString();
        txtClass.setText(timeDep);
        String timeArr = model.getValueAt(index, 2).toString();
        txtDate.setText(timeArr);
        String depAir = model.getValueAt(index, 3).toString();
        txtSeat.setText(depAir);
        String arrAir = model.getValueAt(index, 4).toString();
        txtPrice.setText(arrAir);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        String Seat = ((String) jComboBox1.getSelectedItem());
        String Old = txtSeat.getText();
        removeAndInsert(txtClass.getText(), Old, Seat);
        BookingsSeats bookingsSeats = new BookingsSeats();
        bookingsSeats.setSeatNo(Seat);
        BookingsSeatsDao.UpDate(bookingsSeats);
        BookingsSeats bookingsSeats1 = new BookingsSeats();
        bookingsSeats.setSeatNo(Old);
        BookingsSeatsDao.UpDateFalse(bookingsSeats);
        RegFl regfl = new RegFl();
        regfl.setSeatOld(Old);
        regfl.setSeat(Seat);
        RegFlDao.UpDate(regfl);
        new Tickets(email).setVisible(true);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        // TODO add your handling code here:
        jComboBox1.removeAllItems();
        ArrayList<BookingsSeats> lis = BookingsSeatsDao.getAllRecordsByCategory(txtClass.getText());
        Iterator<BookingsSeats> it = lis.iterator();
        while (it.hasNext()) {
            BookingsSeats bookingsSeatsObj = it.next();
            jComboBox1.addItem(bookingsSeatsObj.getSeatNo());
        }

    }//GEN-LAST:event_jButton3MousePressed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Tickets.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tickets.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tickets.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tickets.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSeat;
    private javax.swing.JLabel lblSeat1;
    private javax.swing.JLabel txtClass;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtPrice;
    private javax.swing.JLabel txtSeat;
    // End of variables declaration//GEN-END:variables
}
