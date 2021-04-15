package com.thong.linkedmomo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="otp")
@Data
public class Otp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="cif")
    private String cif;
    @Column(name="otp")
    private String otp;
}
