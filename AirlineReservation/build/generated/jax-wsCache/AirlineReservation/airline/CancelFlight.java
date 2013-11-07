
package airline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancelFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightBookingNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cardHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cardExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelFlight", propOrder = {
    "flightBookingNumber",
    "cardHolder",
    "cardNumber",
    "cardExpireDate"
})
public class CancelFlight {

    protected int flightBookingNumber;
    protected String cardHolder;
    protected int cardNumber;
    protected String cardExpireDate;

    /**
     * Gets the value of the flightBookingNumber property.
     * 
     */
    public int getFlightBookingNumber() {
        return flightBookingNumber;
    }

    /**
     * Sets the value of the flightBookingNumber property.
     * 
     */
    public void setFlightBookingNumber(int value) {
        this.flightBookingNumber = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     */
    public void setCardNumber(int value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpireDate() {
        return cardExpireDate;
    }

    /**
     * Sets the value of the cardExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpireDate(String value) {
        this.cardExpireDate = value;
    }

}
