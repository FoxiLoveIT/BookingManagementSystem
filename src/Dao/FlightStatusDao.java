/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.FlightStatus;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author bzach
 */
public class FlightStatusDao {
    
    public static void save(FlightStatus flightStatus){
        String query = "insert into FlightStatus (name) values ('" + flightStatus.getStatus() +"')";
        dbOperations.setDataOrDelete(query, "Status Added Succes");
    }
    
    public static ArrayList<FlightStatus> getAllRecords(){
    ArrayList<FlightStatus> arrayList = new ArrayList<>();
    try{
        ResultSet rs = dbOperations.getData("select * from FlightStatus");
        while(rs.next()){
            FlightStatus flightStatus = new FlightStatus();
            flightStatus.setStatus(rs.getString("Name"));
            arrayList.add(flightStatus);
        }
    }
    catch(Exception e){
     JOptionPane.showMessageDialog(null, e);
    }
    return arrayList;
    }
    
    public static void delete(String status){
    String query = "delete from FlightStatus where name ='"+status+"'";
    dbOperations.setDataOrDelete(query, "FlightStatus Deleted Successfully");
    }
}
