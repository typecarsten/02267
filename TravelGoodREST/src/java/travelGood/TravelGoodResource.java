package travelGood;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;


@Path("AirlineReservation")
public class TravelGoodResource {
    
    static String name = "Momondo";
    
    @GET
    public String getFlightInformation(){
        
        return null;
    }
    
    @GET
    public String getAirlineReservation(){
        return name;
    }
    
    @PUT
    public void setAirlineReservation(String name){
    this.name = name;
}
    
    @Path("reset")
    @PUT
    public void resetAirlineReservationName(){
        name = "Momondo";
    }
}
