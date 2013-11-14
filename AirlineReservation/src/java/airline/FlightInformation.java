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
   
    private String bookingNo;
    private String price;
    private String flightService;
    private Flight flight;
    
    public FlightInformation(String bookingNo, String price, String flightService, Flight flight) {
    
        this.bookingNo = bookingNo;
        this.price = price;
        this.flightService = flightService;
        this.flight = flight;
    }
    public String getBookingNo(){
        return bookingNo;
    }
    
    public String getPrice(){
        return price;
    }
    
    public String getFlightService(){
        return flightService;
    }
    
    public Flight getFlight(){
        return flight;
    }
}   
