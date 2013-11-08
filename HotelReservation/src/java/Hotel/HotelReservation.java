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
    
        Hotel DreamDownTown = new Hotel("Dream Downtown", "Wallstreet 25", "New York", true, 200, "FleggaardReservation", 1);
        Hotel CasaHotel = new Hotel("Cassa Hotel", "fifth-avenue 10", "New York", false, 400, "JohnyReservation", 2);
        Hotel ValbyHotel = new Hotel("ValbyHotel", "Valbylanggade 5", "Copenhagen", true, 100, "Hotels.com", 3);
        Hotel WakeUpCopenhagen = new Hotel("Wakeup Copenhagen", "Carsten Nieburhs Gade 11", "Copenhagen", true, 500, "Hotels.com", 4);
        Hotel BlueSea = new Hotel("Blue Sea", "Dragonara Road St. Julian's", "Malta", true, 300, "Momondo.dk" ,5);
        Hotel MarinaHotel = new Hotel("Marina Hotel", "St. Georges Bay St. Julian's", "malta", false, 1000, "NyhavnTravel" ,6);
        Hotel AmediaHotel = new Hotel("Amedia Hotel", "Kurfüerstendamm 203", "Berlin", true, 500, "Momondo.dk", 7);
        Hotel[] hotelList = {WakeUpCopenhagen, DreamDownTown, CasaHotel, ValbyHotel, BlueSea, MarinaHotel, AmediaHotel};
        String[] endDateArray;
        String[] startDateArray;
        
        
    private int getDaysInMonth(String startDate){
        startDateArray = startDate.split(startDate);
        int month = Integer.parseInt(startDateArray[1]);
        int days = 0;
        switch (month) {
            case 2 : return 28;
            case 4 : return 30;
            case 6 : return 30;
            case 9 : return 30;
            case 11 : return 30;
            default : return 31;
        }
    }
    
    private int getLengthOfStay(String endDate){
        endDateArray = endDate.split(":");
        if(endDateArray[1] != startDateArray[1]){
            int daysLeftInMonth = Integer.parseInt(startDateArray[1]) - getDaysInMonth(startDateArray[1]);
            int daysInNextMonth = Integer.parseInt(endDateArray[0]);
            return daysInNextMonth + daysLeftInMonth;
        }
        else{
            return Integer.parseInt(endDateArray[0]) - Integer.parseInt(startDateArray[0]);
        }
    }
        
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getHotel")
    public String[] getHotel(@WebParam(name = "city") String city, @WebParam(name = "arrivalDate") String arrivalDate, @WebParam(name = "depDate") String depDate) {
        String[] list = new String[10];
        int price = 0;
        for(int i = 0; i<hotelList.length; i++){
            if (hotelList[i].getCity() == city){
                price = Integer.parseInt(hotelList[i].getPrice()) * getLengthOfStay(arrivalDate);
                list[0] = "" + hotelList[i].getName() + hotelList[i].getAddress() + hotelList[i].getBookingNo() + price + hotelList[i].getCreditCardGuarantee() + hotelList[i].getReservationService();
            }
        }
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
