package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bzach
 */
public class BookingsSeats {
    private int id;
    private String AirCraftCode;
    private String SeatNo; 
    private String FareConditions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirCraftCode() {
        return AirCraftCode;
    }

    public void setAirCraftCode(String AirCraftCode) {
        this.AirCraftCode = AirCraftCode;
    }

    public String getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(String SeatNo) {
        this.SeatNo = SeatNo;
    }

    public String getFareConditions() {
        return FareConditions;
    }

    public void setFareConditions(String FareConditions) {
        this.FareConditions = FareConditions;
    }
    
    
}
