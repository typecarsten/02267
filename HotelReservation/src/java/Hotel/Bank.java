/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import dk.dtu.imm.fastmoney.CreditCardFaultMessage;
import dk.dtu.imm.fastmoney.types.ExpirationDateType;
import dk.dtu.imm.fastmoney.types.AccountType;
import dk.dtu.imm.fastmoney.types.CreditCardInfoType;



/**
 *
 * @author Carsten
 */
public class Bank {
    private CreditCardInfoType cardInfo = null;
    private AccountType accountType = null;
    
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
    
    public boolean getCreditCardValidation(String cardHolder, String cardNumber, int cardExpireMonth, int cardExpireYear, int price) throws CreditCardFaultMessage{
        CreditCardInfoType creditCardInfo = new CreditCardInfoType();
               ExpirationDateType expireDate = new ExpirationDateType();
               expireDate.setMonth(cardExpireMonth);
               expireDate.setYear(cardExpireYear);
               creditCardInfo.setExpirationDate(expireDate);
               creditCardInfo.setName(cardHolder);
               creditCardInfo.setNumber(cardNumber);
        if (validateCreditCard(1, cardInfo, price)){
            return true;
        }else {
            return false;
        }
        
    } 

    private static boolean validateCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount) throws dk.dtu.imm.fastmoney.CreditCardFaultMessage {
        dk.dtu.imm.fastmoney.BankService service = new dk.dtu.imm.fastmoney.BankService();
        dk.dtu.imm.fastmoney.BankPortType port = service.getBankPort();
        return port.validateCreditCard(group, creditCardInfo, amount);
    }
    
}
