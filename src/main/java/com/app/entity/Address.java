package com.app.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Address extends BaseEntity{

    private String name;

    private String street;

    private String zipCode;
    @ManyToOne
    private Customer customer;

}
