/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import java.util.Date;
/**
 *
 * @author Matias
 */
public class FlightInformation {
   
    private int bookingNo;
    private double price;
    private String flightService;
    private Flight flight;
    
    public FlightInformation(int bookingNo, double price, String flightService, Flight flight) {
    
        this.bookingNo = bookingNo;
        this.price = price;
        this.flightService = flightService;
        this.flight = flight;
    }
}   
