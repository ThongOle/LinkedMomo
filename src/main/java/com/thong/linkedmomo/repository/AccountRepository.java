package com.thong.linkedmomo.repository;

import com.thong.linkedmomo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    public Account findByCifAndAccountNumber(String cif, String accountNumber);
}
