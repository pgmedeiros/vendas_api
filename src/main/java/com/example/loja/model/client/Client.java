package com.example.loja.model.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue
    @Column(name = "client_id")
    private Integer id;

    private String name;
    private Integer adress;
    private String phoneNumber;

    public Client(String name, Integer adress, String phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAdress() {
        return adress;
    }

    public void setAdress(Integer adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return  this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }
}
