/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class table {

    public static void main(String[] args) {
        try {
            //   String userTable = "CREATE TABLE  client (ID bigint AUTO_INCREMENT NOT NULL PRIMARY KEY, NAME varchar(200), EMAIL varchar(200) NOT NULL, MobileNumber varchar(200), Password varchar(200) NOT NULL, Answer varchar(200), Role varchar(200), Status varchar(200))";
            // String flights = "Create table Flights (ID bigint AUTO_INCREMENT NOT NULL PRIMARY KEY,flight_num varchar(200),time_departure time,time_arrival time,departure_airport varchar(200),arrival_airport varchar(200),status varchar(200),airplane_code varchar(200))";
            //  String airports = "Create table Airports (ID bigint AUTO_INCREMENT NOT NULL PRIMARY KEY,IATA varchar(20),airports varchar(200),city varchar(200),timezone varchar(200))";
            // String status = "Create Table FlightStatus (ID bigint AUTO_INCREMENT NOT NULL PRIMARY KEY,Name varchar(200))";
            // String status = "Create Table BookingsSeats (ID bigint AUTO_INCREMENT NOT NULL PRIMARY KEY,AirCraftCode varchar(200),SeatNo varchar(200),FareConditions varchar(200))";
            // String status = "Create Table FareConditions (ID bigint AUTO_INCREMENT NOT NULL PRIMARY KEY,FareConditions varchar(200))";
            String status = "Create Table FlightTiket (ID varchar NOT NULL PRIMARY KEY,FLIGHTNUM varchar(200),Name varchar(200),Email varchar(200),Phone varchar(200),FareConditions varchar(200),FlighDate DATE,Price bigint,Seat varchar)";
            dbOperations.setDataOrDelete(status, "User Table Created Succssfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
