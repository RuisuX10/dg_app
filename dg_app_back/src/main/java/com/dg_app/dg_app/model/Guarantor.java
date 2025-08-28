package com.dg_app.dg_app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Guarantor {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String last_name;
    @Column(nullable = true)
    private int dni;
    @Column(nullable = true)
    private String cuit;
    @Column(nullable = true)
    private String email;
    @Column(nullable = true)
    private String address;
    @Column(nullable = true)
    private String phone;
}
