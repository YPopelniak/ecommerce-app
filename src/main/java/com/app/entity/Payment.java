package com.app.entity;

import com.app.enums.PaymentMethod;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Payment extends BaseEntity{

    private BigDecimal paidPrice;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
}
