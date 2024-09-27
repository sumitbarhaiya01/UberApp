package com.sumit.project.uber.uberApp.entities;

import jakarta.persistence.*;
import org.aspectj.weaver.AjAttribute;

import java.util.List;

@Entity
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne(fetch = FetchType.LAZY)
    private  User user;

    private Double balance;

    @OneToMany(mappedBy = "wallet")
    private List<WalletTransaction> transactions;
}
