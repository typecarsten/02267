
package Hotel.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import Hotel.Hotel;

@XmlRootElement(name = "getHotelResponse", namespace = "http://Hotel/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHotelResponse", namespace = "http://Hotel/")
public class GetHotelResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<Hotel> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Hotel>
     */
    public ArrayList<Hotel> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<Hotel> _return) {
        this._return = _return;
    }

}
