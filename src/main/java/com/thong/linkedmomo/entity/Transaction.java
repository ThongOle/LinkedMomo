package com.thong.linkedmomo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

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
    @Column(name="trans_balance")
    private BigDecimal transBalance;
    @Column(name="trans_Date")
    private Date transDate;

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(int transStatus) {
        this.transStatus = transStatus;
    }

    public BigDecimal getTransBalance() {
        return transBalance;
    }

    public void setTransBalance(BigDecimal transBalance) {
        this.transBalance = transBalance;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }
}
