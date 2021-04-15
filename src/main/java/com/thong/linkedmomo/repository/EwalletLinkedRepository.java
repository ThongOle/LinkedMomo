package com.thong.linkedmomo.repository;

import com.thong.linkedmomo.entity.EwalletLinked;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EwalletLinkedRepository extends JpaRepository<EwalletLinked, Integer> {
    EwalletLinked findByAccountNumber(String accountNumber);
}
