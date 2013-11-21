/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import dk.dtu.imm.fastmoney.CreditCardFaultMessage;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "AirlineReservation")
public class AirlineReservation {  
    
    FlightInformation FI1 = new FlightInformation(1, 500, "Momondo", new Flight("Copenhagen", "Paris", "01;01;10;30" , "01;01;12;30", "SAS"));
    FlightInformation FI2 = new FlightInformation(2, 650, "Momondo", new Flight("Billund", "Berlin", "02;04;8;10" , "02;04;10;30", "Ryan Air"));
    FlightInformation FI3 = new FlightInformation(3, 700, "Momondo", new Flight("Aalborg", "New York", "05;01;14;00" , "05;01;23;30", "SAS"));
    FlightInformation FI4 = new FlightInformation(4, 400, "Momondo", new Flight("Roskilde", "New Delhi", "05;02;9;00" , "05;02;17;45", "Ryan Air"));
    FlightInformation FI5 = new FlightInformation(5, 450, "Momondo", new Flight("Copenhagen", "Paris", "01;13;12;00" , "01;13;15;00", "SAS"));
    
    ArrayList<FlightInformation> flightList = new ArrayList<FlightInformation>();   
    Bank bank = new Bank();
    int amount = 0;
    ArrayList<FlightInformation> bookedFlights = new ArrayList<FlightInformation>();
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getFlights")
    public List<FlightInformation> getFlights(@WebParam(name = "flightStart") String flightStart, @WebParam(name = "flightDest") String flightDest, @WebParam(name = "flightDate") String flightDate) {
        flightList.add(FI1);
        flightList.add(FI2);
        flightList.add(FI3);
        flightList.add(FI4);
        flightList.add(FI5);
        ArrayList<FlightInformation> bookingList = new ArrayList<FlightInformation>();
        for(FlightInformation flightInformation : flightList){
            if(flightInformation.getFlight().getFlightStart().equals(flightStart)){
                if(flightInformation.getFlight().getFlightDest().equals(flightDest)){
                    bookingList.add(flightInformation);
                }
            }
        }
        return bookingList;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bookFlight")
    public boolean bookFlight(@WebParam(name = "flightBookingNumber") int flightBookingNumber, @WebParam(name = "cardHolder") String cardHolder, @WebParam(name = "cardNumber") String cardNumber, @WebParam(name = "month") int month, @WebParam(name = "year") int year) throws Exception {
        for (FlightInformation flightInformation : flightList) {
            if (flightInformation.getBookingNo() == flightBookingNumber){
                amount = flightInformation.getPrice();
                bookedFlights.add(flightInformation);
                try {
            bank.chargeCreditCard(cardHolder, cardNumber, month, year, amount);
            return true;
        } catch (CreditCardFaultMessage ex) {
            Logger.getLogger(AirlineReservation.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
            }
        }
        throw new Exception("Wrong BookingNo");
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cancelFlight")
    public boolean cancelFlight(@WebParam(name = "flightBookingNumber") int flightBookingNumber, @WebParam(name = "price") int price , @WebParam(name = "cardHolder") String cardHolder, @WebParam(name = "cardNumber") String cardNumber, @WebParam(name = "month") int month, @WebParam(name = "year") int year) throws Exception {
        int refundPrice = price / 2;
        for (FlightInformation flightInformation : flightList){
            if (flightBookingNumber == flightInformation.getBookingNo()){
                bookedFlights.remove(flightInformation);
                try {
                    bank.refundMoney(cardHolder, cardNumber, month, year, amount);
                    return true;
                } catch (CreditCardFaultMessage ex) {
                    Logger.getLogger(AirlineReservation.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            }
        }
        throw new Exception("Wrong BookingNo");
    }
    
}
