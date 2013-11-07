/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "AirlineReservation")
public class AirlineReservation {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getFlights")
    public String[] getFlights(@WebParam(name = "flightStart") String flightStart, @WebParam(name = "flightDist") String flightDist, @WebParam(name = "flightDate") String flightDate) {
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
