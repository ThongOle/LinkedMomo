package com.thong.linkedmomo.service.ewalletLinked;

import com.thong.linkedmomo.entity.EwalletLinked;
import org.springframework.stereotype.Service;

@Service
public interface EwalletLinkedService {
    EwalletLinked save(EwalletLinked objEL);
    EwalletLinked findByAccountNumber(String accountNumber);
}
