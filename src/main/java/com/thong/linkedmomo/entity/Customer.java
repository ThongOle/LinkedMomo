package com.thong.linkedmomo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="cif")
    private String cif;
    @Column(name="full_name")
    private String fullName;
    @Column(name = "age")
    private int age;
    @Column(name="sex")
    private int sex;
    @Column(name="address")
    private String address;
    @Column(name="status")
    private int status;
    @Column(name="id_card")
    private String idCard;
    @Column(name="issue_Date")
    private Date issueDate;
    @Column(name="expire_Date")
    private Date expireDate;
    @Column(name="phone")
    private String phone;
    @Column(name = "email")
    private String email;



}
