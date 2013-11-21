/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import dk.dtu.imm.fastmoney.BankService;
import dk.dtu.imm.fastmoney.CreditCardFaultMessage;
import java.util.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceRef;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Administrator
 */
@WebService(serviceName = "HotelReservation")
public class HotelReservation {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/fastmoney.imm.dtu.dk_8080/BankService.wsdl")
    private BankService service;
    
        Hotel DreamDownTown = new Hotel("Dream Downtown", "Wallstreet 25", "New York", true, 200, "FleggaardReservation", 0);
        Hotel CasaHotel = new Hotel("Cassa Hotel", "fifth-avenue 10", "New York", false, 400, "JohnyReservation", 0);
        Hotel ValbyHotel = new Hotel("ValbyHotel", "Valbylanggade 5", "Copenhagen", true, 100, "Hotels.com", 0);
        Hotel WakeUpCopenhagen = new Hotel("Wakeup Copenhagen", "Carsten Nieburhs Gade 11", "Copenhagen", true, 500, "Hotels.com", 0);
        Hotel BlueSea = new Hotel("Blue Sea", "Dragonara Road St. Julian's", "Malta", true, 300, "Momondo.dk" ,0);
        Hotel MarinaHotel = new Hotel("Marina Hotel", "St. Georges Bay St. Julian's", "malta", false, 1000, "NyhavnTravel" ,0);
        Hotel AmediaHotel = new Hotel("Amedia Hotel", "Kurfüerstendamm 203", "Berlin", true, 500, "Momondo.dk",0);
        ArrayList<Hotel> hotelList = new ArrayList<Hotel>();  
        ArrayList<Hotel> bookingList = new ArrayList<Hotel>(); //tempbooking list
        
        String[] arrivalDateArray;
        String[] depDateArray;
        ArrayList<Hotel> bookedHotels;
        BankDataPreparer bank = new BankDataPreparer();
        
        
    private int getDaysInMonth(String startDate){
        arrivalDateArray = startDate.split(startDate);
        int month = Integer.parseInt(arrivalDateArray[1]);
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
    
    private int getLengthOfStay(String arrivalDate, String depDate ){
        arrivalDateArray = arrivalDate.split(":");
        depDateArray = depDate.split(":");
        if(arrivalDateArray[1].equals(depDateArray[1])){
            return Integer.parseInt(depDateArray[0]) - Integer.parseInt(arrivalDateArray[0]);
        }
        else{
            int daysLeftInMonth = Integer.parseInt(arrivalDateArray[1]) - getDaysInMonth(depDateArray[1]);
            int daysInNextMonth = Integer.parseInt(depDateArray[0]);
            return daysInNextMonth + daysLeftInMonth;
        }
    }
        
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getHotel")
    public ArrayList<Hotel> getHotel(@WebParam(name = "city") String city, @WebParam(name = "arrivalDate") String arrivalDate, @WebParam(name = "depDate") String depDate) {
        hotelList.add(DreamDownTown);
        hotelList.add(CasaHotel);
        hotelList.add(ValbyHotel);
        hotelList.add(WakeUpCopenhagen);
        hotelList.add(BlueSea);
        hotelList.add(MarinaHotel);
        hotelList.add(AmediaHotel);
        int j = 0;
        for (Hotel hotel : hotelList){
            if(city == hotel.getCity()){
            Hotel temp = hotel;
            temp.setPrice(hotel.getPrice() * getLengthOfStay(arrivalDate, depDate));
            temp.setBookingNo(j);
            j++;
            bookingList.add(temp);
            }
            
        }
        return bookingList;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bookHotelCreditCard")
    public boolean bookHotelCreditCard(@WebParam(name = "hotelBookingNumber") int hotelBookingNumber, @WebParam(name = "cardHolder") String cardHolder, @WebParam(name = "cardNumber") String cardNumber, @WebParam(name = "cardExpireMonth") int cardExpireMonth, @WebParam(name = "cardExpireYear") int cardExpireYear) throws Exception {
       for (Hotel hotel : bookingList){
           if (hotelBookingNumber == hotel.getBookingNo()){
               try {
                   if (validateCreditCard(1,bank.getCreditCardInfo(cardHolder,cardNumber,cardExpireMonth,cardExpireYear),hotel.getPrice())){           
                       bookedHotels.add(hotel);
                       return true;
                   }
               } catch (CreditCardFaultMessage ex) {
                   Logger.getLogger(HotelReservation.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       }
       throw new Exception("Invallid booking number");
    }
    
        /**
     * Web service operation
     */
    @WebMethod(operationName = "bookHotel")
    public boolean bookHotel(@WebParam(name = "hotelBookingNumber") int hotelBookingNumber) throws Exception {
        for (Hotel hotel : hotelList){
            if(hotelBookingNumber == hotel.getBookingNo()){
               bookedHotels.add(hotel);
            }else{
                throw new Exception("Invallid booking number");
            }
        }
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cancelHotel")
    public boolean cancelHotel(@WebParam(name = "hotelBookingNumber") int hotelBookingNumber) throws Exception {
        for (Hotel hotel : bookedHotels){
            if(hotelBookingNumber == hotel.getBookingNo()){
                bookedHotels.remove(hotel);
                return true;
            }
        }
        throw new Exception("Invallid booking number");
    }

    private boolean validateCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount) throws CreditCardFaultMessage {
        dk.dtu.imm.fastmoney.BankPortType port = service.getBankPort();
        return port.validateCreditCard(group, creditCardInfo, amount);
    }


    
}
