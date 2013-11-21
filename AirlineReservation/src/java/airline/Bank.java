/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import dk.dtu.imm.fastmoney.CreditCardFaultMessage;
import dk.dtu.imm.fastmoney.*;
import dk.dtu.imm.fastmoney.types.AccountType;
import dk.dtu.imm.fastmoney.types.CreditCardInfoType;
import dk.dtu.imm.fastmoney.types.ExpirationDateType;

/**
 *
 * @author Carsten
 */
public class Bank {
    
    int group = 1;
    CreditCardInfoType cardInfo = null;
    AccountType accountType = null;
    
    public boolean chargeCreditCard(String cardHolder, String cardNumber, int month, int year, int amount) throws CreditCardFaultMessage{
               CreditCardInfoType creditCardInfo = new CreditCardInfoType();
               ExpirationDateType expireDate = new ExpirationDateType();
               expireDate.setMonth(month);
               expireDate.setYear(year);
               creditCardInfo.setExpirationDate(expireDate);
               creditCardInfo.setName(cardHolder);
               creditCardInfo.setNumber(cardNumber);
               return chargeCreditCard(group, cardInfo, amount, accountType);
               
    }
    
    public boolean refundMoney(String cardHolder, String cardNumber, int month, int year, int amount) throws CreditCardFaultMessage{
        CreditCardInfoType creditCardInfo = new CreditCardInfoType();
               ExpirationDateType expireDate = new ExpirationDateType();
               expireDate.setMonth(month);
               expireDate.setYear(year);
               creditCardInfo.setExpirationDate(expireDate);
               creditCardInfo.setName(cardHolder);
               creditCardInfo.setNumber(cardNumber);
               return refundCreditCard(group, creditCardInfo, amount, accountType);
    }

    private static boolean chargeCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount, dk.dtu.imm.fastmoney.types.AccountType account) throws CreditCardFaultMessage {
        dk.dtu.imm.fastmoney.BankService service = new dk.dtu.imm.fastmoney.BankService();
        dk.dtu.imm.fastmoney.BankPortType port = service.getBankPort();
        return port.chargeCreditCard(group, creditCardInfo, amount, account);
    }

    private static boolean refundCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount, dk.dtu.imm.fastmoney.types.AccountType account) throws CreditCardFaultMessage {
        dk.dtu.imm.fastmoney.BankService service = new dk.dtu.imm.fastmoney.BankService();
        dk.dtu.imm.fastmoney.BankPortType port = service.getBankPort();
        return port.refundCreditCard(group, creditCardInfo, amount, account);
    }
    
    
    
}
