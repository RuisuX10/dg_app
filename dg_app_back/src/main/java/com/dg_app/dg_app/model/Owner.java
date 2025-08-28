package com.dg_app.dg_app.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String last_name;
    private int dni;
    private String cuit;
    @Column(nullable = true)
    private String phone;
    @Column(nullable = true)
    private String email;
    @Column(nullable = true)
    private String address;

    @OneToMany(mappedBy = "owner")
    @JsonIgnore
    private List<Property> properties;

}
