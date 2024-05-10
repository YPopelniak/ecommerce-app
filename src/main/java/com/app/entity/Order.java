package com.app.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "orders")
public class Order extends BaseEntity{


    private BigDecimal paidPrice;
    private BigDecimal totalPrice;

    @OneToOne
    private Cart cart;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Payment payment;
}
