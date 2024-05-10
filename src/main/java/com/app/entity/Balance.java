package com.app.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Balance extends BaseEntity{

    private BigDecimal amount;
    @OneToOne
    private Customer customer;
}
