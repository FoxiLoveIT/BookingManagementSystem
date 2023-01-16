/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.BookingsSeats;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author bzach
 */
public class BookingsSeatsDao {

    public static void save(BookingsSeats bookingsSeats) {
        String query = "insert into BookingsSeats (AirCraftCode,SeatNo,FareConditions) values ('" + bookingsSeats.getAirCraftCode() + "','" + bookingsSeats.getSeatNo() + "','" + bookingsSeats.getFareConditions() + "')";
        dbOperations.setDataOrDelete(query, "BookingsSeats Added Successfully");
    }

    public static ArrayList<BookingsSeats> getAllRecords() {
        ArrayList<BookingsSeats> arrayList = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select * from BookingsSeats");
            while (rs.next()) {
                BookingsSeats bookingsSeats = new BookingsSeats();
                bookingsSeats.setId(rs.getInt("id"));
                bookingsSeats.setAirCraftCode(rs.getString("AirCraftCode"));
                bookingsSeats.setSeatNo(rs.getString("SeatNo"));
                bookingsSeats.setFareConditions(rs.getString("FareConditions"));
                arrayList.add(bookingsSeats);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void delete(String SeatNo) {
        String query = "delete from BookingsSeats where SeatNo ='" + SeatNo + "'";
        dbOperations.setDataOrDelete(query, "BookingsSeats Deleted Successfully");
    }

    public static void UpDate(BookingsSeats bookingsSeats) {
        String query = "UPDATE BookingsSeats set SEATINGSTATUS = true WHERE SEATNO = '" + bookingsSeats.getSeatNo() + "'";
        dbOperations.setDataOrDelete(query, "Good Flight");
    }

    public static ArrayList<BookingsSeats> getAllRecordsByCategory(String FareConditions) {
        ArrayList<BookingsSeats> arrayList = new ArrayList<>();
        try {
            ResultSet rs = dbOperations.getData("select SeatNo from BookingsSeats where FareConditions = '" + FareConditions + "' and SEATINGSTATUS = False");
            while (rs.next()) {
                BookingsSeats bookingsSeats = new BookingsSeats();
                bookingsSeats.setSeatNo(rs.getString("SeatNo"));

                arrayList.add(bookingsSeats);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
        public static void UpDateFalse(BookingsSeats bookingsSeats) {
        String query = "UPDATE BookingsSeats set SEATINGSTATUS = False WHERE SEATNO = '" + bookingsSeats.getSeatNo() + "'";
        dbOperations.setDataOrDelete(query, bookingsSeats.getSeatNo());
    }
}
