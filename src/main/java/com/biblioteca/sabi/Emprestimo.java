package com.biblioteca.sabi;

import java.sql.Date;

import com.biblioteca.sabi.enums.EstadoEmprestimo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_emprestimo")
public class Emprestimo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private EstadoEmprestimo status;
    
    @ManyToOne
    @JoinColumn(name="pessoa_id")
    private Pessoa pessoa;
    
    @OneToOne
    @JoinColumn(name="livro_id")
    private Livro livro;
    
    @OneToOne
    @JoinColumn(name="comprovante_id")
    private Comprovante comprovante;
    
    public Emprestimo() {
    }
    
    public Emprestimo(int id, Date dataEmprestimo, Date dataDevolucao, EstadoEmprestimo status, Pessoa pessoa, Livro livro, Comprovante comprovante) {
        this.id = id;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.pessoa = pessoa;
        this.livro = livro;
        this.comprovante = comprovante;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public EstadoEmprestimo getStatus() {
        return status;
    }

    public void setStatus(EstadoEmprestimo status) {
        this.status = status;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Comprovante getComprovante() {
        return comprovante;
    }

    public void setComprovante(Comprovante comprovante) {
        this.comprovante = comprovante;
    }
}


