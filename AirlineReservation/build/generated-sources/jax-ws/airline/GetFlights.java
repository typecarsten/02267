
package airline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFlights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFlights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlights", propOrder = {
    "flightStart",
    "flightDist",
    "flightDate"
})
public class GetFlights {

    protected String flightStart;
    protected String flightDist;
    protected String flightDate;

    /**
     * Gets the value of the flightStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightStart() {
        return flightStart;
    }

    /**
     * Sets the value of the flightStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightStart(String value) {
        this.flightStart = value;
    }

    /**
     * Gets the value of the flightDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDist() {
        return flightDist;
    }

    /**
     * Sets the value of the flightDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDist(String value) {
        this.flightDist = value;
    }

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDate(String value) {
        this.flightDate = value;
    }

}
