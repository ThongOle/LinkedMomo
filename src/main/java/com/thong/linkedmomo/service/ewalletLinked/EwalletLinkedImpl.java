package com.thong.linkedmomo.service.ewalletLinked;

import com.thong.linkedmomo.entity.EwalletLinked;
import com.thong.linkedmomo.repository.EwalletLinkedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EwalletLinkedImpl implements  EwalletLinkedService{
    @Autowired
    EwalletLinkedRepository ELRes;
    @Override
    public EwalletLinked save(EwalletLinked objEL) {
        EwalletLinked objELd =  ELRes.save(objEL);
        return objELd;
    }

    @Override
    public EwalletLinked findByAccountNumber(String accountNumber) {
        EwalletLinked objELd = ELRes.findByAccountNumber(accountNumber);
        return objELd;
    }
}
