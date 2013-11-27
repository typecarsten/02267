
package Hotel.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "bookHotelCreditCard", namespace = "http://Hotel/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookHotelCreditCard", namespace = "http://Hotel/", propOrder = {
    "hotelBookingNumber",
    "cardHolder",
    "cardNumber",
    "cardExpireMonth",
    "cardExpireYear"
})
public class BookHotelCreditCard {

    @XmlElement(name = "hotelBookingNumber", namespace = "")
    private int hotelBookingNumber;
    @XmlElement(name = "cardHolder", namespace = "")
    private String cardHolder;
    @XmlElement(name = "cardNumber", namespace = "")
    private String cardNumber;
    @XmlElement(name = "cardExpireMonth", namespace = "")
    private int cardExpireMonth;
    @XmlElement(name = "cardExpireYear", namespace = "")
    private int cardExpireYear;

    /**
     * 
     * @return
     *     returns int
     */
    public int getHotelBookingNumber() {
        return this.hotelBookingNumber;
    }

    /**
     * 
     * @param hotelBookingNumber
     *     the value for the hotelBookingNumber property
     */
    public void setHotelBookingNumber(int hotelBookingNumber) {
        this.hotelBookingNumber = hotelBookingNumber;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCardHolder() {
        return this.cardHolder;
    }

    /**
     * 
     * @param cardHolder
     *     the value for the cardHolder property
     */
    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCardNumber() {
        return this.cardNumber;
    }

    /**
     * 
     * @param cardNumber
     *     the value for the cardNumber property
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getCardExpireMonth() {
        return this.cardExpireMonth;
    }

    /**
     * 
     * @param cardExpireMonth
     *     the value for the cardExpireMonth property
     */
    public void setCardExpireMonth(int cardExpireMonth) {
        this.cardExpireMonth = cardExpireMonth;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getCardExpireYear() {
        return this.cardExpireYear;
    }

    /**
     * 
     * @param cardExpireYear
     *     the value for the cardExpireYear property
     */
    public void setCardExpireYear(int cardExpireYear) {
        this.cardExpireYear = cardExpireYear;
    }

}
