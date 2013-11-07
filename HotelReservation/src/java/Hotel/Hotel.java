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
    
    
    
    public Hotel(String name, String address, String city, Boolean creditCardGuarantee, int price, String reservationService){
        this.name = name;
        this.address = address;
        this.city = city;
        this.creditCardGuarantee = creditCardGuarantee;
        this.price = price;
        this.reservationService = reservationService;
    }
}
