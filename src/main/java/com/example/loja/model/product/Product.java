package com.example.loja.model.product;

public class Product {

    private String name;
    private String cod;
    private Double price;

    public Product(String name, String cod, Double price) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
