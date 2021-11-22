package com.example.loja.model;

public class Pessoa {
    private String nome;
    private Integer idade;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome + "RODOU";
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    public Integer getIdade(){
        return this.idade;
    }
}
