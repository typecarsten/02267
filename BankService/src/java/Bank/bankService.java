/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "BankService")
public class bankService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validateCreditCard")
    public boolean validateCreditCard(@WebParam(name = "cardHolder") String cardHolder, @WebParam(name = "cardNumber") int cardNumber, @WebParam(name = "cardExpireDate") String expireDate, @WebParam(name = "amount") int amount) {
        //TODO write your implementation code here:
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "changeCreditCard")
    public boolean changeCreditCard(@WebParam(name = "cardHolder") String cardHolder, @WebParam(name = "cardNumber") int cardNumber, @WebParam(name = "cardExpireDate") String expireDate, @WebParam(name = "account") int account) {
        //TODO write your implementation code here:
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "refundCreditCard")
    public boolean refundCreditCard(@WebParam(name = "cardHolder") String cardHolder, @WebParam(name = "cardNumber") int cardNumber, @WebParam(name = "cardExpireDate") String expireDate, @WebParam(name = "account") int account, @WebParam(name = "amount") int amount) {
        //TODO write your implementation code here:
        return true;
    }
    
}
