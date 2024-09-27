package com.sumit.project.uber.uberApp.entities;

import com.sumit.project.uber.uberApp.entities.enums.TransactionMethod;
import com.sumit.project.uber.uberApp.entities.enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
public class WalletTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private  Double amount;

    private TransactionType transactionType;

    private TransactionMethod transactionMethod;

    @OneToOne
    private Ride ride;

    private String transactionId;

    @ManyToOne
    private Wallet wallet;

    @CreationTimestamp
    private LocalDate timestamp;


}
