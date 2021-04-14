package com.thong.linkedmomo.repository;

import com.thong.linkedmomo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    public Customer findByPhone(String phone);
    public Customer findByIdCard(String idCard);
}
