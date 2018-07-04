package com.priceminister.account.implementation;

import com.priceminister.account.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerAccount implements Account {

    private double balance;

    public CustomerAccount() {
        balance = 0;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public void add(Double addedAmount) {
        // TODO Auto-generated method stub
        balance = balance + addedAmount;
        setBalance(balance);
    }

    public Double getBalance() {
        // TODO Auto-generated method stub
        return balance;
    }

    public Double withdrawAndReportBalance(Double withdrawnAmount, AccountRule rule)  {
        // TODO Auto-generated method stub
        if (withdrawnAmount > getBalance()) {
            try {
                throw new IllegalBalanceException(getBalance());
            } catch (IllegalBalanceException ex) {
                Logger.getLogger(CustomerAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        double newBal = getBalance() - withdrawnAmount;
        setBalance(newBal);

        return getBalance();
    }

}
