package com.thong.linkedmomo.service.Account;

import com.thong.linkedmomo.entity.Account;
import com.thong.linkedmomo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountImpl implements AccountDao{
    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account findByCifAndAccountNumber(String cif, String accountNumber) {
        Account account = accountRepository.findByCifAndAccountNumber(cif, accountNumber);
        return account;
    }
}
