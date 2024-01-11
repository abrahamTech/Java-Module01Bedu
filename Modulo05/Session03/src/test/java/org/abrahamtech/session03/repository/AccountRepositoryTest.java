package org.abrahamtech.session03.repository;

import java.util.Optional;

import org.abrahamtech.session03.model.Account;
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
}
