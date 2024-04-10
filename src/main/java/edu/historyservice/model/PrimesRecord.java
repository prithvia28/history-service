package edu.historyservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PrimesRecord {
    @Id
    @GeneratedValue
    private int id;
    private String customer;
    private String n;
    private boolean isPrime;

    public int getId()
    {
        return id;
    }
}