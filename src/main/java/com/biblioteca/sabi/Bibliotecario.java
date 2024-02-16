package com.biblioteca.sabi;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_bibliotecario")
public class Bibliotecario {
    //para ser o id seja autoincrementado. um auto incremento, que permite que um id seja 
    //gerado automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bibliotecario_id;
    private String nome;

    
    public Bibliotecario() {
    }

    public Bibliotecario(Integer bibliotecario_id, String nome) {
        this.bibliotecario_id = bibliotecario_id;
        this.nome = nome;
    }
  
    public Integer getBibliotecario_id() {
        return bibliotecario_id;
    }

    public String getNome() {
        return nome;
    }

    // Setters
    public void setBibliotecario_id(Integer bibliotecario_id) {
        this.bibliotecario_id = bibliotecario_id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
