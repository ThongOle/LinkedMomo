package com.thong.linkedmomo.service.customer;

import com.thong.linkedmomo.entity.Customer;
import com.thong.linkedmomo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements CustomerService {
    @Autowired
    CustomerRepository cusRes;
    @Override
    public Customer findByPhone(String phone) {
        Customer customer = cusRes.findByPhone(phone);
        return customer;
    }

    @Override
    public Customer findByIdCard(String idCard) {
        Customer objCustomer = cusRes.findByIdCard(idCard);
        return objCustomer;
    }
}
