/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import java.lang.reflect.Array;
import java.util.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
/**
 *
 * @author Administrator
 */
@WebService(serviceName = "HotelReservation")
public class HotelReservation {
    
        Hotel hotel1 = new Hotel("HenryHotel", "Wallstreet", "New York", true, 200, "FleggaardReservation");
        Hotel hotel2 = new Hotel("ConnieHotel", "fifth-avenue", "New York", false, 400, "JohnyReservation");
        Hotel hotel3 =
        Hotel[] gunner = {hotel1};
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getHotel")
    public String[] getHotel(@WebParam(name = "city") String city, @WebParam(name = "arrivalDate") String arrivalDate, @WebParam(name = "depDate") String depDate) {
        
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bookHotel")
    public boolean bookHotel(@WebParam(name = "hotelBookingNumber") int hotelBookingNumber, @WebParam(name = "cardHolder") String cardHolder, @WebParam(name = "cardNumber") int cardNumber, @WebParam(name = "cardExpireDate") String cardExpireDate) {
        //TODO write your implementation code here:
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cancelHotel")
    public boolean cancelHotel(@WebParam(name = "hotelBookingNumber") int hotelBookingNumber) {
        //TODO write your implementation code here:
        return false;
    }
    
}
