/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sr;

import hotel.Exception_Exception;
import javax.jws.WebService;

/**
 *
 * @author Matias
 */
@WebService(serviceName = "HotelReservation", portName = "HotelReservationPort", endpointInterface = "hotel.HotelReservation", targetNamespace = "http://Hotel/", wsdlLocation = "WEB-INF/wsdl/Hotel/localhost_8080/HotelReservation/HotelReservation.wsdl")
public class Hotel {

    public java.util.List<hotel.Hotel> getHotel(java.lang.String city, java.lang.String arrivalDate, java.lang.String depDate) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean bookHotel(int hotelBookingNumber) throws Exception_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean cancelHotel(int hotelBookingNumber) throws Exception_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean bookHotelCreditCard(int hotelBookingNumber, java.lang.String cardHolder, java.lang.String cardNumber, int cardExpireMonth, int cardExpireYear) throws Exception_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
