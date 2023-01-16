/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author bzach
 */
public class RegFl {

    private String id;
    private String FLIGHTNUM;
    private String name;
    private String email;
    private String flightDate;
    private String Price;
    private String FareConditions;
    private String Arr;
    private String Seat;

    public String getSeatOld() {
        return SeatOld;
    }

    public void setSeatOld(String SeatOld) {
        this.SeatOld = SeatOld;
    }
    private String SeatOld;

    public String getSeat() {
        return Seat;
    }

    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    public String getArr() {
        return Arr;
    }

    public void setArr(String Arr) {
        this.Arr = Arr;
    }

    public String getFareConditions() {
        return FareConditions;
    }

    public void setFareConditions(String FareConditions) {
        this.FareConditions = FareConditions;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFLIGHTNUM() {
        return FLIGHTNUM;
    }

    public void setFLIGHTNUM(String FLIGHTNUM) {
        this.FLIGHTNUM = FLIGHTNUM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    private String mobileNumber;

}
