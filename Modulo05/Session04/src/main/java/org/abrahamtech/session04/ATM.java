package org.abrahamtech.session04;

import java.util.Optional;

import org.abrahamtech.session04.exception.InsufficientBalanceException;
import org.abrahamtech.session04.exception.UnexistingAccountException;
import org.abrahamtech.session04.model.Account;
import org.abrahamtech.session04.model.Card;
import org.abrahamtech.session04.repository.AccountRepository;

import lombok.Getter;

public class ATM {

    //Atributo 1: Tarjeta
    @Getter
    private Card card;

    private Account account;
    private AccountRepository repository;

    public ATM() {
        repository = new AccountRepository();
    }

    //Recibe como parametro el repositorio para el
    public ATM(AccountRepository repository) {
        this.repository = repository;
    }

    //Se inserta tarjeta al cajero
    public void insertCard(Card card) {
        this.card = card;
    }

    //Se valida si el PIN es correcto
    public boolean validatePin(String pin) {
        return card.getPin().equals(pin);
    }

    //Se carga la información de la cuenta
    public void loadAccount() throws UnexistingAccountException {
        long id = card.getAccountId();

        Optional<Account> result = repository.findById(id);

        //Lanzar la Excepcion por si no existe la cuenta
        if(!result.isPresent()) {
            throw new UnexistingAccountException();
        }

        account = result.get();
    }

    //Permitir retirar dinero de la cuenta
    public void withdraw(long amount) throws InsufficientBalanceException {
        if(amount > account.getAmount()) {
            throw new InsufficientBalanceException();
        }

        //Se tuvo que quitar el "finale" del modelo Account
        account.setAmount(account.getAmount() - amount );
    }

    //Salir de la cuenta
    public void exit() {
        card = null;
        account = null;
    }

}
