package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "order")
public class OrderDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int order_id;
    private String name;
    private String mobile;
    private Date create_date;
    private String type;


}
