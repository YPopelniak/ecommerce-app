package com.app.entity;

import com.app.enums.CartState;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Cart extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private CartState cartState;

    @ManyToOne
    private Discount discount;

    @ManyToOne
    private Customer customer;
}