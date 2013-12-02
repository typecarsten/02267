/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import airline.Exception_Exception;
import airline.FlightInformation;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carsten
 */
public class NewEmptyJUnitTest {
    
     @Test
     public void Test1() {
     int size = getFlights("Copenhagen", "Paris", "01;01;10;30").size();
     assertEquals(1, size);
     }
     @Test
     public void Test2() {
         List<FlightInformation> flightList = getFlights("Billund", "Berlin", "02;04;08;10");
         int size = flightList.size();
         assertEquals(2, size);
     }
     
     

    private static boolean bookFlight(int flightBookingNumber, java.lang.String cardHolder, java.lang.String cardNumber, int month, int year) throws Exception_Exception {
        airline.AirlineReservation_Service service = new airline.AirlineReservation_Service();
        airline.AirlineReservation port = service.getAirlineReservationPort();
        return port.bookFlight(flightBookingNumber, cardHolder, cardNumber, month, year);
    }

    private static boolean cancelFlight(int flightBookingNumber, int price, java.lang.String cardHolder, java.lang.String cardNumber, int month, int year) throws Exception_Exception {
        airline.AirlineReservation_Service service = new airline.AirlineReservation_Service();
        airline.AirlineReservation port = service.getAirlineReservationPort();
        return port.cancelFlight(flightBookingNumber, price, cardHolder, cardNumber, month, year);
    }

    private static java.util.List<airline.FlightInformation> getFlights(java.lang.String flightStart, java.lang.String flightDest, java.lang.String flightDate) {
        airline.AirlineReservation_Service service = new airline.AirlineReservation_Service();
        airline.AirlineReservation port = service.getAirlineReservationPort();
        return port.getFlights(flightStart, flightDest, flightDate);
    }
}
