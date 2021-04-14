package com.thong.linkedmomo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name="account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="cif")
    private String cif;
    @Column(name="account_number")
    private String accountNumber;
    @Column(name="account_type")
    private String accountType;
    @Column(name="account_balance")
    private BigDecimal accountBalance;
    @Column(name="account_status")
    private int accountStatus;
}
