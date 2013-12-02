/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import airline.Exception_Exception;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carsten
 */
public class LameDuckTest {
    
    public LameDuckTest() {
    }
     
    @Test
     public void TestGetFlights() {
     int size = 0;
        try {
            size = getFlights("Copenhagen", "Paris", "01;01;10;30").size();
        } catch (Exception_Exception ex) {
            Logger.getLogger(LameDuckTest.class.getName()).log(Level.SEVERE, null, ex);
        }
     assertEquals(1, size);
     }

    private static java.util.List<airline.FlightInformation> getFlights(java.lang.String flightStart, java.lang.String flightDest, java.lang.String flightDate) throws Exception_Exception {
        airline.AirlineReservation_Service service = new airline.AirlineReservation_Service();
        airline.AirlineReservation port = service.getAirlineReservationPort();
        return port.getFlights(flightStart, flightDest, flightDate);
    }
}
