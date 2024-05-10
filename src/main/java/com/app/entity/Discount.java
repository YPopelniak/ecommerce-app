package com.app.entity;

import com.app.enums.DiscountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Discount extends BaseEntity{

    private String name;
    private BigDecimal discount;
    @Enumerated(EnumType.STRING)
    private DiscountType discountType;


}
