package com.thong.linkedmomo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="ewallet_linked")
public class EwalletLinked {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="linked_datetime")
    private Date linkedDatetime;
    @Column(name="account_number")
    private String accountNumber;
    @Column(name="transaction_id")
    private String transactionId;
    @Column(name="ewallet_id")
    private String ewalletId;
    @Column(name="linked_status")
    private int linkedStatus;
    @Column(name="token")
    private String token;
}
