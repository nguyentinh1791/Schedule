package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity

public class AccountDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String user;
    private String pass;
}
