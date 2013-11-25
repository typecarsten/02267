/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matias
 */
public class TestAirlineReservation {
  
        Client client = Client.create();
        WebResource r = client.resource("http://localhost:8070/TravelGoodREST/webresources/AirlineReservation");
    
    @Before
    public void resetAirlineReservationName(){
        r.path("reset").put();
    }
        
    @Test
    public void textGetAirlineReservationName(){
        String result = r.get(String.class);
        assertEquals("Momondo", result);
    }
    
    @Test
    public void testPutAirlineReservationName(){
        String expected = "FlyingTheSkies";
        r.put(expected);
        assertEquals(expected,r.get(String.class));
    }
    
    public TestAirlineReservation() {
    }
    
       
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
