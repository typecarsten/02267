
package Hotel.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getHotel", namespace = "http://Hotel/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHotel", namespace = "http://Hotel/", propOrder = {
    "city",
    "arrivalDate",
    "depDate"
})
public class GetHotel {

    @XmlElement(name = "city", namespace = "")
    private String city;
    @XmlElement(name = "arrivalDate", namespace = "")
    private String arrivalDate;
    @XmlElement(name = "depDate", namespace = "")
    private String depDate;

    /**
     * 
     * @return
     *     returns String
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 
     * @param city
     *     the value for the city property
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getArrivalDate() {
        return this.arrivalDate;
    }

    /**
     * 
     * @param arrivalDate
     *     the value for the arrivalDate property
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getDepDate() {
        return this.depDate;
    }

    /**
     * 
     * @param depDate
     *     the value for the depDate property
     */
    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

}
