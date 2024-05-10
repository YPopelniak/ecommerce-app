package com.app.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
