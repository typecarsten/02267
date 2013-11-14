/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author Carsten
 */
public class Hotel {
    private String name = null;
    private String address = null;
    private String city = null;
    private Boolean creditCardGuarantee = null;
    private int price = 0;
    private String reservationService = null;
    private int bookingNo = 0;
    
    
    
    public Hotel(String name, String address, String city, Boolean creditCardGuarantee, int price, String reservationService, int bookingNo){
        this.name = name;
        this.address = address;
        this.city = city;
        this.creditCardGuarantee = creditCardGuarantee;
        this.price = price;
        this.reservationService = reservationService;
        this.bookingNo = bookingNo;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getCreditCardGuarantee(){
        return creditCardGuarantee.toString();
    }
    
    public String getPrice(){
        return Integer.toString(price);
    }
    
    public String getReservationService(){
        return reservationService;
    }
    
    public String getBookingNo(){
        return Integer.toString(bookingNo);
    }
}
