package com.app.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Product extends BaseEntity{

    private String name;

    private BigDecimal price;

    private Integer quantity;

    private Integer remainingQuantity;

@ManyToMany
@JoinTable(name = "product_category_rel")
    private List<Category> categoryList;
}
