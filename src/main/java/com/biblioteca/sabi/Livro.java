package com.biblioteca.sabi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer livro_id;
    private String nome;
    private String titulo;
    private String autor;
    private String genero;
    private Integer anoPublicacao; 
    private String editora;
    private Integer numPaginas;
 
    @ManyToOne
    @JoinColumn(name = "colecao_id") 
    private Colecao colecao;

    // Construtor padrão
    public Livro() {
    }
    
    // Construtor com parâmetros
    public Livro(Integer livro_id, String nome, String titulo, String autor,String genero, Integer anoPublicacao, String editora,Integer numPaginas, Colecao colecao) {
        this.livro_id = livro_id;
        this.nome = nome;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacao=anoPublicacao;
        this.editora = editora;
        this.numPaginas = numPaginas;
        this.colecao = colecao; 
    }

    public Integer getLivro_id() {
        return livro_id;
    }

    public void setLivro_id(Integer livro_id) {
        this.livro_id = livro_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setAnoPublicacao(Integer anoPublicacao) {
    	this.anoPublicacao=anoPublicacao;
    }
    public Integer getAnoPublicacao() {
    	return anoPublicacao;
    }
    
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Colecao getColecao() {
        return colecao;
    }

    public void setColecao(Colecao colecao) {
        this.colecao = colecao;
    }
}
