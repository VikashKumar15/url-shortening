package com.system.design.urlshrotening.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {

    @Id
    private int id;

    private String name;

    public User() {
    }
}