/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Matias
 */
public class FlightInformation {
   
    private int bookingNo;
    private int price;
    private String flightService;
    private Flight flight;
    
    public FlightInformation() {}
    
    public FlightInformation(int bookingNo, int price, String flightService, Flight flight) {
    
        this.bookingNo = bookingNo;
        this.price = price;
        this.flightService = flightService;
        this.flight = flight;
    }
    public int getBookingNo(){
        return bookingNo;
    }
    
    public int getPrice(){
        return price;
    }
    
    public String getFlightService(){
        return flightService;
    }
    
    public Flight getFlight(){
        return flight;
    }
    
    public void setFlight(Flight f) {}
}   
