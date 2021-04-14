package com.thong.linkedmomo.service.Account;

import com.thong.linkedmomo.entity.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountDao {
    public Account findByCifAndAccountNumber(String cif, String accountNumber);
}
