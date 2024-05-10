package com.app.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Customer extends BaseEntity {

    private String email;
    private String firstName;
    private String lastName;
    private String userName;



}
