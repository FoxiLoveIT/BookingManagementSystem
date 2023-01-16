/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Client;
import Model.RegFl;
import java.util.Random;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bzach
 */
public class RegFlDao {

    public static void save(RegFl regfl) {
        try {
            ResultSet rs = dbOperations.getData("SELECT FLIGHT_NUM FROM FLIGHTS WHERE ARRIVAL_AIRPORT = '" + regfl.getArr() + "'");

            while (rs.next()) {
                try {
                    regfl.setFLIGHTNUM(rs.getString("FLIGHT_NUM"));
                } catch (SQLException ex) {
                    Logger.getLogger(RegFlDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            int num = 100000 + new Random().nextInt(900000);
            String result = "IFA" + Integer.toString(num);

            regfl.setId(result);
            String query = "insert into FlightTiket (ID,FLIGHTNUM,NAME,EMAIL,Phone,FARECONDITIONS,FLIGHDATE,PRICE,SEAT) values ('" + regfl.getId() + "','" + regfl.getFLIGHTNUM() + "','" + regfl.getName() + "','" + regfl.getEmail() + "','" + regfl.getMobileNumber() + "','" + regfl.getFareConditions() + "','" + regfl.getFlightDate() + "','" + regfl.getPrice() + "','" + regfl.getSeat() + "')";
            dbOperations.setDataOrDelete(query, "Flights Added Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(RegFlDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<RegFl> getAllRecords(String Email) {
        ArrayList<RegFl> arrayList = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select FLIGHTNUM,FARECONDITIONS,FLIGHDATE,SEAT,PRICE from FlightTiket where email  = '" + Email + "'");
            while (rs.next()) {
                RegFl regFl = new RegFl();
                regFl.setFLIGHTNUM(rs.getString("FLIGHTNUM"));
                regFl.setFareConditions(rs.getString("FARECONDITIONS"));
                regFl.setFlightDate(rs.getString("FLIGHDATE"));
                regFl.setSeat(rs.getString("SEAT"));
                regFl.setPrice(rs.getString("PRICE"));
                arrayList.add(regFl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void UpDate(RegFl regFl) {
        String query = "UPDATE FlightTiket set SEAT = '" + regFl.getSeat() + "' where SEAT  = '"+ regFl.getSeatOld() +"'";
        dbOperations.setDataOrDelete(query, "Good Flight");
    }
}
