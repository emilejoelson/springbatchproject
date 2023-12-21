package com.example.bank_springbatch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaction;

    private BigDecimal montant;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTransaction;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebit;

    @ManyToOne
    @JoinColumn(name = "idCompte")
    private Compte compte;
}

