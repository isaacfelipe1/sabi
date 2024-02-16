package com.biblioteca.sabi;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tb_colecao")
public class Colecao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer colecao_id;
    private String nome;
    
    public Colecao() {
    }

    public Colecao(Integer colecao_id, String nome) {
        this.colecao_id = colecao_id;
        this.nome = nome;
    }

    public Integer getColecao_id() {
        return colecao_id;
    }

    public void setColecao_id(Integer colecao_id) {
        this.colecao_id = colecao_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

