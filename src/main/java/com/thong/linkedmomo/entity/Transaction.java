package com.thong.linkedmomo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="trans_id")
    private int transId;
    @Column(name="trans_type")
    private String transType;
    @Column(name="description")
    private String description;
    @Column(name="trans_status")
    private int transStatus;
    @Column(name="amount")
    private BigDecimal amount;
    @Column(name="trans_Date")
    private Date transDate;


}
