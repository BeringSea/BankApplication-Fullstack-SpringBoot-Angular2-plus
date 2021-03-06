package com.userfront.userfront.service;

import com.userfront.userfront.domain.PrimaryAccount;
import com.userfront.userfront.domain.SavingsAccount;

import java.security.Principal;


/**
 * @author David Mojicevic on 3/14/19.
 */
public interface AccountService {

    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
}
