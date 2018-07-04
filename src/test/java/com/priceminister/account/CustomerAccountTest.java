package com.priceminister.account;


import org.junit.*;

import com.priceminister.account.implementation.*;

/**
 * Please create the business code, starting from the unit tests below.
 * Implement the first test, the develop the code that makes it pass. Then focus
 * on the second test, and so on.
 *
 * We want to see how you "think code", and how you organize and structure a
 * simple application.
 *
 * When you are done, please zip the whole project (incl. source-code) and send
 * it to recrutement-dev@priceminister.com
 *
 */
public class CustomerAccountTest {

    Account customerAccount;
    AccountRule rule;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        customerAccount = new CustomerAccount();
    }

    /**
     * Tests that an empty account always has a balance of 0.0, not a NULL.
     */
    @Test
    public void testAccountWithoutMoneyHasZeroBalance() {
        //fail("not yet implemented");
        Double bal = customerAccount.getBalance();
        Assert.assertEquals(0.0, bal, Math.abs(0 - bal));
        Assert.assertNotNull(bal);
    }

    /**
     * Adds money to the account and checks that the new balance is as expected.
     */
    @Test
    public void testAddPositiveAmount() {
        //fail("not yet implemented");
        Double current = customerAccount.getBalance();
        Double amountAdd = 100.0;
        Assert.assertEquals((current + amountAdd), current, (current + amountAdd));
    }

    /**
     * Tests that an illegal withdrawal throws the expected exception. Use the
     * logic contained in CustomerAccountRule; feel free to refactor the
     * existing code.
     * @throws com.priceminister.account.IllegalBalanceException
     */
    @Test
    public void testWithdrawAndReportBalanceIllegalBalance() throws IllegalBalanceException {
        //fail("not yet implemented");
        customerAccount.add(100.0);
        customerAccount.withdrawAndReportBalance(120.0, rule);
    }

    // Also implement missing unit tests for the above functionalities.
}
