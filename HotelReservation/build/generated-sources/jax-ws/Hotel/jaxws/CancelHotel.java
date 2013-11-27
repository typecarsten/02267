
package Hotel.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "cancelHotel", namespace = "http://Hotel/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelHotel", namespace = "http://Hotel/")
public class CancelHotel {

    @XmlElement(name = "hotelBookingNumber", namespace = "")
    private int hotelBookingNumber;

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

}
