package com.biblioteca.sabi;

import com.biblioteca.sabi.enums.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pessoa_id; 
    private String nome;
    private String matricula;
    private String email;
    private String cpf;
    private Usuario tipoUsuario;
    private String telefone; // Adicionado campo telefone

    // Construtor vazio
    public Pessoa() {
    }

    // Construtor com parâmetros, incluindo telefone
    public Pessoa(int pessoa_id, String nome, String matricula, String email, String cpf, Usuario tipoUsuario, String telefone) {
        this.pessoa_id = pessoa_id;
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.cpf = cpf;
        this.tipoUsuario = tipoUsuario;
        this.telefone = telefone; // Inicializando o campo telefone
    }

    // Getters e Setters
    public int getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Usuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Usuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}


