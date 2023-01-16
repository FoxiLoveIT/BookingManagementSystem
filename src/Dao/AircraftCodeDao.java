/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Model.AircraftCode;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author bzach
 */
public class AircraftCodeDao {
    
        public static ArrayList<AircraftCode> getAllRecords() {
        ArrayList<AircraftCode> arrayList = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select * from AircraftCode");
            while (rs.next()) {
                AircraftCode aircraftCode = new AircraftCode();
                aircraftCode.setId(rs.getInt("id"));
                aircraftCode.setAircraftCode(rs.getString("AircraftCode"));

                arrayList.add(aircraftCode);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
        
}
