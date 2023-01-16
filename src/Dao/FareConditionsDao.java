/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import Model.FareConditions;
/**
 *
 * @author bzach
 */
public class FareConditionsDao {
        public static ArrayList<FareConditions> getAllRecords() {
        ArrayList<FareConditions> arrayList = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select * from FareConditions");
            while (rs.next()) {
                FareConditions fareConditions = new FareConditions();
                fareConditions.setId(rs.getInt("id"));
                fareConditions.setFareConditions(rs.getString("FareConditions"));
                arrayList.add(fareConditions);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
