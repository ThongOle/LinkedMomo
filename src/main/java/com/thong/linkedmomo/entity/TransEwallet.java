package com.thong.linkedmomo.entity;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="trans_ewallet")
public class TransEwallet implements Serializable{
    private static final long serialVersionUID = 1780115495232186377L;
    @Id
    @Column(name="trans_id")
    private int transId;
    @Id
    @Column(name="ewallet_id")
    private String ewalletId;
    @Column(name="account_number")
    private String accountNumber;
    @Column(name="full_name")
    private String fullName;
    @Column(name="id_card")
    private String idCard;
    @Column(name="issue_date")
    private Date issueDate;
    @Column(name="expire_date")
    private Date expireDate;
}
