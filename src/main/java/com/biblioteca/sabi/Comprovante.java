package com.biblioteca.sabi;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comprovante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comprovante_id;
    private Integer quantidade;

    public Comprovante() {
    }

    public Comprovante(Integer comprovante_id, Integer quantidade) {
        this.comprovante_id = comprovante_id;
        this.quantidade = quantidade;
    }

    public Integer getComprovante_id() {
        return comprovante_id;
    }

    public void setComprovante_id(Integer comprovante_id) {
        this.comprovante_id = comprovante_id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
