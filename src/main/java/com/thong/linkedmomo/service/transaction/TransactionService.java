package com.thong.linkedmomo.service.transaction;

import com.thong.linkedmomo.entity.Transaction;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {
    public boolean save(Transaction objTransaction);
}
