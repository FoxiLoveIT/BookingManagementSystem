/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import Dao.AircraftCodeDao;
import Dao.AirportsDao;
import Dao.FlightsDao;
import Model.Flights;
import Dao.FlightStatusDao;
import Model.AircraftCode;
import Model.Airports;
import Model.FlightStatus;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author bzach
 */
public class NewFlight extends javax.swing.JFrame {

    /**
     * Creates new form NewFlight
     */
    public NewFlight() {
        initComponents();
        btnSave.setEnabled(false);
    }

    public void validateField() {
        String flightNum = txtFlightNum.getText();

        if (!flightNum.equals("")) {
            btnSave.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
        }
    }

    private void clear() {
        txtFlightNum.setText("");
        txtTimeDep.setText("");
        txtTimeArr.setText("");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFlightNum = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        txtArr = new javax.swing.JComboBox<>();
        txtDep = new javax.swing.JComboBox<>();
        txtxStatus = new javax.swing.JComboBox<>();
        txtAirCraftCode = new javax.swing.JComboBox<>();
        txtTimeDep = new javax.swing.JTextField();
        txtTimeArr = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Flight №");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setText("Time Arrival");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 84, -1));

        jLabel5.setText("Departure Airport ");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel6.setText("Arrival Airport");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 97, -1));

        jLabel7.setText("Status Flight");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 93, -1));

        jLabel8.setText("Airplane Code");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        txtFlightNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFlightNumKeyReleased(evt);
            }
        });
        getContentPane().add(txtFlightNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 30));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setText("Сlear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight №", "Time Dep", "Time Arr", "Dep Airport", "Arr Airport", "Status", "Airplane Code"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 600, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("*Click On Row to Delete Flight");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, -1, -1));

        jLabel11.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("New Flight");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 90, 30));

        getContentPane().add(txtArr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 150, 30));

        getContentPane().add(txtDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 150, 30));

        getContentPane().add(txtxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 150, 30));

        getContentPane().add(txtAirCraftCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 150, 30));

        txtTimeDep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimeDepKeyReleased(evt);
            }
        });
        getContentPane().add(txtTimeDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, 30));

        txtTimeArr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimeArrKeyReleased(evt);
            }
        });
        getContentPane().add(txtTimeArr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, 30));

        jLabel10.setText("Time Departure");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        btnStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        getContentPane().add(btnStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFlightNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFlightNumKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtFlightNumKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Flights flights = new Flights();
        flights.setFlightNum(txtFlightNum.getText());
        flights.setTimeDeparture(txtTimeDep.getText());
        flights.setTimeArrival(txtTimeArr.getText());
        flights.setDepartureAirport((String) txtDep.getSelectedItem());
        flights.setArrivalAirport((String) txtArr.getSelectedItem());
        flights.setStatus((String) txtxStatus.getSelectedItem());
        flights.setAirplaneCode((String) txtAirCraftCode.getSelectedItem());
        FlightsDao.save(flights);
        setVisible(false);
        new NewFlight().setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String flightNum = model.getValueAt(index, 0).toString();
        String timeDep = model.getValueAt(index, 1).toString();
        String timeArr = model.getValueAt(index, 2).toString();
        String depAir = model.getValueAt(index, 3).toString();
        String arrAir = model.getValueAt(index, 4).toString();
        String status = model.getValueAt(index, 5).toString();
        String airplaneCode = model.getValueAt(index, 6).toString();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Delete " + flightNum + " Flights", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            FlightsDao.delete(flightNum);
            setVisible(false);
            new NewFlight().setVisible(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here
        setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<Flights> list = FlightsDao.getAllRecords();
        Iterator<Flights> itr = list.iterator();
        while (itr.hasNext()) {
            Flights flightsObj = itr.next();
            dtm.addRow(new Object[]{flightsObj.getFlightNum(), flightsObj.getTimeDeparture(), flightsObj.getTimeArrival(), flightsObj.getDepartureAirport(), flightsObj.getArrivalAirport(), flightsObj.getStatus(), flightsObj.getAirplaneCode()});
        }
        ArrayList<FlightStatus> list2 = FlightStatusDao.getAllRecords();
        Iterator<FlightStatus> itr2 = list2.iterator();
        while (itr2.hasNext()) {
            FlightStatus flightStatusObj = itr2.next();
            txtxStatus.addItem(flightStatusObj.getStatus());
        }

        ArrayList<Airports> lis = AirportsDao.getAllRecords();
        Iterator<Airports> it = lis.iterator();
        while (it.hasNext()) {
            Airports airportsObj = it.next();
            txtDep.addItem(airportsObj.getCity());
            txtArr.addItem(airportsObj.getCity());
        }

        ArrayList<AircraftCode> list1 = AircraftCodeDao.getAllRecords();
        Iterator<AircraftCode> itr1 = list1.iterator();
        while (itr1.hasNext()) {
            AircraftCode aircraftCodesObj = itr1.next();
            txtAirCraftCode.addItem(aircraftCodesObj.getAircraftCode());
        }
    }//GEN-LAST:event_formComponentShown

    private void txtTimeDepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimeDepKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeDepKeyReleased

    private void txtTimeArrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimeArrKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeArrKeyReleased

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
            java.util.logging.Logger.getLogger(NewFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel btnStatus;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> txtAirCraftCode;
    private javax.swing.JComboBox<String> txtArr;
    private javax.swing.JComboBox<String> txtDep;
    private javax.swing.JTextField txtFlightNum;
    private javax.swing.JTextField txtTimeArr;
    private javax.swing.JTextField txtTimeDep;
    private javax.swing.JComboBox<String> txtxStatus;
    // End of variables declaration//GEN-END:variables
}
