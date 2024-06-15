package com.Bank;

import java.util.ArrayList;
import java.util.List;

import com.Account.Account;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    public void displayAllAccounts() {
        for (Account account : accounts) {
            account.displayAccountInfo();
            System.out.println();
        }
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}

