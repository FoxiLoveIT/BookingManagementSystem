/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import Model.Airports;

/**
 *
 * @author bzach
 */
public class AirportsDao {

    public static void save(Airports airports) {
        String query = "insert into airports (IATA,airports,city,timezone) values ('" + airports.getIATA() + "','" + airports.getAirports() + "','" + airports.getCity() + "','" + airports.getTimezone() + "')";
        dbOperations.setDataOrDelete(query, "airports Added Successfully");
    }

    public static ArrayList<Airports> getAllRecords() {
        ArrayList<Airports> arrayList = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select * from airports");
            while (rs.next()) {
                Airports airports = new Airports();
                airports.setId(rs.getInt("id"));
                airports.setIATA(rs.getString("IATA"));
                airports.setAirports(rs.getString("AIRPORTS"));
                airports.setCity(rs.getString("City"));
                airports.setTimezone(rs.getString("Timezone"));
                arrayList.add(airports);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void delete(String id) {
        String query = "delete from airports where id ='" + id + "'";
        dbOperations.setDataOrDelete(query, "Airports Deleted Successfully");
    }
}
