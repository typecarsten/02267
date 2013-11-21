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
@XmlRootElement

public class Flight {
    
    private String flightStart;
    private String flightDest;
    private String departure;
    private String arrival;
    private String carrier;
    
    public Flight() {}
   
    public Flight(String flightStart, String flightDest, String departure, String arrival, String carrier){
        
        this.flightStart = flightStart;
        this.flightDest = flightDest;
        this.departure = departure;
        this.arrival = arrival;
        this.carrier = carrier;
    }
    
    public String getFlightStart(){
        return flightStart;
    }
    
    public String getFlightDest(){
        return flightDest;
    }
    
    public String getDeparture(){
        return departure;
    }
    
    public String getArrival(){
        return arrival;
    }
    
    public String getCarrier(){
        return carrier;
    }

}
