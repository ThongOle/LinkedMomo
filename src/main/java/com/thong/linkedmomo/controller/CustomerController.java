package com.thong.linkedmomo.controller;

import com.thong.linkedmomo.entity.Account;
import com.thong.linkedmomo.entity.Customer;
import com.thong.linkedmomo.entity.Transaction;
import com.thong.linkedmomo.service.Account.AccountDao;
import com.thong.linkedmomo.service.customer.CustomerService;
import com.thong.linkedmomo.service.transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
public class CustomerController {
    Date date = new Date();
    @Autowired
    private CustomerService cusDao;
    @Autowired
    private TransactionService transDao;
    @Autowired
    private AccountDao accountDao;
    @PostMapping("/check")
    public ResponseEntity<?> checkCustomer(HttpSession session, @RequestParam("phone") String phone,
                                           @RequestParam("account") String account, @RequestParam("idCard") String idCard, @RequestParam("fullName") String fullName) {
        Transaction objTrans = new Transaction();
        objTrans.setTransType("check");
        objTrans.setTransDate(date);
        Customer objCustomer = cusDao.findByIdCard(idCard);
        if (objCustomer != null){
            Account objAcount = accountDao.findByCifAndAccountNumber(objCustomer.getCif(),account );
            if(objAcount != null){
                if(objCustomer.getPhone().equals(phone) && objCustomer.getFullName().equals(fullName)){
                    objTrans.setTransStatus(0);
                    objTrans.setDescription("Thành công");
                    transDao.save(objTrans);
                    return new ResponseEntity<Transaction>(objTrans, HttpStatus.OK);
                }
                objTrans.setTransStatus(1);
                objTrans.setDescription("Họ Tên hoặc số điện thoại không chính xác");
                transDao.save(objTrans);
                return new ResponseEntity<Transaction>(objTrans, HttpStatus.EXPECTATION_FAILED);
            }
            objTrans.setTransStatus(2);
            objTrans.setDescription("Tài khoản không tồn tại");
            transDao.save(objTrans);
            return new ResponseEntity<Transaction>(objTrans, HttpStatus.EXPECTATION_FAILED);
        }
        objTrans.setTransStatus(3);
        objTrans.setDescription("Giấy tờ chứng thực cá nhân không đúng");
        transDao.save(objTrans);
        return  new ResponseEntity<Transaction>(objTrans, HttpStatus.EXPECTATION_FAILED);
    }


}
