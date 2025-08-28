package com.dg_app.dg_app.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;

    @ManyToOne
    @JoinColumn(name = "guarantor_id")
    private Guarantor guarantor;
    
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate lastUpdateDate;
    private Integer monthsUntilUpdate;
    private BigDecimal tenantRent;
    private BigDecimal ownerShare;
    private BigDecimal deposit;
    private String type;
    
}