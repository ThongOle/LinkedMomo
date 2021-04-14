package com.thong.linkedmomo.service.customer;

import com.thong.linkedmomo.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer findByPhone (String phone);
    Customer findByIdCard (String idCard);
}
