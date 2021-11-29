package com.example.loja.model;

public class Product {

    private String name;
    private String cod;
    private Long price;

    public Product(String name, String cod, Long price) {
        this.name = name;
        this.cod = cod;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
