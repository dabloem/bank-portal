/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.banking.accounts;

/**
 *
 * @author dabloem
 */
public class Account {
    
    String id;
    String name;
    String type;
    double amount;
    
    String description;

    public Account() {
    }

    Account(String name, String id, String type, double d) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.amount = d;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
    
}
