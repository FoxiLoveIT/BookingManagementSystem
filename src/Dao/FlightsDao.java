/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Flights;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author bzach
 */
public class FlightsDao {

    public static void save(Flights flights) {
        String query = "insert into Flights (flight_num,time_departure,time_arrival,departure_airport,arrival_airport,status,airplane_code) values ('" + flights.getFlightNum() + "',PARSEDATETIME('" + flights.getTimeDeparture() + ":00" + "','HH:mm:ss'),PARSEDATETIME('" + flights.getTimeArrival() + ":00" + "','HH:mm:ss'),'" + flights.getDepartureAirport() + "','" + flights.getArrivalAirport() + "','" + flights.getStatus() + "','" + flights.getAirplaneCode() + "')";
        dbOperations.setDataOrDelete(query, "Flights Added Successfully");
    }

    public static void saveday(Flights flights) {
        String query = "insert into Flights (time_departure,time_arrival) values (',DATE('" + flights.getTimeDeparture() + "'),DATE('" + flights.getTimeArrival() + ") where " + flights.getArrivalAirport() + ")";
        dbOperations.setDataOrDelete(query, "Flights Added Successfully");
    }

    public static ArrayList<Flights> getAllRecords() {
        ArrayList<Flights> arrayList = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("SELECT *, TO_CHAR(TIME_DEPARTURE, 'HH24:MI') AS DEPARTURE_TIME, TO_CHAR(TIME_ARRIVAL, 'HH24:MI') AS ARRIVAL_TIME FROM Flights;");
            while (rs.next()) {
                Flights flights = new Flights();
                flights.setId(rs.getInt("id"));
                flights.setFlightNum(rs.getString("FLIGHT_NUM"));
                flights.setTimeDeparture(rs.getString("DEPARTURE_TIME"));
                flights.setTimeArrival(rs.getString("ARRIVAL_TIME"));
                flights.setDepartureAirport(rs.getString("departure_airport"));
                flights.setArrivalAirport(rs.getString("arrival_airport"));
                flights.setStatus(rs.getString("status"));
                flights.setAirplaneCode(rs.getString("airplane_code"));
                arrayList.add(flights);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<Flights> getAllRecordsByArrivalAirport(String Arr) {
        ArrayList<Flights> arrayList = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("SELECT *, TO_CHAR(TIME_DEPARTURE, 'HH24:MI') AS DEPARTURE_TIME, TO_CHAR(TIME_ARRIVAL, 'HH24:MI') AS ARRIVAL_TIME FROM Flights where arrival_airport = '" + Arr + "'");
            while (rs.next()) {
                Flights flights = new Flights();
                flights.setId(rs.getInt("id"));
                flights.setFlightNum(rs.getString("FLIGHT_NUM"));
                flights.setTimeDeparture(rs.getString("DEPARTURE_TIME"));
                flights.setTimeArrival(rs.getString("ARRIVAL_TIME"));
                flights.setDepartureAirport(rs.getString("departure_airport"));
                flights.setArrivalAirport(rs.getString("arrival_airport"));
                flights.setStatus(rs.getString("status"));
                flights.setAirplaneCode(rs.getString("airplane_code"));
                arrayList.add(flights);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void delete(String flightNum) {
        String query = "delete from Flights where flight_num ='" + flightNum + "'";
        dbOperations.setDataOrDelete(query, "Flights Deleted Successfully");
    }

}
