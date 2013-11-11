/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import java.util.Date;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "AirlineReservation")
public class AirlineReservation {
    
    FlightInformation FI2 = new FlightInformation(00001, 500, "Momondo", new Flight("Copenhagen", "Paris", new Date(113, 1, 1, 10, 30) , new Date(113,1,1,12,30), "SAS"));
    FlightInformation FI3 = new FlightInformation(00002, 650, "Momondo", new Flight("Billund", "Berlin", new Date(113, 2, 4, 8, 10) , new Date(113,2,4,10,30), "Ryan Air"));
    FlightInformation FI4 = new FlightInformation(00003, 700, "Momondo", new Flight("Aalborg", "New York", new Date(113, 5, 1, 14, 00) , new Date(113,5,1,23,30), "SAS"));
    FlightInformation FI5 = new FlightInformation(00004, 400, "Momondo", new Flight("Roskilde", "New Delhi", new Date(113, 5, 2, 9, 00) , new Date(113,5,2,17,45), "Ryan Air"));
    FlightInformation FI6 = new FlightInformation(00005, 450, "Momondo", new Flight("Copenhagen", "Paris", new Date(113, 1, 13, 12, 00) , new Date(113,1,13,15,00), "SAS"));
    
    FligtInformation[] flightlist = new FlightInformation[5];
    
    flightlist[0] = FI2;
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getFlights")
    public String[] getFlights(@WebParam(name = "flightStart") String flightStart, @WebParam(name = "flightDest") String flightDest, @WebParam(name = "flightDate") String flightDate) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bookFlight")
    public boolean bookFlight(@WebParam(name = "flightBookingNumber") int flightBookingNumber, @WebParam(name = "cardHolder") String cardHolder, @WebParam(name = "cardNumber") int cardNumber, @WebParam(name = "cardExpireDate") String cardExpireDate) {
        //TODO write your implementation code here:
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cancelFlight")
    public boolean cancelFlight(@WebParam(name = "flightBookingNumber") int flightBookingNumber, @WebParam(name = "cardHolder") String cardHolder, @WebParam(name = "cardNumber") int cardNumber, @WebParam(name = "cardExpireDate") String cardExpireDate) {
        //TODO write your implementation code here:
        return false;
    }
    
}
