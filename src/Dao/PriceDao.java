/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.PriceFlights;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author bzach
 */

public class PriceDao {
    
    public static String getPrice(String Arr, String Class) {
        PriceFlights priceFlights = new PriceFlights();
        try {
            ResultSet rs = dbOperations.getData("select price from FLIGHTPRICE where ARRIVAL_AIRPORT  like'%"+Arr+"%' and FARE_CONDITIONS like '%"+Class+"%'");
            if (rs.next()) {
                priceFlights.setPrice(rs.getString("PRICE"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(priceFlights.getPrice());
}
    
    public static String getSeats(String Class){
    PriceFlights priceFlights = new PriceFlights();
        try {
            ResultSet rs = dbOperations.getData("SELECT COUNT(*) FROM BOOKINGSSEATS WHERE FARECONDITIONS = '"+Class+"' AND SEATINGSTATUS IS NULL;");
            if (rs.next()) {
                priceFlights.setPrice(rs.getString("COUNT(*)"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(priceFlights.getPrice());
    }
}
