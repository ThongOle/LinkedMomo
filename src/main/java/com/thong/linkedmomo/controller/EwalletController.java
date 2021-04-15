package com.thong.linkedmomo.controller;

import com.thong.linkedmomo.entity.Account;
import com.thong.linkedmomo.entity.Customer;
import com.thong.linkedmomo.entity.Transaction;
import com.thong.linkedmomo.service.Account.AccountService;
import com.thong.linkedmomo.service.customer.CustomerService;
import com.thong.linkedmomo.service.transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
public class EwalletController {
    @Autowired
    CustomerService customerSer;
    @Autowired
    AccountService accountSer;
    @Autowired
    TransactionService transactionSer;
    //Verify account Customer
    @PostMapping("/verify")
    public ResponseEntity<?> verify(@RequestBody Map<String, String> jsonVerify){
        String ewalletNumber =  jsonVerify.get("ewalletNumber");
        String idCard = jsonVerify.get("idCard");
        String fullName = jsonVerify.get("fullName");
        String accountNumber = jsonVerify.get("accountNumber");
        Customer objCustomer = customerSer.findByIdCard(idCard);
        Date date = new Date();
        Transaction objTrans = new Transaction();
        objTrans.setTransDate(date);
        objTrans.setTransType("verifyCustomer");
        // check customer exist
        if(objCustomer != null && objCustomer.getFullName().equals(fullName)){
            Account objAccount = accountSer.findByCifAndAccountNumber(objCustomer.getCif(), accountNumber);
            // check account exist and active
            if(objAccount != null && objAccount.getStatus() == 0){
                objTrans.setTransStatus(0);
                objTrans.setDescription("Success");
                transactionSer.save(objTrans);
                String urlLogin= "https://vietcombank.com.vn/login";
                return new ResponseEntity<String>(urlLogin, HttpStatus.OK);
            }
            objTrans.setTransStatus(1);
            objTrans.setDescription("AccountNumber doesn't exist or active");
            transactionSer.save(objTrans);
            return new ResponseEntity<String>("AccountNumber doesn't exist or active", HttpStatus.OK);
        }
        objTrans.setTransStatus(2);
        objTrans.setDescription("Customer doesn't exist");
        transactionSer.save(objTrans);
        return new ResponseEntity<String>("Customer doesn't exist", HttpStatus.EXPECTATION_FAILED);
    }
}
