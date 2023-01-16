/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author bzach
 */
public class PriceFlights {

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
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
    private String timeArrival;
    private String FareConditions;
    private String Price;
}
