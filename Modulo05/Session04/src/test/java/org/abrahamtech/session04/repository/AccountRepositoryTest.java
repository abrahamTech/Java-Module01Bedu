package org.abrahamtech.session04.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.abrahamtech.session04.model.Account;
import org.abrahamtech.session04.repository.AccountRepository;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountRepositoryTest {
    private AccountRepository repository;

    // JUnit: @BeforeAll
    // TestNG: @BeforeClass
    @BeforeClass
    public void setup() {
        repository = new AccountRepository();
    }

    @Test(description = "Repository should be empty")
    public void test() {
        long id = 786324786;

        Optional<Account> result = repository.findById(id);

        Assert.assertFalse(result.isPresent());
    }

    @Test(description = "Repository should return an empty result if the account doesnt exist")
    public void unexistingAccount() {
        List<Account> hardcoded = new LinkedList<>();
        hardcoded.add(new Account(1000, 20.50));
        repository = new AccountRepository(hardcoded);

        Optional<Account> result = repository.findById(1001);

        Assert.assertFalse(result.isPresent());
    }

    @Test(description = "Repository should return an account result if the account exists")
    public void existingAccount() {
        List<Account> hardcoded = new LinkedList<>();
        hardcoded.add(new Account(1000, 20.50));
        repository = new AccountRepository(hardcoded);
        Optional<Account> result = repository.findById(1000);
        Assert.assertTrue(result.isPresent());
        Account account = result.get();
        Assert.assertEquals(account.getId(), 1000);
        Assert.assertEquals(account.getAmount(), 20.50);
    }
}
