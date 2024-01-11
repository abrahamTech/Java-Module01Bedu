package org.abrahamtech.session03;

import java.util.LinkedList;
import java.util.List;

import org.abrahamtech.session03.exception.InsufficientBalanceException;
import org.abrahamtech.session03.exception.UnexistingAccountException;
import org.abrahamtech.session03.model.Account;
import org.abrahamtech.session03.model.Card;
import org.abrahamtech.session03.repository.AccountRepository;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ATMTest {
    
    private ATM atm;

    @BeforeClass
    public void setup() {
        atm = new ATM();
    }

    @Test(description = "ATM should accept a card")
    public void insertCard() {
        //Arrange
        Card card = new Card("1234", 876786);

        //Act
        atm.insertCard(card);

        //Se agrego el "@Getter" en la clase ATM
        Card insertCard = atm.getCard();

        //Assert
        Assert.assertEquals(insertCard.getPin(), card.getPin());
        Assert.assertEquals(insertCard.getAccountId(), card.getAccountId());
    }

    @Test(description = "ATM should validate a correct PIN")
    public void correctPin() {
        //Arrange
        Card card = new Card("0000", 897982);
        atm.insertCard(card);
        
        //Act
        boolean isValid = atm.validatePin("0000");
        
        //Assert
        Assert.assertTrue(isValid);
    }
    
    @Test(description = "ATM should validate an incorrect PIN")
    public void incorrectPin() {
        //Arrange
        Card card = new Card("0000", 897982);
        atm.insertCard(card);

        //Act
        boolean isValid = atm.validatePin("12345");

        //Assert
        Assert.assertFalse(isValid);
    }

    @Test(description = "ATM should throw an error if the balance is insufficient")
    public void insufficientBalance() throws UnexistingAccountException {
        //Arrange
        Card card = new Card("0000", 676784);
        Account account = new Account(676784, 500);

        List<Account> data = new LinkedList<>();
        data.add(account);
        AccountRepository customRepository = new AccountRepository(data);

        atm = new ATM(customRepository);
        atm.insertCard(card);
        atm.loadAccount();

        //Act - Assert
        //Como va a generar error de que no se puede retirar los $600, por eso el valor esperado es una Excepcion
        Assert.assertThrows(InsufficientBalanceException.class, () -> atm.withdraw(600));
    }

    @Test(description = "ATM should withdraw money")
    public void sufficientBalance() throws UnexistingAccountException, InsufficientBalanceException {
        //Arrange
        Card card = new Card("0000", 676784);
        Account account = new Account(676784, 500);

        List<Account> data = new LinkedList<>();
        data.add(account);
        AccountRepository customRepository = new AccountRepository(data);

        atm = new ATM(customRepository);
        atm.insertCard(card);
        atm.loadAccount();

        //Act
        atm.withdraw(100);

        //Assert
        Assert.assertEquals(account.getAmount(), 400);
    }
}
