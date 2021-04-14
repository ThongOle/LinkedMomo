package com.thong.linkedmomo.service.transaction;

import com.thong.linkedmomo.entity.Transaction;
import com.thong.linkedmomo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionImpl implements TransactionService {
    @Autowired
    TransactionRepository transRes;
    @Override
    public boolean save(Transaction objTransaction) {
        transRes.save(objTransaction);
        return true;
    }
}
