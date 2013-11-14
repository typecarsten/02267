/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import java.util.ArrayList;
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
    
    FlightInformation FI1 = new FlightInformation("00001", "500", "Momondo", new Flight("Copenhagen", "Paris", "01;01;10;30" , "01;01;12;30", "SAS"));
    FlightInformation FI2 = new FlightInformation("00002", "650", "Momondo", new Flight("Billund", "Berlin", "02;04;8;10" , "02;04;10;30", "Ryan Air"));
    FlightInformation FI3 = new FlightInformation("00003", "700", "Momondo", new Flight("Aalborg", "New York", "05;01;14;00" , "05;01;23;30", "SAS"));
    FlightInformation FI4 = new FlightInformation("00004", "400", "Momondo", new Flight("Roskilde", "New Delhi", "05;02;9;00" , "05;02;17;45", "Ryan Air"));
    FlightInformation FI5 = new FlightInformation("00005", "450", "Momondo", new Flight("Copenhagen", "Paris", "01;13;12;00" , "01;13;15;00", "SAS"));
    
    FlightInformation[] flightList = {FI1, FI2, FI3, FI4, FI5};
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getFlights")
    public String[] getFlights(@WebParam(name = "flightStart") String flightStart, @WebParam(name = "flightDest") String flightDest, @WebParam(name = "flightDate") String flightDate) {
        String[] list = new String[5];
        for(int i = 0; i<flightList.length; i++){
            if(flightList[i].getFlight().getFlightStart().equals(flightStart)){
                if(flightList[i].getFlight().getFlightDest().equals(flightDest)){
                list[i] = flightList[i].getBookingNo() + " " + flightList[i].getPrice() + " " + flightList[i].getFlightService() + " " + flightList[i].getFlight().getFlightStart() + " " + flightList[i].getFlight().getFlightDest() + " " + flightList[i].getFlight().getDeparture() + " " + flightList[i].getFlight().getArrival();
        }
            }
        }
        return list;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bookFlight")
    public boolean bookFlight(@WebParam(name = "flightBookingNumber") int flightBookingNumber, @WebParam(name = "cardHolder") String cardHolder, @WebParam(name = "cardNumber") int cardNumber, @WebParam(name = "cardExpireDate") String cardExpireDate) {
        //If booking successful then return true if not successful return false
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cancelFlight")
    public boolean cancelFlight(@WebParam(name = "flightBookingNumber") int flightBookingNumber, @WebParam(name = "price") int price , @WebParam(name = "cardHolder") String cardHolder, @WebParam(name = "cardNumber") int cardNumber, @WebParam(name = "cardExpireDate") String cardExpireDate) {
        double refundPrice = price / 2;
        //If successful return true, if not successful return false
        return false;
    }
    
}
