/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import dk.dtu.imm.fastmoney.types.CreditCardInfoType;
import dk.dtu.imm.fastmoney.types.ExpirationDateType;

/**
 *
 * @author Carsten
 */
public class BankDataPreparer {
    
    public CreditCardInfoType getCreditCardInfo(String cardHolder, String cardNumber, int month, int year){
               CreditCardInfoType creditCardInfo = new CreditCardInfoType();
               ExpirationDateType expireDate = new ExpirationDateType();
               expireDate.setMonth(month);
               expireDate.setYear(year);
               creditCardInfo.setExpirationDate(expireDate);
               creditCardInfo.setName(cardHolder);
               creditCardInfo.setNumber(cardNumber);
               return creditCardInfo;
    }
    
}
