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
public class Flight {
    
    private String flightStart;
    private String flightDest;
    private Date departure;
    private Date arrival;
    private String carrier;
   
    public Flight(String flightStart, String flightDest, Date departure, Date arrival, String carrier){
        
        this.flightStart = flightStart;
        this.flightDest = flightDest;
        this.departure = departure;
        this.arrival = arrival;
        this.carrier = carrier;
    }

}
