package org.abrahamtech.session04.stepdefinitions;

import java.util.LinkedList;
import java.util.List;

import org.abrahamtech.session04.model.Account;
import org.abrahamtech.session04.repository.AccountRepository;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithdrawalStepDefinition {
    
    private AccountRepository repository;
    private int amount;

    @And("a bank account with id {long} and balance {double}")
    public void bank_account(long accountId, double balance) {
        List<Account> data = new LinkedList<>();
        data.add(new Account(accountId, balance));

        repository = new AccountRepository(data);
    }

    @And("the user enters the amount {int}")
    public void enters_amount(int amount) {
        this.amount = amount;
    }

    @Then("the ATM should deliver the money")
    public void deliver_money() {

    }
}
