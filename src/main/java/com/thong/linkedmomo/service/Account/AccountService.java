package com.thong.linkedmomo.service.Account;

import com.thong.linkedmomo.entity.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    public Account findByCifAndAccountNumber(String cif, String accountNumber);
    public Account findByAccountNumber(String accountNumber);
    public Account save(Account objAccount);
}
