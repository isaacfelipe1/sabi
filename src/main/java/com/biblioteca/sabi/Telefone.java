package com.biblioteca.sabi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_telefone")
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer telefone_id;
    private String ddd;
    private String numero;
    
    // Construtor padrão
    public Telefone() {
    }

    // Construtor com parâmetros
    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    // Getters e Setters
    public Integer getTelefone_id() {
        return telefone_id;
    }

    public void setTelefone_id(Integer telefone_id) {
        this.telefone_id = telefone_id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
