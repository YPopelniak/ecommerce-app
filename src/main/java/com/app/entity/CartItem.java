package com.app.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class CartItem extends BaseEntity {


    private Integer quantity;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Product product;
}
