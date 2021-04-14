package com.learning.dao;

import javax.persistence.*;

@Entity
@Table(name = "yb.customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_customer")
    @SequenceGenerator(name = "seq_customer", sequenceName = "yb.customer_seq",
            allocationSize = 1)
    private int id;
    
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
}
