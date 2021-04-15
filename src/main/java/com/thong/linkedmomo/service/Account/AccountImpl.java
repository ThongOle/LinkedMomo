package com.thong.linkedmomo.service.Account;

import com.thong.linkedmomo.entity.Account;
import com.thong.linkedmomo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountImpl implements AccountService{
    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account findByCifAndAccountNumber(String cif, String accountNumber) {
        Account account = accountRepository.findByCifAndAccountNumber(cif, accountNumber);
        return account;
    }

    @Override
    public Account findByAccountNumber(String accountNumber) {
        Account objAccount = accountRepository.findByAccountNumber(accountNumber);
        return objAccount;
    }

    @Override
    public Account save(Account objAccount) {
        Account objAcc = accountRepository.save(objAccount);
        return objAcc;
    }
}
